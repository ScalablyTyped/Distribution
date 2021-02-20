package typings.algoliasearchHelper.mod

import org.scalablytyped.runtime.StringDictionary
import typings.algoliasearchHelper.algoliasearchHelperStrings.change
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctiveFacets
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctiveFacetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.error
import typings.algoliasearchHelper.algoliasearchHelperStrings.facetsExcludes
import typings.algoliasearchHelper.algoliasearchHelperStrings.facetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchicalFacets
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchicalFacetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.index
import typings.algoliasearchHelper.algoliasearchHelperStrings.numericRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.optionalFilters
import typings.algoliasearchHelper.algoliasearchHelperStrings.queryLanguages
import typings.algoliasearchHelper.algoliasearchHelperStrings.result
import typings.algoliasearchHelper.algoliasearchHelperStrings.ruleContexts
import typings.algoliasearchHelper.algoliasearchHelperStrings.search
import typings.algoliasearchHelper.algoliasearchHelperStrings.searchForFacetValues
import typings.algoliasearchHelper.algoliasearchHelperStrings.searchOnce
import typings.algoliasearchHelper.algoliasearchHelperStrings.searchQueueEmpty
import typings.algoliasearchHelper.algoliasearchHelperStrings.tagRefinements
import typings.algoliasearchHelper.anon.Content
import typings.algoliasearchHelper.anon.Error
import typings.algoliasearchHelper.anon.Facet
import typings.algoliasearchHelper.anon.IsPageReset
import typings.algoliasearchHelper.anon.Results
import typings.algoliasearchHelper.anon.ResultsState
import typings.algoliasearchHelper.anon.State
import typings.algoliasearchHelper.mod.SearchForFacetValues.Result
import typings.algoliasearchHelper.mod.SearchParameters.FacetList
import typings.algoliasearchHelper.mod.SearchParameters.HierarchicalFacet
import typings.algoliasearchHelper.mod.SearchParameters.Operator
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import typings.events.mod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("algoliasearch-helper", "AlgoliaSearchHelper")
@js.native
class AlgoliaSearchHelper () extends EventEmitter {
  
  def addDisjunctiveFacetRefinement(facet: String, value: String): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#addDisjunctiveFacetRefinement}
    */
  def addDisjunctiveRefine(facet: String, value: String): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#addFacetExclusion}
    */
  def addExclude(facet: String, value: String): this.type = js.native
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#addFacetExclusion}
    */
  @JSName("addExclude")
  var addExclude_Original: js.Function2[/* facet */ String, /* value */ String, this.type] = js.native
  
  def addFacetExclusion(facet: String, value: String): this.type = js.native
  
  def addFacetRefinement(facet: String, value: String): this.type = js.native
  
  def addHierarchicalFacetRefinement(facet: String, path: String): this.type = js.native
  
  def addNumericRefinement(facet: String): this.type = js.native
  def addNumericRefinement(facet: String, operator: js.UndefOr[scala.Nothing], value: js.Array[Double]): this.type = js.native
  def addNumericRefinement(facet: String, operator: js.UndefOr[scala.Nothing], value: Double): this.type = js.native
  def addNumericRefinement(facet: String, operator: Operator): this.type = js.native
  def addNumericRefinement(facet: String, operator: Operator, value: js.Array[Double]): this.type = js.native
  def addNumericRefinement(facet: String, operator: Operator, value: Double): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#addFacetRefinement}
    */
  def addRefine(facet: String, value: String): this.type = js.native
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#addFacetRefinement}
    */
  @JSName("addRefine")
  var addRefine_Original: js.Function2[/* facet */ String, /* value */ String, this.type] = js.native
  
  def addTag(facet: String, value: String): this.type = js.native
  
  def clearCache(): this.type = js.native
  
  /**
    * Remove all the types of refinements except tags. A string can be provided to remove
    * only the refinements of a specific attribute. For more advanced use case, you can
    * provide a function instead. This function should follow the
    * [clearCallback definition](#SearchParameters.clearCallback).
    *
    * This method resets the current page to 0.
    * @param [name] optional name of the facet / attribute on which we want to remove all refinements
    * @return
    * @fires change
    * @chainable
    * @example
    * // Removing all the refinements
    * helper.clearRefinements().search();
    * @example
    * // Removing all the filters on a the category attribute.
    * helper.clearRefinements('category').search();
    * @example
    * // Removing only the exclude filters on the category facet.
    * helper.clearRefinements(function(value, attribute, type) {
    *   return type === 'exclude' && attribute === 'category';
    * }).search();
    */
  def clearRefinements(): this.type = js.native
  def clearRefinements(func: js.Function3[/* value */ js.Any, /* attribute */ String, /* type */ String, Boolean]): this.type = js.native
  def clearRefinements(name: String): this.type = js.native
  
