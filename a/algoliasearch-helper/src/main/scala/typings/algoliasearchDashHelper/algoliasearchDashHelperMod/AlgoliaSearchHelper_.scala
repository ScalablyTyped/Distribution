package typings.algoliasearchDashHelper.algoliasearchDashHelperMod

import typings.algoliasearchDashHelper.Anon_Content
import typings.algoliasearchDashHelper.algoliasearchDashHelperMod.AlgoliaSearchHelper.FacetSearchResult
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.change
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.error
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.result
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.search
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.searchForFacetValues
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.searchOnce
import typings.algoliasearchDashHelper.algoliasearchDashHelperStrings.searchQueueEmpty
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("algoliasearch-helper", "AlgoliaSearchHelper")
@js.native
class AlgoliaSearchHelper_ () extends EventEmitter {
  var derivedHelpers: js.Array[AlgoliaSearchHelper] = js.native
  var lastResults: SearchResults = js.native
  var state: SearchParameters = js.native
  def addDisjunctiveFacetRefinement(args: js.Any*): js.Any = js.native
  def addDisjunctiveRefine(args: js.Any*): js.Any = js.native
  def addExclude(args: js.Any*): js.Any = js.native
  def addFacetExclusion(args: js.Any*): js.Any = js.native
  def addFacetRefinement(args: js.Any*): js.Any = js.native
  def addHierarchicalFacetRefinement(args: js.Any*): js.Any = js.native
  def addNumericRefinement(args: js.Any*): js.Any = js.native
  def addRefine(args: js.Any*): js.Any = js.native
  def addTag(args: js.Any*): js.Any = js.native
  def clearCache(args: js.Any*): js.Any = js.native
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
  def containsRefinement(args: js.Any*): js.Any = js.native
  def derive(args: js.Any*): js.Any = js.native
  def detachDerivedHelper(args: js.Any*): js.Any = js.native
  def getClient(args: js.Any*): js.Any = js.native
  def getCurrentPage(args: js.Any*): js.Any = js.native
  def getHierarchicalFacetBreadcrumb(args: js.Any*): js.Any = js.native
  def getIndex(args: js.Any*): js.Any = js.native
  def getNumericRefinement(args: js.Any*): js.Any = js.native
  def getPage(args: js.Any*): js.Any = js.native
  /**
    * Gets the search query parameters that would be sent to the Algolia Client
    * for the hits
    * @return Query Parameters
    */
  def getQuery(): QueryParameters = js.native
  def getQueryParameter(args: js.Any*): js.Any = js.native
  def getRefinements(args: js.Any*): js.Any = js.native
  /**
    * Get the current search state stored in the helper. This object is immutable.
    * @param [filters] optional filters to retrieve only a subset of the state
    * @return if filters is specified a plain object is
    * returned containing only the requested fields, otherwise return the unfiltered
    * state
    * @example
    * // Get the complete state as stored in the helper
    * helper.getState();
    * @example
    * // Get a part of the state with all the refinements on attributes and the query
    * helper.getState(['query', 'attribute:category']);
    */
  def getState(): SearchParameters = js.native
  def getState(filters: js.Array[String]): QueryParameters = js.native
  def getStateAsQueryString(args: js.Any*): js.Any = js.native
  def getTags(args: js.Any*): js.Any = js.native
  def hasPendingRequests(args: js.Any*): js.Any = js.native
  def hasRefinements(args: js.Any*): js.Any = js.native
  def hasTag(args: js.Any*): js.Any = js.native
  def isDisjunctiveRefined(args: js.Any*): js.Any = js.native
  def isExcluded(args: js.Any*): js.Any = js.native
  def isRefined(args: js.Any*): js.Any = js.native
  def isTagRefined(args: js.Any*): js.Any = js.native
  def nextPage(args: js.Any*): js.Any = js.native
  @JSName("on")
  def on_change(
    event: change,
    cb: js.Function2[/* state */ SearchParameters, /* lastResults */ SearchResults | Null, _]
  ): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ js.Any, _]): this.type = js.native
  @JSName("on")
  def on_result(event: result, cb: js.Function2[/* results */ SearchResults, /* state */ SearchParameters, _]): this.type = js.native
  @JSName("on")
  def on_search(
    event: search,
    cb: js.Function2[/* state */ SearchParameters, /* lastResults */ SearchResults | Null, _]
  ): this.type = js.native
  @JSName("on")
  def on_searchForFacetValues(
    event: searchForFacetValues,
    cb: js.Function3[/* state */ SearchParameters, /* facet */ String, /* query */ String, _]
  ): this.type = js.native
  @JSName("on")
  def on_searchOnce(event: searchOnce, cb: js.Function1[/* state */ SearchParameters, _]): this.type = js.native
  @JSName("on")
  def on_searchQueueEmpty(event: searchQueueEmpty, cb: js.Function0[_]): this.type = js.native
  def overrideStateWithoutTriggeringChangeEvent(args: js.Any*): js.Any = js.native
  def previousPage(args: js.Any*): js.Any = js.native
  def removeDisjunctiveFacetRefinement(args: js.Any*): js.Any = js.native
  def removeDisjunctiveRefine(args: js.Any*): js.Any = js.native
  def removeExclude(args: js.Any*): js.Any = js.native
  def removeFacetExclusion(args: js.Any*): js.Any = js.native
  def removeFacetRefinement(args: js.Any*): js.Any = js.native
  def removeHierarchicalFacetRefinement(args: js.Any*): js.Any = js.native
  def removeNumericRefinement(args: js.Any*): js.Any = js.native
  def removeRefine(args: js.Any*): js.Any = js.native
  def removeTag(args: js.Any*): js.Any = js.native
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
  def searchForFacetValues(facet: String, query: String, maxFacetHits: Double, userState: js.Any): js.Promise[FacetSearchResult] = js.native
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
  def searchOnce(options: QueryParameters): js.Promise[Anon_Content] = js.native
  def searchOnce(
    options: QueryParameters,
    cb: js.Function3[/* error */ js.Any, /* content */ SearchResults, /* state */ SearchParameters, _]
  ): js.UndefOr[scala.Nothing] = js.native
  def setClient(args: js.Any*): js.Any = js.native
  def setCurrentPage(args: js.Any*): js.Any = js.native
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
  def setPage(args: js.Any*): js.Any = js.native
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
  def setQueryParameter(args: js.Any*): js.Any = js.native
  /**
    * Set the whole state (warning: will erase previous state)
    * @param newState the whole new state
    * @return
    * @fires change
    * @chainable
    */
  def setState(newState: QueryParameters): this.type = js.native
  def setStateFromQueryString(args: js.Any*): js.Any = js.native
  def toggleExclude(args: js.Any*): js.Any = js.native
  def toggleFacetExclusion(args: js.Any*): js.Any = js.native
  def toggleFacetRefinement(args: js.Any*): js.Any = js.native
  def toggleRefine(args: js.Any*): js.Any = js.native
  def toggleRefinement(args: js.Any*): js.Any = js.native
  def toggleTag(args: js.Any*): js.Any = js.native
}

