package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearchHelper.mod.SearchParameters.FacetList
import typings.algoliasearchHelper.mod.SearchParameters.HierarchicalFacet
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped std.ReturnType<algoliasearch-helper.anon.Typeofalgoliasearch> extends algoliasearch-helper.algoliasearch-helper.DummySearchClientV4 ? @algolia/client-search.@algolia/client-search.SearchOptions : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SearchOptionsV3 * / any */ @js.native
trait PlainSearchParameters extends StObject {
  
  /**
    * This attribute contains the list of all the disjunctive facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    */
  var disjunctiveFacets: js.UndefOr[js.Array[String]] = js.native
  
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
  var disjunctiveFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.native
  
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
  var facetsExcludes: js.UndefOr[StringDictionary[FacetList]] = js.native
  
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
  var facetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.native
  
  /**
    * This attribute contains the list of all the hierarchical facets
    * used. This list will be added to requested facets in the
    * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
    * Hierarchical facets are a sub type of disjunctive facets that
    * let you filter faceted attributes hierarchically.
    */
  var hierarchicalFacets: js.UndefOr[js.Array[HierarchicalFacet]] = js.native
  
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
  var hierarchicalFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.native
  
  /**
    * Targeted index. This parameter is mandatory.
    */
  var index: js.UndefOr[String] = js.native
  
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
  var numericRefinements: js.UndefOr[StringDictionary[OperatorList]] = js.native
  
  var optionalFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.native
  
  var queryLanguages: js.UndefOr[js.Array[String]] = js.native
  
  // types missing in @types/algoliasearch, so duplicated from v4
  var ruleContexts: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * This attribute contains all the tags used to refine the query.
    *
    * When querying algolia, the values stored in this attribute will
    * be translated into the `tagFilters` attribute.
    */
  var tagRefinements: js.UndefOr[js.Array[String]] = js.native
}
object PlainSearchParameters {
  
  @scala.inline
  def apply(): PlainSearchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlainSearchParameters]
  }
  
  @scala.inline
  implicit class PlainSearchParametersMutableBuilder[Self <: PlainSearchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisjunctiveFacets(value: js.Array[String]): Self = StObject.set(x, "disjunctiveFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveFacetsRefinements(value: StringDictionary[FacetList]): Self = StObject.set(x, "disjunctiveFacetsRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisjunctiveFacetsRefinementsUndefined: Self = StObject.set(x, "disjunctiveFacetsRefinements", js.undefined)
    
    @scala.inline
    def setDisjunctiveFacetsUndefined: Self = StObject.set(x, "disjunctiveFacets", js.undefined)
    
    @scala.inline
    def setDisjunctiveFacetsVarargs(value: String*): Self = StObject.set(x, "disjunctiveFacets", js.Array(value :_*))
    
    @scala.inline
    def setFacetsExcludes(value: StringDictionary[FacetList]): Self = StObject.set(x, "facetsExcludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsExcludesUndefined: Self = StObject.set(x, "facetsExcludes", js.undefined)
    
    @scala.inline
    def setFacetsRefinements(value: StringDictionary[FacetList]): Self = StObject.set(x, "facetsRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetsRefinementsUndefined: Self = StObject.set(x, "facetsRefinements", js.undefined)
    
    @scala.inline
    def setHierarchicalFacets(value: js.Array[HierarchicalFacet]): Self = StObject.set(x, "hierarchicalFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchicalFacetsRefinements(value: StringDictionary[FacetList]): Self = StObject.set(x, "hierarchicalFacetsRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchicalFacetsRefinementsUndefined: Self = StObject.set(x, "hierarchicalFacetsRefinements", js.undefined)
    
    @scala.inline
    def setHierarchicalFacetsUndefined: Self = StObject.set(x, "hierarchicalFacets", js.undefined)
    
    @scala.inline
    def setHierarchicalFacetsVarargs(value: HierarchicalFacet*): Self = StObject.set(x, "hierarchicalFacets", js.Array(value :_*))
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setNumericRefinements(value: StringDictionary[OperatorList]): Self = StObject.set(x, "numericRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericRefinementsUndefined: Self = StObject.set(x, "numericRefinements", js.undefined)
    
    @scala.inline
    def setOptionalFilters(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "optionalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalFiltersUndefined: Self = StObject.set(x, "optionalFilters", js.undefined)
    
    @scala.inline
    def setOptionalFiltersVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "optionalFilters", js.Array(value :_*))
    
    @scala.inline
    def setQueryLanguages(value: js.Array[String]): Self = StObject.set(x, "queryLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryLanguagesUndefined: Self = StObject.set(x, "queryLanguages", js.undefined)
    
    @scala.inline
    def setQueryLanguagesVarargs(value: String*): Self = StObject.set(x, "queryLanguages", js.Array(value :_*))
    
    @scala.inline
    def setRuleContexts(value: js.Array[String]): Self = StObject.set(x, "ruleContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleContextsUndefined: Self = StObject.set(x, "ruleContexts", js.undefined)
    
    @scala.inline
    def setRuleContextsVarargs(value: String*): Self = StObject.set(x, "ruleContexts", js.Array(value :_*))
    
    @scala.inline
    def setTagRefinements(value: js.Array[String]): Self = StObject.set(x, "tagRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagRefinementsUndefined: Self = StObject.set(x, "tagRefinements", js.undefined)
    
    @scala.inline
    def setTagRefinementsVarargs(value: String*): Self = StObject.set(x, "tagRefinements", js.Array(value :_*))
  }
}
