package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearchHelper.algoliasearchHelperStrings.all
import typings.algoliasearchHelper.algoliasearchHelperStrings.allOptional
import typings.algoliasearchHelper.algoliasearchHelperStrings.alpha
import typings.algoliasearchHelper.algoliasearchHelperStrings.attribute
import typings.algoliasearchHelper.algoliasearchHelperStrings.count
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctiveFacets
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctiveFacetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.facets
import typings.algoliasearchHelper.algoliasearchHelperStrings.facetsExcludes
import typings.algoliasearchHelper.algoliasearchHelperStrings.facetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.firstWords
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchicalFacets
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchicalFacetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.ignorePlurals
import typings.algoliasearchHelper.algoliasearchHelperStrings.index
import typings.algoliasearchHelper.algoliasearchHelperStrings.lastWords
import typings.algoliasearchHelper.algoliasearchHelperStrings.multiWordsSynonym
import typings.algoliasearchHelper.algoliasearchHelperStrings.none
import typings.algoliasearchHelper.algoliasearchHelperStrings.numericRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.optionalFilters
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixAll
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixLast
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixNone
import typings.algoliasearchHelper.algoliasearchHelperStrings.queryLanguages
import typings.algoliasearchHelper.algoliasearchHelperStrings.ruleContexts
import typings.algoliasearchHelper.algoliasearchHelperStrings.singleWordSynonym
import typings.algoliasearchHelper.algoliasearchHelperStrings.tagRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.word
import typings.algoliasearchHelper.mod.SearchParameters.FacetList
import typings.algoliasearchHelper.mod.SearchParameters.HierarchicalFacet
import typings.algoliasearchHelper.mod.SearchParameters.Operator
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("algoliasearch-helper", "SearchParameters")
@js.native
class SearchParameters_ () extends PlainSearchParameters {
  def this(newParameters: PlainSearchParameters) = this()
  
  /* Add a disjunctive facet to the disjunctiveFacets attribute of the helper configuration, if it isn't already present. */
  def addDisjunctiveFacet(facet: String): SearchParameters = js.native
  
  /* Adds a refinement on a disjunctive facet. */
  def addDisjunctiveFacetRefinement(facet: String, value: String): SearchParameters = js.native
  
  /* Exclude a value from a "normal" facet */
  def addExcludeRefinement(facet: String, value: String): SearchParameters = js.native
  
  /* Add a facet to the facets attribute of the helper configuration, if it isn't already present. */
  def addFacet(facet: String): SearchParameters = js.native
  
  /* Add a refinement on a "normal" facet */
  def addFacetRefinement(facet: String, value: String): SearchParameters = js.native
  
  def addHierarchicalFacet(facet: js.Any): SearchParameters = js.native
  
  def addHierarchicalFacetRefinement(facet: String, path: String): SearchParameters = js.native
  
  def addNumericRefinement(attribute: String, operator: Operator, value: js.Array[Double]): SearchParameters = js.native
  def addNumericRefinement(attribute: String, operator: Operator, value: Double): SearchParameters = js.native
  
  def addTagRefinement(tag: String): SearchParameters = js.native
  
  /**
    * Enables the advanced query syntax
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/advancedSyntax/
    */
  var advancedSyntax: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to false, disables typo tolerance on numeric tokens (numbers).
    * default:
    * https://www.algolia.com/doc/api-reference/api-parameters/allowTyposOnNumericTokens/
    */
  var allowTyposOnNumericTokens: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the list of approximation that should be considered as an exact match in the ranking formula
    * default: ['ignorePlurals', 'singleWordSynonym']
    * 'ignorePlurals': alternative words added by the ignorePlurals feature
    * 'singleWordSynonym': single-word synonym (For example "NY" = "NYC")
    * 'multiWordsSynonym': multiple-words synonym
    * https://www.algolia.com/doc/api-reference/api-parameters/alternativesAsExact/
    */
  var alternativesAsExact: js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.native
  
  /**
    * If set to false, this query will not be taken into account in the analytics feature.
    * default true
    * https://www.algolia.com/doc/api-reference/api-parameters/analytics/
    */
  var analytics: js.UndefOr[Boolean] = js.native
  
