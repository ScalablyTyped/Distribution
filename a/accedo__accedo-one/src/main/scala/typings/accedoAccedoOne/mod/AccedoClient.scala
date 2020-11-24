package typings.accedoAccedoOne.mod

import typings.accedoAccedoOne.anon.Locales
import typings.accedoAccedoOne.anon.PickAccedoEntryParamsprev
import typings.accedoAccedoOne.anon.ReadonlyDetails
import typings.accedoAccedoOne.mod.AccedoLog.Level
import typings.accedoAccedoOne.mod.AccedoLog.Logobject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccedoClient extends js.Object {
  
  var config: AccedoConfig = js.native
  
  /**
    * Create a session and store it for reuse in this client instance.
    * Note you do not usually need to worry about this. Other methods
    * will call it automatically for you when it is needed.
    *
    * @returns a Promise of a string, the sessionKey
    */
  def createSession(): js.Promise[String] = js.native
  
  /**
    * Get all the application-group-scope data for a given user
    *
    * @param userName an Accedo One user
    * @returns A promise of the requested data
    */
  def getAllApplicationGroupScopeDataByUser(userName: String): js.Promise[_] = js.native
  
  /**
    * Get all the application-scope data for a given user
    *
    * @param userName an Accedo One user
    * @returns A promise of the requested data
    */
  def getAllApplicationScopeDataByUser(userName: String): js.Promise[_] = js.native
  
  /**
    * Lists all the assets.
    *
    * @returns A promise of a hash of assets (key: asset name, value: asset URL)
    */
  def getAllAssets(): js.Promise[String] = js.native
  
  /**
    * Get all the enabled plugins
    *
    * @returns A promise of the requested data
    */
  def getAllEnabledPlugins(): js.Promise[_] = js.native
  
  /**
    * Get all the metadata
    *
    * @returns A promise of the requested data
    */
  def getAllMetadata(): js.Promise[_] = js.native
  
  /**
    * Get all the application-group-scope data for a given user
    *
    * @param userName an Accedo One user
    * @param key a key to specify what data to obtain
    * @returns A promise of the requested data
    */
  def getApplicationGroupScopeDataByUserAndKey(userName: String, key: String): js.Promise[_] = js.native
  
  /**
    * Get all the application-scope data for a given user and data key
    *
    * @param userName an Accedo One user
    * @param key a key to specify what data to obtain
    */
  def getApplicationScopeDataByUserAndKey(userName: String, key: String): js.Promise[_] = js.native
  
  /**
    * Get the current application status
    *
    * @returns A promise of the application status (string)
    */
  def getApplicationStatus(): js.Promise[String] = js.native
  
  /**
    * Get all the available locales
    *
    * @returns A promise of the requested data
    */
  def getAvailableLocales(): js.Promise[Locales] = js.native
  
  /**
    * Get all the content entries, based on the given parameters.
    * DO NOT use several of the id, alias, typeId and typeAlias
    * options at the same time - behaviour would be ungaranteed.
    *
    * @param params
    */
  def getEntries(): js.Promise[_] = js.native
  def getEntries(params: AccedoEntryParams): js.Promise[_] = js.native
  
  /**
    * Get one content entry, based on the given parameters.
    *
    * @param alias
    * @param params
    */
  def getEntryByAlias[A](alias: A): js.Promise[A] = js.native
  def getEntryByAlias[A](alias: A, params: PickAccedoEntryParamsprev): js.Promise[A] = js.native
  
  /**
    * Get one content entry by id, based on the given parameters.
    *
    * @param id
    * @param params
    */
  def getEntryById(id: String): js.Promise[_] = js.native
  def getEntryById(id: String, params: PickAccedoEntryParamsprev): js.Promise[_] = js.native
  
  /**
    * Get the current log level
    *
    * @returns a promise of the log level (string)
    */
  def getLogLevel(): js.Promise[Level] = js.native
  
  /**
    * Get the metadata by a specific key
    *
    * @param key a key to get specific metadata
    * @returns a promise of the requested data
    */
  def getMetadataByKey(key: String): js.Promise[_] = js.native
  
  /**
    * Get the metadata by specific keys
    *
    * @param keys an array of keys (strings)
    * @returns a promise of the requested data
    */
  def getMetadataByKeys(keys: js.Array[String]): js.Promise[_] = js.native
  
  /**
    * Get the profile information
    *
    * @returns A promise of the requested data
    */
  def getProfileInfo(): js.Promise[AccedoProfile] = js.native
  
  /**
    * Returns the currently stored sessionKey for this client instance
    *
    * @returns string: the sessionKey, if any
    */
  def getSessionKey(): String = js.native
  
  /**
    * NOTE: the behaviour varies when run on Node.js or on browsers.
    *
    * On Node.js, the log will be sent immediately.
    * On browsers: add the log to a queue so several logs may be sent
    * as a batch, when a predefined total size is reached or after a
    * debouncing delay. Whenever the user navigates away, the SDK will
    * also attempt to send any queued-up log.
    *
    * If the current log level is high enough, lower level logs will be ignored.
    *
    * @param level the log level
    * @param details the log information
    * @param metadata extra metadata (will go through JSON.stringify). Can be passed as any number of trailing arguments.
    */
  def sendLog(level: Level, details: ReadonlyDetails): js.Promise[Boolean] = js.native
  def sendLog(level: Level, details: ReadonlyDetails, metadata: js.Any): js.Promise[Boolean] = js.native
  
  /**
    * Send batched logs, each with its own level, timestamp, details and extra metadata.
    * Note that on browsers, the other method, sendLog, is more convenient as it will
    * auto-batch logs for you.
    *
    * @param logs
    * @returns A promise of the success of the operation
    */
  def sendLogs(logs: js.Array[Logobject]): js.Promise[Boolean] = js.native
  
  /**
    * Send a usage START event
    *
    * @returns A promise denoting the success of the operation
    */
  def sendUsageStartEvent(): js.Promise[Boolean] = js.native
  
  /**
    * Send a usage QUIT event
    *
    * @param retentionTimeInSeconds the retention time, in seconds
    * @returns A promise denoting the success of the operation
    */
  def sendUsageStopEvent(): js.Promise[Boolean] = js.native
  def sendUsageStopEvent(retentionTimeInSeconds: String): js.Promise[Boolean] = js.native
  def sendUsageStopEvent(retentionTimeInSeconds: Double): js.Promise[Boolean] = js.native
  
  /**
    * Set the application-group-scope data for a given user
    *
    * @param userName an Accedo One user
    * @param data the data to store
    * @returns A promise of the requested data
    */
  def setApplicationGroupScopeUserData[D /* <: js.Object */](userName: String, data: D): js.Promise[D] = js.native
  
  /**
    * Set the application-group-scope data for a given user
    *
    * @param userName an Accedo One user
    * @param key a key to specify what data to obtain
    * @param data the data to store
    * @returns A promise of the requested data
    */
  def setApplicationGroupScopeUserDataByKey[D /* <: js.Object */](userName: String, key: String, data: D): js.Promise[D] = js.native
  
  /**
    * Set the application-scope data for a given user
    *
    * @param userName an Accedo One user
    * @param data the data to store
    * @returns A promise of the requested data
    */
  def setApplicationScopeUserData[D /* <: js.Object */](userName: String, data: D): js.Promise[D] = js.native
  
  /**
    * Set the application-scope data for a given user
    *
    * @param userName an Accedo One user
    * @param key a key to specify what data to obtain
    * @param data the data to store
    * @returns A promise of the requested data
    */
  def setApplicationScopeUserDataByKey[D /* <: js.Object */](userName: String, key: String, data: D): js.Promise[D] = js.native
}
