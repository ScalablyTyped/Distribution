package typings.algoliasearch.algoliasearchMod.SearchForFacetValues

import typings.algoliasearch.algoliasearchMod.QueryParameters
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

trait Parameters extends QueryParameters {
  /**
    * The facet to search in
    */
  var facetName: String
  /**
    * The query for the search in this facet
    */
  var facetQuery: String
  /**
    * The maximum number of facets to fetch
    */
  var maxFacetHits: js.UndefOr[Double] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    facetName: String,
    facetQuery: String,
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
    maxFacetHits: Int | Double = null,
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
    synonyms: js.UndefOr[Boolean] = js.undefined,
    tagFilters: js.Array[String] = null,
    typoTolerance: Boolean | min | strict = null,
    userData: String | js.Object = null
  ): Parameters = {
    val __obj = js.Dynamic.literal(facetName = facetName, facetQuery = facetQuery)
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax)
    if (!js.isUndefined(allowTyposOnNumericTokens)) __obj.updateDynamic("allowTyposOnNumericTokens")(allowTyposOnNumericTokens)
    if (alternativesAsExact != null) __obj.updateDynamic("alternativesAsExact")(alternativesAsExact)
    if (!js.isUndefined(analytics)) __obj.updateDynamic("analytics")(analytics)
    if (analyticsTags != null) __obj.updateDynamic("analyticsTags")(analyticsTags)
    if (aroundLatLng != null) __obj.updateDynamic("aroundLatLng")(aroundLatLng)
    if (!js.isUndefined(aroundLatLngViaIP)) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP)
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
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters)
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct)
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
    if (maxFacetHits != null) __obj.updateDynamic("maxFacetHits")(maxFacetHits.asInstanceOf[js.Any])
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
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight)
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays)
    if (restrictSearchableAttributes != null) __obj.updateDynamic("restrictSearchableAttributes")(restrictSearchableAttributes)
    if (ruleContexts != null) __obj.updateDynamic("ruleContexts")(ruleContexts)
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText)
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms)
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters)
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

