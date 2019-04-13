package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch-helper", "SearchParameters")
@js.native
class SearchParameters () extends QueryParameters {
  def this(newParameters: QueryParameters) = this()
  @JSName("alternativesAsExact")
  var alternativesAsExact_SearchParameters: js.UndefOr[
    js.Array[
      algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.ignorePlurals | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.singleWordSynonym | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.multiWordsSynonym
    ]
  ] = js.native
  @JSName("aroundRadius")
  var aroundRadius_SearchParameters: js.UndefOr[scala.Double] = js.native
  @JSName("disjunctiveFacetsRefinements")
  var disjunctiveFacetsRefinements_SearchParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.native
  @JSName("exactOnSingleWordQuery")
  var exactOnSingleWordQuery_SearchParameters: js.UndefOr[
    algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.none | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.attribute | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.word
  ] = js.native
  @JSName("facetsExcludes")
  var facetsExcludes_SearchParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.native
  @JSName("facetsRefinements")
  var facetsRefinements_SearchParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.native
  @JSName("hierarchicalFacetsRefinements")
  var hierarchicalFacetsRefinements_SearchParameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.native
  @JSName("minProximity")
  var minProximity_SearchParameters: js.UndefOr[js.Any] = js.native
  @JSName("queryType")
  var queryType_SearchParameters: js.UndefOr[
    algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.prefixAll | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.prefixLast | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.prefixNone
  ] = js.native
  @JSName("removeWordsIfNoResults")
  var removeWordsIfNoResults_SearchParameters: js.UndefOr[
    algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.none | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.lastWords | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.firstWords | algoliasearchDashHelperLib.algoliasearchDashHelperLibStrings.allOptional
  ] = js.native
  /* Add a disjunctive facet to the disjunctiveFacets attribute of the helper configuration, if it isn't already present. */
  def addDisjunctiveFacet(facet: java.lang.String): SearchParameters = js.native
  /* Adds a refinement on a disjunctive facet. */
  def addDisjunctiveFacetRefinement(facet: java.lang.String, value: java.lang.String): SearchParameters = js.native
  /* Exclude a value from a "normal" facet */
  def addExcludeRefinement(facet: java.lang.String, value: java.lang.String): SearchParameters = js.native
  /* Add a facet to the facets attribute of the helper configuration, if it isn't already present. */
  def addFacet(facet: java.lang.String): SearchParameters = js.native
  /* Add a refinement on a "normal" facet */
  def addFacetRefinement(facet: java.lang.String, value: java.lang.String): SearchParameters = js.native
  def addHierarchicalFacet(facet: js.Any): SearchParameters = js.native
  def addHierarchicalFacetRefinement(facet: java.lang.String, path: java.lang.String): SearchParameters = js.native
  def addNumericRefinement(
    attribute: java.lang.String,
    operator: algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.Operator,
    value: js.Array[scala.Double]
  ): SearchParameters = js.native
  def addNumericRefinement(
    attribute: java.lang.String,
    operator: algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.Operator,
    value: scala.Double
  ): SearchParameters = js.native
  def addTagRefinement(tag: java.lang.String): SearchParameters = js.native
  def clearRefinements(): SearchParameters = js.native
  def clearRefinements(attribute: java.lang.String): SearchParameters = js.native
  def clearRefinements(
    attribute: js.Function3[/* value */ js.Any, /* attribute */ java.lang.String, /* type */ java.lang.String, _]
  ): SearchParameters = js.native
  def clearTags(): SearchParameters = js.native
  def filter(filters: js.Array[java.lang.String]): js.Any = js.native
  def getConjunctiveRefinements(facetName: java.lang.String): js.Array[java.lang.String] = js.native
  def getDisjunctiveRefinements(facetName: java.lang.String): js.Array[java.lang.String] = js.native
  def getExcludeRefinements(facetName: java.lang.String): js.Array[java.lang.String] = js.native
  def getHierarchicalFacetBreadcrumb(facetName: java.lang.String): js.Array[java.lang.String] = js.native
  def getHierarchicalFacetByName(hierarchicalFacetName: java.lang.String): js.Any = js.native
  def getHierarchicalRefinement(facetName: java.lang.String): js.Array[java.lang.String] = js.native
  def getNumericRefinement(
    attribute: java.lang.String,
    operator: algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.Operator
  ): js.Array[scala.Double | js.Array[scala.Double]] = js.native
  def getNumericRefinements(facetName: java.lang.String): js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.OperatorList
  ] = js.native
  def getQueryParameter(paramName: java.lang.String): js.Any = js.native
  def getRefinedDisjunctiveFacets(facet: java.lang.String, value: js.Any): js.Array[java.lang.String] = js.native
  def getRefinedHierarchicalFacets(facet: java.lang.String, value: js.Any): js.Array[java.lang.String] = js.native
  def getUnrefinedDisjunctiveFacets(): js.Array[java.lang.String] = js.native
  def isConjunctiveFacet(facet: java.lang.String): scala.Boolean = js.native
  def isDisjunctiveFacet(facet: java.lang.String): scala.Boolean = js.native
  def isDisjunctiveFacetRefined(facet: java.lang.String): scala.Boolean = js.native
  def isDisjunctiveFacetRefined(facet: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def isExcludeRefined(facet: java.lang.String): scala.Boolean = js.native
  def isExcludeRefined(facet: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def isFacetRefined(facet: java.lang.String): scala.Boolean = js.native
  def isFacetRefined(facet: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def isHierarchicalFacet(facet: java.lang.String): scala.Boolean = js.native
  def isHierarchicalFacetRefined(facet: java.lang.String): scala.Boolean = js.native
  def isHierarchicalFacetRefined(facet: java.lang.String, value: java.lang.String): scala.Boolean = js.native
  def isNumericRefined(
    attribute: java.lang.String,
    operator: algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.Operator
  ): scala.Boolean = js.native
  def isNumericRefined(
    attribute: java.lang.String,
    operator: algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParametersNs.Operator,
    value: java.lang.String
  ): scala.Boolean = js.native
  def isTagRefined(tag: java.lang.String): scala.Boolean = js.native
  def removeDisjunctiveFacet(facet: java.lang.String): SearchParameters = js.native
  def removeDisjunctiveFacetRefinement(facet: java.lang.String): SearchParameters = js.native
  def removeDisjunctiveFacetRefinement(facet: java.lang.String, value: java.lang.String): SearchParameters = js.native
  def removeExcludeRefinement(facet: java.lang.String, value: java.lang.String): SearchParameters = js.native
  def removeFacet(facet: java.lang.String): SearchParameters = js.native
  def removeFacetRefinement(facet: java.lang.String): SearchParameters = js.native
  def removeFacetRefinement(facet: java.lang.String, value: java.lang.String): SearchParameters = js.native
  def removeHierarchicalFacet(facet: java.lang.String): SearchParameters = js.native
  def removeHierarchicalFacetRefinement(facet: java.lang.String): SearchParameters = js.native
  def removeTagRefinement(tag: java.lang.String): SearchParameters = js.native
  def setDisjunctiveFacets(facets: js.Array[java.lang.String]): SearchParameters = js.native
  def setFacets(facets: js.Array[java.lang.String]): SearchParameters = js.native
  def setHitsPerPage(n: scala.Double): SearchParameters = js.native
  def setPage(newPage: scala.Double): SearchParameters = js.native
  def setQuery(newQuery: java.lang.String): SearchParameters = js.native
  def setQueryParameter(parameter: java.lang.String, value: js.Any): SearchParameters = js.native
  def setQueryParameters(params: org.scalablytyped.runtime.StringDictionary[js.Any]): SearchParameters = js.native
  def setTypoTolerance(typoTolerance: java.lang.String): SearchParameters = js.native
  def toggleConjunctiveFacetRefinement(facet: java.lang.String, value: js.Any): SearchParameters = js.native
  def toggleDisjunctiveFacetRefinement(facet: java.lang.String, value: js.Any): SearchParameters = js.native
  def toggleExcludeFacetRefinement(facet: java.lang.String, value: js.Any): SearchParameters = js.native
  def toggleFacetRefinement(facet: java.lang.String, value: js.Any): SearchParameters = js.native
  def toggleHierarchicalFacetRefinement(facet: java.lang.String, value: js.Any): SearchParameters = js.native
  def toggleTagRefinement(tag: java.lang.String): SearchParameters = js.native
}

/* static members */
@JSImport("algoliasearch-helper", "SearchParameters")
@js.native
object SearchParameters extends js.Object {
  def make(newParameters: algoliasearchDashHelperLib.algoliasearchDashHelperMod.QueryParameters): algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParameters = js.native
  def validate(
    currentState: algoliasearchDashHelperLib.algoliasearchDashHelperMod.SearchParameters,
    parameters: algoliasearchDashHelperLib.algoliasearchDashHelperMod.QueryParameters
  ): scala.Null | stdLib.Error = js.native
}