  /**
    * If set, tag your query with the specified identifiers
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/analyticsTags/
    */
  var analyticsTags: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Search for entries around a given location
    * default: ""
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundLatLng/
    */
  var aroundLatLng: js.UndefOr[String] = js.native
  
  /**
    * Search for entries around a given latitude/longitude automatically computed from user IP address.
    * default: ""
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundLatLngViaIP/
    */
  var aroundLatLngViaIP: js.UndefOr[Boolean] = js.native
  
  /**
    * Control the precision of a geo search
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundPrecision/
    */
  var aroundPrecision: js.UndefOr[Double] = js.native
  
  /**
    * Control the radius associated with a geo search. Defined in meters.
    * default: null
    * You can specify aroundRadius=all if you want to compute the geo distance without filtering in a geo area
    * https://www.algolia.com/doc/api-reference/api-parameters/aroundRadius/
    */
  var aroundRadius: js.UndefOr[Double | all] = js.native
  
  /**
    * Default list of attributes to highlight. If set to null, all indexed attributes are highlighted.
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/attributesToHighlight/
    */
  var attributesToHighlight: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A string that contains the list of attributes you want to retrieve in order to minimize the size of the JSON answer.
    * default: *
    * https://www.algolia.com/doc/api-reference/api-parameters/attributesToRetrieve/
    */
  var attributesToRetrieve: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Default list of attributes to snippet alongside the number of words to return
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/attributesToSnippet/
    */
  var attributesToSnippet: js.UndefOr[js.Array[String]] = js.native
  
  def clearRefinements(): SearchParameters = js.native
  def clearRefinements(attribute: String): SearchParameters = js.native
  def clearRefinements(attribute: js.Function3[/* value */ js.Any, /* attribute */ String, /* type */ String, Unit]): SearchParameters = js.native
  
  def clearTags(): SearchParameters = js.native
  
  /**
    * If set to true, enables the Click Analytics feature
    * default false
    * https://www.algolia.com/doc/api-reference/api-parameters/clickAnalytics/
    */
  var clickAnalytics: js.UndefOr[Boolean] = js.native
  
  /**
    * List of attributes on which you want to disable the computation of exact criteria
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/disableExactOnAttributes/
    */
  var disableExactOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of attributes on which you want to disable typo tolerance
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/disableTypoToleranceOnAttributes/
    */
  var disableTypoToleranceOnAttributes: js.UndefOr[js.Array[String]] = js.native
  
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
  @JSName("disjunctiveFacetsRefinements")
  var disjunctiveFacetsRefinements_SearchParameters_ : StringDictionary[FacetList] = js.native
  
  /**
    * This attribute contains the list of all the disjunctive facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    */
  @JSName("disjunctiveFacets")
  var disjunctiveFacets_SearchParameters_ : js.Array[String] = js.native
  
  /**
    * If set to 1, enables the distinct feature, disabled by default, if the attributeForDistinct index setting is set.
    * https://www.algolia.com/doc/api-reference/api-parameters/distinct/
    */
  var distinct: js.UndefOr[Double | Boolean] = js.native
  
  /**
    * This parameter control how the exact ranking criterion is computed when the query contains one word
    * default: attribute
    * 'none': no exact on single word query
    * 'word': exact set to 1 if the query word is found in the record
    * 'attribute': exact set to 1 if there is an attribute containing a string equals to the query
    * https://www.algolia.com/doc/api-reference/api-parameters/exactOnSingleWordQuery/
    */
  var exactOnSingleWordQuery: js.UndefOr[attribute | none | word] = js.native
  
  /**
    * Filter the query by a set of facets.
    * Default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/facetFilters/
    */
  var facetFilters: js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  
  /**
    * Force faceting to be applied after de-duplication (via the Distinct setting).
    * When using the distinct setting in combination with faceting, facet counts may be higher than expected.
    * This is because the engine, by default, computes faceting before applying de-duplication (distinct).
    * When facetingAfterDistinct is set to true, the engine calculates faceting after the de-duplication has been applied.
    * default ""
    * https://www.algolia.com/doc/api-reference/api-parameters/facetingAfterDistinct/
    */
  var facetingAfterDistinct: js.UndefOr[Boolean] = js.native
  
