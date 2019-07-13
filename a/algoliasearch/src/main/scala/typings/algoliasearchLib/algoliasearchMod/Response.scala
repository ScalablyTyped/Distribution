package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  /**
    * If a search encounters an index that is being A/B tested, abTestVariantID
    * reports the variant ID of the index used (note, this is the ID not the name).
    * The variant ID is the position in the array of variants (starting at 1).
    * 
    * For example, abTestVariantID=1 is variant A (the main index), abTestVariantID=2
    * is variant B (the replica you chose when creating the A/B test , or the queries
    * with the changed query parameters if the A/B test is based on query parameters).
    * Returned only if getRankingInfo is set to true.
    */
  var abTestVariantID: js.UndefOr[scala.Double] = js.undefined
  /**
    * The computed geo location. Warning: for legacy reasons, this parameter is
    * a string and not an object. Format: ${lat},${lng}, where the latitude and
    * longitude are expressed as decimal floating point numbers.
    * Only returned when aroundLatLngViaIP or aroundLatLng is set.
    */
  var aroundLatLng: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The automatically computed radius. For legacy reasons, this parameter is a
    * string and not an integer.
    * Only returned for geo queries without an explicitly specified radius (see aroundRadius).
    */
  var automaticRadius: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The cursor is only set when browsing the index.
    */
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the facet count is exhaustive (true) or approximate (false).
    */
  var exhaustiveFacetsCount: scala.Boolean
  /**
    * Whether the nbHits is exhaustive (true) or approximate (false).
    * An approximation is done when the query takes more than 50ms to be processed
    * (this can happen when using complex filters on millions on records).
    */
  var exhaustiveNbHits: scala.Boolean
  /**
    * A mapping of each facet name to the corresponding facet counts.
    */
  var facets: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]]
  ] = js.undefined
  /**
    * Statistics for numerical facets.
    */
  var facets_stats: js.UndefOr[org.scalablytyped.runtime.StringDictionary[algoliasearchLib.Anon_Avg]] = js.undefined
  /**
    * Contains all the hits matching the query
    */
  var hits: js.Array[T]
  /**
    * Number of hits per pages
    */
  var hitsPerPage: scala.Double
  /**
    * The index name is only set when searching multiple indices.
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Index name used for the query. In the case of an A/B test, the targeted
    * index isn’t always the index used by the query.
    * Returned only if getRankingInfo is set to true.
    */
  var indexUsed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used to return warnings about the query.
    */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Number of total hits matching the query
    */
  var nbHits: scala.Double
  /**
    * Number of pages
    */
  var nbPages: scala.Double
  /**
    * Current page
    */
  var page: scala.Double
  /**
    * GET parameters used to perform the search
    */
  var params: java.lang.String
  /**
    * The query string that will be searched, after normalization. Normalization
    * includes removing stop words (if removeStopWords is enabled), and transforming
    * portions of the query string into phrase queries (see advancedSyntax).
    * Returned only if getRankingInfo is set to true.
    */
  var parsedQuery: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the query was processed. Only returned when strategy: stopIfEnoughmatches.
    */
  var processed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Engine processing time (excluding network transfer)
    */
  var processingTimeMS: scala.Double
  /**
    * Query used to perform the search
    */
  var query: java.lang.String
  /**
    * A markup text indicating which parts of the original query have been removed
    * in order to retrieve a non-empty result set.
    * The removed parts are surrounded by <em> tags.
    * Only returned when removeWordsIfNoResults is set to lastWords or firstWords.
    */
  var queryAfterRemoval: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unique identifier of this search, only returned if clickAnalytics: true
    */
  var queryID: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Actual host name of the server that processed the request. Our DNS
    * supports automatic failover and load balancing, so this may differ from
    * the host name used in the request.
    * Returned only if getRankingInfo is set to true.
    */
  var serverUsed: js.UndefOr[java.lang.String] = js.undefined
  /**
    * user data is returned if a matching query rule was set up to do so
    */
  var userData: js.UndefOr[js.Array[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](
    exhaustiveFacetsCount: scala.Boolean,
    exhaustiveNbHits: scala.Boolean,
    hits: js.Array[T],
    hitsPerPage: scala.Double,
    nbHits: scala.Double,
    nbPages: scala.Double,
    page: scala.Double,
    params: java.lang.String,
    processingTimeMS: scala.Double,
    query: java.lang.String,
    abTestVariantID: scala.Int | scala.Double = null,
    aroundLatLng: java.lang.String = null,
    automaticRadius: java.lang.String = null,
    cursor: java.lang.String = null,
    facets: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[scala.Double]] = null,
    facets_stats: org.scalablytyped.runtime.StringDictionary[algoliasearchLib.Anon_Avg] = null,
    index: java.lang.String = null,
    indexUsed: java.lang.String = null,
    message: java.lang.String = null,
    parsedQuery: java.lang.String = null,
    processed: js.UndefOr[scala.Boolean] = js.undefined,
    queryAfterRemoval: java.lang.String = null,
    queryID: java.lang.String = null,
    serverUsed: java.lang.String = null,
    userData: js.Array[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): Response[T] = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount, exhaustiveNbHits = exhaustiveNbHits, hits = hits, hitsPerPage = hitsPerPage, nbHits = nbHits, nbPages = nbPages, page = page, params = params, processingTimeMS = processingTimeMS, query = query)
    if (abTestVariantID != null) __obj.updateDynamic("abTestVariantID")(abTestVariantID.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng)
    if (automaticRadius != null) __obj.updateDynamic("automaticRadius")(automaticRadius)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (facets != null) __obj.updateDynamic("facets")(facets)
    if (facets_stats != null) __obj.updateDynamic("facets_stats")(facets_stats)
    if (index != null) __obj.updateDynamic("index")(index)
    if (indexUsed != null) __obj.updateDynamic("indexUsed")(indexUsed)
    if (message != null) __obj.updateDynamic("message")(message)
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery)
    if (!js.isUndefined(processed)) __obj.updateDynamic("processed")(processed)
    if (queryAfterRemoval != null) __obj.updateDynamic("queryAfterRemoval")(queryAfterRemoval)
    if (queryID != null) __obj.updateDynamic("queryID")(queryID)
    if (serverUsed != null) __obj.updateDynamic("serverUsed")(serverUsed)
    if (userData != null) __obj.updateDynamic("userData")(userData)
    __obj.asInstanceOf[Response[T]]
  }
}

