package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearch.algoliasearchStrings.all
import typings.algoliasearch.algoliasearchStrings.allOptional
import typings.algoliasearch.algoliasearchStrings.alpha
import typings.algoliasearch.algoliasearchStrings.attribute
import typings.algoliasearch.algoliasearchStrings.count
import typings.algoliasearch.algoliasearchStrings.firstWords
import typings.algoliasearch.algoliasearchStrings.ignorePlurals
import typings.algoliasearch.algoliasearchStrings.lastWords
import typings.algoliasearch.algoliasearchStrings.min
import typings.algoliasearch.algoliasearchStrings.multiWordsSynonym
import typings.algoliasearch.algoliasearchStrings.none
import typings.algoliasearch.algoliasearchStrings.prefixAll
import typings.algoliasearch.algoliasearchStrings.prefixLast
import typings.algoliasearch.algoliasearchStrings.prefixNone
import typings.algoliasearch.algoliasearchStrings.singleWordSynonym
import typings.algoliasearch.algoliasearchStrings.strict
import typings.algoliasearch.algoliasearchStrings.word
import typings.algoliasearchHelper.mod.SearchParameters.FacetList
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters
  extends typings.algoliasearch.mod.QueryParameters {
  /**
    * This attribute contains the list of all the disjunctive facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    */
  var disjunctiveFacets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * This attribute contains all the filters that need to be
    * applied on the disjunctive facets. Each facet must be properly
    * defined in the `disjunctiveFacets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters selected for the associated facet name.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var disjunctiveFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.undefined
  // Misc. parameters
  /**
    * Applies 'exact' on single word queries if the word contains at least 3 characters
    * and is not a stop word.
    * Can take two values?: true or false.
    * By default, its set to false.
    * @see https://www.algolia.com/doc/rest#param-enableExactOnSingleWordQuery
    */
  var enableExactOnSingleWordQuery: js.UndefOr[Boolean] = js.undefined
  /**
    * This attribute contains all the filters that need to be
    * excluded from the conjunctive facets. Each facet must be properly
    * defined in the `facets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters excluded for the associated facet name.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var facetsExcludes: js.UndefOr[StringDictionary[FacetList]] = js.undefined
  // Refinements
  /**
    * This attribute contains all the filters that need to be
    * applied on the conjunctive facets. Each facet must be properly
    * defined in the `facets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters selected for the associated facet name.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var facetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.undefined
  /**
    * This attribute contains the list of all the hierarchical facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    * Hierarchical facets are a sub type of disjunctive facets that
    * let you filter faceted attributes hierarchically.
    */
  var hierarchicalFacets: js.UndefOr[js.Array[js.Object | String]] = js.undefined
  /**
    * This attribute contains all the filters that need to be
    * applied on the hierarchical facets. Each facet must be properly
    * defined in the `hierarchicalFacets` attribute.
    *
    * The key is the name of the facet, and the `FacetList` contains all
    * filters selected for the associated facet name. The FacetList values
    * are structured as a string that contain the values for each level
    * separated by the configured separator.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `facetFilters` attribute.
    */
  var hierarchicalFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.undefined
  /**
    * Targeted index. This parameter is mandatory.
    */
  var index: js.UndefOr[String] = js.undefined
  /**
    * This attribute contains all the filters that need to be
    * applied on the numeric attributes.
    *
    * The key is the name of the attribute, and the value is the
    * filters to apply to this attribute.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `numericFilters` attribute.
    */
  var numericRefinements: js.UndefOr[StringDictionary[OperatorList]] = js.undefined
  /**
    * Contains the optional facet filters in the raw format of the Algolia API.
    * @see https://www.algolia.com/doc/rest#param-tagFilters
    */
  var optionalFacetFilters: js.UndefOr[String] = js.undefined
  /**
    * Contains the optional tag filters in the raw format of the Algolia API.
    * @see https://www.algolia.com/doc/rest#param-tagFilters
    */
  var optionalTagFilters: js.UndefOr[String] = js.undefined
  /**
    * This attribute contains all the tags used to refine the query.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `tagFilters` attribute.
    */
  var tagRefinements: js.UndefOr[js.Array[String]] = js.undefined
}