  /**
    * You can use facets to retrieve only a part of your attributes declared in attributesForFaceting attributes
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/facets/
    */
  var facets: js.UndefOr[js.Array[String]] = js.native
  
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
  @JSName("facetsExcludes")
  var facetsExcludes_SearchParameters_ : StringDictionary[FacetList] = js.native
  
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
  @JSName("facetsRefinements")
  var facetsRefinements_SearchParameters_ : StringDictionary[FacetList] = js.native
  
  /**
    * Filter the query with numeric, facet or/and tag filters
    * default: ""
    * https://www.algolia.com/doc/api-reference/api-parameters/filters/
    */
  var filters: js.UndefOr[String] = js.native
  
  def getConjunctiveRefinements(facetName: String): js.Array[String] = js.native
  
  def getDisjunctiveRefinements(facetName: String): js.Array[String] = js.native
  
  def getExcludeRefinements(facetName: String): js.Array[String] = js.native
  
  def getHierarchicalFacetBreadcrumb(facetName: String): js.Array[String] = js.native
  
  def getHierarchicalFacetByName(hierarchicalFacetName: String): js.Any = js.native
  
  def getHierarchicalRefinement(facetName: String): js.Array[String] = js.native
  
  def getNumericRefinement(attribute: String, operator: Operator): js.Array[Double | js.Array[Double]] = js.native
  
  def getNumericRefinements(facetName: String): OperatorList = js.native
  
  def getQueryParams(): SearchOptions = js.native
  
  /**
    * If set to true, the result hits will contain ranking information in the _rankingInfo attribute.
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/getRankingInfo/
    */
  var getRankingInfo: js.UndefOr[Boolean] = js.native
  
  def getRefinedDisjunctiveFacets(facet: String, value: js.Any): js.Array[String] = js.native
  
  def getRefinedHierarchicalFacets(facet: String, value: js.Any): js.Array[String] = js.native
  
  def getUnrefinedDisjunctiveFacets(): js.Array[String] = js.native
  
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
  @JSName("hierarchicalFacetsRefinements")
  var hierarchicalFacetsRefinements_SearchParameters_ : StringDictionary[FacetList] = js.native
  
  /**
    * This attribute contains the list of all the hierarchical facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    * Hierarchical facets are a sub type of disjunctive facets that
    * let you filter faceted attributes hierarchically.
    */
  @JSName("hierarchicalFacets")
  var hierarchicalFacets_SearchParameters_ : js.Array[HierarchicalFacet] = js.native
  
  /**
    * Specify the string that is inserted after the highlighted parts in the query result
    * default: </em>
    * https://www.algolia.com/doc/api-reference/api-parameters/highlightPostTag/
    */
  var highlightPostTag: js.UndefOr[String] = js.native
  
  /**
    * Specify the string that is inserted before the highlighted parts in the query result
    * default: <em>
    * https://www.algolia.com/doc/api-reference/api-parameters/highlightPreTag/
    */
  var highlightPreTag: js.UndefOr[String] = js.native
  
  /**
    * Pagination parameter used to select the number of hits per page
    * default: 20
    * https://www.algolia.com/doc/api-reference/api-parameters/hitsPerPage/
    */
  var hitsPerPage: js.UndefOr[Double] = js.native
  
  /**
    * If set to true, plural won't be considered as a typo
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/ignorePlurals/
    */
  var ignorePlurals: js.UndefOr[Boolean] = js.native
  
  /**
    * implementation of PlainSearchParameters, copied because it's an interface.
    * Notable difference is that the managed search parameters are not optional,
    * ideally this would be Required<ManagedParameters> where ManagedParameters
    * are the following ones.
    */
  /**
    * Targeted index. This parameter is mandatory.
    */
  @JSName("index")
  var index_SearchParameters_ : String = js.native
  
  /**
    * Search entries inside a given area defined by the two extreme points of a rectangle
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/insideBoundingBox/
    */
  var insideBoundingBox: js.UndefOr[js.Array[js.Tuple4[Double, Double, Double, Double]]] = js.native
  
