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
trait ConsequenceParamsPickSear extends js.Object {
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
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Names of facets to which automatic filtering must be applied; they must match the facet name of a facet value placeholder in the query pattern.
    */
  val automaticFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter | String]] = js.undefined
  /**
    * Same syntax as automaticFacetFilters, but the engine treats the filters as optional.
    * Behaves like optionalFilters.
    */
  val automaticOptionalFacetFilters: js.UndefOr[js.Array[AutomaticFacetFilter]] = js.undefined
  var clickAnalytics: js.UndefOr[Boolean] = js.undefined
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var distinct: js.UndefOr[Boolean | Double] = js.undefined
  var enableABTest: js.UndefOr[Boolean] = js.undefined
  var enablePersonalization: js.UndefOr[Boolean] = js.undefined
  var enableRules: js.UndefOr[Boolean] = js.undefined
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.undefined
  var facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined
  var facets: js.UndefOr[js.Array[String]] = js.undefined
  var filters: js.UndefOr[String] = js.undefined
  var getRankingInfo: js.UndefOr[Boolean] = js.undefined
  var highlightPostTag: js.UndefOr[String] = js.undefined
  var highlightPreTag: js.UndefOr[String] = js.undefined
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  var ignorePlurals: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
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
  /**
    * When providing a string, it replaces the entire query string.
    * When providing an object, it describes incremental edits to be made to the query string (but you can’t do both).
    */
  val query: js.UndefOr[ConsequenceQuery | String] = js.undefined
  var queryType: js.UndefOr[prefixLast | prefixAll | prefixNone] = js.undefined
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  var removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.undefined
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

