/*
 * Copyright 2013 Luca Burgazzoli (lburgazzoli)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.lburgazzoli.examples.karaf.jpa.commons.cmd;

import org.apache.karaf.shell.console.OsgiCommandSupport;

/**
 *
 */
public abstract class AbstractDataCommand extends OsgiCommandSupport {

    @Override
    public Object doExecute() throws Exception {
        doExecuteCommand();
        return null;
    }

    /**
     *
     * @throws Exception
     */
    protected abstract void doExecuteCommand() throws Exception;
}