  /**
    * Search entries inside a given area defined by a set of points
    * defauly: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/insidePolygon/
    */
  var insidePolygon: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  def isConjunctiveFacet(facet: String): Boolean = js.native
  
  def isDisjunctiveFacet(facet: String): Boolean = js.native
  
  def isDisjunctiveFacetRefined(facet: String): Boolean = js.native
  def isDisjunctiveFacetRefined(facet: String, value: String): Boolean = js.native
  
  def isExcludeRefined(facet: String): Boolean = js.native
  def isExcludeRefined(facet: String, value: String): Boolean = js.native
  
  def isFacetRefined(facet: String): Boolean = js.native
  def isFacetRefined(facet: String, value: String): Boolean = js.native
  
  def isHierarchicalFacet(facet: String): Boolean = js.native
  
  def isHierarchicalFacetRefined(facet: String): Boolean = js.native
  def isHierarchicalFacetRefined(facet: String, value: String): Boolean = js.native
  
  def isNumericRefined(attribute: String): Boolean = js.native
  def isNumericRefined(attribute: String, operator: js.UndefOr[scala.Nothing], value: String): Boolean = js.native
  def isNumericRefined(attribute: String, operator: Operator): Boolean = js.native
  def isNumericRefined(attribute: String, operator: Operator, value: String): Boolean = js.native
  
  def isTagRefined(tag: String): Boolean = js.native
  
  /**
    * Number of hits to return.
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/length/
    */
  var length: js.UndefOr[Double] = js.native
  
  var managedParameters: js.Tuple10[
    index, 
    facets, 
    disjunctiveFacets, 
    facetsRefinements, 
    facetsExcludes, 
    disjunctiveFacetsRefinements, 
    numericRefinements, 
    tagRefinements, 
    hierarchicalFacets, 
    hierarchicalFacetsRefinements
  ] = js.native
  
  /**
    * Limit the number of facet values returned for each facet.
    * default: 100
    * https://www.algolia.com/doc/api-reference/api-parameters/maxValuesPerFacet/
    */
  var maxValuesPerFacet: js.UndefOr[Double] = js.native
  
  /**
    * Configure the precision of the proximity ranking criterion
    * default: 1
    * https://www.algolia.com/doc/api-reference/api-parameters/minProximity/
    */
  var minProximity: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of characters needed to accept one typo.
    * default: 4
    * https://www.algolia.com/doc/api-reference/api-parameters/minWordSizefor1Typo/
    */
  var minWordSizefor1Typo: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of characters needed to accept two typo.
    * fault: 8
    * https://www.algolia.com/doc/api-reference/api-parameters/minWordSizefor2Typos/
    */
  var minWordSizefor2Typos: js.UndefOr[Double] = js.native
  
  /**
    * Define the minimum radius used for a geo search when aroundRadius is not set.
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/minimumAroundRadius/
    */
  var minimumAroundRadius: js.UndefOr[Double] = js.native
  
  var nbShards: js.UndefOr[Double] = js.native
  
  /**
    * All numerical attributes are automatically indexed as numerical filters
    * default: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/numericAttributesForFiltering/
    */
  var numericAttributesForFiltering: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @deprecated Use `numericAttributesForFiltering` instead
    * All numerical attributes are automatically indexed as numerical filters
    * default: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/numericAttributesForFiltering/
    */
  var numericAttributesToIndex: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * @deprecated please use filters instead
    * A string that contains the comma separated list of numeric filters you want to apply.
    * https://www.algolia.com/doc/api-reference/api-parameters/numericFilters/
    */
  var numericFilters: js.UndefOr[js.Array[String]] = js.native
  
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
  @JSName("numericRefinements")
  var numericRefinements_SearchParameters_ : StringDictionary[OperatorList] = js.native
  
  /**
    * Offset of the first hit to return
    * default: null
    * https://www.algolia.com/doc/api-reference/api-parameters/offset/
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * A string that contains the comma separated list of words that should be considered as optional when found in the query
    * default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/optionalWords/
    */
  var optionalWords: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Pagination parameter used to select the page to retrieve.
    * default: 0
    * https://www.algolia.com/doc/api-reference/api-parameters/page/
    */
  var page: js.UndefOr[Double] = js.native
  
