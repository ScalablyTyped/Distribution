package typings.algoliaClientSearch.mod

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
import typings.algoliaClientSearch.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchOptions extends StObject {
  
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
  val aroundPrecision: js.UndefOr[Double | js.Array[From]] = js.undefined
  
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
    * List of supported languages with their associated language ISO code.
    *
    * Apply a set of natural language best practices such as ignorePlurals,
    * removeStopWords, removeWordsIfNoResults, analyticsTags and ruleContexts.
    */
  val naturalLanguages: js.UndefOr[js.Array[String]] = js.undefined
  
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
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
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
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
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
