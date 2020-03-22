package typings.algoliasearch

import typings.algoliasearch.mod.BrowseParameters
import typings.algoliasearch.mod.BrowseResponse
import typings.algoliasearch.mod.ClientOptions
import typings.algoliasearch.mod.MultiResponse
import typings.algoliasearch.mod.QueryParameters
import typings.algoliasearch.mod.SearchForFacetValues.Parameters
import typings.algoliasearch.mod.SearchForFacetValues.Response
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch/lite", JSImport.Namespace)
@js.native
object liteMod extends js.Object {
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
      * clear browser cache
      * https://github.com/algolia/algoliasearch-client-js#cache
      */
    def clearCache(): Unit = js.native
    /**
      * Get the value of an extra header
      */
    def getExtraHeader(name: String): String = js.native
    /**
      * Initialization of the index
      * https://github.com/algolia/algoliasearch-client-js#init-index---initindex
      */
    def initIndex(indexName: String): Index = js.native
    /**
      * Query on multiple index
      * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
      */
    def search[T](queries: js.Array[AnonIndexName]): js.Promise[MultiResponse[T]] = js.native
    /**
      * Query on multiple index
      * https://github.com/algolia/algoliasearch-client-js#multiple-queries---multiplequeries
      */
    def search[T](
      queries: js.Array[AnonIndexName],
      cb: js.Function2[/* err */ Error, /* res */ MultiResponse[T], Unit]
    ): Unit = js.native
    /**
      * Query for facet values of a specific facet
      */
    def searchForFacetValues(queries: js.Array[AnonParams]): js.Promise[js.Array[Response]] = js.native
    /**
      * Add a header to be sent with all upcoming requests
      */
    def setExtraHeader(name: String, value: String): Unit = js.native
    /**
      * remove an extra header for all upcoming requests
      */
    def unsetExtraHeader(name: String): Unit = js.native
  }
  
  /**
    * Interface for the index algolia object
    */
  @js.native
  trait Index extends js.Object {
    var indexName: String = js.native
    /**
      * Browse an index
      * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
      */
    def browse(query: String): js.Promise[BrowseResponse] = js.native
    /**
      * Browse an index
      * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
      */
    def browse(query: String, cb: js.Function2[/* err */ Error, /* res */ BrowseResponse, Unit]): Unit = js.native
    def browse(query: String, parameters: BrowseParameters): js.Promise[BrowseResponse] = js.native
    /**
      * Browse an index
      * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
      */
    def browse(
      query: String,
      parameters: BrowseParameters,
      cb: js.Function2[/* err */ Error, /* res */ BrowseResponse, Unit]
    ): Unit = js.native
    /**
      * Browse an index from a cursor
      * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
      */
    def browseFrom(cursor: String): js.Promise[BrowseResponse] = js.native
    /**
      * Browse an index from a cursor
      * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
      */
    def browseFrom(cursor: String, cb: js.Function2[/* err */ Error, /* res */ BrowseResponse, Unit]): Unit = js.native
    /**
      * Clear cache of an index
      * https://github.com/algolia/algoliasearch-client-js#cache
      */
    def clearCache(): Unit = js.native
    /**
      * Gets specific attributes from an object
      * https://algolia.com/doc/api-reference/api-methods/get-objects/#retrieve-only-one-object
      */
    def getObject(
      objectID: String,
      attributes: js.Array[String],
      cb: js.Function2[/* err */ Error, /* res */ js.Object, Unit]
    ): Unit = js.native
    /**
      * Gets a specific object
      * https://algolia.com/doc/api-reference/api-methods/get-objects/#retrieve-only-one-object
      */
    def getObject(objectID: String, cb: js.Function2[/* err */ Error, /* res */ js.Object, Unit]): Unit = js.native
    /**
      * Gets specific attributes from an object
      * https://algolia.com/doc/api-reference/api-methods/get-objects/#retrieve-only-one-object
      */
    def getObject[T](objectID: String): js.Promise[T] = js.native
    def getObject[T](objectID: String, attributes: js.Array[String]): js.Promise[T] = js.native
    /**
      * Gets a list of objects
      * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
      */
    def getObjects(objectIDs: js.Array[String]): js.Promise[AnonResults] = js.native
    /**
      * Gets a list of objects
      * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
      */
    def getObjects(objectIDs: js.Array[String], cb: js.Function2[/* err */ Error, /* res */ AnonResults, Unit]): Unit = js.native
    /**
      * Search in an index
      * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
      */
    def search[T](params: QueryParameters): js.Promise[typings.algoliasearch.mod.Response[T]] = js.native
    /**
      * Search in an index
      * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
      */
    def search[T](
      params: QueryParameters,
      cb: js.Function2[/* err */ Error, /* res */ typings.algoliasearch.mod.Response[T], Unit]
    ): Unit = js.native
    /**
      * Search in an index
      * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
      */
    def searchForFacetValues(options: Parameters): js.Promise[Response] = js.native
    /**
      * Search in an index
      * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
      */
    def searchForFacetValues(options: Parameters, cb: js.Function2[/* err */ Error, /* res */ Response, Unit]): Unit = js.native
  }
  
  def apply(applicationId: String, apiKey: String): Client = js.native
  def apply(applicationId: String, apiKey: String, options: ClientOptions): Client = js.native
}

