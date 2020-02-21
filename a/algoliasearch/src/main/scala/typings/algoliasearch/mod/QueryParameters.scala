package typings.algoliasearch.mod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters extends js.Object {
  /**
    * Enables the advanced query syntax
    * default: false
    */
  var advancedSyntax: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default:
    */
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the list of approximation that should be considered as an exact match in the ranking formula
    * default: ['ignorePlurals', 'singleWordSynonym']
    * 'ignorePlurals': alternative words added by the ignorePlurals feature
    * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
    * 'multiWordsSynonym': multiple-words synonym
    */
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.undefined
  /**
    * If set to false, this query will not be taken into account in the analytics feature.
    * default true
    */
  var analytics: js.UndefOr[Boolean] = js.undefined
  /**
    * If set, tag your query with the specified identifiers
    * default: []
    */
  var analyticsTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Search for entries around a given location
    * default: ""
    */
  var aroundLatLng: js.UndefOr[String] = js.undefined
  /**
    * Search for entries around a given latitude/longitude automatically computed from user IP address.
    * default: ""
    */
  var aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the precision of a geo search
    * default: null
    */
  var aroundPrecision: js.UndefOr[Double] = js.undefined
  /**
    * Control the radius associated with a geo search. Defined in meters.
    * default: null
    * You can specify aroundRadius=all if you want to compute the geo distance without filtering in a geo area
    */
  var aroundRadius: js.UndefOr[Double | all] = js.undefined
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    */
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer.
    * default: *
    */
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    */
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If set to true, enables the Click Analytics feature
    * default false
    */
  var clickAnalytics: js.UndefOr[Boolean] = js.undefined
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: []
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    */
  var distinct: js.UndefOr[Double | Boolean] = js.undefined
  /**
    * allow the usage of an AB-test. This parameter is only allowed for queries, not for settings.
    * default: true
    */
  var enableABTest: js.UndefOr[Boolean] = js.undefined
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    */
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.undefined
  /**
    * Filter the query by a set of facets.
    * Default: []
    */
  var facetFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  /**
    * Force faceting to be applied after de-duplication (via the Distinct setting).
    * When using the distinct setting in combination with faceting, facet counts may be higher than expected.
    * This is because the engine, by default, computes faceting before applying de-duplication (distinct).
    * When facetingAfterDistinct is set to true, the engine calculates faceting after the de-duplication has been applied.
    * default ""
    */
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined
  /**
    * You can use facets to retrieve only a part of your attributes declared in attributesForFaceting attributes
    * default: []
    */
  var facets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Filter the query with numeric, facet or/and tag filters
    * default: ""
    */
  var filters: js.UndefOr[String] = js.undefined
  /**
    * If set to true, the result hits will contain ranking information in the _rankingInfo attribute.
    * default: false
    */
  var getRankingInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the string that is inserted after the highlighted parts in the query result
    * default: </em>
    */
  var highlightPostTag: js.UndefOr[String] = js.undefined
  /**
    * Specify the string that is inserted before the highlighted parts in the query result
    * default: <em>
    */
  var highlightPreTag: js.UndefOr[String] = js.undefined
  /**
    * Pagination parameter used to select the number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, plural won't be considered as a typo
    * default: false
    */
  var ignorePlurals: js.UndefOr[Boolean] = js.undefined
  /**
    * Search entries inside a given area defined by the two extreme points of a rectangle
    * default: null
    */
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  /**
    * Search entries inside a given area defined by a set of points
    * defauly: ''
    */
  var insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  /**
    * Number of hits to return.
    * default: null
    */
  var length: js.UndefOr[Double] = js.undefined
  /**
    * Limit the number of facet values returned for each facet.
    * default: 100
    */
  var maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    */
  var minProximity: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of characters needed to accept one typo.
    * default: 4
    */
  var minWordSizefor1Typo: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of characters needed to accept two typo.
    * fault: 8
    */
  var minWordSizefor2Typos: js.UndefOr[Double] = js.undefined
  /**
    * Define the minimum radius used for a geo search when aroundRadius is not set.
    * default: null
    */
  var minimumAroundRadius: js.UndefOr[Double] = js.undefined
  var nbShards: js.UndefOr[Double] = js.undefined
  /**
    * All numerical attributes are automatically indexed as numerical filters
    */
  var numericAttributesForFiltering: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @deprecated Use `numericAttributesForFiltering` instead
    * All numerical attributes are automatically indexed as numerical filters
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * @deprecated please use filters instead
    * A string that contains the comma separated list of numeric filters you want to apply.
    */
  var numericFilters: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Offset of the first hit to return
    * default: null
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    */
  var optionalWords: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Pagination parameter used to select the page to retrieve.
    * default: 0
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Query string used to perform the search
    * default: ''
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    */
  var queryType: js.UndefOr[prefixAll | prefixLast | prefixNone] = js.undefined
  /**
    * Remove stop words from the query before executing it
    * default: false
    * true|false: enable or disable stop words for all 41 supported languages; or
    * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
    */
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * This option is used to select a strategy in order to avoid having an empty result page
    * default: 'none'
    * 'lastWords' When a query does not return any results, the last word will be added as optional
    * 'firstWords' When a query does not return any results, the first word will be added as optional
    * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
    * 'none' No specific processing is done when a query does not return any results
    */
  var removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.undefined
  /**
    * If set to false, words matched via synonym expansion will not be replaced by the matched synonym in the highlighted result.
    * default: true
    */
  var replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined
  /**
    * List of attributes you want to use for textual search
    * default: attributeToIndex
    */
  var restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  var ruleContexts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    */
  var snippetEllipsisText: js.UndefOr[String] = js.undefined
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.undefined
  /**
    * Determines how to calculate the total score for filtering
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/sumOrFiltersScores/
    */
  var sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to false, the search will not use the synonyms defined for the targeted index.
    * default: true
    */
  var synonyms: js.UndefOr[Boolean] = js.undefined
  /**
    * @deprecated
    *
    * Filter the query by a set of tags.
    * Default: []
    */
  var tagFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
  /**
    * This option allows you to control the number of typos allowed in the result set:
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    */
  var typoTolerance: js.UndefOr[Boolean | min | strict] = js.undefined
  var userData: js.UndefOr[String | js.Object] = js.undefined
  /**
    * Associates a certain user token with the current search
    * https://www.algolia.com/doc/api-reference/api-parameters/userToken/
    */
  var userToken: js.UndefOr[String] = js.undefined
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
    distinct: Double | Boolean = null,
    enableABTest: js.UndefOr[Boolean] = js.undefined,
    exactOnSingleWordQuery: attribute | none | word = null,
    facetFilters: js.Array[String | js.Array[String]] = null,
    facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined,
    facets: js.Array[String] = null,
    filters: String = null,
    getRankingInfo: js.UndefOr[Boolean] = js.undefined,
    highlightPostTag: String = null,
    highlightPreTag: String = null,
    hitsPerPage: Int | Double = null,
    ignorePlurals: js.UndefOr[Boolean] = js.undefined,
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
    offset: Int | Double = null,
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
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (!js.isUndefined(enableABTest)) __obj.updateDynamic("enableABTest")(enableABTest.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals.asInstanceOf[js.Any])
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
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
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
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
}

