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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @algolia/client-search.@algolia/client-search.ConsequenceParams & std.Pick<@algolia/client-search.@algolia/client-search.SearchOptions, std.Exclude<keyof @algolia/client-search.@algolia/client-search.SearchOptions, 'query'>> */
@js.native
trait ConsequenceParamsPickSear extends js.Object {
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
  implicit class ConsequenceParamsPickSearOps[Self <: ConsequenceParamsPickSear] (val x: Self) extends AnyVal {
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
    def setAdvancedSyntax(value: Boolean): Self = this.set("advancedSyntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedSyntax: Self = this.set("advancedSyntax", js.undefined)
    @scala.inline
    def setAdvancedSyntaxFeaturesVarargs(value: (exactPhrase | excludeWords)*): Self = this.set("advancedSyntaxFeatures", js.Array(value :_*))
    @scala.inline
    def setAdvancedSyntaxFeatures(value: js.Array[exactPhrase | excludeWords]): Self = this.set("advancedSyntaxFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedSyntaxFeatures: Self = this.set("advancedSyntaxFeatures", js.undefined)
    @scala.inline
    def setAllowTyposOnNumericTokens(value: Boolean): Self = this.set("allowTyposOnNumericTokens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTyposOnNumericTokens: Self = this.set("allowTyposOnNumericTokens", js.undefined)
    @scala.inline
    def setAlternativesAsExactVarargs(value: (ignorePlurals | singleWordSynonym | multiWordsSynonym)*): Self = this.set("alternativesAsExact", js.Array(value :_*))
    @scala.inline
    def setAlternativesAsExact(value: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]): Self = this.set("alternativesAsExact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternativesAsExact: Self = this.set("alternativesAsExact", js.undefined)
    @scala.inline
    def setAnalytics(value: Boolean): Self = this.set("analytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalytics: Self = this.set("analytics", js.undefined)
    @scala.inline
    def setAnalyticsTagsVarargs(value: String*): Self = this.set("analyticsTags", js.Array(value :_*))
    @scala.inline
    def setAnalyticsTags(value: js.Array[String]): Self = this.set("analyticsTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyticsTags: Self = this.set("analyticsTags", js.undefined)
    @scala.inline
    def setAroundLatLng(value: String): Self = this.set("aroundLatLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundLatLng: Self = this.set("aroundLatLng", js.undefined)
    @scala.inline
    def setAroundLatLngViaIP(value: Boolean): Self = this.set("aroundLatLngViaIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundLatLngViaIP: Self = this.set("aroundLatLngViaIP", js.undefined)
    @scala.inline
    def setAroundPrecisionVarargs(value: From*): Self = this.set("aroundPrecision", js.Array(value :_*))
    @scala.inline
    def setAroundPrecision(value: Double | js.Array[From]): Self = this.set("aroundPrecision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundPrecision: Self = this.set("aroundPrecision", js.undefined)
    @scala.inline
    def setAroundRadius(value: Double | all): Self = this.set("aroundRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAroundRadius: Self = this.set("aroundRadius", js.undefined)
    @scala.inline
    def setAttributesToHighlightVarargs(value: String*): Self = this.set("attributesToHighlight", js.Array(value :_*))
    @scala.inline
    def setAttributesToHighlight(value: js.Array[String]): Self = this.set("attributesToHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesToHighlight: Self = this.set("attributesToHighlight", js.undefined)
    @scala.inline
    def setAttributesToRetrieveVarargs(value: String*): Self = this.set("attributesToRetrieve", js.Array(value :_*))
    @scala.inline
    def setAttributesToRetrieve(value: js.Array[String]): Self = this.set("attributesToRetrieve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesToRetrieve: Self = this.set("attributesToRetrieve", js.undefined)
    @scala.inline
    def setAttributesToSnippetVarargs(value: String*): Self = this.set("attributesToSnippet", js.Array(value :_*))
    @scala.inline
    def setAttributesToSnippet(value: js.Array[String]): Self = this.set("attributesToSnippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributesToSnippet: Self = this.set("attributesToSnippet", js.undefined)
    @scala.inline
    def setAutomaticFacetFiltersVarargs(value: (AutomaticFacetFilter | String)*): Self = this.set("automaticFacetFilters", js.Array(value :_*))
    @scala.inline
    def setAutomaticFacetFilters(value: js.Array[AutomaticFacetFilter | String]): Self = this.set("automaticFacetFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticFacetFilters: Self = this.set("automaticFacetFilters", js.undefined)
    @scala.inline
    def setAutomaticOptionalFacetFiltersVarargs(value: AutomaticFacetFilter*): Self = this.set("automaticOptionalFacetFilters", js.Array(value :_*))
    @scala.inline
    def setAutomaticOptionalFacetFilters(value: js.Array[AutomaticFacetFilter]): Self = this.set("automaticOptionalFacetFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticOptionalFacetFilters: Self = this.set("automaticOptionalFacetFilters", js.undefined)
    @scala.inline
    def setClickAnalytics(value: Boolean): Self = this.set("clickAnalytics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickAnalytics: Self = this.set("clickAnalytics", js.undefined)
    @scala.inline
    def setDisableExactOnAttributesVarargs(value: String*): Self = this.set("disableExactOnAttributes", js.Array(value :_*))
    @scala.inline
    def setDisableExactOnAttributes(value: js.Array[String]): Self = this.set("disableExactOnAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableExactOnAttributes: Self = this.set("disableExactOnAttributes", js.undefined)
    @scala.inline
    def setDisableTypoToleranceOnAttributesVarargs(value: String*): Self = this.set("disableTypoToleranceOnAttributes", js.Array(value :_*))
    @scala.inline
    def setDisableTypoToleranceOnAttributes(value: js.Array[String]): Self = this.set("disableTypoToleranceOnAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTypoToleranceOnAttributes: Self = this.set("disableTypoToleranceOnAttributes", js.undefined)
    @scala.inline
    def setDistinct(value: Boolean | Double): Self = this.set("distinct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    @scala.inline
    def setEnableABTest(value: Boolean): Self = this.set("enableABTest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableABTest: Self = this.set("enableABTest", js.undefined)
    @scala.inline
    def setEnablePersonalization(value: Boolean): Self = this.set("enablePersonalization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersonalization: Self = this.set("enablePersonalization", js.undefined)
    @scala.inline
    def setEnableRules(value: Boolean): Self = this.set("enableRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRules: Self = this.set("enableRules", js.undefined)
    @scala.inline
    def setExactOnSingleWordQuery(value: attribute | none | word): Self = this.set("exactOnSingleWordQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExactOnSingleWordQuery: Self = this.set("exactOnSingleWordQuery", js.undefined)
    @scala.inline
    def setFacetFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("facetFilters", js.Array(value :_*))
    @scala.inline
    def setFacetFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("facetFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetFilters: Self = this.set("facetFilters", js.undefined)
    @scala.inline
    def setFacetingAfterDistinct(value: Boolean): Self = this.set("facetingAfterDistinct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacetingAfterDistinct: Self = this.set("facetingAfterDistinct", js.undefined)
    @scala.inline
    def setFacetsVarargs(value: String*): Self = this.set("facets", js.Array(value :_*))
    @scala.inline
    def setFacets(value: js.Array[String]): Self = this.set("facets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacets: Self = this.set("facets", js.undefined)
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGetRankingInfo(value: Boolean): Self = this.set("getRankingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetRankingInfo: Self = this.set("getRankingInfo", js.undefined)
    @scala.inline
    def setHighlightPostTag(value: String): Self = this.set("highlightPostTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightPostTag: Self = this.set("highlightPostTag", js.undefined)
    @scala.inline
    def setHighlightPreTag(value: String): Self = this.set("highlightPreTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightPreTag: Self = this.set("highlightPreTag", js.undefined)
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    @scala.inline
    def setIgnorePluralsVarargs(value: String*): Self = this.set("ignorePlurals", js.Array(value :_*))
    @scala.inline
    def setIgnorePlurals(value: Boolean | js.Array[String]): Self = this.set("ignorePlurals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePlurals: Self = this.set("ignorePlurals", js.undefined)
    @scala.inline
    def setInsideBoundingBoxVarargs(value: js.Array[Double]*): Self = this.set("insideBoundingBox", js.Array(value :_*))
    @scala.inline
    def setInsideBoundingBox(value: js.Array[js.Array[Double]]): Self = this.set("insideBoundingBox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsideBoundingBox: Self = this.set("insideBoundingBox", js.undefined)
    @scala.inline
    def setInsidePolygonVarargs(value: js.Array[Double]*): Self = this.set("insidePolygon", js.Array(value :_*))
    @scala.inline
    def setInsidePolygon(value: js.Array[js.Array[Double]]): Self = this.set("insidePolygon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsidePolygon: Self = this.set("insidePolygon", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMaxFacetHits(value: Double): Self = this.set("maxFacetHits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFacetHits: Self = this.set("maxFacetHits", js.undefined)
    @scala.inline
    def setMaxValuesPerFacet(value: Double): Self = this.set("maxValuesPerFacet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValuesPerFacet: Self = this.set("maxValuesPerFacet", js.undefined)
    @scala.inline
    def setMinProximity(value: Double): Self = this.set("minProximity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinProximity: Self = this.set("minProximity", js.undefined)
    @scala.inline
    def setMinWordSizefor1Typo(value: Double): Self = this.set("minWordSizefor1Typo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWordSizefor1Typo: Self = this.set("minWordSizefor1Typo", js.undefined)
    @scala.inline
    def setMinWordSizefor2Typos(value: Double): Self = this.set("minWordSizefor2Typos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWordSizefor2Typos: Self = this.set("minWordSizefor2Typos", js.undefined)
    @scala.inline
    def setMinimumAroundRadius(value: Double): Self = this.set("minimumAroundRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumAroundRadius: Self = this.set("minimumAroundRadius", js.undefined)
    @scala.inline
    def setNaturalLanguagesVarargs(value: String*): Self = this.set("naturalLanguages", js.Array(value :_*))
    @scala.inline
    def setNaturalLanguages(value: js.Array[String]): Self = this.set("naturalLanguages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNaturalLanguages: Self = this.set("naturalLanguages", js.undefined)
    @scala.inline
    def setNumericFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("numericFilters", js.Array(value :_*))
    @scala.inline
    def setNumericFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("numericFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericFilters: Self = this.set("numericFilters", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOptionalFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("optionalFilters", js.Array(value :_*))
    @scala.inline
    def setOptionalFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("optionalFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalFilters: Self = this.set("optionalFilters", js.undefined)
    @scala.inline
    def setOptionalWordsVarargs(value: String*): Self = this.set("optionalWords", js.Array(value :_*))
    @scala.inline
    def setOptionalWords(value: String | js.Array[String]): Self = this.set("optionalWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptionalWords: Self = this.set("optionalWords", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPercentileComputation(value: Boolean): Self = this.set("percentileComputation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercentileComputation: Self = this.set("percentileComputation", js.undefined)
    @scala.inline
    def setPersonalizationImpact(value: Double): Self = this.set("personalizationImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonalizationImpact: Self = this.set("personalizationImpact", js.undefined)
    @scala.inline
    def setQuery(value: ConsequenceQuery | String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryType(value: prefixLast | prefixAll | prefixNone): Self = this.set("queryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryType: Self = this.set("queryType", js.undefined)
    @scala.inline
    def setRemoveStopWordsVarargs(value: String*): Self = this.set("removeStopWords", js.Array(value :_*))
    @scala.inline
    def setRemoveStopWords(value: Boolean | js.Array[String]): Self = this.set("removeStopWords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveStopWords: Self = this.set("removeStopWords", js.undefined)
    @scala.inline
    def setRemoveWordsIfNoResults(value: none | lastWords | firstWords | allOptional): Self = this.set("removeWordsIfNoResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveWordsIfNoResults: Self = this.set("removeWordsIfNoResults", js.undefined)
    @scala.inline
    def setReplaceSynonymsInHighlight(value: Boolean): Self = this.set("replaceSynonymsInHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplaceSynonymsInHighlight: Self = this.set("replaceSynonymsInHighlight", js.undefined)
    @scala.inline
    def setResponseFieldsVarargs(value: String*): Self = this.set("responseFields", js.Array(value :_*))
    @scala.inline
    def setResponseFields(value: js.Array[String]): Self = this.set("responseFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseFields: Self = this.set("responseFields", js.undefined)
    @scala.inline
    def setRestrictHighlightAndSnippetArrays(value: Boolean): Self = this.set("restrictHighlightAndSnippetArrays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictHighlightAndSnippetArrays: Self = this.set("restrictHighlightAndSnippetArrays", js.undefined)
    @scala.inline
    def setRestrictSearchableAttributesVarargs(value: String*): Self = this.set("restrictSearchableAttributes", js.Array(value :_*))
    @scala.inline
    def setRestrictSearchableAttributes(value: js.Array[String]): Self = this.set("restrictSearchableAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestrictSearchableAttributes: Self = this.set("restrictSearchableAttributes", js.undefined)
    @scala.inline
    def setRuleContextsVarargs(value: String*): Self = this.set("ruleContexts", js.Array(value :_*))
    @scala.inline
    def setRuleContexts(value: js.Array[String]): Self = this.set("ruleContexts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleContexts: Self = this.set("ruleContexts", js.undefined)
    @scala.inline
    def setSimilarQuery(value: String): Self = this.set("similarQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSimilarQuery: Self = this.set("similarQuery", js.undefined)
    @scala.inline
    def setSnippetEllipsisText(value: String): Self = this.set("snippetEllipsisText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippetEllipsisText: Self = this.set("snippetEllipsisText", js.undefined)
    @scala.inline
    def setSortFacetValuesBy(value: count | alpha): Self = this.set("sortFacetValuesBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortFacetValuesBy: Self = this.set("sortFacetValuesBy", js.undefined)
    @scala.inline
    def setSumOrFiltersScores(value: Boolean): Self = this.set("sumOrFiltersScores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSumOrFiltersScores: Self = this.set("sumOrFiltersScores", js.undefined)
    @scala.inline
    def setSynonyms(value: Boolean): Self = this.set("synonyms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynonyms: Self = this.set("synonyms", js.undefined)
    @scala.inline
    def setTagFiltersVarargs(value: (js.Array[String] | String)*): Self = this.set("tagFilters", js.Array(value :_*))
    @scala.inline
    def setTagFilters(value: String | (js.Array[js.Array[String] | String])): Self = this.set("tagFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagFilters: Self = this.set("tagFilters", js.undefined)
    @scala.inline
    def setTypoTolerance(value: Boolean | min | strict): Self = this.set("typoTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypoTolerance: Self = this.set("typoTolerance", js.undefined)
    @scala.inline
    def setUserToken(value: String): Self = this.set("userToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserToken: Self = this.set("userToken", js.undefined)
  }
  
}