  /* end implementation of PlainSearchParameters */
  /**
    * Implementation of regular search parameters, copied from algoliasearch.QueryParameters
    * Ideally there'd be a way to automatically implement this interface, but that
    * isn't possible.
    */
  /**
    * Query string used to perform the search
    * default: ''
    * https://www.algolia.com/doc/api-reference/api-parameters/query/
    */
  var query: js.UndefOr[String] = js.native
  
  /**
    * Selects how the query words are interpreted
    * default: 'prefixLast'
    * 'prefixAll' All query words are interpreted as prefixes. This option is not recommended.
    * 'prefixLast' Only the last word is interpreted as a prefix (default behavior).
    * 'prefixNone' No query word is interpreted as a prefix. This option is not recommended.
    * https://www.algolia.com/doc/api-reference/api-parameters/queryType/
    */
  var queryType: js.UndefOr[prefixAll | prefixLast | prefixNone] = js.native
  
  def removeDisjunctiveFacet(facet: String): SearchParameters = js.native
  
  def removeDisjunctiveFacetRefinement(facet: String): SearchParameters = js.native
  def removeDisjunctiveFacetRefinement(facet: String, value: String): SearchParameters = js.native
  
  def removeExcludeRefinement(facet: String, value: String): SearchParameters = js.native
  
  def removeFacet(facet: String): SearchParameters = js.native
  
  def removeFacetRefinement(facet: String): SearchParameters = js.native
  def removeFacetRefinement(facet: String, value: String): SearchParameters = js.native
  
  def removeHierarchicalFacet(facet: String): SearchParameters = js.native
  
  def removeHierarchicalFacetRefinement(facet: String): SearchParameters = js.native
  
  def removeNumericRefinement(attribute: String): SearchParameters = js.native
  def removeNumericRefinement(attribute: String, operator: js.UndefOr[scala.Nothing], value: String): SearchParameters = js.native
  def removeNumericRefinement(attribute: String, operator: String): SearchParameters = js.native
  def removeNumericRefinement(attribute: String, operator: String, value: String): SearchParameters = js.native
  
  /**
    * Remove stop words from the query before executing it
    * default: false
    * true|false: enable or disable stop words for all 41 supported languages; or
    * a list of language ISO codes (as a comma-separated string) for which stop words should be enable
    * https://www.algolia.com/doc/api-reference/api-parameters/removeStopWords/
    */
  var removeStopWords: js.UndefOr[Boolean | js.Array[String]] = js.native
  
  def removeTagRefinement(tag: String): SearchParameters = js.native
  
  /**
    * This option is used to select a strategy in order to avoid having an empty result page
    * default: 'none'
    * 'lastWords' When a query does not return any results, the last word will be added as optional
    * 'firstWords' When a query does not return any results, the first word will be added as optional
    * 'allOptional' When a query does not return any results, a second trial will be made with all words as optional
    * 'none' No specific processing is done when a query does not return any results
    * https://www.algolia.com/doc/api-reference/api-parameters/removeWordsIfNoResults/
    */
  var removeWordsIfNoResults: js.UndefOr[none | lastWords | firstWords | allOptional] = js.native
  
  /**
    * If set to false, words matched via synonym expansion will not be replaced by the matched synonym in the highlighted result.
    * default: true
    * https://www.algolia.com/doc/api-reference/api-parameters/replaceSynonymsInHighlight/
    */
  var replaceSynonymsInHighlight: js.UndefOr[Boolean] = js.native
  
  def resetPage(): SearchParameters = js.native
  
  /**
    * If set to true, restrict arrays in highlights and snippets to items that matched the query at least partially else return all array items in highlights and snippets
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/restrictHighlightAndSnippetArrays/
    */
  var restrictHighlightAndSnippetArrays: js.UndefOr[Boolean] = js.native
  
  /**
    * List of attributes you want to use for textual search
    * default: attributeToIndex
    * https://www.algolia.com/doc/api-reference/api-parameters/restrictSearchableAttributes/
    */
  var restrictSearchableAttributes: js.UndefOr[js.Array[String]] = js.native
  
  def setDisjunctiveFacets(facets: js.Array[String]): SearchParameters = js.native
  
  def setFacets(facets: js.Array[String]): SearchParameters = js.native
  
