package typings.algoliasearch.algoliasearchMod

import typings.algoliasearch.Anon_IndexName
import typings.algoliasearch.Anon_IndexNameParams
import typings.algoliasearch.Anon_Logs
import typings.algoliasearch.algoliasearchStrings.rules
import typings.algoliasearch.algoliasearchStrings.settings
import typings.algoliasearch.algoliasearchStrings.synonyms
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the algolia client object
  */
@js.native
trait Client extends js.Object {
  /**
    * add a header, used for flagging InstantSearch implementations
    */
  def addAlgoliaAgent(agent: String): Unit = js.native
  /**
    * Add global API Keys
    */
  def addApiKey(scopes: js.Array[String]): js.Promise[AddApiKeyTask] = js.native
  /**
    * Add global API Keys
    */
  def addApiKey(scopes: js.Array[String], cb: js.Function2[/* err */ Error, /* res */ AddApiKeyTask, Unit]): Unit = js.native
  def addApiKey(scopes: js.Array[String], options: ApiKeyOptions): js.Promise[AddApiKeyTask] = js.native
  /**
    * Add global API Key
    */
  def addApiKey(
    scopes: js.Array[String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ Error, /* res */ AddApiKeyTask, Unit]
  ): Unit = js.native
  /**
    * Perform multiple operations with one API call to reduce latency
    */
  def batch(action: js.Array[Action]): js.Promise[BatchTask] = js.native
  /**
    * Perform multiple operations with one API call to reduce latency
    */
  def batch(action: js.Array[Action], cb: js.Function2[/* err */ Error, /* res */ BatchTask, Unit]): Unit = js.native
  /**
    * clear browser cache
    */
  def clearCache(): Unit = js.native
  /**
    * Copy settings of an index from a specific index to a new one
    */
  def copyIndex(from: String, to: String): js.Promise[UpdateIndexTask] = js.native
  /**
    * Copy an index from a specific index to a new one
    */
  def copyIndex(from: String, to: String, cb: js.Function2[/* err */ Error, /* res */ UpdateIndexTask, Unit]): Unit = js.native
  def copyIndex(from: String, to: String, scope: js.Array[settings | synonyms | rules]): js.Promise[UpdateIndexTask] = js.native
  /**
    * Copy settings of an index from a specific index to a new one
    */
  def copyIndex(
    from: String,
    to: String,
    scope: js.Array[settings | synonyms | rules],
    cb: js.Function2[/* err */ Error, /* res */ UpdateIndexTask, Unit]
  ): Unit = js.native
  /**
    * Deletes a global key
    */
  def deleteApiKey(key: String): js.Promise[DeleteApiKeyTask] = js.native
  /**
    * Deletes a global key
    */
  def deleteApiKey(key: String, cb: js.Function2[/* err */ Error, /* res */ DeleteApiKeyTask, Unit]): Unit = js.native
  /**
    * Delete a specific index
    */
  def deleteIndex(name: String): js.Promise[Task] = js.native
  /**
    * Delete a specific index
    */
  def deleteIndex(name: String, cb: js.Function2[/* err */ Error, /* res */ Task, Unit]): Unit = js.native
  /**
    * kill alive connections
    */
  def destroy(): Unit = js.native
  /**
    * Generate a public API key
    */
  def generateSecuredApiKey(key: String, filters: SecuredApiOptions): String = js.native
  /**
    * Gets the rights of a global key
    */
  def getApiKey(key: String): js.Promise[ApiKey] = js.native
  /**
    * Gets the rights of a global key
    */
  def getApiKey(key: String, cb: js.Function2[/* err */ Error, /* res */ ApiKey, Unit]): Unit = js.native
  /**
    * Get the value of an extra header
    */
  def getExtraHeader(name: String): String = js.native
  /**
    * Get 1000 last events
    */
  def getLogs(options: LogsOptions): js.Promise[Anon_Logs] = js.native
  /**
    * Get 1000 last events
    */
  def getLogs(options: LogsOptions, cb: js.Function2[/* err */ Error, /* res */ Anon_Logs, Unit]): Unit = js.native
  /**
    * Initialization of the index
    */
  def initIndex(indexName: String): Index = js.native
  /**
    * Lists global API Keys
    */
  def listApiKeys(): js.Promise[js.Array[ApiKey]] = js.native
  /**
    * Lists global API Keys
    */
  def listApiKeys(cb: js.Function2[/* err */ Error, /* res */ js.Array[ApiKey], Unit]): Unit = js.native
  /**
    * List all your indices along with their associated information (number of entries, disk size, etc.)
    */
  def listIndexes(): js.Promise[_] = js.native
  /**
    * List all your indices along with their associated information (number of entries, disk size, etc.)
    */
  def listIndexes(cb: js.Function2[/* err */ Error, /* res */ js.Any, Unit]): Unit = js.native
  /**
    * Move index to a new one (and will overwrite the original one)
    */
  def moveIndex(from: String, to: String): js.Promise[UpdateIndexTask] = js.native
  /**
    * Move index to a new one (and will overwrite the original one)
    */
  def moveIndex(from: String, to: String, cb: js.Function2[/* err */ Error, /* res */ UpdateIndexTask, Unit]): Unit = js.native
  /**
    * Query on multiple index
    */
  def search[T](queries: js.Array[Anon_IndexName]): js.Promise[MultiResponse[T]] = js.native
  /**
    * Query on multiple index
    */
  def search[T](
    queries: js.Array[Anon_IndexName],
    cb: js.Function2[/* err */ Error, /* res */ MultiResponse[T], Unit]
  ): Unit = js.native
  /**
    * Query for facet values of a specific facet
    */
  def searchForFacetValues(queries: js.Array[Anon_IndexNameParams]): js.Promise[js.Array[typings.algoliasearch.algoliasearchMod.SearchForFacetValues.Response]] = js.native
  /**
    * Add a header to be sent with all upcoming requests
    */
  def setExtraHeader(name: String, value: String): Unit = js.native
  /**
    * Remove an extra header for all upcoming requests
    */
  def unsetExtraHeader(name: String): Unit = js.native
  /**
    * Update global API key
    */
  def updateApiKey(key: String, scopes: js.Array[String]): js.Promise[UpdateApiKeyTask] = js.native
  /**
    * Update global API key
    */
  def updateApiKey(
    key: String,
    scopes: js.Array[String],
    cb: js.Function2[/* err */ Error, /* res */ UpdateApiKeyTask, Unit]
  ): Unit = js.native
  def updateApiKey(key: String, scopes: js.Array[String], options: ApiKeyOptions): js.Promise[UpdateApiKeyTask] = js.native
  /**
    * Update global API key
    */
  def updateApiKey(
    key: String,
    scopes: js.Array[String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ Error, /* res */ UpdateApiKeyTask, Unit]
  ): Unit = js.native
}

