package typings
package algoliasearchLib.liteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters extends js.Object {
  /**
    * Enables the advanced query syntax
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/advancedSyntax/
    */
  var advancedSyntax: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default:
    * https://www.algolia.com/doc/api-reference/api-parameters/allowTyposOnNumericTokens/
    */
  var allowTyposOnNumericTokens: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the list of approximation that should be considered as an exact match in the ranking formula
    * default: ['ignorePlurals', 'singleWordSynonym']
    * 'ignorePlurals': alternative words added by the ignorePlurals feature
    * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
    * 'multiWordsSynonym': multiple-words synonym
    * https://www.algolia.com/doc/api-reference/api-parameters/alternativesAsExact/
    */
  var alternativesAsExact: js.UndefOr[
    js.Array[
      algoliasearchLib.algoliasearchLibStrings.ignorePlurals | algoliasearchLib.algoliasearchLibStrings.singleWordSynonym | algoliasearchLib.algoliasearchLibStrings.multiWordsSynonym
    ]
  ] = js.undefined
  /**
    * If set to false, this query will not be taken into account in the analytics feature.
    * default true
    * https://www.algolia.com/doc/api-reference/api-parameters/analytics/
    */
  var analytics: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set, tag your query with the specified identifiers
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/analyticsTags/
    */
  var analyticsTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Search for entries around a given location
    * default: ""
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundLatLng/
    */
  var aroundLatLng: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Search for entries around a given latitude/longitude automatically computed from user IP address.
    * default: ""
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundLatLngViaIP/
    */
  var aroundLatLngViaIP: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Control the precision of a geo search
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundPrecision/
    */
  var aroundPrecision: js.UndefOr[scala.Double] = js.undefined
  /**
    * Control the radius associated with a geo search. Defined in meters.
    * default: null
    * You can specify aroundRadius=all if you want to compute the geo distance without filtering in a geo area
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundRadius/
    */
  var aroundRadius: js.UndefOr[scala.Double | algoliasearchLib.algoliasearchLibStrings.all] = js.undefined
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/attributesToHighlight/
    */
  var attributesToHighlight: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer.
    * default: *
    * https://www.algolia.com/doc/api-reference/api-parameters/attributesToRetrieve/
    */
  var attributesToRetrieve: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/attributesToSnippet/
    */
  var attributesToSnippet: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If set to true, enables the Click Analytics feature
    * default false
    * https://www.algolia.com/doc/api-reference/api-parameters/clickAnalytics/
    */
  var clickAnalytics: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/disableExactOnAttributes/
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/disableTypoToleranceOnAttributes/
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    * https://www.algolia.com/doc/api-reference/api-parameters/distinct/
    */
  var distinct: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    * https://www.algolia.com/doc/api-reference/api-parameters/exactOnSingleWordQuery/
    */
  var exactOnSingleWordQuery: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.attribute | algoliasearchLib.algoliasearchLibStrings.none | algoliasearchLib.algoliasearchLibStrings.word
  ] = js.undefined
  /**
    * Filter the query by a set of facets.
    * Default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/facetFilters/
    */
  var facetFilters: js.UndefOr[js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]]] = js.undefined
  /**
    * You can use facets to retrieve only a part of your attributes declared in attributesForFaceting attributes
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/facets/
    */
  var facets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Filter the query with numeric, facet or/and tag filters
    * default: ""
    * https://www.algolia.com/doc/api-reference/api-parameters/filters/
    */
  var filters: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If set to true, the result hits will contain ranking information in the _rankingInfo attribute.
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/getRankingInfo/
    */
  var getRankingInfo: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the string that is inserted after the highlighted parts in the query result
    * default: </em>
    * https://www.algolia.com/doc/api-reference/api-parameters/highlightPostTag/
    */
  var highlightPostTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the string that is inserted before the highlighted parts in the query result
    * default: <em>
    * https://www.algolia.com/doc/api-reference/api-parameters/highlightPreTag/
    */
  var highlightPreTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Pagination parameter used to select the number of hits per page
    * default: 20
    * https://www.algolia.com/doc/api-reference/api-parameters/hitsPerPage/
    */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set to true, plural won't be considered as a typo
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/ignorePlurals/
    */
  var ignorePlurals: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Search entries inside a given area defined by the two extreme points of a rectangle
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/insideBoundingBox/
    */
  var insideBoundingBox: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  /**
    * Search entries inside a given area defined by a set of points
    * defauly: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/insidePolygon/
    */
  var insidePolygon: js.UndefOr[js.Array[js.Array[scala.Double]]] = js.undefined
  /**
    * Number of hits to return.
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/length/
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /**
    * Limit the number of facet values returned for each facet.
    * default: 100
    * https://www.algolia.com/doc/api-reference/api-parameters/maxValuesPerFacet/
    */
  var maxValuesPerFacet: js.UndefOr[scala.Double] = js.undefined
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    * https://www.algolia.com/doc/api-reference/api-parameters/minProximity/
    */
  var minProximity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of characters needed to accept one typo.
    * default: 4
    * https://www.algolia.com/doc/api-reference/api-parameters/minWordSizefor1Typo/
    */
  var minWordSizefor1Typo: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum number of characters needed to accept two typo.
    * fault: 8
    * https://www.algolia.com/doc/api-reference/api-parameters/minWordSizefor2Typos/
    */
  var minWordSizefor2Typos: js.UndefOr[scala.Double] = js.undefined
  /**
    * Define the minimum radius used for a geo search when aroundRadius is not set.
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/minimumAroundRadius/
    */
  var minimumAroundRadius: js.UndefOr[scala.Double] = js.undefined
  var nbShards: js.UndefOr[scala.Double] = js.undefined
  /**
    * All numerical attributes are automatically indexed as numerical filters
    * default: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/numericAttributesForFiltering/
    */
  var numericAttributesForFiltering: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * @deprecated Use `numericAttributesForFiltering` instead
    * All numerical attributes are automatically indexed as numerical filters
    * default: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/numericAttributesForFiltering/
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * @deprecated please use filters instead
    * A string that contains the comma separated list of numeric filters you want to apply.
    * https://www.algolia.com/doc/api-reference/api-parameters/numericFilters/
    */
  var numericFilters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Offset of the first hit to return
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/offset/
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/optionalWords/
    */
  var optionalWords: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Pagination parameter used to select the page to retrieve.
    * default: 0
    * https://www.algolia.com/doc/api-reference/api-parameters/page/
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Query string used to perform the search
    * default: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/query/
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets the languages to be used by language-specific settings and functionalities
    * such as ignorePlurals, removeStopWords, and CJK word-detection.
    * https://www.algolia.com/doc/api-reference/api-parameters/queryLanguages/
    */
  var queryLanguages: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 68 */ js.Any
    ]
  ] = js.undefined
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    * https://www.algolia.com/doc/api-reference/api-parameters/queryType/
    */
  var queryType: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.prefixAll | algoliasearchLib.algoliasearchLibStrings.prefixLast | algoliasearchLib.algoliasearchLibStrings.prefixNone
  ] = js.undefined
  /**
    * Remove stop words from the query before executing it
    * default: false
    * true|false: enable or disable stop words for all 41 supported languages; or
    * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
    * https://www.algolia.com/doc/api-reference/api-parameters/removeStopWords/
    */
  var removeStopWords: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
  /**
    * This option is used to select a strategy in order to avoid having an empty result page
    * default: 'none'
    * 'lastWords' When a query does not return any results, the last word will be added as optional
    * 'firstWords' When a query does not return any results, the first word will be added as optional
    * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
    * 'none' No specific processing is done when a query does not return any results
    * https://www.algolia.com/doc/api-reference/api-parameters/removeWordsIfNoResults/
    */
  var removeWordsIfNoResults: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.none | algoliasearchLib.algoliasearchLibStrings.lastWords | algoliasearchLib.algoliasearchLibStrings.firstWords | algoliasearchLib.algoliasearchLibStrings.allOptional
  ] = js.undefined
  /**
    * If set to false, words matched via synonym expansion will not be replaced by the matched synonym in the highlighted result.
    * default: true
    * https://www.algolia.com/doc/api-reference/api-parameters/replaceSynonymsInHighlight/
    */
  var replaceSynonymsInHighlight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/restrictHighlightAndSnippetArrays/
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of attributes you want to use for textual search
    * default: attributeToIndex
    * https://www.algolia.com/doc/api-reference/api-parameters/restrictSearchableAttributes/
    */
  var restrictSearchableAttributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    * https://www.algolia.com/doc/api-reference/api-parameters/snippetEllipsisText/
    */
  var snippetEllipsisText: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Controls how facet values are sorted.
    * https://www.algolia.com/doc/api-reference/api-parameters/sortFacetValuesBy/
    */
  var sortFacetValuesBy: js.UndefOr[
    algoliasearchLib.algoliasearchLibStrings.count | algoliasearchLib.algoliasearchLibStrings.alpha
  ] = js.undefined
  /**
    * If set to false, the search will not use the synonyms defined for the targeted index.
    * default: true
    * https://www.algolia.com/doc/api-reference/api-parameters/synonyms/
    */
  var synonyms: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * @deprecated
    *
    * Filter the query by a set of tags.
    * Default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/tagFilters/
    */
  var tagFilters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * This option allows you to control the number of typos allowed in the result set:
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    * https://www.algolia.com/doc/api-reference/api-parameters/typoTolerance/
    */
  var typoTolerance: js.UndefOr[scala.Boolean] = js.undefined
  var userData: js.UndefOr[java.lang.String | js.Object] = js.undefined
}