object ConsequenceParamsPickSear {
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[Boolean] = js.undefined,
    advancedSyntaxFeatures: js.Array[exactPhrase | excludeWords] = null,
    allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined,
    alternativesAsExact: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym] = null,
    analytics: js.UndefOr[Boolean] = js.undefined,
    analyticsTags: js.Array[String] = null,
    aroundLatLng: String = null,
    aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined,
    aroundPrecision: Double | js.Array[From] = null,
    aroundRadius: Double | all = null,
    attributesToHighlight: js.Array[String] = null,
    attributesToRetrieve: js.Array[String] = null,
    attributesToSnippet: js.Array[String] = null,
    automaticFacetFilters: js.Array[AutomaticFacetFilter | String] = null,
    automaticOptionalFacetFilters: js.Array[AutomaticFacetFilter] = null,
    clickAnalytics: js.UndefOr[Boolean] = js.undefined,
    disableExactOnAttributes: js.Array[String] = null,
    disableTypoToleranceOnAttributes: js.Array[String] = null,
    distinct: Boolean | Double = null,
    enableABTest: js.UndefOr[Boolean] = js.undefined,
    enablePersonalization: js.UndefOr[Boolean] = js.undefined,
    enableRules: js.UndefOr[Boolean] = js.undefined,
    exactOnSingleWordQuery: attribute | none | word = null,
    facetFilters: String | (js.Array[js.Array[String] | String]) = null,
    facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined,
    facets: js.Array[String] = null,
    filters: String = null,
    getRankingInfo: js.UndefOr[Boolean] = js.undefined,
    highlightPostTag: String = null,
    highlightPreTag: String = null,
    hitsPerPage: js.UndefOr[Double] = js.undefined,
    ignorePlurals: Boolean | js.Array[String] = null,
    insideBoundingBox: js.Array[js.Array[Double]] = null,
    insidePolygon: js.Array[js.Array[Double]] = null,
    length: js.UndefOr[Double] = js.undefined,
    maxFacetHits: js.UndefOr[Double] = js.undefined,
    maxValuesPerFacet: js.UndefOr[Double] = js.undefined,
    minProximity: js.UndefOr[Double] = js.undefined,
    minWordSizefor1Typo: js.UndefOr[Double] = js.undefined,
    minWordSizefor2Typos: js.UndefOr[Double] = js.undefined,
    minimumAroundRadius: js.UndefOr[Double] = js.undefined,
    numericFilters: String | (js.Array[js.Array[String] | String]) = null,
    offset: js.UndefOr[Double] = js.undefined,
    optionalFilters: String | (js.Array[js.Array[String] | String]) = null,
    optionalWords: String | js.Array[String] = null,
    page: js.UndefOr[Double] = js.undefined,
    percentileComputation: js.UndefOr[Boolean] = js.undefined,
    personalizationImpact: js.UndefOr[Double] = js.undefined,
    query: ConsequenceQuery | String = null,
    queryType: prefixLast | prefixAll | prefixNone = null,
    removeStopWords: Boolean | js.Array[String] = null,
    removeWordsIfNoResults: none | lastWords | firstWords | allOptional = null,
    replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined,
    responseFields: js.Array[String] = null,
    restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined,
    restrictSearchableAttributes: js.Array[String] = null,
    ruleContexts: js.Array[String] = null,
    similarQuery: String = null,
    snippetEllipsisText: String = null,
    sortFacetValuesBy: count | alpha = null,
    sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined,
    synonyms: js.UndefOr[Boolean] = js.undefined,
    tagFilters: String | (js.Array[js.Array[String] | String]) = null,
    typoTolerance: Boolean | min | strict = null,
    userToken: String = null
  ): ConsequenceParamsPickSear = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax.get.asInstanceOf[js.Any])
    if (advancedSyntaxFeatures != null) __obj.updateDynamic("advancedSyntaxFeatures")(advancedSyntaxFeatures.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens.get.asInstanceOf[js.Any])
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact.asInstanceOf[js.Any])
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics.get.asInstanceOf[js.Any])
    if (analyticsTags != null) __obj.updateDynamic("analyticsTags")(analyticsTags.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (!js.isUndefined(aroundLatLngViaIP)) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP.get.asInstanceOf[js.Any])
    if (aroundPrecision != null) __obj.updateDynamic("aroundPrecision")(aroundPrecision.asInstanceOf[js.Any])
    if (aroundRadius != null) __obj.updateDynamic("aroundRadius")(aroundRadius.asInstanceOf[js.Any])
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight.asInstanceOf[js.Any])
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet.asInstanceOf[js.Any])
    if (automaticFacetFilters != null) __obj.updateDynamic("automaticFacetFilters")(automaticFacetFilters.asInstanceOf[js.Any])
    if (automaticOptionalFacetFilters != null) __obj.updateDynamic("automaticOptionalFacetFilters")(automaticOptionalFacetFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(clickAnalytics)) __obj.updateDynamic("clickAnalytics")(clickAnalytics.get.asInstanceOf[js.Any])
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes.asInstanceOf[js.Any])
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes.asInstanceOf[js.Any])
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (!js.isUndefined(enableABTest)) __obj.updateDynamic("enableABTest")(enableABTest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersonalization)) __obj.updateDynamic("enablePersonalization")(enablePersonalization.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRules)) __obj.updateDynamic("enableRules")(enableRules.get.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct.get.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo.get.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (ignorePlurals != null) __obj.updateDynamic("ignorePlurals")(ignorePlurals.asInstanceOf[js.Any])
    if (insideBoundingBox != null) __obj.updateDynamic("insideBoundingBox")(insideBoundingBox.asInstanceOf[js.Any])
    if (insidePolygon != null) __obj.updateDynamic("insidePolygon")(insidePolygon.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFacetHits)) __obj.updateDynamic("maxFacetHits")(maxFacetHits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxValuesPerFacet)) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minProximity)) __obj.updateDynamic("minProximity")(minProximity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordSizefor1Typo)) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWordSizefor2Typos)) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumAroundRadius)) __obj.updateDynamic("minimumAroundRadius")(minimumAroundRadius.get.asInstanceOf[js.Any])
    if (numericFilters != null) __obj.updateDynamic("numericFilters")(numericFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (optionalFilters != null) __obj.updateDynamic("optionalFilters")(optionalFilters.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percentileComputation)) __obj.updateDynamic("percentileComputation")(percentileComputation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(personalizationImpact)) __obj.updateDynamic("personalizationImpact")(personalizationImpact.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight.get.asInstanceOf[js.Any])
    if (responseFields != null) __obj.updateDynamic("responseFields")(responseFields.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays.get.asInstanceOf[js.Any])
    if (restrictSearchableAttributes != null) __obj.updateDynamic("restrictSearchableAttributes")(restrictSearchableAttributes.asInstanceOf[js.Any])
    if (ruleContexts != null) __obj.updateDynamic("ruleContexts")(ruleContexts.asInstanceOf[js.Any])
    if (similarQuery != null) __obj.updateDynamic("similarQuery")(similarQuery.asInstanceOf[js.Any])
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText.asInstanceOf[js.Any])
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOrFiltersScores)) __obj.updateDynamic("sumOrFiltersScores")(sumOrFiltersScores.get.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms.get.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsequenceParamsPickSear]
  }
}

