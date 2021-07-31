package typings.ariClient.mod

import typings.ariClient.anon.ConfigClass
import typings.ariClient.anon.Configuration
import typings.ariClient.anon.Fields
import typings.ariClient.anon.LogChannelName
import typings.ariClient.anon.ModuleName
import typings.ariClient.anon.Only
import typings.ariClient.anon.Value
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Asterisk extends StObject {
  
  /**
    * Adds a log channel.
    *
    * @param params.logChannelName - The log channel to add.
    * @param params.configuration - levels of the log channel.
    */
  def addLog(params: Configuration): js.Promise[Unit] = js.native
  /**
    * Adds a log channel.
    *
    * @param params.logChannelName - The log channel to add.
    * @param params.configuration - levels of the log channel.
    */
  def addLog(params: Configuration, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Deletes a log channel.
    *
    * @param params.logChannelName - Log channels name.
    */
  def deleteLog(params: LogChannelName): js.Promise[Unit] = js.native
  /**
    * Deletes a log channel.
    *
    * @param params.logChannelName - Log channels name.
    */
  def deleteLog(params: LogChannelName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Delete a dynamic configuration object.
    *
    * @param params.configClass - The configuration class containing dynamic configuration objects.
    * @param params.objectType - The type of configuration object to delete.
    * @param params.id - The unique identifier of the object to delete.
    */
  def deleteObject(params: ConfigClass): js.Promise[Unit] = js.native
  /**
    * Delete a dynamic configuration object.
    *
    * @param params.configClass - The configuration class containing dynamic configuration objects.
    * @param params.objectType - The type of configuration object to delete.
    * @param params.id - The unique identifier of the object to delete.
    */
  def deleteObject(params: ConfigClass, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Get the value of a global variable.
    *
    * @param params.variable - The variable to get.
    */
  def getGlobalVar(params: typings.ariClient.anon.Variable): js.Promise[Variable] = js.native
  /**
    * Get the value of a global variable.
    *
    * @param params.variable - The variable to get.
    */
  def getGlobalVar(
    params: typings.ariClient.anon.Variable,
    callback: js.Function2[/* err */ Error, /* variable */ Variable, Unit]
  ): Unit = js.native
  
  /**
    * Gets Asterisk system information.
    *
    * @param [params.only] - Filter information returned.
    */
  def getInfo(): js.Promise[AsteriskInfo] = js.native
  /**
    * Gets Asterisk system information.
    */
  def getInfo(callback: js.Function2[/* err */ Error, /* asteriskinfo */ AsteriskInfo, Unit]): Unit = js.native
  def getInfo(params: Only): js.Promise[AsteriskInfo] = js.native
  /**
    * Gets Asterisk system information.
    *
    * @param [params.only] - Filter information returned.
    */
  def getInfo(params: Only, callback: js.Function2[/* err */ Error, /* asteriskinfo */ AsteriskInfo, Unit]): Unit = js.native
  
  /**
    * Get Asterisk module information.
    *
    * @param params.moduleName - Modules name.
    */
  def getModule(params: ModuleName): js.Promise[Module] = js.native
  /**
    * Get Asterisk module information.
    *
    * @param params.moduleName - Modules name.
    */
  def getModule(params: ModuleName, callback: js.Function2[/* err */ Error, /* module */ Module, Unit]): Unit = js.native
  
  /**
    * Retrieve a dynamic configuration object.
    *
    * @param params.configClass - The configuration class containing dynamic configuration objects.
    * @param params.objectType - The type of configuration object to retrieve.
    * @param params.id - The unique identifier of the object to retrieve.
    */
  def getObject(params: ConfigClass): js.Promise[js.Array[ConfigTuple]] = js.native
  /**
    * Retrieve a dynamic configuration object.
    *
    * @param params.configClass - The configuration class containing dynamic configuration objects.
    * @param params.objectType - The type of configuration object to retrieve.
    * @param params.id - The unique identifier of the object to retrieve.
    */
  def getObject(
    params: ConfigClass,
    callback: js.Function2[/* err */ Error, /* configtuples */ js.Array[ConfigTuple], Unit]
  ): Unit = js.native
  
  /**
    * Gets Asterisk log channel information.
    */
  def listLogChannels(): js.Promise[js.Array[LogChannel]] = js.native
  /**
    * Gets Asterisk log channel information.
    */
  def listLogChannels(callback: js.Function2[/* err */ Error, /* logchannels */ js.Array[LogChannel], Unit]): Unit = js.native
  
  /**
    * List Asterisk modules.
    */
  def listModules(): js.Promise[js.Array[Module]] = js.native
  /**
    * List Asterisk modules.
    */
  def listModules(callback: js.Function2[/* err */ Error, /* modules */ js.Array[Module], Unit]): Unit = js.native
  
  /**
    * Load an Asterisk module.
    *
    * @param params.moduleName - Modules name.
    */
  def loadModule(params: ModuleName): js.Promise[Unit] = js.native
  /**
    * Load an Asterisk module.
    *
    * @param params.moduleName - Modules name.
    */
  def loadModule(params: ModuleName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Response pong message.
    */
  def ping(): js.Promise[AsteriskPing] = js.native
  /**
    * Response pong message.
    */
  def ping(callback: js.Function2[/* err */ Error, /* asteriskping */ AsteriskPing, Unit]): Unit = js.native
  
  /**
    * Reload an Asterisk module.
    *
    * @param params.moduleName - Modules name.
    */
  def reloadModule(params: ModuleName): js.Promise[Unit] = js.native
  /**
    * Reload an Asterisk module.
    *
    * @param params.moduleName - Modules name.
    */
  def reloadModule(params: ModuleName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Rotates a log channel.
    *
    * @param params.logChannelName - Log channels name.
    */
  def rotateLog(params: LogChannelName): js.Promise[Unit] = js.native
  /**
    * Rotates a log channel.
    *
    * @param params.logChannelName - Log channels name.
    */
  def rotateLog(params: LogChannelName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Set the value of a global variable.
    *
    * @param params.variable - The variable to set.
    * @param [params.value] - The value to set the variable to.
    */
  def setGlobalVar(params: Value): js.Promise[Unit] = js.native
  /**
    * Set the value of a global variable.
    *
    * @param params.variable - The variable to set.
    * @param [params.value] - The value to set the variable to.
    */
  def setGlobalVar(params: Value, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Unload an Asterisk module.
    *
    * @param params.moduleName - Modules name.
    */
  def unloadModule(params: ModuleName): js.Promise[Unit] = js.native
  /**
    * Unload an Asterisk module.
    *
    * @param params.moduleName - Modules name.
    */
  def unloadModule(params: ModuleName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Create or update a dynamic configuration object.
    *
    * @param params.configClass - The configuration class containing dynamic configuration objects.
    * @param params.objectType - The type of configuration object to create or update.
    * @param params.id - The unique identifier of the object to create or update.
    * @param [params.fields] - The body object should have a value that is a list of ConfigTuples, which provide the fields to update. Ex. [ { "attribute": "directmedia", "value": "false" } ].
    */
  def updateObject(params: Fields): js.Promise[js.Array[ConfigTuple]] = js.native
  /**
    * Create or update a dynamic configuration object.
    *
    * @param params.configClass - The configuration class containing dynamic configuration objects.
    * @param params.objectType - The type of configuration object to create or update.
    * @param params.id - The unique identifier of the object to create or update.
    * @param [params.fields] - The body object should have a value that is a list of ConfigTuples, which provide the fields to update. Ex. [ { "attribute": "directmedia", "value": "false" } ].
    */
  def updateObject(
    params: Fields,
    callback: js.Function2[/* err */ Error, /* configtuples */ js.Array[ConfigTuple], Unit]
  ): Unit = js.native
}