object QueryParameters {
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined,
    alternativesAsExact: js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym] = null,
    analytics: js.UndefOr[Boolean] = js.undefined,
    analyticsTags: js.Array[String] = null,
    aroundLatLng: String = null,
    aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined,
    aroundPrecision: Int | Double = null,
    aroundRadius: Double | all = null,
    attributesToHighlight: js.Array[String] = null,
    attributesToRetrieve: js.Array[String] = null,
    attributesToSnippet: js.Array[String] = null,
    clickAnalytics: js.UndefOr[Boolean] = js.undefined,
    disableExactOnAttributes: js.Array[String] = null,
    disableTypoToleranceOnAttributes: js.Array[String] = null,
    disjunctiveFacets: js.Array[String] = null,
    disjunctiveFacetsRefinements: StringDictionary[FacetList] = null,
    distinct: Double | Boolean = null,
    enableABTest: js.UndefOr[Boolean] = js.undefined,
    enableExactOnSingleWordQuery: js.UndefOr[Boolean] = js.undefined,
    exactOnSingleWordQuery: attribute | none | word = null,
    facetFilters: js.Array[String | js.Array[String]] = null,
    facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined,
    facets: js.Array[String] = null,
    facetsExcludes: StringDictionary[FacetList] = null,
    facetsRefinements: StringDictionary[FacetList] = null,
    filters: String = null,
    getRankingInfo: js.UndefOr[Boolean] = js.undefined,
    hierarchicalFacets: js.Array[js.Object | String] = null,
    hierarchicalFacetsRefinements: StringDictionary[FacetList] = null,
    highlightPostTag: String = null,
    highlightPreTag: String = null,
    hitsPerPage: Int | Double = null,
    ignorePlurals: js.UndefOr[Boolean] = js.undefined,
    index: String = null,
    insideBoundingBox: js.Array[js.Array[Double]] = null,
    insidePolygon: js.Array[js.Array[Double]] = null,
    length: Int | Double = null,
    maxValuesPerFacet: Int | Double = null,
    minProximity: Int | Double = null,
    minWordSizefor1Typo: Int | Double = null,
    minWordSizefor2Typos: Int | Double = null,
    minimumAroundRadius: Int | Double = null,
    nbShards: Int | Double = null,
    numericAttributesForFiltering: js.Array[String] = null,
    numericAttributesToIndex: js.Array[String] = null,
    numericFilters: js.Array[String] = null,
    numericRefinements: StringDictionary[OperatorList] = null,
    offset: Int | Double = null,
    optionalFacetFilters: String = null,
    optionalTagFilters: String = null,
    optionalWords: js.Array[String] = null,
    page: Int | Double = null,
    query: String = null,
    queryType: prefixAll | prefixLast | prefixNone = null,
    removeStopWords: Boolean | js.Array[String] = null,
    removeWordsIfNoResults: none | lastWords | firstWords | allOptional = null,
    replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined,
    restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined,
    restrictSearchableAttributes: js.Array[String] = null,
    ruleContexts: js.Array[String] = null,
    snippetEllipsisText: String = null,
    sortFacetValuesBy: count | alpha = null,
    sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined,
    synonyms: js.UndefOr[Boolean] = js.undefined,
    tagFilters: js.Array[String | js.Array[String]] = null,
    tagRefinements: js.Array[String] = null,
    typoTolerance: Boolean | min | strict = null,
    userData: String | js.Object = null,
    userToken: String = null
  ): QueryParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax.asInstanceOf[js.Any])
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens.asInstanceOf[js.Any])
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact.asInstanceOf[js.Any])
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics.asInstanceOf[js.Any])
    if (analyticsTags != null) __obj.updateDynamic("analyticsTags")(analyticsTags.asInstanceOf[js.Any])
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng.asInstanceOf[js.Any])
    if (!js.isUndefined(aroundLatLngViaIP)) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP.asInstanceOf[js.Any])
    if (aroundPrecision != null) __obj.updateDynamic("aroundPrecision")(aroundPrecision.asInstanceOf[js.Any])
    if (aroundRadius != null) __obj.updateDynamic("aroundRadius")(aroundRadius.asInstanceOf[js.Any])
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight.asInstanceOf[js.Any])
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve.asInstanceOf[js.Any])
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet.asInstanceOf[js.Any])
    if (!js.isUndefined(clickAnalytics)) __obj.updateDynamic("clickAnalytics")(clickAnalytics.asInstanceOf[js.Any])
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes.asInstanceOf[js.Any])
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes.asInstanceOf[js.Any])
    if (disjunctiveFacets != null) __obj.updateDynamic("disjunctiveFacets")(disjunctiveFacets.asInstanceOf[js.Any])
    if (disjunctiveFacetsRefinements != null) __obj.updateDynamic("disjunctiveFacetsRefinements")(disjunctiveFacetsRefinements.asInstanceOf[js.Any])
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (!js.isUndefined(enableABTest)) __obj.updateDynamic("enableABTest")(enableABTest.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExactOnSingleWordQuery)) __obj.updateDynamic("enableExactOnSingleWordQuery")(enableExactOnSingleWordQuery.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (facetsExcludes != null) __obj.updateDynamic("facetsExcludes")(facetsExcludes.asInstanceOf[js.Any])
    if (facetsRefinements != null) __obj.updateDynamic("facetsRefinements")(facetsRefinements.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo.asInstanceOf[js.Any])
    if (hierarchicalFacets != null) __obj.updateDynamic("hierarchicalFacets")(hierarchicalFacets.asInstanceOf[js.Any])
    if (hierarchicalFacetsRefinements != null) __obj.updateDynamic("hierarchicalFacetsRefinements")(hierarchicalFacetsRefinements.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (insideBoundingBox != null) __obj.updateDynamic("insideBoundingBox")(insideBoundingBox.asInstanceOf[js.Any])
    if (insidePolygon != null) __obj.updateDynamic("insidePolygon")(insidePolygon.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxValuesPerFacet != null) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.asInstanceOf[js.Any])
    if (minProximity != null) __obj.updateDynamic("minProximity")(minProximity.asInstanceOf[js.Any])
    if (minWordSizefor1Typo != null) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.asInstanceOf[js.Any])
    if (minWordSizefor2Typos != null) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.asInstanceOf[js.Any])
    if (minimumAroundRadius != null) __obj.updateDynamic("minimumAroundRadius")(minimumAroundRadius.asInstanceOf[js.Any])
    if (nbShards != null) __obj.updateDynamic("nbShards")(nbShards.asInstanceOf[js.Any])
    if (numericAttributesForFiltering != null) __obj.updateDynamic("numericAttributesForFiltering")(numericAttributesForFiltering.asInstanceOf[js.Any])
    if (numericAttributesToIndex != null) __obj.updateDynamic("numericAttributesToIndex")(numericAttributesToIndex.asInstanceOf[js.Any])
    if (numericFilters != null) __obj.updateDynamic("numericFilters")(numericFilters.asInstanceOf[js.Any])
    if (numericRefinements != null) __obj.updateDynamic("numericRefinements")(numericRefinements.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (optionalFacetFilters != null) __obj.updateDynamic("optionalFacetFilters")(optionalFacetFilters.asInstanceOf[js.Any])
    if (optionalTagFilters != null) __obj.updateDynamic("optionalTagFilters")(optionalTagFilters.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays.asInstanceOf[js.Any])
    if (restrictSearchableAttributes != null) __obj.updateDynamic("restrictSearchableAttributes")(restrictSearchableAttributes.asInstanceOf[js.Any])
    if (ruleContexts != null) __obj.updateDynamic("ruleContexts")(ruleContexts.asInstanceOf[js.Any])
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText.asInstanceOf[js.Any])
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOrFiltersScores)) __obj.updateDynamic("sumOrFiltersScores")(sumOrFiltersScores.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    if (tagRefinements != null) __obj.updateDynamic("tagRefinements")(tagRefinements.asInstanceOf[js.Any])
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
}

