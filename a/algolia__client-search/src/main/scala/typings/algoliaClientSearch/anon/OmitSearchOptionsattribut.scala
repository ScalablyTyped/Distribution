package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.algoliaClientSearchStrings.all
import typings.algoliaClientSearch.algoliaClientSearchStrings.alpha
import typings.algoliaClientSearch.algoliaClientSearchStrings.attribute
import typings.algoliaClientSearch.algoliaClientSearchStrings.count
import typings.algoliaClientSearch.algoliaClientSearchStrings.exactPhrase
import typings.algoliaClientSearch.algoliaClientSearchStrings.excludeWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals
import typings.algoliaClientSearch.algoliaClientSearchStrings.min
import typings.algoliaClientSearch.algoliaClientSearchStrings.multiWordsSynonym
import typings.algoliaClientSearch.algoliaClientSearchStrings.none
import typings.algoliaClientSearch.algoliaClientSearchStrings.singleWordSynonym
import typings.algoliaClientSearch.algoliaClientSearchStrings.strict
import typings.algoliaClientSearch.algoliaClientSearchStrings.word
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@algolia/client-search.@algolia/client-search.SearchOptions, 'attributesToSnippet' | 'hitsPerPage' | 'queryType' | 'naturalLanguages' | 'removeStopWords' | 'ignorePlurals' | 'removeWordsIfNoResults'> */
trait OmitSearchOptionsattribut extends StObject {
  
  var advancedSyntax: js.UndefOr[Boolean] = js.undefined
  
  var advancedSyntaxFeatures: js.UndefOr[js.Array[exactPhrase | excludeWords]] = js.undefined
  
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined
  
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.undefined
  
  var analytics: js.UndefOr[Boolean] = js.undefined
  
  var analyticsTags: js.UndefOr[js.Array[String]] = js.undefined
  
  var aroundLatLng: js.UndefOr[String] = js.undefined
  
  var aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined
  
  var aroundPrecision: js.UndefOr[Double | js.Array[From]] = js.undefined
  
  var aroundRadius: js.UndefOr[Double | all] = js.undefined
  
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.undefined
  
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  
  var clickAnalytics: js.UndefOr[Boolean] = js.undefined
  
  var decompoundQuery: js.UndefOr[Boolean] = js.undefined
  
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var distinct: js.UndefOr[Boolean | Double] = js.undefined
  
  var enableABTest: js.UndefOr[Boolean] = js.undefined
  
  var enablePersonalization: js.UndefOr[Boolean] = js.undefined
  
  var enableReRanking: js.UndefOr[Boolean] = js.undefined
  
  var enableRules: js.UndefOr[Boolean] = js.undefined
  
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.undefined
  
  var explain: js.UndefOr[js.Array[String]] = js.undefined
  
  var facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined
  
  var facets: js.UndefOr[js.Array[String]] = js.undefined
  
  var filters: js.UndefOr[String] = js.undefined
  
  var getRankingInfo: js.UndefOr[Boolean] = js.undefined
  
  var highlightPostTag: js.UndefOr[String] = js.undefined
  
  var highlightPreTag: js.UndefOr[String] = js.undefined
  
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]] | String] = js.undefined
  
  var insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var maxFacetHits: js.UndefOr[Double] = js.undefined
  
  var maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  
  var minProximity: js.UndefOr[Double] = js.undefined
  
  var minWordSizefor1Typo: js.UndefOr[Double] = js.undefined
  
  var minWordSizefor2Typos: js.UndefOr[Double] = js.undefined
  
  var minimumAroundRadius: js.UndefOr[Double] = js.undefined
  
  var numericFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var optionalFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  var optionalWords: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var page: js.UndefOr[Double] = js.undefined
  
  var percentileComputation: js.UndefOr[Boolean] = js.undefined
  
  var personalizationImpact: js.UndefOr[Double] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var queryLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
  var reRankingApplyFilter: js.UndefOr[String | (js.Array[js.Array[String] | String]) | Null] = js.undefined
  
  var relevancyStrictness: js.UndefOr[Double] = js.undefined
  
  var replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined
  
  var responseFields: js.UndefOr[js.Array[String]] = js.undefined
  
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined
  
  var restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var ruleContexts: js.UndefOr[js.Array[String]] = js.undefined
  
  var similarQuery: js.UndefOr[String] = js.undefined
  
  var snippetEllipsisText: js.UndefOr[String] = js.undefined
  
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.undefined
  
  var sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined
  
  var synonyms: js.UndefOr[Boolean] = js.undefined
  
  var tagFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  
  var typoTolerance: js.UndefOr[Boolean | min | strict] = js.undefined
  
  var userToken: js.UndefOr[String] = js.undefined
}
object OmitSearchOptionsattribut {
  
