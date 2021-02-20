package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Answer
import typings.algoliaClientSearch.anon.Avg
import typings.algoliaClientSearch.anon.Match
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.SearchResponse<TObject> & {  hits :std.Array<@algolia/client-search.@algolia/client-search.Hit<TObject & {  _answer :{  extract :string,   score :number,   extractAttribute :string} | undefined}>>} */
@js.native
trait FindAnswersResponse[TObject] extends StObject {
  
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
  var hits: js.Array[Hit[TObject]] with (js.Array[Hit[TObject with Answer]]) = js.native
  
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
object FindAnswersResponse {
  
  @scala.inline
  def apply[TObject](
    exhaustiveNbHits: Boolean,
    hits: js.Array[Hit[TObject]] with (js.Array[Hit[TObject with Answer]]),
    hitsPerPage: Double,
    nbHits: Double,
    nbPages: Double,
    page: Double,
    params: String,
    processingTimeMS: Double,
    query: String
  ): FindAnswersResponse[TObject] = {
    val __obj = js.Dynamic.literal(exhaustiveNbHits = exhaustiveNbHits.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], nbPages = nbPages.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindAnswersResponse[TObject]]
  }
  
  @scala.inline
  implicit class FindAnswersResponseMutableBuilder[Self <: FindAnswersResponse[_], TObject] (val x: Self with FindAnswersResponse[TObject]) extends AnyVal {
    
    @scala.inline
    def setAbTestVariantID(value: Double): Self = StObject.set(x, "abTestVariantID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbTestVariantIDUndefined: Self = StObject.set(x, "abTestVariantID", js.undefined)
    
    @scala.inline
    def setAppliedRules(value: js.Array[Record[String, _]]): Self = StObject.set(x, "appliedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppliedRulesUndefined: Self = StObject.set(x, "appliedRules", js.undefined)
    
    @scala.inline
    def setAppliedRulesVarargs(value: (Record[String, js.Any])*): Self = StObject.set(x, "appliedRules", js.Array(value :_*))
    
    @scala.inline
    def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    @scala.inline
    def setAutomaticRadius(value: String): Self = StObject.set(x, "automaticRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticRadiusUndefined: Self = StObject.set(x, "automaticRadius", js.undefined)
    
    @scala.inline
    def setExhaustiveFacetsCount(value: Boolean): Self = StObject.set(x, "exhaustiveFacetsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExhaustiveFacetsCountUndefined: Self = StObject.set(x, "exhaustiveFacetsCount", js.undefined)
    
    @scala.inline
    def setExhaustiveNbHits(value: Boolean): Self = StObject.set(x, "exhaustiveNbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplain(value: Match): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setFacets(value: Record[String, Record[String, Double]]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsStats(value: Record[String, Avg]): Self = StObject.set(x, "facetsStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsStatsUndefined: Self = StObject.set(x, "facetsStats", js.undefined)
    
    @scala.inline
    def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    @scala.inline
    def setHits(value: js.Array[Hit[TObject]] with (js.Array[Hit[TObject with Answer]])): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setIndexUsed(value: String): Self = StObject.set(x, "indexUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUsedUndefined: Self = StObject.set(x, "indexUsed", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedQuery(value: String): Self = StObject.set(x, "parsedQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedQueryUndefined: Self = StObject.set(x, "parsedQuery", js.undefined)
    
    @scala.inline
    def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryAfterRemoval(value: String): Self = StObject.set(x, "queryAfterRemoval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryAfterRemovalUndefined: Self = StObject.set(x, "queryAfterRemoval", js.undefined)
    
    @scala.inline
    def setQueryID(value: String): Self = StObject.set(x, "queryID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryIDUndefined: Self = StObject.set(x, "queryID", js.undefined)
    
    @scala.inline
    def setServerUsed(value: String): Self = StObject.set(x, "serverUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUsedUndefined: Self = StObject.set(x, "serverUsed", js.undefined)
    
    @scala.inline
    def setUserData(value: js.Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
