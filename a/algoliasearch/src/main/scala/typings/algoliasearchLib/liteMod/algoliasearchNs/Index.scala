package typings
package algoliasearchLib.liteMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the index algolia object
  */
@js.native
trait Index extends js.Object {
  var indexName: java.lang.String = js.native
  /**
    * Browse an index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browse(query: java.lang.String): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browse(
    query: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  def browse(query: java.lang.String, parameters: BrowseParameters): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browse(
    query: java.lang.String,
    parameters: BrowseParameters,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Browse an index from a cursor
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browseFrom(cursor: java.lang.String): js.Promise[BrowseResponse] = js.native
  /**
    * Browse an index from a cursor
    * https://github.com/algolia/algoliasearch-client-js#backup--export-an-index---browse
    */
  def browseFrom(
    cursor: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ BrowseResponse, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Clear cache of an index
    * https://github.com/algolia/algoliasearch-client-js#cache
    */
  def clearCache(): scala.Unit = js.native
  /**
    * Gets specific attributes from an object
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(
    objectID: java.lang.String,
    attributes: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a specific object
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObject(
    objectID: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets a list of objects
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObjects(objectIDs: js.Array[java.lang.String]): js.Promise[algoliasearchLib.Anon_Results] = js.native
  /**
    * Gets a list of objects
    * https://github.com/algolia/algoliasearch-client-js#find-by-ids---getobjects
    */
  def getObjects(
    objectIDs: js.Array[java.lang.String],
    cb: js.Function2[/* err */ stdLib.Error, /* res */ algoliasearchLib.Anon_Results, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Search in an index
    * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
    */
  def search[T](params: QueryParameters): js.Promise[Response[T]] = js.native
  /**
    * Search in an index
    * https://github.com/algolia/algoliasearch-client-js#search-in-an-index---search
    */
  def search[T](
    params: QueryParameters,
    cb: js.Function2[/* err */ stdLib.Error, /* res */ Response[T], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Search in an index
    * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
    */
  def searchForFacetValues(options: algoliasearchLib.liteMod.algoliasearchNs.SearchForFacetValuesNs.Parameters): js.Promise[algoliasearchLib.liteMod.algoliasearchNs.SearchForFacetValuesNs.Response] = js.native
  /**
    * Search in an index
    * https://www.algolia.com/doc/api-reference/api-methods/search-for-facet-values/
    */
  def searchForFacetValues(
    options: algoliasearchLib.liteMod.algoliasearchNs.SearchForFacetValuesNs.Parameters,
    cb: js.Function2[
      /* err */ stdLib.Error, 
      /* res */ algoliasearchLib.liteMod.algoliasearchNs.SearchForFacetValuesNs.Response, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