  inline def apply(): OmitSearchOptionsattribut = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitSearchOptionsattribut]
  }
  
  extension [Self <: OmitSearchOptionsattribut](x: Self) {
    
    inline def setAdvancedSyntax(value: Boolean): Self = StObject.set(x, "advancedSyntax", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = StObject.set(x, "advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSyntaxFeaturesUndefined: Self = StObject.set(x, "advancedSyntaxFeatures", js.undefined)
    
    inline def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = StObject.set(x, "advancedSyntaxFeatures", js.Array(value*))
    
    inline def setAdvancedSyntaxUndefined: Self = StObject.set(x, "advancedSyntax", js.undefined)
    
    inline def setAllowTyposOnNumericTokens(value: Boolean): Self = StObject.set(x, "allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    
    inline def setAllowTyposOnNumericTokensUndefined: Self = StObject.set(x, "allowTyposOnNumericTokens", js.undefined)
    
    inline def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = StObject.set(x, "alternativesAsExact", value.asInstanceOf[js.Any])
    
    inline def setAlternativesAsExactUndefined: Self = StObject.set(x, "alternativesAsExact", js.undefined)
    
    inline def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = StObject.set(x, "alternativesAsExact", js.Array(value*))
    
    inline def setAnalytics(value: Boolean): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsTags(value: js.Array[String]): Self = StObject.set(x, "analyticsTags", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsTagsUndefined: Self = StObject.set(x, "analyticsTags", js.undefined)
    
    inline def setAnalyticsTagsVarargs(value: String*): Self = StObject.set(x, "analyticsTags", js.Array(value*))
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    inline def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    inline def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    inline def setAroundLatLngViaIP(value: Boolean): Self = StObject.set(x, "aroundLatLngViaIP", value.asInstanceOf[js.Any])
    
    inline def setAroundLatLngViaIPUndefined: Self = StObject.set(x, "aroundLatLngViaIP", js.undefined)
    
    inline def setAroundPrecision(value: Double | js.Array[From]): Self = StObject.set(x, "aroundPrecision", value.asInstanceOf[js.Any])
    
    inline def setAroundPrecisionUndefined: Self = StObject.set(x, "aroundPrecision", js.undefined)
    
    inline def setAroundPrecisionVarargs(value: From*): Self = StObject.set(x, "aroundPrecision", js.Array(value*))
    
    inline def setAroundRadius(value: Double | all): Self = StObject.set(x, "aroundRadius", value.asInstanceOf[js.Any])
    
    inline def setAroundRadiusUndefined: Self = StObject.set(x, "aroundRadius", js.undefined)
    
    inline def setAttributesToHighlight(value: js.Array[String]): Self = StObject.set(x, "attributesToHighlight", value.asInstanceOf[js.Any])
    
    inline def setAttributesToHighlightUndefined: Self = StObject.set(x, "attributesToHighlight", js.undefined)
    
    inline def setAttributesToHighlightVarargs(value: String*): Self = StObject.set(x, "attributesToHighlight", js.Array(value*))
    
    inline def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    inline def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    inline def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value*))
    
    inline def setClickAnalytics(value: Boolean): Self = StObject.set(x, "clickAnalytics", value.asInstanceOf[js.Any])
    
    inline def setClickAnalyticsUndefined: Self = StObject.set(x, "clickAnalytics", js.undefined)
    
    inline def setDecompoundQuery(value: Boolean): Self = StObject.set(x, "decompoundQuery", value.asInstanceOf[js.Any])
    
    inline def setDecompoundQueryUndefined: Self = StObject.set(x, "decompoundQuery", js.undefined)
    
    inline def setDisableExactOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableExactOnAttributes", value.asInstanceOf[js.Any])
    
    inline def setDisableExactOnAttributesUndefined: Self = StObject.set(x, "disableExactOnAttributes", js.undefined)
    
    inline def setDisableExactOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableExactOnAttributes", js.Array(value*))
    
    inline def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    
    inline def setDisableTypoToleranceOnAttributesUndefined: Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.undefined)
    
    inline def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.Array(value*))
    
    inline def setDistinct(value: Boolean | Double): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    inline def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    inline def setEnableABTest(value: Boolean): Self = StObject.set(x, "enableABTest", value.asInstanceOf[js.Any])
    
    inline def setEnableABTestUndefined: Self = StObject.set(x, "enableABTest", js.undefined)
    
    inline def setEnablePersonalization(value: Boolean): Self = StObject.set(x, "enablePersonalization", value.asInstanceOf[js.Any])
    
    inline def setEnablePersonalizationUndefined: Self = StObject.set(x, "enablePersonalization", js.undefined)
    
    inline def setEnableReRanking(value: Boolean): Self = StObject.set(x, "enableReRanking", value.asInstanceOf[js.Any])
    
    inline def setEnableReRankingUndefined: Self = StObject.set(x, "enableReRanking", js.undefined)
    
    inline def setEnableRules(value: Boolean): Self = StObject.set(x, "enableRules", value.asInstanceOf[js.Any])
    
    inline def setEnableRulesUndefined: Self = StObject.set(x, "enableRules", js.undefined)
    
    inline def setExactOnSingleWordQuery(value: attribute | none | word): Self = StObject.set(x, "exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    
    inline def setExactOnSingleWordQueryUndefined: Self = StObject.set(x, "exactOnSingleWordQuery", js.undefined)
    
    inline def setExplain(value: js.Array[String]): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setExplainVarargs(value: String*): Self = StObject.set(x, "explain", js.Array(value*))
    
    inline def setFacetFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "facetFilters", value.asInstanceOf[js.Any])
    
    inline def setFacetFiltersUndefined: Self = StObject.set(x, "facetFilters", js.undefined)
    
    inline def setFacetFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "facetFilters", js.Array(value*))
    
    inline def setFacetingAfterDistinct(value: Boolean): Self = StObject.set(x, "facetingAfterDistinct", value.asInstanceOf[js.Any])
    
    inline def setFacetingAfterDistinctUndefined: Self = StObject.set(x, "facetingAfterDistinct", js.undefined)
    
    inline def setFacets(value: js.Array[String]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacetsVarargs(value: String*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setGetRankingInfo(value: Boolean): Self = StObject.set(x, "getRankingInfo", value.asInstanceOf[js.Any])
    
    inline def setGetRankingInfoUndefined: Self = StObject.set(x, "getRankingInfo", js.undefined)
    
    inline def setHighlightPostTag(value: String): Self = StObject.set(x, "highlightPostTag", value.asInstanceOf[js.Any])
    
    inline def setHighlightPostTagUndefined: Self = StObject.set(x, "highlightPostTag", js.undefined)
    
    inline def setHighlightPreTag(value: String): Self = StObject.set(x, "highlightPreTag", value.asInstanceOf[js.Any])
    
    inline def setHighlightPreTagUndefined: Self = StObject.set(x, "highlightPreTag", js.undefined)
    
    inline def setInsideBoundingBox(value: js.Array[js.Array[Double]] | String): Self = StObject.set(x, "insideBoundingBox", value.asInstanceOf[js.Any])
    
    inline def setInsideBoundingBoxUndefined: Self = StObject.set(x, "insideBoundingBox", js.undefined)
    
    inline def setInsideBoundingBoxVarargs(value: js.Array[Double]*): Self = StObject.set(x, "insideBoundingBox", js.Array(value*))
    
    inline def setInsidePolygon(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "insidePolygon", value.asInstanceOf[js.Any])
    
    inline def setInsidePolygonUndefined: Self = StObject.set(x, "insidePolygon", js.undefined)
    
    inline def setInsidePolygonVarargs(value: js.Array[Double]*): Self = StObject.set(x, "insidePolygon", js.Array(value*))
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMaxFacetHits(value: Double): Self = StObject.set(x, "maxFacetHits", value.asInstanceOf[js.Any])
    
    inline def setMaxFacetHitsUndefined: Self = StObject.set(x, "maxFacetHits", js.undefined)
    
    inline def setMaxValuesPerFacet(value: Double): Self = StObject.set(x, "maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    inline def setMaxValuesPerFacetUndefined: Self = StObject.set(x, "maxValuesPerFacet", js.undefined)
    
    inline def setMinProximity(value: Double): Self = StObject.set(x, "minProximity", value.asInstanceOf[js.Any])
    
    inline def setMinProximityUndefined: Self = StObject.set(x, "minProximity", js.undefined)
    
    inline def setMinWordSizefor1Typo(value: Double): Self = StObject.set(x, "minWordSizefor1Typo", value.asInstanceOf[js.Any])
    
    inline def setMinWordSizefor1TypoUndefined: Self = StObject.set(x, "minWordSizefor1Typo", js.undefined)
    
    inline def setMinWordSizefor2Typos(value: Double): Self = StObject.set(x, "minWordSizefor2Typos", value.asInstanceOf[js.Any])
    
    inline def setMinWordSizefor2TyposUndefined: Self = StObject.set(x, "minWordSizefor2Typos", js.undefined)
    
    inline def setMinimumAroundRadius(value: Double): Self = StObject.set(x, "minimumAroundRadius", value.asInstanceOf[js.Any])
    
    inline def setMinimumAroundRadiusUndefined: Self = StObject.set(x, "minimumAroundRadius", js.undefined)
    
    inline def setNumericFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "numericFilters", value.asInstanceOf[js.Any])
    
    inline def setNumericFiltersUndefined: Self = StObject.set(x, "numericFilters", js.undefined)
    
    inline def setNumericFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "numericFilters", js.Array(value*))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOptionalFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "optionalFilters", value.asInstanceOf[js.Any])
    
    inline def setOptionalFiltersUndefined: Self = StObject.set(x, "optionalFilters", js.undefined)
    
    inline def setOptionalFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "optionalFilters", js.Array(value*))
    
    inline def setOptionalWords(value: String | js.Array[String]): Self = StObject.set(x, "optionalWords", value.asInstanceOf[js.Any])
    
    inline def setOptionalWordsUndefined: Self = StObject.set(x, "optionalWords", js.undefined)
    
    inline def setOptionalWordsVarargs(value: String*): Self = StObject.set(x, "optionalWords", js.Array(value*))
    
    inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPercentileComputation(value: Boolean): Self = StObject.set(x, "percentileComputation", value.asInstanceOf[js.Any])
    
    inline def setPercentileComputationUndefined: Self = StObject.set(x, "percentileComputation", js.undefined)
    
    inline def setPersonalizationImpact(value: Double): Self = StObject.set(x, "personalizationImpact", value.asInstanceOf[js.Any])
    
    inline def setPersonalizationImpactUndefined: Self = StObject.set(x, "personalizationImpact", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguages(value: js.Array[String]): Self = StObject.set(x, "queryLanguages", value.asInstanceOf[js.Any])
    
    inline def setQueryLanguagesUndefined: Self = StObject.set(x, "queryLanguages", js.undefined)
    
    inline def setQueryLanguagesVarargs(value: String*): Self = StObject.set(x, "queryLanguages", js.Array(value*))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReRankingApplyFilter(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "reRankingApplyFilter", value.asInstanceOf[js.Any])
    
    inline def setReRankingApplyFilterNull: Self = StObject.set(x, "reRankingApplyFilter", null)
    
    inline def setReRankingApplyFilterUndefined: Self = StObject.set(x, "reRankingApplyFilter", js.undefined)
    
    inline def setReRankingApplyFilterVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "reRankingApplyFilter", js.Array(value*))
    
    inline def setRelevancyStrictness(value: Double): Self = StObject.set(x, "relevancyStrictness", value.asInstanceOf[js.Any])
    
    inline def setRelevancyStrictnessUndefined: Self = StObject.set(x, "relevancyStrictness", js.undefined)
    
    inline def setReplaceSynonymsInHighlight(value: Boolean): Self = StObject.set(x, "replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    
    inline def setReplaceSynonymsInHighlightUndefined: Self = StObject.set(x, "replaceSynonymsInHighlight", js.undefined)
    
    inline def setResponseFields(value: js.Array[String]): Self = StObject.set(x, "responseFields", value.asInstanceOf[js.Any])
    
    inline def setResponseFieldsUndefined: Self = StObject.set(x, "responseFields", js.undefined)
    
    inline def setResponseFieldsVarargs(value: String*): Self = StObject.set(x, "responseFields", js.Array(value*))
    
    inline def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = StObject.set(x, "restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    
    inline def setRestrictHighlightAndSnippetArraysUndefined: Self = StObject.set(x, "restrictHighlightAndSnippetArrays", js.undefined)
    
    inline def setRestrictSearchableAttributes(value: js.Array[String]): Self = StObject.set(x, "restrictSearchableAttributes", value.asInstanceOf[js.Any])
    
    inline def setRestrictSearchableAttributesUndefined: Self = StObject.set(x, "restrictSearchableAttributes", js.undefined)
    
    inline def setRestrictSearchableAttributesVarargs(value: String*): Self = StObject.set(x, "restrictSearchableAttributes", js.Array(value*))
    
    inline def setRuleContexts(value: js.Array[String]): Self = StObject.set(x, "ruleContexts", value.asInstanceOf[js.Any])
    
    inline def setRuleContextsUndefined: Self = StObject.set(x, "ruleContexts", js.undefined)
    
    inline def setRuleContextsVarargs(value: String*): Self = StObject.set(x, "ruleContexts", js.Array(value*))
    
    inline def setSimilarQuery(value: String): Self = StObject.set(x, "similarQuery", value.asInstanceOf[js.Any])
    
    inline def setSimilarQueryUndefined: Self = StObject.set(x, "similarQuery", js.undefined)
    
    inline def setSnippetEllipsisText(value: String): Self = StObject.set(x, "snippetEllipsisText", value.asInstanceOf[js.Any])
    
    inline def setSnippetEllipsisTextUndefined: Self = StObject.set(x, "snippetEllipsisText", js.undefined)
    
    inline def setSortFacetValuesBy(value: count | alpha): Self = StObject.set(x, "sortFacetValuesBy", value.asInstanceOf[js.Any])
    
    inline def setSortFacetValuesByUndefined: Self = StObject.set(x, "sortFacetValuesBy", js.undefined)
    
    inline def setSumOrFiltersScores(value: Boolean): Self = StObject.set(x, "sumOrFiltersScores", value.asInstanceOf[js.Any])
    
    inline def setSumOrFiltersScoresUndefined: Self = StObject.set(x, "sumOrFiltersScores", js.undefined)
    
    inline def setSynonyms(value: Boolean): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    inline def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    inline def setTagFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    inline def setTagFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "tagFilters", js.Array(value*))
    
    inline def setTypoTolerance(value: Boolean | min | strict): Self = StObject.set(x, "typoTolerance", value.asInstanceOf[js.Any])
    
    inline def setTypoToleranceUndefined: Self = StObject.set(x, "typoTolerance", js.undefined)
    
    inline def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    inline def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
  }
}
