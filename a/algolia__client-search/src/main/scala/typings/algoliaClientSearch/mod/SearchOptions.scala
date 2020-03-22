package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.AnonFrom
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  /**
    * Enables the advanced query syntax.
    */
  val advancedSyntax: js.UndefOr[Boolean] = js.undefined
  /**
    * AdvancedSyntaxFeatures can be exactPhrase or excludeWords
    */
  val advancedSyntaxFeatures: js.UndefOr[js.Array[exactPhrase | excludeWords]] = js.undefined
  /**
    * Whether to allow typos on numbers (“numeric tokens”) in the query string.
    */
  val allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.undefined
  /**
    * List of alternatives that should be considered an exact match by the exact ranking criterion.
    */
  val alternativesAsExact: js.UndefOr[
    js.Array[
      typings.algoliaClientSearch.algoliaClientSearchStrings.ignorePlurals | singleWordSynonym | multiWordsSynonym
    ]
  ] = js.undefined
  /**
    * Whether the current query will be taken into account in the Analytics
    */
  val analytics: js.UndefOr[Boolean] = js.undefined
  /**
    * List of tags to apply to the query in the analytics.
    */
  val analyticsTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Search for entries around a central geolocation, enabling a geo search within a circular area.
    */
  val aroundLatLng: js.UndefOr[String] = js.undefined
  /**
    * Search for entries around a given location automatically computed from the requester’s IP address.
    */
  val aroundLatLngViaIP: js.UndefOr[Boolean] = js.undefined
  /**
    * Precision of geo search (in meters), to add grouping by geo location to the ranking formula.
    */
  val aroundPrecision: js.UndefOr[Double | js.Array[AnonFrom]] = js.undefined
  /**
    * Search for entries around a given location automatically computed from the requester’s IP address.
    */
  val aroundRadius: js.UndefOr[Double | all] = js.undefined
  /**
    * List of attributes to highlight.
    */
  val attributesToHighlight: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Gives control over which attributes to retrieve and which not to retrieve.
    */
  val attributesToRetrieve: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes to snippet, with an optional maximum number of words to snippet.
    */
  val attributesToSnippet: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Enable the Click Analytics feature.
    */
  val clickAnalytics: js.UndefOr[Boolean] = js.undefined
  /**
    * List of attributes on which you want to disable the exact ranking criterion.
    */
  val disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * List of attributes on which you want to disable typo tolerance.
    */
  val disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Enables de-duplication or grouping of results.
    */
  val distinct: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Can be to enable or disable A/B tests at query time.
    * Engine's default: true
    */
  val enableABTest: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable personalization for the query
    */
  val enablePersonalization: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether rules should be globally enabled.
    */
  val enableRules: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls how the exact ranking criterion is computed when the query contains only one word.
    */
  val exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.undefined
  /**
    *  Filter hits by facet value.
    */
  val facetFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  /**
    *  Force faceting to be applied after de-duplication (via the Distinct setting).
    */
  val facetingAfterDistinct: js.UndefOr[Boolean] = js.undefined
  /**
    * Facets to retrieve.
    */
  val facets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Filter the query with numeric, facet and/or tag filters.
    */
  val filters: js.UndefOr[String] = js.undefined
  /**
    * When true, each hit in the response contains an additional _rankingInfo object.
    */
  val getRankingInfo: js.UndefOr[Boolean] = js.undefined
  /**
    * The HTML string to insert after the highlighted parts in all highlight and snippet results
    */
  val highlightPostTag: js.UndefOr[String] = js.undefined
  /**
    * The HTML string to insert before the highlighted parts in all highlight and snippet results.
    */
  val highlightPreTag: js.UndefOr[String] = js.undefined
  /**
    * Set the number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Treats singular, plurals, and other forms of declensions as matching terms.
    */
  val ignorePlurals: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Search inside a rectangular area (in geo coordinates).
    */
  val insideBoundingBox: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  /**
    * Search inside a polygon (in geo coordinates).
    */
  val insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  /**
    * Set the number of hits to retrieve (used only with offset).
    */
  val length: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of facet hits to return during a search for facet values.
    */
  val maxFacetHits: js.UndefOr[Double] = js.undefined
  /**
    * Maximum number of facet values to return for each facet during a regular search.
    */
  val maxValuesPerFacet: js.UndefOr[Double] = js.undefined
  /**
    * Precision of the proximity ranking criterion.
    */
  val minProximity: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 1 typo
    */
  val minWordSizefor1Typo: js.UndefOr[Double] = js.undefined
  /**
    * Minimum number of characters a word in the query string must contain to accept matches with 2 typos.
    */
  val minWordSizefor2Typos: js.UndefOr[Double] = js.undefined
  /**
    * Minimum radius (in meters) used for a geo search when aroundRadius is not set.
    */
  val minimumAroundRadius: js.UndefOr[Double] = js.undefined
  /**
    * Filter on numeric attributes.
    */
  val numericFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  /**
    * Specify the offset of the first hit to return.
    */
  val offset: js.UndefOr[Double] = js.undefined
  /**
    * Create filters for ranking purposes, where records that match the filter are ranked highest.
    */
  val optionalFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  /**
    * A list of words that should be considered as optional when found in the query.
    */
  val optionalWords: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Specify the page to retrieve.
    */
  val page: js.UndefOr[Double] = js.undefined
  /**
    * Whether to include or exclude a query from the processing-time percentile computation.
    */
  val percentileComputation: js.UndefOr[Boolean] = js.undefined
  /**
    * The `personalizationImpact` parameter sets the percentage of the impact that personalization has on ranking records. The
    * value must be between 0 and 100 (inclusive). This parameter will not be taken into account if `enablePersonalization`
    * is **false**.
    */
  val personalizationImpact: js.UndefOr[Double] = js.undefined
  /**
    * Create a new query with an empty search query.
    */
  val query: js.UndefOr[String] = js.undefined
  /**
    * Controls if and how query words are interpreted as prefixes.
    */
  val queryType: js.UndefOr[prefixLast | prefixAll | prefixNone] = js.undefined
  /**
    * Removes stop (common) words from the query before executing it.
    */
  val removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  /**
    * Selects a strategy to remove words from the query when it doesn’t match any hits.
    */
  val removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.undefined
  /**
    * Whether to highlight and snippet the original word that matches the synonym or the synonym itself.
    */
  val replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.undefined
  /**
    * Choose which fields the response will contain. Applies to search and browse queries.
    */
  val responseFields: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Restrict highlighting and snippeting to items that matched the query.
    */
  val restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.undefined
  /**
    * Restricts a given query to look in only a subset of your searchable attributes.
    */
  val restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Enables contextual rules.
    */
  val ruleContexts: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Allows a search for similar objects, but the query has to be constructed on your end and included alongside an empty query.
    *
    * The similarQuery should be made from the tags and keywords of the relevant object.
    */
  val similarQuery: js.UndefOr[String] = js.undefined
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    */
  val snippetEllipsisText: js.UndefOr[String] = js.undefined
  /**
    * Restricts a given query to look in only a subset of your searchable attributes.
    */
  val sortFacetValuesBy: js.UndefOr[count | alpha] = js.undefined
  /**
    * Determines how to calculate the total score for filtering.
    */
  val sumOrFiltersScores: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to take into account an index’s synonyms for a particular search.
    */
  val synonyms: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter hits by tags. tagFilters is a different way of filtering, which relies on the _tags
    * attribute. It uses a simpler syntax than filters. You can use it when you want to do
    * simple filtering based on tags.
    */
  val tagFilters: js.UndefOr[String | (js.Array[js.Array[String] | String])] = js.undefined
  /**
    * Controls whether typo tolerance is enabled and how it is applied.
    */
  val typoTolerance: js.UndefOr[Boolean | min | strict] = js.undefined
  /**
    * A user identifier.
    * Format: alpha numeric string [a-zA-Z0-9_-]
    * Length: between 1 and 64 characters.
    */
  val userToken: js.UndefOr[String] = js.undefined
}

