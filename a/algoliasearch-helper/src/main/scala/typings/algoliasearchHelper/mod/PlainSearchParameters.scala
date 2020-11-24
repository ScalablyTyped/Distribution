package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearchHelper.mod.SearchParameters.FacetList
import typings.algoliasearchHelper.mod.SearchParameters.HierarchicalFacet
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped std.ReturnType<algoliasearch-helper.anon.Typeofalgoliasearch> extends algoliasearch-helper.algoliasearch-helper.DummySearchClientV4 ? @algolia/client-search.@algolia/client-search.SearchOptions : / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SearchOptionsV3 * / any */ @js.native
trait PlainSearchParameters extends js.Object {
  
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
  implicit class PlainSearchParametersOps[Self <: PlainSearchParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisjunctiveFacetsVarargs(value: String*): Self = this.set("disjunctiveFacets", js.Array(value :_*))
    
    @scala.inline
    def setDisjunctiveFacets(value: js.Array[String]): Self = this.set("disjunctiveFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisjunctiveFacets: Self = this.set("disjunctiveFacets", js.undefined)
    
    @scala.inline
    def setDisjunctiveFacetsRefinements(value: StringDictionary[FacetList]): Self = this.set("disjunctiveFacetsRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisjunctiveFacetsRefinements: Self = this.set("disjunctiveFacetsRefinements", js.undefined)
    
    @scala.inline
    def setFacetsExcludes(value: StringDictionary[FacetList]): Self = this.set("facetsExcludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetsExcludes: Self = this.set("facetsExcludes", js.undefined)
    
    @scala.inline
    def setFacetsRefinements(value: StringDictionary[FacetList]): Self = this.set("facetsRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetsRefinements: Self = this.set("facetsRefinements", js.undefined)
    
    @scala.inline
    def setHierarchicalFacetsVarargs(value: HierarchicalFacet*): Self = this.set("hierarchicalFacets", js.Array(value :_*))
    
    @scala.inline
    def setHierarchicalFacets(value: js.Array[HierarchicalFacet]): Self = this.set("hierarchicalFacets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchicalFacets: Self = this.set("hierarchicalFacets", js.undefined)
    
    @scala.inline
    def setHierarchicalFacetsRefinements(value: StringDictionary[FacetList]): Self = this.set("hierarchicalFacetsRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHierarchicalFacetsRefinements: Self = this.set("hierarchicalFacetsRefinements", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setNumericRefinements(value: StringDictionary[OperatorList]): Self = this.set("numericRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumericRefinements: Self = this.set("numericRefinements", js.undefined)
    
    @scala.inline
    def setOptionalFiltersVarargs(value: (String | js.Array[String])*): Self = this.set("optionalFilters", js.Array(value :_*))
    
    @scala.inline
    def setOptionalFilters(value: js.Array[String | js.Array[String]]): Self = this.set("optionalFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionalFilters: Self = this.set("optionalFilters", js.undefined)
    
    @scala.inline
    def setQueryLanguagesVarargs(value: String*): Self = this.set("queryLanguages", js.Array(value :_*))
    
    @scala.inline
    def setQueryLanguages(value: js.Array[String]): Self = this.set("queryLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryLanguages: Self = this.set("queryLanguages", js.undefined)
    
    @scala.inline
    def setRuleContextsVarargs(value: String*): Self = this.set("ruleContexts", js.Array(value :_*))
    
    @scala.inline
    def setRuleContexts(value: js.Array[String]): Self = this.set("ruleContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleContexts: Self = this.set("ruleContexts", js.undefined)
    
    @scala.inline
    def setTagRefinementsVarargs(value: String*): Self = this.set("tagRefinements", js.Array(value :_*))
    
    @scala.inline
    def setTagRefinements(value: js.Array[String]): Self = this.set("tagRefinements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagRefinements: Self = this.set("tagRefinements", js.undefined)
  }
}