  def setHitsPerPage(n: Double): SearchParameters = js.native
  
  def setIndex(index: String): SearchParameters = js.native
  
  def setPage(newPage: Double): SearchParameters = js.native
  
  def setQuery(newQuery: String): SearchParameters = js.native
  
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacets(parameter: disjunctiveFacets): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacets(parameter: disjunctiveFacets, value: js.Array[String]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacetsRefinements(parameter: disjunctiveFacetsRefinements): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacetsRefinements(parameter: disjunctiveFacetsRefinements, value: StringDictionary[FacetList]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsExcludes(parameter: facetsExcludes): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsExcludes(parameter: facetsExcludes, value: StringDictionary[FacetList]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsRefinements(parameter: facetsRefinements): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsRefinements(parameter: facetsRefinements, value: StringDictionary[FacetList]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacets(parameter: hierarchicalFacets): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacets(parameter: hierarchicalFacets, value: js.Array[HierarchicalFacet]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacetsRefinements(parameter: hierarchicalFacetsRefinements): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacetsRefinements(parameter: hierarchicalFacetsRefinements, value: StringDictionary[FacetList]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_index(parameter: index): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_index(parameter: index, value: String): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_numericRefinements(parameter: numericRefinements): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_numericRefinements(parameter: numericRefinements, value: StringDictionary[OperatorList]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_optionalFilters(parameter: optionalFilters): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_optionalFilters(parameter: optionalFilters, value: js.Array[String | js.Array[String]]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_queryLanguages(parameter: queryLanguages): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_queryLanguages(parameter: queryLanguages, value: js.Array[String]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_ruleContexts(parameter: ruleContexts): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_ruleContexts(parameter: ruleContexts, value: js.Array[String]): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_tagRefinements(parameter: tagRefinements): SearchParameters = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_tagRefinements(parameter: tagRefinements, value: js.Array[String]): SearchParameters = js.native
  
  def setQueryParameters(params: PlainSearchParameters): SearchParameters = js.native
  
  def setTypoTolerance(typoTolerance: String): SearchParameters = js.native
  
  /**
    * String used as an ellipsis indicator when a snippet is truncated.
    * default: …
    * https://www.algolia.com/doc/api-reference/api-parameters/snippetEllipsisText/
    */
  var snippetEllipsisText: js.UndefOr[String] = js.native
  
  /**
    * https://www.algolia.com/doc/api-reference/api-parameters/sortFacetValuesBy/
    */
  var sortFacetValuesBy: js.UndefOr[count | alpha] = js.native
  
  /**
    * Determines how to calculate the total score for filtering
    * default: false
    * https://www.algolia.com/doc/api-reference/api-parameters/sumOrFiltersScores/
    */
  var sumOrFiltersScores: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to false, the search will not use the synonyms defined for the targeted index.
    * default: true
    * https://www.algolia.com/doc/api-reference/api-parameters/synonyms/
    */
  var synonyms: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated
    *
    * Filter the query by a set of tags.
    * Default: []
    * https://www.algolia.com/doc/api-reference/api-parameters/tagFilters/
    */
  var tagFilters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This attribute contains all the tags used to refine the query.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `tagFilters` attribute.
    */
  @JSName("tagRefinements")
  var tagRefinements_SearchParameters_ : js.Array[String] = js.native
  
  def toggleConjunctiveFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  
  def toggleDisjunctiveFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  
  def toggleExcludeFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  
  def toggleFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  
  def toggleHierarchicalFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  
  def toggleTagRefinement(tag: String): SearchParameters = js.native
  
  /**
    * This option allows you to control the number of typos allowed in the result set:
    * default: true
    * 'true' The typo tolerance is enabled and all matching hits are retrieved
    * 'false' The typo tolerance is disabled. All results with typos will be hidden.
    * 'min' Only keep results with the minimum number of typos
    * 'strict' Hits matching with 2 typos are not retrieved if there are some matching without typos.
    * https://www.algolia.com/doc/api-reference/api-parameters/typoTolerance/
    */
  var typoTolerance: js.UndefOr[Boolean] = js.native
  
  var userData: js.UndefOr[String | js.Object] = js.native
}
