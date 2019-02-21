package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the algolia client object
  */
@js.native
trait Client extends js.Object {
  /**
    * Add global API Keys
    * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
    */
  def addApiKey(scopes: js.Array[java.lang.String]): js.Promise[Task] = js.native
  /**
    * Add global API Keys
    * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
    */
  def addApiKey(
    scopes: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  def addApiKey(scopes: js.Array[java.lang.String], options: ApiKeyOptions): js.Promise[Task] = js.native
  /**
    * Add global API Key
    * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
    */
  def addApiKey(
    scopes: js.Array[java.lang.String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Perform multiple operations with one API call to reduce latency
    * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
    */
  def batch(action: js.Array[Action]): js.Promise[Task] = js.native
  /**
    * Perform multiple operations with one API call to reduce latency
    * https://github.com/algolia/algoliasearch-client-js#custom-batch---batch
    */
  def batch(action: js.Array[Action], cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * clear browser cache
    * https://github.com/algolia/algoliasearch-client-js#cache
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Copy settings of an index from a specific index to a new one
    * https://github.com/algolia/algoliasearch-client-js#copy-index---copyindex
    */
  def copyIndex(from: java.lang.String, to: java.lang.String): js.Promise[Task] = js.native
  /**
    * Copy an index from a specific index to a new one
    * https://github.com/algolia/algoliasearch-client-js#copy-index---copyindex
    */
  def copyIndex(
    from: java.lang.String,
    to: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  def copyIndex(
    from: java.lang.String,
    to: java.lang.String,
    scope: js.Array[
      algoliasearchLib.algoliasearchLibStrings.settings | algoliasearchLib.algoliasearchLibStrings.synonyms | algoliasearchLib.algoliasearchLibStrings.rules
    ]
  ): js.Promise[Task] = js.native
  /**
    * Copy settings of an index from a specific index to a new one
    * https://github.com/algolia/algoliasearch-client-js#copy-index---copyindex
    */
  def copyIndex(
    from: java.lang.String,
    to: java.lang.String,
    scope: js.Array[
      algoliasearchLib.algoliasearchLibStrings.settings | algoliasearchLib.algoliasearchLibStrings.synonyms | algoliasearchLib.algoliasearchLibStrings.rules
    ],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Deletes a global key
    * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteapikey
    */
  def deleteApiKey(key: java.lang.String): js.Promise[Task] = js.native
  /**
    * Deletes a global key
    * https://github.com/algolia/algoliasearch-client-js#delete-user-key---deleteapikey
    */
  def deleteApiKey(key: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * Delete a specific index
    * https://github.com/algolia/algoliasearch-client-js#delete-index---deleteindex
    */
  def deleteIndex(name: java.lang.String): js.Promise[Task] = js.native
  /**
    * Delete a specific index
    * https://github.com/algolia/algoliasearch-client-js#delete-index---deleteindex
    */
  def deleteIndex(name: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]): scala.Unit = js.native
  /**
    * kill alive connections
    * https://github.com/algolia/algoliasearch-client-js#keep-alive
    */
  def destroy(): scala.Unit = js.native
  /**
    * Generate a public API key
    * https://github.com/algolia/algoliasearch-client-js#generate-key---generatesecuredapikey
    */
  def generateSecuredApiKey(key: java.lang.String, filters: SecuredApiOptions): java.lang.String = js.native
  /**
    * Gets the rights of a global key
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def getApiKey(key: java.lang.String): js.Promise[_] = js.native
  /**
    * Gets the rights of a global key
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def getApiKey(key: java.lang.String, cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Get the value of an extra header
    */
  def getExtraHeader(name: java.lang.String): java.lang.String = js.native
  /**
    * Get 1000 last events
    * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
    */
  def getLogs(options: LogsOptions): js.Promise[algoliasearchLib.Anon_Logs] = js.native
  /**
    * Get 1000 last events
    * https://github.com/algolia/algoliasearch-client-js#get-logs---getlogs
    */
  def getLogs(
    options: LogsOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ algoliasearchLib.Anon_Logs, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Initialization of the index
    * https://github.com/algolia/algoliasearch-client-js#init-index---initindex
    */
  def initIndex(indexName: java.lang.String): Index = js.native
  /**
    * Lists global API Keys
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def listApiKeys(): js.Promise[_] = js.native
  /**
    * Lists global API Keys
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def listApiKeys(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * List all your indices along with their associated information (number of entries, disk size, etc.)
    * https://github.com/algolia/algoliasearch-client-js#list-indices---listindexes
    */
  def listIndexes(): js.Promise[_] = js.native
  /**
    * List all your indices along with their associated information (number of entries, disk size, etc.)
    * https://github.com/algolia/algoliasearch-client-js#list-indices---listindexes
    */
  def listIndexes(cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
    * Move index to a new one (and will overwrite the original one)
    * https://github.com/algolia/algoliasearch-client-js#move-index---moveindex
    */
  def moveIndex(from: java.lang.String, to: java.lang.String): js.Promise[Task] = js.native
  /**
    * Move index to a new one (and will overwrite the original one)
    * https://github.com/algolia/algoliasearch-client-js#move-index---moveindex
    */
  def moveIndex(
    from: java.lang.String,
    to: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Query on multiple index
    * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
    */
  def search[T](queries: js.Array[algoliasearchLib.Anon_IndexName]): js.Promise[MultiResponse[T]] = js.native
  /**
    * Query on multiple index
    * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
    */
  def search[T](
    queries: js.Array[algoliasearchLib.Anon_IndexName],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ MultiResponse[T], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Query for facet values of a specific facet
    */
  def searchForFacetValues(queries: js.Array[algoliasearchLib.Anon_IndexNameParams]): js.Promise[
    js.Array[
      algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs.Response
    ]
  ] = js.native
  /**
    * Add a header to be sent with all upcoming requests
    */
  def setExtraHeader(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
    * Remove an extra header for all upcoming requests
    */
  def unsetExtraHeader(name: java.lang.String): scala.Unit = js.native
  /**
    * Update global API key
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(key: java.lang.String, scopes: js.Array[java.lang.String]): js.Promise[Task] = js.native
  /**
    * Update global API key
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(
    key: java.lang.String,
    scopes: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
  def updateApiKey(key: java.lang.String, scopes: js.Array[java.lang.String], options: ApiKeyOptions): js.Promise[Task] = js.native
  /**
    * Update global API key
    * https://github.com/algolia/algoliasearch-client-js#update-user-key---updateapikey
    */
  def updateApiKey(
    key: java.lang.String,
    scopes: js.Array[java.lang.String],
    options: ApiKeyOptions,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Task, scala.Unit]
  ): scala.Unit = js.native
}

