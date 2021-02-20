package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.algoliaClientSearchStrings.all
import typings.algoliaClientSearch.algoliaClientSearchStrings.allOptional
import typings.algoliaClientSearch.algoliaClientSearchStrings.alpha
import typings.algoliaClientSearch.algoliaClientSearchStrings.attribute
import typings.algoliaClientSearch.algoliaClientSearchStrings.count
import typings.algoliaClientSearch.algoliaClientSearchStrings.exactPhrase
import typings.algoliaClientSearch.algoliaClientSearchStrings.excludeWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.firstWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals
import typings.algoliaClientSearch.algoliaClientSearchStrings.lastWords
import typings.algoliaClientSearch.algoliaClientSearchStrings.min
import typings.algoliaClientSearch.algoliaClientSearchStrings.multiWordsSynonym
import typings.algoliaClientSearch.algoliaClientSearchStrings.none
import typings.algoliaClientSearch.algoliaClientSearchStrings.prefixAll
import typings.algoliaClientSearch.algoliaClientSearchStrings.prefixLast
import typings.algoliaClientSearch.algoliaClientSearchStrings.prefixNone
import typings.algoliaClientSearch.algoliaClientSearchStrings.singleWordSynonym
import typings.algoliaClientSearch.algoliaClientSearchStrings.strict
import typings.algoliaClientSearch.algoliaClientSearchStrings.word
import typings.algoliaClientSearch.mod.AutomaticFacetFilter
import typings.algoliaClientSearch.mod.ConsequenceQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @algolia/client-search.@algolia/client-search.ConsequenceParams & std.Pick<@algolia/client-search.@algolia/client-search.SearchOptions, std.Exclude<keyof @algolia/client-search.@algolia/client-search.SearchOptions, 'query'>> */
@js.native
trait ConsequenceParamsPickSear extends StObject {
  
  var advancedSyntax: js.UndefOr[Boolean] = js.native
  
  var advancedSyntaxFeatures: js.UndefOr[js.Array[exactPhrase | excludeWords]] = js.native
  
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.native
  
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.native
  
  var analytics: js.UndefOr[Boolean] = js.native
  
  var analyticsTags: js.UndefOr[js.Array[String]] = js.native
  
  var aroundLatLng: js.UndefOr[String] = js.native
  
  var aroundLatLngViaIP: js.UndefOr[Boolean] = js.native
  
  var aroundPrecision: js.UndefOr[Double | js.Array[From]] = js.native
  
  var aroundRadius: js.UndefOr[Double | all] = js.native
  
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.native
  
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Names of facets to which automatic filtering must be applied; they must match the facet name of a facet value placeholder in the query pattern.
    */
  val automaticFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter | String]] = js.native
  
  /**
    * Same syntax as automaticFacetFilters, but the engine treats the filters as optional.
    * Behaves like optionalFilters.
    */
  val automaticOptionalFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter]] = js.native
  
  var clickAnalytics: js.UndefOr[Boolean] = js.native
  
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var distinct: js.UndefOr[Boolean | Double] = js.native
  
  var enableABTest: js.UndefOr[Boolean] = js.native
  
  var enablePersonalization: js.UndefOr[Boolean] = js.native
  
  var enableRules: js.UndefOr[Boolean] = js.native
  
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.native
  
  var facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.native
  
  var facets: js.UndefOr[js.Array[String]] = js.native
  
  var filters: js.UndefOr[String] = js.native
  
  var getRankingInfo: js.UndefOr[Boolean] = js.native
  
  var highlightPostTag: js.UndefOr[String] = js.native
  
  var highlightPreTag: js.UndefOr[String] = js.native
  
  var hitsPerPage: js.UndefOr[Double] = js.native
  
  var ignorePlurals: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  var length: js.UndefOr[Double] = js.native
  
  var maxFacetHits: js.UndefOr[Double] = js.native
  
  var maxValuesPerFacet: js.UndefOr[Double] = js.native
  
  var minProximity: js.UndefOr[Double] = js.native
  
  var minWordSizefor1Typo: js.UndefOr[Double] = js.native
  
  var minWordSizefor2Typos: js.UndefOr[Double] = js.native
  
  var minimumAroundRadius: js.UndefOr[Double] = js.native
  
  var naturalLanguages: js.UndefOr[js.Array[String]] = js.native
  
  var numericFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var optionalFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  var optionalWords: js.UndefOr[String | js.Array[String]] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var percentileComputation: js.UndefOr[Boolean] = js.native
  
  var personalizationImpact: js.UndefOr[Double] = js.native
  
  /**
    * When providing a string, it replaces the entire query string.
    * When providing an object, it describes incremental edits to be made to the query string (but you can’t do both).
    */
  val query: js.UndefOr[ConsequenceQuery | String] = js.native
  
  var queryType: js.UndefOr[prefixLast | prefixAll | prefixNone] = js.native
  
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  var removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.native
  
  var replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.native
  
  var responseFields: js.UndefOr[js.Array[String]] = js.native
  
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.native
  
  var restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var ruleContexts: js.UndefOr[js.Array[String]] = js.native
  
  var similarQuery: js.UndefOr[String] = js.native
  
  var snippetEllipsisText: js.UndefOr[String] = js.native
  
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.native
  
  var sumOrFiltersScores: js.UndefOr[Boolean] = js.native
  
  var synonyms: js.UndefOr[Boolean] = js.native
  
  var tagFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.native
  
  var typoTolerance: js.UndefOr[Boolean | min | strict] = js.native
  
  var userToken: js.UndefOr[String] = js.native
}
object ConsequenceParamsPickSear {
  