object SearchOptions {
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
    aroundPrecision: Double | js.Array[AnonFrom] = null,
    aroundRadius: Double | all = null,
    attributesToHighlight: js.Array[String] = null,
    attributesToRetrieve: js.Array[String] = null,
    attributesToSnippet: js.Array[String] = null,
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
    hitsPerPage: Int | Double = null,
    ignorePlurals: Boolean | js.Array[String] = null,
    insideBoundingBox: js.Array[js.Array[Double]] = null,
    insidePolygon: js.Array[js.Array[Double]] = null,
    length: Int | Double = null,
    maxFacetHits: Int | Double = null,
    maxValuesPerFacet: Int | Double = null,
    minProximity: Int | Double = null,
    minWordSizefor1Typo: Int | Double = null,
    minWordSizefor2Typos: Int | Double = null,
    minimumAroundRadius: Int | Double = null,
    numericFilters: String | (js.Array[js.Array[String] | String]) = null,
    offset: Int | Double = null,
    optionalFilters: String | (js.Array[js.Array[String] | String]) = null,
    optionalWords: String | js.Array[String] = null,
    page: Int | Double = null,
    percentileComputation: js.UndefOr[Boolean] = js.undefined,
    personalizationImpact: Int | Double = null,
    query: String = null,
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
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(advancedSyntax)) __obj.updateDynamic("advancedSyntax")(advancedSyntax.asInstanceOf[js.Any])
    if (advancedSyntaxFeatures != null) __obj.updateDynamic("advancedSyntaxFeatures")(advancedSyntaxFeatures.asInstanceOf[js.Any])
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
    if (!js.isUndefined(enablePersonalization)) __obj.updateDynamic("enablePersonalization")(enablePersonalization.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRules)) __obj.updateDynamic("enableRules")(enableRules.asInstanceOf[js.Any])
    if (exactOnSingleWordQuery != null) __obj.updateDynamic("exactOnSingleWordQuery")(exactOnSingleWordQuery.asInstanceOf[js.Any])
    if (facetFilters != null) __obj.updateDynamic("facetFilters")(facetFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(facetingAfterDistinct)) __obj.updateDynamic("facetingAfterDistinct")(facetingAfterDistinct.asInstanceOf[js.Any])
    if (facets != null) __obj.updateDynamic("facets")(facets.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(getRankingInfo)) __obj.updateDynamic("getRankingInfo")(getRankingInfo.asInstanceOf[js.Any])
    if (highlightPostTag != null) __obj.updateDynamic("highlightPostTag")(highlightPostTag.asInstanceOf[js.Any])
    if (highlightPreTag != null) __obj.updateDynamic("highlightPreTag")(highlightPreTag.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (ignorePlurals != null) __obj.updateDynamic("ignorePlurals")(ignorePlurals.asInstanceOf[js.Any])
    if (insideBoundingBox != null) __obj.updateDynamic("insideBoundingBox")(insideBoundingBox.asInstanceOf[js.Any])
    if (insidePolygon != null) __obj.updateDynamic("insidePolygon")(insidePolygon.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (maxFacetHits != null) __obj.updateDynamic("maxFacetHits")(maxFacetHits.asInstanceOf[js.Any])
    if (maxValuesPerFacet != null) __obj.updateDynamic("maxValuesPerFacet")(maxValuesPerFacet.asInstanceOf[js.Any])
    if (minProximity != null) __obj.updateDynamic("minProximity")(minProximity.asInstanceOf[js.Any])
    if (minWordSizefor1Typo != null) __obj.updateDynamic("minWordSizefor1Typo")(minWordSizefor1Typo.asInstanceOf[js.Any])
    if (minWordSizefor2Typos != null) __obj.updateDynamic("minWordSizefor2Typos")(minWordSizefor2Typos.asInstanceOf[js.Any])
    if (minimumAroundRadius != null) __obj.updateDynamic("minimumAroundRadius")(minimumAroundRadius.asInstanceOf[js.Any])
    if (numericFilters != null) __obj.updateDynamic("numericFilters")(numericFilters.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (optionalFilters != null) __obj.updateDynamic("optionalFilters")(optionalFilters.asInstanceOf[js.Any])
    if (optionalWords != null) __obj.updateDynamic("optionalWords")(optionalWords.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(percentileComputation)) __obj.updateDynamic("percentileComputation")(percentileComputation.asInstanceOf[js.Any])
    if (personalizationImpact != null) __obj.updateDynamic("personalizationImpact")(personalizationImpact.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (queryType != null) __obj.updateDynamic("queryType")(queryType.asInstanceOf[js.Any])
    if (removeStopWords != null) __obj.updateDynamic("removeStopWords")(removeStopWords.asInstanceOf[js.Any])
    if (removeWordsIfNoResults != null) __obj.updateDynamic("removeWordsIfNoResults")(removeWordsIfNoResults.asInstanceOf[js.Any])
    if (!js.isUndefined(replaceSynonymsInHighlight)) __obj.updateDynamic("replaceSynonymsInHighlight")(replaceSynonymsInHighlight.asInstanceOf[js.Any])
    if (responseFields != null) __obj.updateDynamic("responseFields")(responseFields.asInstanceOf[js.Any])
    if (!js.isUndefined(restrictHighlightAndSnippetArrays)) __obj.updateDynamic("restrictHighlightAndSnippetArrays")(restrictHighlightAndSnippetArrays.asInstanceOf[js.Any])
    if (restrictSearchableAttributes != null) __obj.updateDynamic("restrictSearchableAttributes")(restrictSearchableAttributes.asInstanceOf[js.Any])
    if (ruleContexts != null) __obj.updateDynamic("ruleContexts")(ruleContexts.asInstanceOf[js.Any])
    if (similarQuery != null) __obj.updateDynamic("similarQuery")(similarQuery.asInstanceOf[js.Any])
    if (snippetEllipsisText != null) __obj.updateDynamic("snippetEllipsisText")(snippetEllipsisText.asInstanceOf[js.Any])
    if (sortFacetValuesBy != null) __obj.updateDynamic("sortFacetValuesBy")(sortFacetValuesBy.asInstanceOf[js.Any])
    if (!js.isUndefined(sumOrFiltersScores)) __obj.updateDynamic("sumOrFiltersScores")(sumOrFiltersScores.asInstanceOf[js.Any])
    if (!js.isUndefined(synonyms)) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    if (typoTolerance != null) __obj.updateDynamic("typoTolerance")(typoTolerance.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

