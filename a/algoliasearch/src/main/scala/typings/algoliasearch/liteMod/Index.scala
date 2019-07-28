package typings.algoliasearch.liteMod

import typings.algoliasearch.Anon_Results
import typings.algoliasearch.algoliasearchMod.BrowseParameters
import typings.algoliasearch.algoliasearchMod.BrowseResponse
import typings.algoliasearch.algoliasearchMod.QueryParameters
import typings.algoliasearch.algoliasearchMod.Response
import typings.algoliasearch.algoliasearchMod.SearchForFacetValuesNs.Parameters
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(
    objectID: String,
    attributes: js.Array[String],
    cb: js.Function2[/* err */ Error, /* res */ js.Object, Unit]
  ): Unit = js.native
  /**
    * Gets a specific object
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(objectID: String, cb: js.Function2[/* err */ Error, /* res */ js.Object, Unit]): Unit = js.native
  /**
    * Gets a list of objects
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObjects(objectIDs: js.Array[String]): js.Promise[Anon_Results] = js.native
  /**
    * Gets a list of objects
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObjects(objectIDs: js.Array[String], cb: js.Function2[/* err */ Error, /* res */ Anon_Results, Unit]): Unit = js.native
  /**
    * Search in an index
    * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
    */
  def search[T](params: QueryParameters): js.Promise[Response[T]] = js.native
  /**
    * Search in an index
    * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
    */
  def search[T](params: QueryParameters, cb: js.Function2[/* err */ Error, /* res */ Response[T], Unit]): Unit = js.native
  /**
    * Search in an index
    * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
    */
  def searchForFacetValues(options: Parameters): js.Promise[typings.algoliasearch.algoliasearchMod.SearchForFacetValuesNs.Response] = js.native
  /**
    * Search in an index
    * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
    */
  def searchForFacetValues(
    options: Parameters,
    cb: js.Function2[
      /* err */ Error, 
      /* res */ typings.algoliasearch.algoliasearchMod.SearchForFacetValuesNs.Response, 
      Unit
    ]
  ): Unit = js.native
}

