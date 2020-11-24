package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Avg
import typings.algoliaClientSearch.anon.Match
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResponse[TObject] extends js.Object {
  
  /**
    * In case of AB test, reports the variant ID used. The variant ID is the position in the array of variants (starting at 1).
    */
  var abTestVariantID: js.UndefOr[Double] = js.native
  
  /**
    * Rules applied to the query.
    */
  var appliedRules: js.UndefOr[js.Array[Record[String, _]]] = js.native
  
  /**
    * The computed geo location.
    *
    * Format: "lat,lng", where the latitude and longitude are expressed as decimal floating point number.
    */
  var aroundLatLng: js.UndefOr[String] = js.native
  
  /**
    * The automatically computed radius.
    */
  var automaticRadius: js.UndefOr[String] = js.native
  
  /**
    * Whether the facet count is exhaustive (true) or approximate (false).
    */
  var exhaustiveFacetsCount: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the nbHits is exhaustive (true) or approximate (false).
    *
    * An approximation is done when the query takes more than 50ms to be
    * processed (this can happen when using complex filters on millions on records).
    */
  var exhaustiveNbHits: Boolean = js.native
  
  /**
    * The explanation of the decompounding at query time.
    */
  var explain: js.UndefOr[Match] = js.native
  
  /**
    * A mapping of each facet name to the corresponding facet counts.
    */
  var facets: js.UndefOr[Record[String, Record[String, Double]]] = js.native
  
  /**
    * Statistics for numerical facets.
    */
  var facetsStats: js.UndefOr[Record[String, Avg]] = js.native
  
  /**
    * The hits returned by the search.
    *
    * Hits are ordered according to the ranking or sorting of the index being queried.
    */
  var hits: js.Array[Hit[TObject]] = js.native
  
  /**
    * Maximum number of hits returned per page.
    */
  var hitsPerPage: Double = js.native
  
  /**
    * Index name used for the query.
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * Index name used for the query. In case of AB test, the index targetted isn’t always the index used by the query.
    */
  var indexUsed: js.UndefOr[String] = js.native
  
  /**
    * Number of hits returned (used only with offset)
    */
  var length: js.UndefOr[Double] = js.native
  
  /**
    * Used to return warnings about the query.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Number of hits matched by the query.
    */
  var nbHits: Double = js.native
  
  /**
    * Number of pages returned.
    *
    * Calculation is based on the total number of hits (nbHits) divided by the
    * number of hits per page (hitsPerPage), rounded up to the nearest integer.
    */
  var nbPages: Double = js.native
  
  /**
    * The offset of the first hit to returned.
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Index of the current page (zero-based).
    */
  var page: Double = js.native
  
  /**
    * A url-encoded string of all search parameters.
    */
  var params: String = js.native
  
  /**
    * The query string that will be searched, after normalization.
    */
  var parsedQuery: js.UndefOr[String] = js.native
  
  /**
    * Time the server took to process the request, in milliseconds. This does not include network time.
    */
  var processingTimeMS: Double = js.native
  
  /**
    * The query used to search. Accepts every character, and every character entered will be used in the search.
    *
    * An empty query can be used to fetch all records.
    */
  var query: String = js.native
  
  /**
    * A markup text indicating which parts of the original query have been removed in order to retrieve a non-empty result set.
    */
  var queryAfterRemoval: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier of the search query, to be sent in Insights methods. This identifier links events back to the search query it represents.
    *
    * Returned only if clickAnalytics is true.
    */
  var queryID: js.UndefOr[String] = js.native
  
  /**
    * Actual host name of the server that processed the request.
    *
    * Our DNS supports automatic failover and load balancing, so this may differ from the host name used in the request.
    */
  var serverUsed: js.UndefOr[String] = js.native
  
  /**
    * Custom user data.
    */
  var userData: js.UndefOr[js.Any] = js.native
}
object SearchResponse {
  
  @scala.inline
  def apply[TObject](
    exhaustiveNbHits: Boolean,
    hits: js.Array[Hit[TObject]],
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String
  ): SearchResponse[TObject] = {
    val __obj = js.Dynamic.literal(exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse[TObject]]
  }
  
  @scala.inline
  implicit class SearchResponseOps[Self <: SearchResponse[_], TObject] (val x: Self with SearchResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExhaustiveNbHits(value: Boolean): Self = this.set("exhaustiveNbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsVarargs(value: Hit[TObject]*): Self = this.set("hits", js.Array(value :_*))
    
    @scala.inline
    def setHits(value: js.Array[Hit[TObject]]): Self = this.set("hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbPages(value: Double): Self = this.set("nbPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = this.set("processingTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbTestVariantID(value: Double): Self = this.set("abTestVariantID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbTestVariantID: Self = this.set("abTestVariantID", js.undefined)
    
    @scala.inline
    def setAppliedRulesVarargs(value: (Record[String, js.Any])*): Self = this.set("appliedRules", js.Array(value :_*))
    
    @scala.inline
    def setAppliedRules(value: js.Array[Record[String, _]]): Self = this.set("appliedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedRules: Self = this.set("appliedRules", js.undefined)
    
    @scala.inline
    def setAroundLatLng(value: String): Self = this.set("aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAroundLatLng: Self = this.set("aroundLatLng", js.undefined)
    
    @scala.inline
    def setAutomaticRadius(value: String): Self = this.set("automaticRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticRadius: Self = this.set("automaticRadius", js.undefined)
    
    @scala.inline
    def setExhaustiveFacetsCount(value: Boolean): Self = this.set("exhaustiveFacetsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExhaustiveFacetsCount: Self = this.set("exhaustiveFacetsCount", js.undefined)
    
    @scala.inline
    def setExplain(value: Match): Self = this.set("explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    
    @scala.inline
    def setFacets(value: Record[String, Record[String, Double]]): Self = this.set("facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacets: Self = this.set("facets", js.undefined)
    
    @scala.inline
    def setFacetsStats(value: Record[String, Avg]): Self = this.set("facetsStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetsStats: Self = this.set("facetsStats", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIndexUsed(value: String): Self = this.set("indexUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexUsed: Self = this.set("indexUsed", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setParsedQuery(value: String): Self = this.set("parsedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParsedQuery: Self = this.set("parsedQuery", js.undefined)
    
    @scala.inline
    def setQueryAfterRemoval(value: String): Self = this.set("queryAfterRemoval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryAfterRemoval: Self = this.set("queryAfterRemoval", js.undefined)
    
    @scala.inline
    def setQueryID(value: String): Self = this.set("queryID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryID: Self = this.set("queryID", js.undefined)
    
    @scala.inline
    def setServerUsed(value: String): Self = this.set("serverUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerUsed: Self = this.set("serverUsed", js.undefined)
    
    @scala.inline
    def setUserData(value: js.Any): Self = this.set("userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserData: Self = this.set("userData", js.undefined)
  }
}
