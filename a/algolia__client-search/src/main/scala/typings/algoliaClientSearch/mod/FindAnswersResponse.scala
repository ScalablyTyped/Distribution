package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.Answer
import typings.algoliaClientSearch.anon.Avg
import typings.algoliaClientSearch.anon.FacetOrdering
import typings.algoliaClientSearch.anon.Match
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@algolia/client-search.@algolia/client-search.SearchResponse<TObject>, 'hits'> & {  hits :std.Array<@algolia/client-search.@algolia/client-search.Hit<TObject & {  _answer :{  extract :string,   score :number,   extractAttribute :string} | undefined}>>} */
trait FindAnswersResponse[TObject] extends StObject {
  
  var abTestID: js.UndefOr[Double] = js.undefined
  
  var abTestVariantID: js.UndefOr[Double] = js.undefined
  
  var appliedRelevancyStrictness: js.UndefOr[Double] = js.undefined
  
  var appliedRules: js.UndefOr[js.Array[Record[String, Any]]] = js.undefined
  
  var aroundLatLng: js.UndefOr[String] = js.undefined
  
  var automaticRadius: js.UndefOr[String] = js.undefined
  
  var exhaustiveFacetsCount: js.UndefOr[Boolean] = js.undefined
  
  var exhaustiveNbHits: Boolean
  
  var explain: js.UndefOr[Match] = js.undefined
  
  var facets: js.UndefOr[Record[String, Record[String, Double]]] = js.undefined
  
  var facets_stats: js.UndefOr[Record[String, Avg]] = js.undefined
  
  /**
    * The hits returned by the search.
    *
    * Hits are ordered according to the ranking or sorting of the index being queried.
    */
  var hits: js.Array[Hit[TObject & Answer]]
  
  var hitsPerPage: Double
  
  var index: js.UndefOr[String] = js.undefined
  
  var indexUsed: js.UndefOr[String] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var nbHits: Double
  
  var nbPages: Double
  
  var nbSortedHits: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var page: Double
  
  var params: String
  
  var parsedQuery: js.UndefOr[String] = js.undefined
  
  var processingTimeMS: Double
  
  var query: String
  
  var queryAfterRemoval: js.UndefOr[String] = js.undefined
  
  var queryID: js.UndefOr[String] = js.undefined
  
  var renderingContent: js.UndefOr[FacetOrdering] = js.undefined
  
  var serverUsed: js.UndefOr[String] = js.undefined
  
  var userData: js.UndefOr[Any] = js.undefined
}
object FindAnswersResponse {
  
  inline def apply[TObject](
    exhaustiveNbHits: Boolean,
    hits: js.Array[Hit[TObject & Answer]],
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
  implicit open class MutableBuilder[Self <: FindAnswersResponse[?], TObject] (val x: Self & FindAnswersResponse[TObject]) extends AnyVal {
    
    inline def setAbTestID(value: Double): Self = StObject.set(x, "abTestID", value.asInstanceOf[js.Any])
    
    inline def setAbTestIDUndefined: Self = StObject.set(x, "abTestID", js.undefined)
    
    inline def setAbTestVariantID(value: Double): Self = StObject.set(x, "abTestVariantID", value.asInstanceOf[js.Any])
    
    inline def setAbTestVariantIDUndefined: Self = StObject.set(x, "abTestVariantID", js.undefined)
    
    inline def setAppliedRelevancyStrictness(value: Double): Self = StObject.set(x, "appliedRelevancyStrictness", value.asInstanceOf[js.Any])
    
    inline def setAppliedRelevancyStrictnessUndefined: Self = StObject.set(x, "appliedRelevancyStrictness", js.undefined)
    
    inline def setAppliedRules(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "appliedRules", value.asInstanceOf[js.Any])
    
    inline def setAppliedRulesUndefined: Self = StObject.set(x, "appliedRules", js.undefined)
    
    inline def setAppliedRulesVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "appliedRules", js.Array(value*))
    
    inline def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    inline def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    inline def setAutomaticRadius(value: String): Self = StObject.set(x, "automaticRadius", value.asInstanceOf[js.Any])
    
    inline def setAutomaticRadiusUndefined: Self = StObject.set(x, "automaticRadius", js.undefined)
    
    inline def setExhaustiveFacetsCount(value: Boolean): Self = StObject.set(x, "exhaustiveFacetsCount", value.asInstanceOf[js.Any])
    
    inline def setExhaustiveFacetsCountUndefined: Self = StObject.set(x, "exhaustiveFacetsCount", js.undefined)
    
    inline def setExhaustiveNbHits(value: Boolean): Self = StObject.set(x, "exhaustiveNbHits", value.asInstanceOf[js.Any])
    
    inline def setExplain(value: Match): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setFacets(value: Record[String, Record[String, Double]]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacets_stats(value: Record[String, Avg]): Self = StObject.set(x, "facets_stats", value.asInstanceOf[js.Any])
    
    inline def setFacets_statsUndefined: Self = StObject.set(x, "facets_stats", js.undefined)
    
    inline def setHits(value: js.Array[Hit[TObject & Answer]]): Self = StObject.set(x, "hits", value.asInstanceOf[js.Any])
    
    inline def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    inline def setHitsVarargs(value: (Hit[TObject & Answer])*): Self = StObject.set(x, "hits", js.Array(value*))
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndexUsed(value: String): Self = StObject.set(x, "indexUsed", value.asInstanceOf[js.Any])
    
    inline def setIndexUsedUndefined: Self = StObject.set(x, "indexUsed", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNbHits(value: Double): Self = StObject.set(x, "nbHits", value.asInstanceOf[js.Any])
    
    inline def setNbPages(value: Double): Self = StObject.set(x, "nbPages", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHits(value: Double): Self = StObject.set(x, "nbSortedHits", value.asInstanceOf[js.Any])
    
    inline def setNbSortedHitsUndefined: Self = StObject.set(x, "nbSortedHits", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setParams(value: String): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParsedQuery(value: String): Self = StObject.set(x, "parsedQuery", value.asInstanceOf[js.Any])
    
    inline def setParsedQueryUndefined: Self = StObject.set(x, "parsedQuery", js.undefined)
    
    inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryAfterRemoval(value: String): Self = StObject.set(x, "queryAfterRemoval", value.asInstanceOf[js.Any])
    
    inline def setQueryAfterRemovalUndefined: Self = StObject.set(x, "queryAfterRemoval", js.undefined)
    
    inline def setQueryID(value: String): Self = StObject.set(x, "queryID", value.asInstanceOf[js.Any])
    
    inline def setQueryIDUndefined: Self = StObject.set(x, "queryID", js.undefined)
    
    inline def setRenderingContent(value: FacetOrdering): Self = StObject.set(x, "renderingContent", value.asInstanceOf[js.Any])
    
    inline def setRenderingContentUndefined: Self = StObject.set(x, "renderingContent", js.undefined)
    
    inline def setServerUsed(value: String): Self = StObject.set(x, "serverUsed", value.asInstanceOf[js.Any])
    
    inline def setServerUsedUndefined: Self = StObject.set(x, "serverUsed", js.undefined)
    
    inline def setUserData(value: Any): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