  /**
    * Remove all the tag filters.
    *
    * This method resets the current page to 0.
    * @return
    * @fires change
    * @chainable
    */
  def clearTags(): this.type = js.native
  
  /**
    * @deprecated
    */
  def containsRefinement(any: js.Any*): js.Any = js.native
  
  def derive(deriveFn: js.Function1[/* oldParams */ SearchParameters, SearchParameters]): DerivedHelper = js.native
  
  var derivedHelpers: js.Array[DerivedHelper] = js.native
  
  def detachDerivedHelper(derivedHelper: DerivedHelper): Unit = js.native
  
  def getClient(): SearchClient = js.native
  
  /**
    * @deprecated
    */
  def getCurrentPage(): Double = js.native
  
  def getHierarchicalFacetBreadcrumb(facetName: String): js.Array[String] = js.native
  @JSName("getHierarchicalFacetBreadcrumb")
  var getHierarchicalFacetBreadcrumb_Original: js.Function1[/* facetName */ String, js.Array[String]] = js.native
  
  def getIndex(): String = js.native
  
  def getNumericRefinement(attribute: String, operator: Operator): js.Array[Double | js.Array[Double]] = js.native
  @JSName("getNumericRefinement")
  var getNumericRefinement_Original: js.Function2[/* attribute */ String, /* operator */ Operator, js.Array[Double | js.Array[Double]]] = js.native
  
  def getPage(): Double = js.native
  
  /**
    * Gets the search query parameters that would be sent to the Algolia Client
    * for the hits
    */
  def getQuery(): SearchOptions = js.native
  
  def getRefinements(facetName: String): js.Array[_] = js.native
  
  def getTags(): js.Array[String] = js.native
  
  def hasPendingRequests(): Boolean = js.native
  
  def hasRefinements(facet: String): Boolean = js.native
  
  def hasTag(tag: String): Boolean = js.native
  @JSName("hasTag")
  var hasTag_Original: js.Function1[/* tag */ String, Boolean] = js.native
  
  /**
    * @deprecated since 2.4.0, see {@link AlgoliaSearchHelper#hasRefinements}
    */
  def isDisjunctiveRefined(facet: String): Boolean = js.native
  def isDisjunctiveRefined(facet: String, value: String): Boolean = js.native
  /**
    * @deprecated since 2.4.0, see {@link AlgoliaSearchHelper#hasRefinements}
    */
  @JSName("isDisjunctiveRefined")
  var isDisjunctiveRefined_Original: js.Function2[/* facet */ String, /* value */ js.UndefOr[String], Boolean] = js.native
  
  def isExcluded(facet: String): Boolean = js.native
  def isExcluded(facet: String, value: String): Boolean = js.native
  @JSName("isExcluded")
  var isExcluded_Original: js.Function2[/* facet */ String, /* value */ js.UndefOr[String], Boolean] = js.native
  
  /**
    * @deprecated since 2.4.0, see {@link AlgoliaSearchHelper#hasTag}
    */
  def isTagRefined(tag: String): Boolean = js.native
  /**
    * @deprecated since 2.4.0, see {@link AlgoliaSearchHelper#hasTag}
    */
  @JSName("isTagRefined")
  var isTagRefined_Original: js.Function1[/* tag */ String, Boolean] = js.native
  
  var lastResults: SearchResults[_] | Null = js.native
  
  def nextPage(): this.type = js.native
  
