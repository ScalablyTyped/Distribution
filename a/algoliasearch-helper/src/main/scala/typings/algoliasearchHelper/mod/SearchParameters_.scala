package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearchHelper.algoliasearchHelperStrings.allOptional
import typings.algoliasearchHelper.algoliasearchHelperStrings.attribute
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
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixAll
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixLast
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixNone
import typings.algoliasearchHelper.algoliasearchHelperStrings.singleWordSynonym
import typings.algoliasearchHelper.algoliasearchHelperStrings.tagRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.word
import typings.algoliasearchHelper.mod.SearchParameters.Operator
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch-helper", "SearchParameters")
@js.native
class SearchParameters_ () extends QueryParameters {
  def this(newParameters: QueryParameters) = this()
  @JSName("alternativesAsExact")
  var alternativesAsExact_SearchParameters_ : js.UndefOr[js.Array[ignorePlurals | singleWordSynonym | multiWordsSynonym]] = js.native
  @JSName("aroundRadius")
  var aroundRadius_SearchParameters_ : js.UndefOr[Double] = js.native
  @JSName("disjunctiveFacetsRefinements")
  var disjunctiveFacetsRefinements_SearchParameters_ : js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  @JSName("exactOnSingleWordQuery")
  var exactOnSingleWordQuery_SearchParameters_ : js.UndefOr[none | attribute | word] = js.native
  @JSName("facetFilters")
  var facetFilters_SearchParameters_ : js.UndefOr[js.Array[js.Array[String] | String]] = js.native
  @JSName("facetsExcludes")
  var facetsExcludes_SearchParameters_ : js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  @JSName("facetsRefinements")
  var facetsRefinements_SearchParameters_ : js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  @JSName("hierarchicalFacetsRefinements")
  var hierarchicalFacetsRefinements_SearchParameters_ : js.UndefOr[StringDictionary[js.Array[String]]] = js.native
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
  @JSName("minProximity")
  var minProximity_SearchParameters_ : js.UndefOr[js.Any] = js.native
  @JSName("queryType")
  var queryType_SearchParameters_ : js.UndefOr[prefixAll | prefixLast | prefixNone] = js.native
  @JSName("removeWordsIfNoResults")
  var removeWordsIfNoResults_SearchParameters_ : js.UndefOr[none | lastWords | firstWords | allOptional] = js.native
  @JSName("typoTolerance")
  var typoTolerance_SearchParameters_ : js.UndefOr[Boolean] = js.native
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
  def clearRefinements(): SearchParameters = js.native
  def clearRefinements(attribute: String): SearchParameters = js.native
  def clearRefinements(attribute: js.Function3[/* value */ js.Any, /* attribute */ String, /* type */ String, _]): SearchParameters = js.native
  def clearTags(): SearchParameters = js.native
  def filter(filters: js.Array[String]): js.Any = js.native
  def getConjunctiveRefinements(facetName: String): js.Array[String] = js.native
  def getDisjunctiveRefinements(facetName: String): js.Array[String] = js.native
  def getExcludeRefinements(facetName: String): js.Array[String] = js.native
  def getHierarchicalFacetBreadcrumb(facetName: String): js.Array[String] = js.native
  def getHierarchicalFacetByName(hierarchicalFacetName: String): js.Any = js.native
  def getHierarchicalRefinement(facetName: String): js.Array[String] = js.native
  def getNumericRefinement(attribute: String, operator: Operator): js.Array[Double | js.Array[Double]] = js.native
  def getNumericRefinements(facetName: String): js.Array[OperatorList] = js.native
  def getQueryParameter(paramName: String): js.Any = js.native
  def getQueryParams(): Partial[ManagedParameters] = js.native
  def getRefinedDisjunctiveFacets(facet: String, value: js.Any): js.Array[String] = js.native
  def getRefinedHierarchicalFacets(facet: String, value: js.Any): js.Array[String] = js.native
  def getUnrefinedDisjunctiveFacets(): js.Array[String] = js.native
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
  def isNumericRefined(attribute: String, operator: Operator): Boolean = js.native
  def isNumericRefined(attribute: String, operator: Operator, value: String): Boolean = js.native
  def isTagRefined(tag: String): Boolean = js.native
  def removeDisjunctiveFacet(facet: String): SearchParameters = js.native
  def removeDisjunctiveFacetRefinement(facet: String): SearchParameters = js.native
  def removeDisjunctiveFacetRefinement(facet: String, value: String): SearchParameters = js.native
  def removeExcludeRefinement(facet: String, value: String): SearchParameters = js.native
  def removeFacet(facet: String): SearchParameters = js.native
  def removeFacetRefinement(facet: String): SearchParameters = js.native
  def removeFacetRefinement(facet: String, value: String): SearchParameters = js.native
  def removeHierarchicalFacet(facet: String): SearchParameters = js.native
  def removeHierarchicalFacetRefinement(facet: String): SearchParameters = js.native
  def removeTagRefinement(tag: String): SearchParameters = js.native
  def setDisjunctiveFacets(facets: js.Array[String]): SearchParameters = js.native
  def setFacets(facets: js.Array[String]): SearchParameters = js.native
  def setHitsPerPage(n: Double): SearchParameters = js.native
  def setPage(newPage: Double): SearchParameters = js.native
  def setQuery(newQuery: String): SearchParameters = js.native
  def setQueryParameter(parameter: String, value: js.Any): SearchParameters = js.native
  def setQueryParameters(params: StringDictionary[js.Any]): SearchParameters = js.native
  def setTypoTolerance(typoTolerance: String): SearchParameters = js.native
  def toggleConjunctiveFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  def toggleDisjunctiveFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  def toggleExcludeFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  def toggleFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  def toggleHierarchicalFacetRefinement(facet: String, value: js.Any): SearchParameters = js.native
  def toggleTagRefinement(tag: String): SearchParameters = js.native
}

