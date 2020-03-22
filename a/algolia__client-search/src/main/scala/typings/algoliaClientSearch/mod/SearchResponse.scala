package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.AnonAvg
import typings.algoliaClientSearch.AnonMatch
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse[TObject] extends js.Object {
  /**
    * In case of AB test, reports the variant ID used. The variant ID is the position in the array of variants (starting at 1).
    */
  val abTestVariantID: js.UndefOr[Double] = js.undefined
  /**
    * Rules applied to the query.
    */
  val appliedRules: js.UndefOr[js.Array[Record[String, _]]] = js.undefined
  /**
    * The computed geo location.
    *
    * Format: "lat,lng", where the latitude and longitude are expressed as decimal floating point number.
    */
  val aroundLatLng: js.UndefOr[String] = js.undefined
  /**
    * The automatically computed radius.
    */
  val automaticRadius: js.UndefOr[String] = js.undefined
  /**
    * Whether the facet count is exhaustive (true) or approximate (false).
    */
  val exhaustiveFacetsCount: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the nbHits is exhaustive (true) or approximate (false).
    *
    * An approximation is done when the query takes more than 50ms to be
    * processed (this can happen when using complex filters on millions on records).
    */
  val exhaustiveNbHits: Boolean
  /**
    * The explanation of the decompounding at query time.
    */
  val explain: js.UndefOr[AnonMatch] = js.undefined
  /**
    * A mapping of each facet name to the corresponding facet counts.
    */
  val facets: js.UndefOr[Record[String, Record[String, Double]]] = js.undefined
  /**
    * Statistics for numerical facets.
    */
  val facetsStats: js.UndefOr[Record[String, AnonAvg]] = js.undefined
  /**
    * The hits returned by the search.
    *
    * Hits are ordered according to the ranking or sorting of the index being queried.
    */
  val hits: js.Array[TObject with ObjectWithObjectID]
  /**
    * Maximum number of hits returned per page.
    */
  val hitsPerPage: Double
  /**
    * Index name used for the query.
    */
  val index: js.UndefOr[String] = js.undefined
  /**
    * Index name used for the query. In case of AB test, the index targetted isn’t always the index used by the query.
    */
  val indexUsed: js.UndefOr[String] = js.undefined
  /**
    * Number of hits returned (used only with offset)
    */
  val length: js.UndefOr[Double] = js.undefined
  /**
    * Used to return warnings about the query.
    */
  val message: js.UndefOr[String] = js.undefined
  /**
    * Number of hits matched by the query.
    */
  val nbHits: Double
  /**
    * Number of pages returned.
    *
    * Calculation is based on the total number of hits (nbHits) divided by the
    * number of hits per page (hitsPerPage), rounded up to the nearest integer.
    */
  val nbPages: Double
  /**
    * The offset of the first hit to returned.
    */
  val offset: js.UndefOr[Double] = js.undefined
  /**
    * Index of the current page (zero-based).
    */
  val page: Double
  /**
    * A url-encoded string of all search parameters.
    */
  val params: String
  /**
    * The query string that will be searched, after normalization.
    */
  val parsedQuery: js.UndefOr[String] = js.undefined
  /**
    * Time the server took to process the request, in milliseconds. This does not include network time.
    */
  val processingTimeMS: Double
  /**
    * The query used to search. Accepts every character, and every character entered will be used in the search.
    *
    * An empty query can be used to fetch all records.
    */
  val query: String
  /**
    * A markup text indicating which parts of the original query have been removed in order to retrieve a non-empty result set.
    */
  val queryAfterRemoval: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier of the search query, to be sent in Insights methods. This identifier links events back to the search query it represents.
    *
    * Returned only if clickAnalytics is true.
    */
  val queryID: js.UndefOr[String] = js.undefined
  /**
    * Actual host name of the server that processed the request.
    *
    * Our DNS supports automatic failover and load balancing, so this may differ from the host name used in the request.
    */
  val serverUsed: js.UndefOr[String] = js.undefined
  /**
    * Custom user data.
    */
  val userData: js.UndefOr[js.Any] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply[TObject](
    exhaustiveNbHits: Boolean,
    hits: js.Array[TObject with ObjectWithObjectID],
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String,
    abTestVariantID: Int | Double = null,
    appliedRules: js.Array[Record[String, _]] = null,
    aroundLatLng: String = null,
    automaticRadius: String = null,
    exhaustiveFacetsCount: js.UndefOr[Boolean] = js.undefined,
    explain: AnonMatch = null,
    facets: Record[String, Record[String, Double]] = null,
    facetsStats: Record[String, AnonAvg] = null,
    index: String = null,
    indexUsed: String = null,
    length: Int | Double = null,
    message: String = null,
    offset: Int | Double = null,
    parsedQuery: String = null,
    queryAfterRemoval: String = null,
    queryID: String = null,
    serverUsed: String = null,
    userData: js.Any = null
  ): SearchResponse[TObject] = {
    val __obj = js.Dynamic.literal(exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    if (abTestVariantID != null) __obj.updateDynamic("abTestVariantID")(abTestVariantID.asInstanceOf[js.Any])
    if (appliedRules != null) __obj.updateDynamic("appliedRules")(appliedRules.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (automaticRadius != null) __obj.updateDynamic("automaticRadius")(automaticRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(exhaustiveFacetsCount)) __obj.updateDynamic("exhaustiveFacetsCount")(exhaustiveFacetsCount.asInstanceOf[js.Any])
    if (explain != null) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (facetsStats != null) __obj.updateDynamic("facetsStats")(facetsStats.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (indexUsed != null) __obj.updateDynamic("indexUsed")(indexUsed.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (queryAfterRemoval != null) __obj.updateDynamic("queryAfterRemoval")(queryAfterRemoval.asInstanceOf[js.Any])
    if (queryID != null) __obj.updateDynamic("queryID")(queryID.asInstanceOf[js.Any])
    if (serverUsed != null) __obj.updateDynamic("serverUsed")(serverUsed.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse[TObject]]
  }
}