  @JSName("on")
  def on_change(event: change, cb: js.Function1[/* res */ IsPageReset, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* res */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_result(event: result, cb: js.Function1[/* res */ ResultsState, Unit]): this.type = js.native
  @JSName("on")
  def on_search(event: search, cb: js.Function1[/* res */ Results, Unit]): this.type = js.native
  @JSName("on")
  def on_searchForFacetValues(event: searchForFacetValues, cb: js.Function1[/* res */ Facet, Unit]): this.type = js.native
  @JSName("on")
  def on_searchOnce(event: searchOnce, cb: js.Function1[/* res */ State, Unit]): this.type = js.native
  @JSName("on")
  def on_searchQueueEmpty(event: searchQueueEmpty, cb: js.Function0[Unit]): this.type = js.native
  
  def overrideStateWithoutTriggeringChangeEvent(newState: PlainSearchParameters): this.type = js.native
  @JSName("overrideStateWithoutTriggeringChangeEvent")
  var overrideStateWithoutTriggeringChangeEvent_Original: js.Function1[/* newState */ PlainSearchParameters, this.type] = js.native
  
  def previousPage(): this.type = js.native
  
  def removeDisjunctiveFacetRefinement(facet: String): this.type = js.native
  def removeDisjunctiveFacetRefinement(facet: String, value: String): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#removeDisjunctiveFacetRefinement}
    */
  def removeDisjunctiveRefine(facet: String): this.type = js.native
  def removeDisjunctiveRefine(facet: String, value: String): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#removeFacetExclusion}
    */
  def removeExclude(facet: String, value: String): this.type = js.native
  
  def removeFacetExclusion(facet: String, value: String): this.type = js.native
  
  def removeFacetRefinement(facet: String): this.type = js.native
  def removeFacetRefinement(facet: String, value: String): this.type = js.native
  
  def removeHierarchicalFacetRefinement(facet: String): this.type = js.native
  
  def removeNumericRefinement(facet: String): this.type = js.native
  def removeNumericRefinement(facet: String, operator: js.UndefOr[scala.Nothing], value: js.Array[Double]): this.type = js.native
  def removeNumericRefinement(facet: String, operator: js.UndefOr[scala.Nothing], value: Double): this.type = js.native
  def removeNumericRefinement(facet: String, operator: Operator): this.type = js.native
  def removeNumericRefinement(facet: String, operator: Operator, value: js.Array[Double]): this.type = js.native
  def removeNumericRefinement(facet: String, operator: Operator, value: Double): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#removeFacetRefinement}
    */
  def removeRefine(facet: String, value: String): this.type = js.native
  
  def removeTag(value: String): this.type = js.native
  
  /**
    * Start the search with the parameters set in the state. When the
    * method is called, it triggers a `search` event. The results will
    * be available through the `result` event. If an error occurs, an
    * `error` will be fired instead.
    * @return
    * @fires search
    * @fires result
    * @fires error
    * @chainable
    */
  def search(): this.type = js.native
  
  /**
    * Search for facet values based on an query and the name of a faceted attribute. This
    * triggers a search and will return a promise. On top of using the query, it also sends
    * the parameters from the state so that the search is narrowed down to only the possible values.
    *
    * See the description of [FacetSearchResult](reference.html#FacetSearchResult)
    * @param facet the name of the faceted attribute
    * @param query the string query for the search
    * @param [maxFacetHits] the maximum number values returned. Should be > 0 and <= 100
    * @param [userState] the set of custom parameters to use on top of the current state. Setting a property to `undefined` removes
    * it in the generated query.
    * @return the results of the search
    */
  def searchForFacetValues(facet: String, query: String, maxFacetHits: Double): js.Promise[Result] = js.native
  def searchForFacetValues(facet: String, query: String, maxFacetHits: Double, userState: PlainSearchParameters): js.Promise[Result] = js.native
  
  /**
    * Start a search using a modified version of the current state. This method does
    * not trigger the helper lifecycle and does not modify the state kept internally
    * by the helper. This second aspect means that the next search call will be the
    * same as a search call before calling searchOnce.
    * @param options can contain all the parameters that can be set to SearchParameters
    * plus the index
    * @param [callback] optional callback executed when the response from the
    * server is back.
    * @return if a callback is passed the method returns undefined
    * otherwise it returns a promise containing an object with two keys :
    *  - content with a SearchResults
    *  - state with the state used for the query as a SearchParameters
    * @example
    * // Changing the number of records returned per page to 1
    * // This example uses the callback API
    * var state = helper.searchOnce({hitsPerPage: 1},
    *   function(error, content, state) {
    *     // if an error occurred it will be passed in error, otherwise its value is null
    *     // content contains the results formatted as a SearchResults
    *     // state is the instance of SearchParameters used for this search
    *   });
    * @example
    * // Changing the number of records returned per page to 1
    * // This example uses the promise API
    * var state1 = helper.searchOnce({hitsPerPage: 1})
    *                 .then(promiseHandler);
    *
    * function promiseHandler(res) {
    *   // res contains
    *   // {
    *   //   content : SearchResults
    *   //   state   : SearchParameters (the one used for this specific search)
    *   // }
    * }
    */
  def searchOnce(options: PlainSearchParameters): js.Promise[Content] = js.native
  def searchOnce(
    options: PlainSearchParameters,
    cb: js.Function3[
      /* error */ typings.std.Error, 
      /* content */ SearchResults[_], 
      /* state */ SearchParameters, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Private method to only search on derived helpers
    */
  def searchOnlyWithDerivedHelpers(): this.type = js.native
  
  /**
    * Private method for search, without triggering events
    */
  def searchWithoutTriggeringOnStateChange(): this.type = js.native
  
  def setClient(client: SearchClient): this.type = js.native
  
  /**
    * @deprecated
    */
  def setCurrentPage(page: Double): this.type = js.native
  
  /**
    * Updates the name of the index that will be targeted by the query.
    *
    * This method resets the current page to 0.
    * @param name the index name
    * @return
    * @fires change
    * @chainable
    */
  def setIndex(name: String): this.type = js.native
  
  def setPage(page: Double): this.type = js.native
  
  /**
    * Sets the text query used for the search.
    *
    * This method resets the current page to 0.
    * @param  q the user query
    * @return
    * @fires change
    * @chainable
    */
  def setQuery(q: String): this.type = js.native
  
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacets(parameter: disjunctiveFacets): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacets(parameter: disjunctiveFacets, value: js.Array[String]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacetsRefinements(parameter: disjunctiveFacetsRefinements): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_disjunctiveFacetsRefinements(parameter: disjunctiveFacetsRefinements, value: StringDictionary[FacetList]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsExcludes(parameter: facetsExcludes): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsExcludes(parameter: facetsExcludes, value: StringDictionary[FacetList]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsRefinements(parameter: facetsRefinements): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_facetsRefinements(parameter: facetsRefinements, value: StringDictionary[FacetList]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacets(parameter: hierarchicalFacets): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacets(parameter: hierarchicalFacets, value: js.Array[HierarchicalFacet]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacetsRefinements(parameter: hierarchicalFacetsRefinements): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_hierarchicalFacetsRefinements(parameter: hierarchicalFacetsRefinements, value: StringDictionary[FacetList]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_index(parameter: index): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_index(parameter: index, value: String): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_numericRefinements(parameter: numericRefinements): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_numericRefinements(parameter: numericRefinements, value: StringDictionary[OperatorList]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_optionalFilters(parameter: optionalFilters): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_optionalFilters(parameter: optionalFilters, value: js.Array[String | js.Array[String]]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_queryLanguages(parameter: queryLanguages): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_queryLanguages(parameter: queryLanguages, value: js.Array[String]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_ruleContexts(parameter: ruleContexts): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_ruleContexts(parameter: ruleContexts, value: js.Array[String]): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_tagRefinements(parameter: tagRefinements): this.type = js.native
  @JSName("setQueryParameter")
  def setQueryParameter_tagRefinements(parameter: tagRefinements, value: js.Array[String]): this.type = js.native
  
  /**
    * Set the whole state (warning: will erase previous state)
    * @param newState the whole new state
    * @return
    * @fires change
    * @chainable
    */
  def setState(newState: PlainSearchParameters): this.type = js.native
  
  var state: SearchParameters = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#toggleFacetExclusion}
    */
  def toggleExclude(facet: String, value: String): this.type = js.native
  
  def toggleFacetExclusion(facet: String, value: String): this.type = js.native
  
  def toggleFacetRefinement(facet: String, value: String): this.type = js.native
  
  /**
    * @deprecated since version 2.4.0, see {@link AlgoliaSearchHelper#toggleFacetRefinement}
    */
  def toggleRefine(facet: String, value: String): this.type = js.native
  
  /**
    * @deprecated since version 2.19.0, see {@link AlgoliaSearchHelper#toggleFacetRefinement}
    */
  def toggleRefinement(facet: String, value: String): this.type = js.native
  
  def toggleTag(tag: String): this.type = js.native
}