object QueryParameters {
  @scala.inline
  def apply(
    advancedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[scala.Boolean] = js.undefined,
    alternativesAsExact: js.Array[
      algoliasearchLib.algoliasearchLibStrings.ignorePlurals | algoliasearchLib.algoliasearchLibStrings.singleWordSynonym | algoliasearchLib.algoliasearchLibStrings.multiWordsSynonym
    ] = null,
    analytics: js.UndefOr[scala.Boolean] = js.undefined,
    analyticsTags: js.Array[java.lang.String] = null,
    aroundLatLng: java.lang.String = null,
    aroundLatLngViaIP: java.lang.String = null,
    aroundPrecision: scala.Int | scala.Double = null,
    aroundRadius: scala.Double | algoliasearchLib.algoliasearchLibStrings.all = null,
    attributesToHighlight: js.Array[java.lang.String] = null,
    attributesToRetrieve: js.Array[java.lang.String] = null,
    attributesToSnippet: js.Array[java.lang.String] = null,
    clickAnalytics: js.UndefOr[scala.Boolean] = js.undefined,
    disableExactOnAttributes: js.Array[java.lang.String] = null,
    disableTypoToleranceOnAttributes: js.Array[java.lang.String] = null,
    distinct: scala.Double | scala.Boolean = null,
    exactOnSingleWordQuery: algoliasearchLib.algoliasearchLibStrings.attribute | algoliasearchLib.algoliasearchLibStrings.none | algoliasearchLib.algoliasearchLibStrings.word = null,
    facetFilters: js.Array[java.lang.String] | js.Array[js.Array[java.lang.String]] = null,
    facets: js.Array[java.lang.String] = null,
    filters: java.lang.String = null,
    getRankingInfo: js.UndefOr[scala.Boolean] = js.undefined,
    highlightPostTag: java.lang.String = null,
    highlightPreTag: java.lang.String = null,
    hitsPerPage: scala.Int | scala.Double = null,
    ignorePlurals: js.UndefOr[scala.Boolean] = js.undefined,
    insideBoundingBox: js.Array[js.Array[scala.Double]] = null,
    insidePolygon: js.Array[js.Array[scala.Double]] = null,
    length: scala.Int | scala.Double = null,
    maxValuesPerFacet: scala.Int | scala.Double = null,
    minProximity: scala.Int | scala.Double = null,
    minWordSizefor1Typo: scala.Int | scala.Double = null,
    minWordSizefor2Typos: scala.Int | scala.Double = null,
    minimumAroundRadius: scala.Int | scala.Double = null,
    nbShards: scala.Int | scala.Double = null,
    numericAttributesForFiltering: js.Array[java.lang.String] = null,
    numericAttributesToIndex: js.Array[java.lang.String] = null,
    numericFilters: js.Array[java.lang.String] = null,
    offset: scala.Int | scala.Double = null,
    optionalWords: js.Array[java.lang.String] = null,
    page: scala.Int | scala.Double = null,
    query: java.lang.String = null,
    queryLanguages: js.Array[
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 68 */ js.Any
    ] = null,
    queryType: algoliasearchLib.algoliasearchLibStrings.prefixAll | algoliasearchLib.algoliasearchLibStrings.prefixLast | algoliasearchLib.algoliasearchLibStrings.prefixNone = null,
    removeStopWords: scala.Boolean | js.Array[java.lang.String] = null,
    removeWordsIfNoResults: algoliasearchLib.algoliasearchLibStrings.none | algoliasearchLib.algoliasearchLibStrings.lastWords | algoliasearchLib.algoliasearchLibStrings.firstWords | algoliasearchLib.algoliasearchLibStrings.allOptional = null,
    replaceSynonymsInHighlight: js.UndefOr[scala.Boolean] = js.undefined,
    restrictHighlightAndSnippetArrays: js.UndefOr[scala.Boolean] = js.undefined,
    restrictSearchableAttributes: js.Array[java.lang.String] = null,
    snippetEllipsisText: java.lang.String = null,
    sortFacetValuesBy: algoliasearchLib.algoliasearchLibStrings.count | algoliasearchLib.algoliasearchLibStrings.alpha = null,
    synonyms: js.UndefOr[scala.Boolean] = js.undefined,
    tagFilters: js.Array[java.lang.String] = null,
    typoTolerance: js.UndefOr[scala.Boolean] = js.undefined,
    userData: java.lang.String | js.Object = null
  ): QueryParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax)
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens)
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact)
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics)
    if (analyticsTags != null) __obj.updateDynamic("analyticsTags")(analyticsTags)
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng)
    if (aroundLatLngViaIP != null) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP)
    if (aroundPrecision != null) __obj.updateDynamic("aroundPrecision")(aroundPrecision.asInstanceOf[js.Any])
    if (aroundRadius != null) __obj.updateDynamic("aroundRadius")(aroundRadius.asInstanceOf[js.Any])
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight)
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve)
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet)
    if (!js.isUndefined(clickAnalytics)) __obj.updateDynamic("clickAnalytics")(clickAnalytics)
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes)
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes)
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo)
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag)
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals)
    if (insideBoundingBox != null) __obj.updateDynamic("insideBoundingBox")(insideBoundingBox)
    if (insidePolygon != null) __obj.updateDynamic("insidePolygon")(insidePolygon)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxValuesPerFacet != null) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.asInstanceOf[js.Any])
    if (minProximity != null) __obj.updateDynamic("minProximity")(minProximity.asInstanceOf[js.Any])
    if (minWordSizefor1Typo != null) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.asInstanceOf[js.Any])
    if (minWordSizefor2Typos != null) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.asInstanceOf[js.Any])
    if (minimumAroundRadius != null) __obj.updateDynamic("minimumAroundRadius")(minimumAroundRadius.asInstanceOf[js.Any])
    if (nbShards != null) __obj.updateDynamic("nbShards")(nbShards.asInstanceOf[js.Any])
    if (numericAttributesForFiltering != null) __obj.updateDynamic("numericAttributesForFiltering")(numericAttributesForFiltering)
    if (numericAttributesToIndex != null) __obj.updateDynamic("numericAttributesToIndex")(numericAttributesToIndex)
    if (numericFilters != null) __obj.updateDynamic("numericFilters")(numericFilters)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryLanguages != null) __obj.updateDynamic("queryLanguages")(queryLanguages)
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight)
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays)
    if (restrictSearchableAttributes != null) __obj.updateDynamic("restrictSearchableAttributes")(restrictSearchableAttributes)
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText)
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms)
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters)
    if (!js.isUndefined(typoTolerance)) __obj.updateDynamic("typoTolerance")(typoTolerance)
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
}

