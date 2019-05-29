package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryParameters
  extends algoliasearchLib.algoliasearchMod.QueryParameters {
  /**
    * This attribute contains the list of all the disjunctive facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    */
  var disjunctiveFacets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
  var disjunctiveFacetsRefinements: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ]
  ] = js.undefined
  // Misc. parameters
  /**
    * Applies 'exact' on single word queries if the word contains at least 3 characters
    * and is not a stop word.
    * Can take two values?: true or false.
    * By default, its set to false.
    * @see https://www.algolia.com/doc/rest#param-enableExactOnSingleWordQuery
    */
  var enableExactOnSingleWordQuery: js.UndefOr[scala.Boolean] = js.undefined
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
  var facetsExcludes: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ]
  ] = js.undefined
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
  var facetsRefinements: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ]
  ] = js.undefined
  /**
    * This attribute contains the list of all the hierarchical facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    * Hierarchical facets are a sub type of disjunctive facets that
    * let you filter faceted attributes hierarchically.
    */
  var hierarchicalFacets: js.UndefOr[js.Array[js.Object | java.lang.String]] = js.undefined
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
  var hierarchicalFacetsRefinements: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ]
  ] = js.undefined
  /**
    * Targeted index. This parameter is mandatory.
    */
  var index: js.UndefOr[java.lang.String] = js.undefined
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
  var numericRefinements: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.OperatorList
    ]
  ] = js.undefined
  /**
    * Contains the optional facet filters in the raw format of the Algolia API.
    * @see https://www.algolia.com/doc/rest#param-tagFilters
    */
  var optionalFacetFilters: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains the optional tag filters in the raw format of the Algolia API.
    * @see https://www.algolia.com/doc/rest#param-tagFilters
    */
  var optionalTagFilters: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This attribute contains all the tags used to refine the query.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `tagFilters` attribute.
    */
  var tagRefinements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
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
    aroundLatLngViaIP: js.UndefOr[scala.Boolean] = js.undefined,
    aroundPrecision: scala.Int | scala.Double = null,
    aroundRadius: scala.Double | algoliasearchLib.algoliasearchLibStrings.all = null,
    attributesToHighlight: js.Array[java.lang.String] = null,
    attributesToRetrieve: js.Array[java.lang.String] = null,
    attributesToSnippet: js.Array[java.lang.String] = null,
    clickAnalytics: js.UndefOr[scala.Boolean] = js.undefined,
    disableExactOnAttributes: js.Array[java.lang.String] = null,
    disableTypoToleranceOnAttributes: js.Array[java.lang.String] = null,
    disjunctiveFacets: js.Array[java.lang.String] = null,
    disjunctiveFacetsRefinements: org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ] = null,
    distinct: scala.Double | scala.Boolean = null,
    enableExactOnSingleWordQuery: js.UndefOr[scala.Boolean] = js.undefined,
    exactOnSingleWordQuery: algoliasearchLib.algoliasearchLibStrings.attribute | algoliasearchLib.algoliasearchLibStrings.none | algoliasearchLib.algoliasearchLibStrings.word = null,
    facetFilters: js.Array[js.Array[java.lang.String] | java.lang.String] = null,
    facetingAfterDistinct: js.UndefOr[scala.Boolean] = js.undefined,
    facets: js.Array[java.lang.String] = null,
    facetsExcludes: org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ] = null,
    facetsRefinements: org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ] = null,
    filters: java.lang.String = null,
    getRankingInfo: js.UndefOr[scala.Boolean] = js.undefined,
    hierarchicalFacets: js.Array[js.Object | java.lang.String] = null,
    hierarchicalFacetsRefinements: org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.FacetList
    ] = null,
    highlightPostTag: java.lang.String = null,
    highlightPreTag: java.lang.String = null,
    hitsPerPage: scala.Int | scala.Double = null,
    ignorePlurals: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String = null,
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
    numericRefinements: org.scalablytyped.runtime.StringDictionary[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.OperatorList
    ] = null,
    offset: scala.Int | scala.Double = null,
    optionalFacetFilters: java.lang.String = null,
    optionalTagFilters: java.lang.String = null,
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
    tagRefinements: js.Array[java.lang.String] = null,
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
    if (!js.isUndefined(aroundLatLngViaIP)) __obj.updateDynamic("aroundLatLngViaIP")(aroundLatLngViaIP)
    if (aroundPrecision != null) __obj.updateDynamic("aroundPrecision")(aroundPrecision.asInstanceOf[js.Any])
    if (aroundRadius != null) __obj.updateDynamic("aroundRadius")(aroundRadius.asInstanceOf[js.Any])
    if (attributesToHighlight != null) __obj.updateDynamic("attributesToHighlight")(attributesToHighlight)
    if (attributesToRetrieve != null) __obj.updateDynamic("attributesToRetrieve")(attributesToRetrieve)
    if (attributesToSnippet != null) __obj.updateDynamic("attributesToSnippet")(attributesToSnippet)
    if (!js.isUndefined(clickAnalytics)) __obj.updateDynamic("clickAnalytics")(clickAnalytics)
    if (disableExactOnAttributes != null) __obj.updateDynamic("disableExactOnAttributes")(disableExactOnAttributes)
    if (disableTypoToleranceOnAttributes != null) __obj.updateDynamic("disableTypoToleranceOnAttributes")(disableTypoToleranceOnAttributes)
    if (disjunctiveFacets != null) __obj.updateDynamic("disjunctiveFacets")(disjunctiveFacets)
    if (disjunctiveFacetsRefinements != null) __obj.updateDynamic("disjunctiveFacetsRefinements")(disjunctiveFacetsRefinements)
    if (distinct != null) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExactOnSingleWordQuery)) __obj.updateDynamic("enableExactOnSingleWordQuery")(enableExactOnSingleWordQuery)
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters)
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct)
    if (facets != null) __obj.updateDynamic("facets")(facets)
    if (facetsExcludes != null) __obj.updateDynamic("facetsExcludes")(facetsExcludes)
    if (facetsRefinements != null) __obj.updateDynamic("facetsRefinements")(facetsRefinements)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo)
    if (hierarchicalFacets != null) __obj.updateDynamic("hierarchicalFacets")(hierarchicalFacets)
    if (hierarchicalFacetsRefinements != null) __obj.updateDynamic("hierarchicalFacetsRefinements")(hierarchicalFacetsRefinements)
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag)
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag)
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (!js.isUndefined(ignorePlurals)) __obj.updateDynamic("ignorePlurals")(ignorePlurals)
    if (index != null) __obj.updateDynamic("index")(index)
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
    if (numericRefinements != null) __obj.updateDynamic("numericRefinements")(numericRefinements)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (optionalFacetFilters != null) __obj.updateDynamic("optionalFacetFilters")(optionalFacetFilters)
    if (optionalTagFilters != null) __obj.updateDynamic("optionalTagFilters")(optionalTagFilters)
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
    if (tagRefinements != null) __obj.updateDynamic("tagRefinements")(tagRefinements)
    if (!js.isUndefined(typoTolerance)) __obj.updateDynamic("typoTolerance")(typoTolerance)
    if (userData != null) __obj.updateDynamic("userData")(userData.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
}

