package typings.algoliasearch.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearch.anon.Avg
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
  var abTestVariantID: js.UndefOr[Double] = js.undefined
  /**
    * The computed geo location. Warning: for legacy reasons, this parameter is
    * a string and not an object. Format: ${lat},${lng}, where the latitude and
    * longitude are expressed as decimal floating point numbers.
    * Only returned when aroundLatLngViaIP or aroundLatLng is set.
    */
  var aroundLatLng: js.UndefOr[String] = js.undefined
  /**
    * The automatically computed radius. For legacy reasons, this parameter is a
    * string and not an integer.
    * Only returned for geo queries without an explicitly specified radius (see aroundRadius).
    */
  var automaticRadius: js.UndefOr[String] = js.undefined
  /**
    * The cursor is only set when browsing the index.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Whether the facet count is exhaustive (true) or approximate (false).
    */
  var exhaustiveFacetsCount: Boolean
  /**
    * Whether the nbHits is exhaustive (true) or approximate (false).
    * An approximation is done when the query takes more than 50ms to be processed
    * (this can happen when using complex filters on millions on records).
    */
  var exhaustiveNbHits: Boolean
  /**
    * A mapping of each facet name to the corresponding facet counts.
    */
  var facets: js.UndefOr[StringDictionary[StringDictionary[Double]]] = js.undefined
  /**
    * Statistics for numerical facets.
    */
  var facets_stats: js.UndefOr[StringDictionary[Avg]] = js.undefined
  /**
    * Contains all the hits matching the query
    */
  var hits: js.Array[T]
  /**
    * Number of hits per pages
    */
  var hitsPerPage: Double
  /**
    * The index name is only set when searching multiple indices.
    */
  var index: js.UndefOr[String] = js.undefined
  /**
    * Index name used for the query. In the case of an A/B test, the targeted
    * index isn’t always the index used by the query.
    * Returned only if getRankingInfo is set to true.
    */
  var indexUsed: js.UndefOr[String] = js.undefined
  /**
    * Used to return warnings about the query.
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Number of total hits matching the query
    */
  var nbHits: Double
  /**
    * Number of pages
    */
  var nbPages: Double
  /**
    * Current page
    */
  var page: Double
  /**
    * GET parameters used to perform the search
    */
  var params: String
  /**
    * The query string that will be searched, after normalization. Normalization
    * includes removing stop words (if removeStopWords is enabled), and transforming
    * portions of the query string into phrase queries (see advancedSyntax).
    * Returned only if getRankingInfo is set to true.
    */
  var parsedQuery: js.UndefOr[String] = js.undefined
  /**
    * Whether the query was processed. Only returned when strategy: stopIfEnoughmatches.
    */
  var processed: js.UndefOr[Boolean] = js.undefined
  /**
    * Engine processing time (excluding network transfer)
    */
  var processingTimeMS: Double
  /**
    * Query used to perform the search
    */
  var query: String
  /**
    * A markup text indicating which parts of the original query have been removed
    * in order to retrieve a non-empty result set.
    * The removed parts are surrounded by <em> tags.
    * Only returned when removeWordsIfNoResults is set to lastWords or firstWords.
    */
  var queryAfterRemoval: js.UndefOr[String] = js.undefined
  /**
    * The unique identifier of this search, only returned if clickAnalytics: true
    */
  var queryID: js.UndefOr[String] = js.undefined
  /**
    * Actual host name of the server that processed the request. Our DNS
    * supports automatic failover and load balancing, so this may differ from
    * the host name used in the request.
    * Returned only if getRankingInfo is set to true.
    */
  var serverUsed: js.UndefOr[String] = js.undefined
  /**
    * user data is returned if a matching query rule was set up to do so
    */
  var userData: js.UndefOr[js.Array[StringDictionary[_]]] = js.undefined
}

object Response {
  @scala.inline
  def apply[T](
    exhaustiveFacetsCount: Boolean,
    exhaustiveNbHits: Boolean,
    hits: js.Array[T],
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String,
    abTestVariantID: js.UndefOr[Double] = js.undefined,
    aroundLatLng: String = null,
    automaticRadius: String = null,
    cursor: String = null,
    facets: StringDictionary[StringDictionary[Double]] = null,
    facets_stats: StringDictionary[Avg] = null,
    index: String = null,
    indexUsed: String = null,
    message: String = null,
    parsedQuery: String = null,
    processed: js.UndefOr[Boolean] = js.undefined,
    queryAfterRemoval: String = null,
    queryID: String = null,
    serverUsed: String = null,
    userData: js.Array[StringDictionary[_]] = null
  ): Response[T] = {
    val __obj = js.Dynamic.literal(exhaustiveFacetsCount = exhaustiveFacetsCount.asInstanceOf[js.Any], exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (!js.isUndefined(abTestVariantID)) __obj.updateDynamic("abTestVariantID")(abTestVariantID.get.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (automaticRadius != null) __obj.updateDynamic("automaticRadius")(automaticRadius.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (facets_stats != null) __obj.updateDynamic("facets_stats")(facets_stats.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexUsed != null) __obj.updateDynamic("indexUsed")(indexUsed.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(processed)) __obj.updateDynamic("processed")(processed.get.asInstanceOf[js.Any])
    if (queryAfterRemoval != null) __obj.updateDynamic("queryAfterRemoval")(queryAfterRemoval.asInstanceOf[js.Any])
    if (queryID != null) __obj.updateDynamic("queryID")(queryID.asInstanceOf[js.Any])
    if (serverUsed != null) __obj.updateDynamic("serverUsed")(serverUsed.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
}

