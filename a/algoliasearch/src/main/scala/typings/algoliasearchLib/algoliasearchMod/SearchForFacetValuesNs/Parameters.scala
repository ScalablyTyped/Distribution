package typings
package algoliasearchLib.algoliasearchMod.SearchForFacetValuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters
  extends algoliasearchLib.algoliasearchMod.QueryParameters {
  /**
    * The facet to search in
    */
  var facetName: java.lang.String
  /**
    * The query for the search in this facet
    */
  var facetQuery: java.lang.String
  /**
    * The maximum number of facets to fetch
    */
  var maxFacetHits: js.UndefOr[scala.Double] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(
    facetName: java.lang.String,
    facetQuery: java.lang.String,
    advancedSyntax: js.UndefOr[scala.Boolean] = js.undefined,
    allowTyposOnNumericTokens: js.UndefOr[scala.Boolean] = js.undefined,
    alternativesAsExact: js.Array[
      algoliasearchLib.algoliasearchLibStrings.ignorePlurals | algoliasearchLib.algoliasearchLibStrings.singleWordSynonym | algoliasearchLib.algoliasearchLibStrings.multiWordsSynonym
    ] = null,
    analytics: js.UndefOr[scala.Boolean] = js.undefined,
    analyticsTags: js.Array[java.lang.String] = null,
    aroundLatLng: java.lang.String = null,
    aroundLatLngViaIP: js.UndefOr[scala.Boolean] = js.undefined,
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
    facetFilters: js.Array[js.Array[java.lang.String] | java.lang.String] = null,
    facetingAfterDistinct: js.UndefOr[scala.Boolean] = js.undefined,
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
    maxFacetHits: scala.Int | scala.Double = null,
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
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText)
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms)
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters)
    if (!js.isUndefined(typoTolerance)) __obj.updateDynamic("typoTolerance")(typoTolerance)
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

