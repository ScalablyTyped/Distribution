package typings
package algoliasearchLib.liteMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  /**
    * The cursor is only set when browsing the index.
    * https://www.algolia.com/doc/api-reference/api-methods/browse/
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var facets: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]]
  ] = js.undefined
  var facets_stats: js.UndefOr[org.scalablytyped.runtime.StringDictionary[algoliasearchLib.Anon_Avg]] = js.undefined
  /**
    * Contains all the hits matching the query
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var hits: js.Array[T]
  /**
    * Number of hits per pages
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var hitsPerPage: scala.Double
  /**
    * The index name is only set when searching multiple indices.
    * https://www.algolia.com/doc/api-reference/api-methods/multiple-queries/?language=javascript#response
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of total hits matching the query
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var nbHits: scala.Double
  /**
    * Number of pages
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var nbPages: scala.Double
  /**
    * Current page
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var page: scala.Double
  /**
    * GET parameters used to perform the search
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var params: java.lang.String
  /**
    * Engine processing time (excluding network transfer)
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var processingTimeMS: scala.Double
  /**
    * Query used to perform the search
    * https://www.algolia.com/doc/api-reference/api-methods/search/?language=javascript#response
    */
  var query: java.lang.String
}

object Response {
  @scala.inline
  def apply[T](
    hits: js.Array[T],
    hitsPerPage: scala.Double,
    nbHits: scala.Double,
    nbPages: scala.Double,
    page: scala.Double,
    params: java.lang.String,
    processingTimeMS: scala.Double,
    query: java.lang.String,
    cursor: java.lang.String = null,
    facets: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]] = null,
    facets_stats: org.scalablytyped.runtime.StringDictionary[algoliasearchLib.Anon_Avg] = null,
    index: java.lang.String = null
  ): Response[T] = {
    val __obj = js.Dynamic.literal(hits = hits, hitsPerPage = hitsPerPage, nbHits = nbHits, nbPages = nbPages, page = page, params = params, processingTimeMS = processingTimeMS, query = query)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (facets != null) __obj.updateDynamic("facets")(facets)
    if (facets_stats != null) __obj.updateDynamic("facets_stats")(facets_stats)
    if (index != null) __obj.updateDynamic("index")(index)
    __obj.asInstanceOf[Response[T]]
  }
}