  @scala.inline
  def apply(): ConsequenceParamsPickSear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsequenceParamsPickSear]
  }
  
  @scala.inline
  implicit class ConsequenceParamsPickSearMutableBuilder[Self <: ConsequenceParamsPickSear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedSyntax(value: Boolean): Self = StObject.set(x, "advancedSyntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = StObject.set(x, "advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedSyntaxFeaturesUndefined: Self = StObject.set(x, "advancedSyntaxFeatures", js.undefined)
    
    @scala.inline
    def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = StObject.set(x, "advancedSyntaxFeatures", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedSyntaxUndefined: Self = StObject.set(x, "advancedSyntax", js.undefined)
    
    @scala.inline
    def setAllowTyposOnNumericTokens(value: Boolean): Self = StObject.set(x, "allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowTyposOnNumericTokensUndefined: Self = StObject.set(x, "allowTyposOnNumericTokens", js.undefined)
    
    @scala.inline
    def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = StObject.set(x, "alternativesAsExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativesAsExactUndefined: Self = StObject.set(x, "alternativesAsExact", js.undefined)
    
    @scala.inline
    def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = StObject.set(x, "alternativesAsExact", js.Array(value :_*))
    
    @scala.inline
    def setAnalytics(value: Boolean): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsTags(value: js.Array[String]): Self = StObject.set(x, "analyticsTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsTagsUndefined: Self = StObject.set(x, "analyticsTags", js.undefined)
    
    @scala.inline
    def setAnalyticsTagsVarargs(value: String*): Self = StObject.set(x, "analyticsTags", js.Array(value :_*))
    
    @scala.inline
    def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
    
    @scala.inline
    def setAroundLatLng(value: String): Self = StObject.set(x, "aroundLatLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngUndefined: Self = StObject.set(x, "aroundLatLng", js.undefined)
    
    @scala.inline
    def setAroundLatLngViaIP(value: Boolean): Self = StObject.set(x, "aroundLatLngViaIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundLatLngViaIPUndefined: Self = StObject.set(x, "aroundLatLngViaIP", js.undefined)
    
    @scala.inline
    def setAroundPrecision(value: Double | js.Array[From]): Self = StObject.set(x, "aroundPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundPrecisionUndefined: Self = StObject.set(x, "aroundPrecision", js.undefined)
    
    @scala.inline
    def setAroundPrecisionVarargs(value: From*): Self = StObject.set(x, "aroundPrecision", js.Array(value :_*))
    
    @scala.inline
    def setAroundRadius(value: Double | all): Self = StObject.set(x, "aroundRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAroundRadiusUndefined: Self = StObject.set(x, "aroundRadius", js.undefined)
    
    @scala.inline
    def setAttributesToHighlight(value: js.Array[String]): Self = StObject.set(x, "attributesToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToHighlightUndefined: Self = StObject.set(x, "attributesToHighlight", js.undefined)
    
    @scala.inline
    def setAttributesToHighlightVarargs(value: String*): Self = StObject.set(x, "attributesToHighlight", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = StObject.set(x, "attributesToRetrieve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToRetrieveUndefined: Self = StObject.set(x, "attributesToRetrieve", js.undefined)
    
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = StObject.set(x, "attributesToRetrieve", js.Array(value :_*))
    
    @scala.inline
    def setAttributesToSnippet(value: js.Array[String]): Self = StObject.set(x, "attributesToSnippet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesToSnippetUndefined: Self = StObject.set(x, "attributesToSnippet", js.undefined)
    
    @scala.inline
    def setAttributesToSnippetVarargs(value: String*): Self = StObject.set(x, "attributesToSnippet", js.Array(value :_*))
    
    @scala.inline
    def setAutomaticFacetFilters(value: js.Array[AutomaticFacetFilter | String]): Self = StObject.set(x, "automaticFacetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticFacetFiltersUndefined: Self = StObject.set(x, "automaticFacetFilters", js.undefined)
    
    @scala.inline
    def setAutomaticFacetFiltersVarargs(value: (AutomaticFacetFilter | String)*): Self = StObject.set(x, "automaticFacetFilters", js.Array(value :_*))
    
    @scala.inline
    def setAutomaticOptionalFacetFilters(value: js.Array[AutomaticFacetFilter]): Self = StObject.set(x, "automaticOptionalFacetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticOptionalFacetFiltersUndefined: Self = StObject.set(x, "automaticOptionalFacetFilters", js.undefined)
    
    @scala.inline
    def setAutomaticOptionalFacetFiltersVarargs(value: AutomaticFacetFilter*): Self = StObject.set(x, "automaticOptionalFacetFilters", js.Array(value :_*))
    
    @scala.inline
    def setClickAnalytics(value: Boolean): Self = StObject.set(x, "clickAnalytics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickAnalyticsUndefined: Self = StObject.set(x, "clickAnalytics", js.undefined)
    
    @scala.inline
    def setDisableExactOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableExactOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableExactOnAttributesUndefined: Self = StObject.set(x, "disableExactOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableExactOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableExactOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = StObject.set(x, "disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTypoToleranceOnAttributesUndefined: Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.undefined)
    
    @scala.inline
    def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = StObject.set(x, "disableTypoToleranceOnAttributes", js.Array(value :_*))
    
    @scala.inline
    def setDistinct(value: Boolean | Double): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setEnableABTest(value: Boolean): Self = StObject.set(x, "enableABTest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableABTestUndefined: Self = StObject.set(x, "enableABTest", js.undefined)
    
    @scala.inline
    def setEnablePersonalization(value: Boolean): Self = StObject.set(x, "enablePersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnablePersonalizationUndefined: Self = StObject.set(x, "enablePersonalization", js.undefined)
    
    @scala.inline
    def setEnableRules(value: Boolean): Self = StObject.set(x, "enableRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableRulesUndefined: Self = StObject.set(x, "enableRules", js.undefined)
    
    @scala.inline
    def setExactOnSingleWordQuery(value: attribute | none | word): Self = StObject.set(x, "exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExactOnSingleWordQueryUndefined: Self = StObject.set(x, "exactOnSingleWordQuery", js.undefined)
    
    @scala.inline
    def setFacetFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "facetFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetFiltersUndefined: Self = StObject.set(x, "facetFilters", js.undefined)
    
    @scala.inline
    def setFacetFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "facetFilters", js.Array(value :_*))
    
    @scala.inline
    def setFacetingAfterDistinct(value: Boolean): Self = StObject.set(x, "facetingAfterDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetingAfterDistinctUndefined: Self = StObject.set(x, "facetingAfterDistinct", js.undefined)
    
    @scala.inline
    def setFacets(value: js.Array[String]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    @scala.inline
    def setFacetsVarargs(value: String*): Self = StObject.set(x, "facets", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: String): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setGetRankingInfo(value: Boolean): Self = StObject.set(x, "getRankingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRankingInfoUndefined: Self = StObject.set(x, "getRankingInfo", js.undefined)
    
    @scala.inline
    def setHighlightPostTag(value: String): Self = StObject.set(x, "highlightPostTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightPostTagUndefined: Self = StObject.set(x, "highlightPostTag", js.undefined)
    
    @scala.inline
    def setHighlightPreTag(value: String): Self = StObject.set(x, "highlightPreTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightPreTagUndefined: Self = StObject.set(x, "highlightPreTag", js.undefined)
    
    @scala.inline
    def setHitsPerPage(value: Double): Self = StObject.set(x, "hitsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitsPerPageUndefined: Self = StObject.set(x, "hitsPerPage", js.undefined)
    
    @scala.inline
    def setIgnorePlurals(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignorePlurals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePluralsUndefined: Self = StObject.set(x, "ignorePlurals", js.undefined)
    
    @scala.inline
    def setIgnorePluralsVarargs(value: String*): Self = StObject.set(x, "ignorePlurals", js.Array(value :_*))
    
    @scala.inline
    def setInsideBoundingBox(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "insideBoundingBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsideBoundingBoxUndefined: Self = StObject.set(x, "insideBoundingBox", js.undefined)
    
    @scala.inline
    def setInsideBoundingBoxVarargs(value: js.Array[Double]*): Self = StObject.set(x, "insideBoundingBox", js.Array(value :_*))
    
    @scala.inline
    def setInsidePolygon(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "insidePolygon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsidePolygonUndefined: Self = StObject.set(x, "insidePolygon", js.undefined)
    
    @scala.inline
    def setInsidePolygonVarargs(value: js.Array[Double]*): Self = StObject.set(x, "insidePolygon", js.Array(value :_*))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setMaxFacetHits(value: Double): Self = StObject.set(x, "maxFacetHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFacetHitsUndefined: Self = StObject.set(x, "maxFacetHits", js.undefined)
    
    @scala.inline
    def setMaxValuesPerFacet(value: Double): Self = StObject.set(x, "maxValuesPerFacet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValuesPerFacetUndefined: Self = StObject.set(x, "maxValuesPerFacet", js.undefined)
    
    @scala.inline
    def setMinProximity(value: Double): Self = StObject.set(x, "minProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinProximityUndefined: Self = StObject.set(x, "minProximity", js.undefined)
    
    @scala.inline
    def setMinWordSizefor1Typo(value: Double): Self = StObject.set(x, "minWordSizefor1Typo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWordSizefor1TypoUndefined: Self = StObject.set(x, "minWordSizefor1Typo", js.undefined)
    
    @scala.inline
    def setMinWordSizefor2Typos(value: Double): Self = StObject.set(x, "minWordSizefor2Typos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWordSizefor2TyposUndefined: Self = StObject.set(x, "minWordSizefor2Typos", js.undefined)
    
    @scala.inline
    def setMinimumAroundRadius(value: Double): Self = StObject.set(x, "minimumAroundRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumAroundRadiusUndefined: Self = StObject.set(x, "minimumAroundRadius", js.undefined)
    
    @scala.inline
    def setNaturalLanguages(value: js.Array[String]): Self = StObject.set(x, "naturalLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNaturalLanguagesUndefined: Self = StObject.set(x, "naturalLanguages", js.undefined)
    
    @scala.inline
    def setNaturalLanguagesVarargs(value: String*): Self = StObject.set(x, "naturalLanguages", js.Array(value :_*))
    
    @scala.inline
    def setNumericFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "numericFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericFiltersUndefined: Self = StObject.set(x, "numericFilters", js.undefined)
    
    @scala.inline
    def setNumericFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "numericFilters", js.Array(value :_*))
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOptionalFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "optionalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFiltersUndefined: Self = StObject.set(x, "optionalFilters", js.undefined)
    
    @scala.inline
    def setOptionalFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "optionalFilters", js.Array(value :_*))
    
    @scala.inline
    def setOptionalWords(value: String | js.Array[String]): Self = StObject.set(x, "optionalWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalWordsUndefined: Self = StObject.set(x, "optionalWords", js.undefined)
    
    @scala.inline
    def setOptionalWordsVarargs(value: String*): Self = StObject.set(x, "optionalWords", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPercentileComputation(value: Boolean): Self = StObject.set(x, "percentileComputation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentileComputationUndefined: Self = StObject.set(x, "percentileComputation", js.undefined)
    
    @scala.inline
    def setPersonalizationImpact(value: Double): Self = StObject.set(x, "personalizationImpact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonalizationImpactUndefined: Self = StObject.set(x, "personalizationImpact", js.undefined)
    
    @scala.inline
    def setQuery(value: ConsequenceQuery | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryType(value: prefixLast | prefixAll | prefixNone): Self = StObject.set(x, "queryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTypeUndefined: Self = StObject.set(x, "queryType", js.undefined)
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setRemoveStopWords(value: Boolean | js.Array[String]): Self = StObject.set(x, "removeStopWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveStopWordsUndefined: Self = StObject.set(x, "removeStopWords", js.undefined)
    
    @scala.inline
    def setRemoveStopWordsVarargs(value: String*): Self = StObject.set(x, "removeStopWords", js.Array(value :_*))
    
    @scala.inline
    def setRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = StObject.set(x, "removeWordsIfNoResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveWordsIfNoResultsUndefined: Self = StObject.set(x, "removeWordsIfNoResults", js.undefined)
    
    @scala.inline
    def setReplaceSynonymsInHighlight(value: Boolean): Self = StObject.set(x, "replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceSynonymsInHighlightUndefined: Self = StObject.set(x, "replaceSynonymsInHighlight", js.undefined)
    
    @scala.inline
    def setResponseFields(value: js.Array[String]): Self = StObject.set(x, "responseFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseFieldsUndefined: Self = StObject.set(x, "responseFields", js.undefined)
    
    @scala.inline
    def setResponseFieldsVarargs(value: String*): Self = StObject.set(x, "responseFields", js.Array(value :_*))
    
    @scala.inline
    def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = StObject.set(x, "restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictHighlightAndSnippetArraysUndefined: Self = StObject.set(x, "restrictHighlightAndSnippetArrays", js.undefined)
    
    @scala.inline
    def setRestrictSearchableAttributes(value: js.Array[String]): Self = StObject.set(x, "restrictSearchableAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictSearchableAttributesUndefined: Self = StObject.set(x, "restrictSearchableAttributes", js.undefined)
    
    @scala.inline
    def setRestrictSearchableAttributesVarargs(value: String*): Self = StObject.set(x, "restrictSearchableAttributes", js.Array(value :_*))
    
    @scala.inline
    def setRuleContexts(value: js.Array[String]): Self = StObject.set(x, "ruleContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleContextsUndefined: Self = StObject.set(x, "ruleContexts", js.undefined)
    
    @scala.inline
    def setRuleContextsVarargs(value: String*): Self = StObject.set(x, "ruleContexts", js.Array(value :_*))
    
    @scala.inline
    def setSimilarQuery(value: String): Self = StObject.set(x, "similarQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimilarQueryUndefined: Self = StObject.set(x, "similarQuery", js.undefined)
    
    @scala.inline
    def setSnippetEllipsisText(value: String): Self = StObject.set(x, "snippetEllipsisText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippetEllipsisTextUndefined: Self = StObject.set(x, "snippetEllipsisText", js.undefined)
    
    @scala.inline
    def setSortFacetValuesBy(value: count | alpha): Self = StObject.set(x, "sortFacetValuesBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortFacetValuesByUndefined: Self = StObject.set(x, "sortFacetValuesBy", js.undefined)
    
    @scala.inline
    def setSumOrFiltersScores(value: Boolean): Self = StObject.set(x, "sumOrFiltersScores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSumOrFiltersScoresUndefined: Self = StObject.set(x, "sumOrFiltersScores", js.undefined)
    
    @scala.inline
    def setSynonyms(value: Boolean): Self = StObject.set(x, "synonyms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSynonymsUndefined: Self = StObject.set(x, "synonyms", js.undefined)
    
    @scala.inline
    def setTagFilters(value: String | (js.Array[js.Array[String] | String])): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    @scala.inline
    def setTagFiltersVarargs(value: (js.Array[String] | String)*): Self = StObject.set(x, "tagFilters", js.Array(value :_*))
    
    @scala.inline
    def setTypoTolerance(value: Boolean | min | strict): Self = StObject.set(x, "typoTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypoToleranceUndefined: Self = StObject.set(x, "typoTolerance", js.undefined)
    
    @scala.inline
    def setUserToken(value: String): Self = StObject.set(x, "userToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTokenUndefined: Self = StObject.set(x, "userToken", js.undefined)
  }
}
