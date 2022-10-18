package typings.algoliasearchHelper

import org.scalablytyped.runtime.StringDictionary
import typings.algoliaEvents.mod.default
import typings.algoliasearchHelper.algoliasearchHelperStrings.all
import typings.algoliasearchHelper.algoliasearchHelperStrings.allOptional
import typings.algoliasearchHelper.algoliasearchHelperStrings.alpha
import typings.algoliasearchHelper.algoliasearchHelperStrings.attribute
import typings.algoliasearchHelper.algoliasearchHelperStrings.change
import typings.algoliasearchHelper.algoliasearchHelperStrings.count
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctive
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctiveFacets
import typings.algoliasearchHelper.algoliasearchHelperStrings.disjunctiveFacetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.error
import typings.algoliasearchHelper.algoliasearchHelperStrings.exclude
import typings.algoliasearchHelper.algoliasearchHelperStrings.facet
import typings.algoliasearchHelper.algoliasearchHelperStrings.facets
import typings.algoliasearchHelper.algoliasearchHelperStrings.facetsExcludes
import typings.algoliasearchHelper.algoliasearchHelperStrings.facetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.firstWords
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchical
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchicalFacets
import typings.algoliasearchHelper.algoliasearchHelperStrings.hierarchicalFacetsRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.ignorePlurals
import typings.algoliasearchHelper.algoliasearchHelperStrings.index
import typings.algoliasearchHelper.algoliasearchHelperStrings.lastWords
import typings.algoliasearchHelper.algoliasearchHelperStrings.multiWordsSynonym
import typings.algoliasearchHelper.algoliasearchHelperStrings.none
import typings.algoliasearchHelper.algoliasearchHelperStrings.numeric
import typings.algoliasearchHelper.algoliasearchHelperStrings.numericRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.optionalFilters
import typings.algoliasearchHelper.algoliasearchHelperStrings.params
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixAll
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixLast
import typings.algoliasearchHelper.algoliasearchHelperStrings.prefixNone
import typings.algoliasearchHelper.algoliasearchHelperStrings.queryLanguages
import typings.algoliasearchHelper.algoliasearchHelperStrings.relevancyStrictness
import typings.algoliasearchHelper.algoliasearchHelperStrings.result
import typings.algoliasearchHelper.algoliasearchHelperStrings.ruleContexts
import typings.algoliasearchHelper.algoliasearchHelperStrings.search
import typings.algoliasearchHelper.algoliasearchHelperStrings.searchForFacetValues
import typings.algoliasearchHelper.algoliasearchHelperStrings.searchOnce
import typings.algoliasearchHelper.algoliasearchHelperStrings.searchQueueEmpty
import typings.algoliasearchHelper.algoliasearchHelperStrings.singleWordSynonym
import typings.algoliasearchHelper.algoliasearchHelperStrings.tagRefinements
import typings.algoliasearchHelper.algoliasearchHelperStrings.word
import typings.algoliasearchHelper.anon.AttributesForPrediction
import typings.algoliasearchHelper.anon.Avg
import typings.algoliasearchHelper.anon.Content
import typings.algoliasearchHelper.anon.DistinctSeqID
import typings.algoliasearchHelper.anon.Error
import typings.algoliasearchHelper.anon.Facet
import typings.algoliasearchHelper.anon.FacetOrdering
import typings.algoliasearchHelper.anon.IsPageReset
import typings.algoliasearchHelper.anon.Results
import typings.algoliasearchHelper.anon.ResultsState
import typings.algoliasearchHelper.anon.SortBy
import typings.algoliasearchHelper.anon.State
import typings.algoliasearchHelper.mod.SearchForFacetValues.Result
import typings.algoliasearchHelper.mod.SearchParameters.FacetList
import typings.algoliasearchHelper.mod.SearchParameters.HierarchicalFacet
import typings.algoliasearchHelper.mod.SearchParameters.Operator
import typings.algoliasearchHelper.mod.SearchParameters.OperatorList
import typings.algoliasearchHelper.mod.SearchResults.FacetValue
import typings.algoliasearchHelper.mod.SearchResults.Refinement
import typings.algoliasearchHelper.typesAlgoliasearchMod.FindAnswersResponse
import typings.algoliasearchHelper.typesAlgoliasearchMod.SearchClient
import typings.algoliasearchHelper.typesAlgoliasearchMod.SearchOptions
import typings.algoliasearchHelper.typesAlgoliasearchMod.SearchResponse
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The algoliasearchHelper module is the function that will let its
    * contains everything needed to use the Algoliasearch
    * Helper. It is a also a function that instantiate the helper.
    * To use the helper, you also need the Algolia JS client v3.
    * @param client an AlgoliaSearch client
    * @param index the name of the index to query
    * @param opts
    */
  inline def apply(client: SearchClient, index: String): AlgoliaSearchHelper = (^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[AlgoliaSearchHelper]
  inline def apply(client: SearchClient, index: String, opts: PlainSearchParameters): AlgoliaSearchHelper = (^.asInstanceOf[js.Dynamic].apply(client.asInstanceOf[js.Any], index.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AlgoliaSearchHelper]
  
  @JSImport("algoliasearch-helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("algoliasearch-helper", "AlgoliaSearchHelper")
  @js.native
  open class AlgoliaSearchHelper () extends default {
    
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
    def addNumericRefinement(facet: String, operator: Unit, value: js.Array[Double]): this.type = js.native
    def addNumericRefinement(facet: String, operator: Unit, value: Double): this.type = js.native
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
    
    def addTag(tag: String): this.type = js.native
    
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
    def clearRefinements(func: js.Function3[/* value */ Any, /* attribute */ String, /* type */ String, Boolean]): this.type = js.native
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
    def containsRefinement(any: Any*): Any = js.native
    
    def derive(deriveFn: js.Function1[/* oldParams */ SearchParameters, SearchParameters]): DerivedHelper = js.native
    
    var derivedHelpers: js.Array[DerivedHelper] = js.native
    
    def detachDerivedHelper(derivedHelper: DerivedHelper): Unit = js.native
    
    /**
      * Start the search for answers with the parameters set in the state.
      * This method returns a promise.
      * @param {Object} options - the options for answers API call
      * @param {string[]} options.attributesForPrediction - Attributes to use for predictions. If empty, `searchableAttributes` is used instead.
      * @param {string[]} options.queryLanguages - The languages in the query. Currently only supports ['en'].
      * @param {number} options.nbHits - Maximum number of answers to retrieve from the Answers Engine. Cannot be greater than 1000.
      */
    def findAnswers[TObject](options: AttributesForPrediction): js.Promise[FindAnswersResponse[TObject]] = js.native
    
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
    
    def getRefinements(facetName: String): js.Array[Any] = js.native
    
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
    
    var lastResults: SearchResults[Any] | Null = js.native
    
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
    def removeNumericRefinement(facet: String, operator: Unit, value: js.Array[Double]): this.type = js.native
    def removeNumericRefinement(facet: String, operator: Unit, value: Double): this.type = js.native
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
          /* error */ js.Error, 
          /* content */ SearchResults[Any], 
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
    def setQueryParameter_relevancyStrictness(parameter: relevancyStrictness): this.type = js.native
    @JSName("setQueryParameter")
    def setQueryParameter_relevancyStrictness(parameter: relevancyStrictness, value: Double): this.type = js.native
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
  
  @JSImport("algoliasearch-helper", "SearchParameters")
  @js.native
  open class SearchParameters ()
    extends StObject
       with PlainSearchParameters {
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
    
    def addHierarchicalFacet(facet: HierarchicalFacet): SearchParameters = js.native
    
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
    def clearRefinements(attribute: js.Function3[/* value */ Any, /* attribute */ String, /* type */ String, Unit]): SearchParameters = js.native
    
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
    var disjunctiveFacetsRefinements_SearchParameters: StringDictionary[FacetList] = js.native
    
    /**
      * This attribute contains the list of all the disjunctive facets
      * used. This list will be added to requested facets in the
      * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
      */
    @JSName("disjunctiveFacets")
    var disjunctiveFacets_SearchParameters: js.Array[String] = js.native
    
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
    var facetsExcludes_SearchParameters: StringDictionary[FacetList] = js.native
    
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
    var facetsRefinements_SearchParameters: StringDictionary[FacetList] = js.native
    
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
    
    def getHierarchicalFacetByName(hierarchicalFacetName: String): Any = js.native
    
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
    
    def getRefinedDisjunctiveFacets(facet: String, value: Any): js.Array[String] = js.native
    
    def getRefinedHierarchicalFacets(facet: String, value: Any): js.Array[String] = js.native
    
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
    var hierarchicalFacetsRefinements_SearchParameters: StringDictionary[FacetList] = js.native
    
    /**
      * This attribute contains the list of all the hierarchical facets
      * used. This list will be added to requested facets in the
      * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
      * Hierarchical facets are a sub type of disjunctive facets that
      * let you filter faceted attributes hierarchically.
      */
    @JSName("hierarchicalFacets")
    var hierarchicalFacets_SearchParameters: js.Array[HierarchicalFacet] = js.native
    
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
    var index_SearchParameters: String = js.native
    
    /**
      * Search entries inside a given area defined by the two extreme points of a rectangle
      * default: null
      * https://www.algolia.com/doc/api-reference/api-parameters/insideBoundingBox/
      */
    var insideBoundingBox: js.UndefOr[js.Array[js.Tuple4[Double, Double, Double, Double]]] = js.native
    
    /**
      * Search entries inside a given area defined by a set of points
      * default: ''
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
    def isNumericRefined(attribute: String, operator: Unit, value: String): Boolean = js.native
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
        hierarchicalFacets, 
        facetsExcludes, 
        disjunctiveFacetsRefinements, 
        numericRefinements, 
        tagRefinements, 
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
    var numericRefinements_SearchParameters: StringDictionary[OperatorList] = js.native
    
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
    def removeNumericRefinement(attribute: String, operator: String): SearchParameters = js.native
    def removeNumericRefinement(attribute: String, operator: String, value: String): SearchParameters = js.native
    def removeNumericRefinement(attribute: String, operator: Unit, value: String): SearchParameters = js.native
    
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
    def setQueryParameter_relevancyStrictness(parameter: relevancyStrictness): SearchParameters = js.native
    @JSName("setQueryParameter")
    def setQueryParameter_relevancyStrictness(parameter: relevancyStrictness, value: Double): SearchParameters = js.native
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
    var tagRefinements_SearchParameters: js.Array[String] = js.native
    
    def toggleConjunctiveFacetRefinement(facet: String, value: Any): SearchParameters = js.native
    
    def toggleDisjunctiveFacetRefinement(facet: String, value: Any): SearchParameters = js.native
    
    def toggleExcludeFacetRefinement(facet: String, value: Any): SearchParameters = js.native
    
    def toggleFacetRefinement(facet: String, value: Any): SearchParameters = js.native
    
    def toggleHierarchicalFacetRefinement(facet: String, value: Any): SearchParameters = js.native
    
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
  /* static members */
  object SearchParameters {
    
    @JSImport("algoliasearch-helper", "SearchParameters")
    @js.native
    val ^ : js.Any = js.native
    
    inline def make(newParameters: PlainSearchParameters): SearchParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(newParameters.asInstanceOf[js.Any]).asInstanceOf[SearchParameters]
    
    inline def validate(currentState: SearchParameters, parameters: PlainSearchParameters): Null | js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(currentState.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Null | js.Error]
    
    type FacetList = js.Array[String]
    
    trait HierarchicalFacet extends StObject {
      
      var attributes: js.Array[String]
      
      var name: String
      
      var rootPath: js.UndefOr[String | Null] = js.undefined
      
      var separator: js.UndefOr[String] = js.undefined
      
      var showParentLevel: js.UndefOr[Boolean] = js.undefined
    }
    object HierarchicalFacet {
      
      inline def apply(attributes: js.Array[String], name: String): HierarchicalFacet = {
        val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[HierarchicalFacet]
      }
      
      extension [Self <: HierarchicalFacet](x: Self) {
        
        inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
        
        inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
        
        inline def setRootPathNull: Self = StObject.set(x, "rootPath", null)
        
        inline def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
        
        inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
        
        inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
        
        inline def setShowParentLevel(value: Boolean): Self = StObject.set(x, "showParentLevel", value.asInstanceOf[js.Any])
        
        inline def setShowParentLevelUndefined: Self = StObject.set(x, "showParentLevel", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.algoliasearchHelper.algoliasearchHelperStrings.Equalssign
      - typings.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign
      - typings.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign
      - typings.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign
      - typings.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign
      - typings.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign
    */
    trait Operator extends StObject
    object Operator {
      
      inline def Equalssign: typings.algoliasearchHelper.algoliasearchHelperStrings.Equalssign = "=".asInstanceOf[typings.algoliasearchHelper.algoliasearchHelperStrings.Equalssign]
      
      inline def ExclamationmarkEqualssign: typings.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typings.algoliasearchHelper.algoliasearchHelperStrings.ExclamationmarkEqualssign]
      
      inline def Greaterthansign: typings.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign = ">".asInstanceOf[typings.algoliasearchHelper.algoliasearchHelperStrings.Greaterthansign]
      
      inline def GreaterthansignEqualssign: typings.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typings.algoliasearchHelper.algoliasearchHelperStrings.GreaterthansignEqualssign]
      
      inline def Lessthansign: typings.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign = "<".asInstanceOf[typings.algoliasearchHelper.algoliasearchHelperStrings.Lessthansign]
      
      inline def LessthansignEqualssign: typings.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign = "<=".asInstanceOf[typings.algoliasearchHelper.algoliasearchHelperStrings.LessthansignEqualssign]
    }
    
    /* Inlined {[ k in algoliasearch-helper.algoliasearch-helper.SearchParameters.Operator ]:? std.Array<number | std.Array<number>>} */
    trait OperatorList extends StObject {
      
      @JSName("=")
      var Equalssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
      
      @JSName("!=")
      var ExclamationmarkEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
      
      @JSName(">")
      var Greaterthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
      
      @JSName(">=")
      var GreaterthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
      
      @JSName("<")
      var Lessthansign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
      
      @JSName("<=")
      var LessthansignEqualssign: js.UndefOr[js.Array[Double | js.Array[Double]]] = js.undefined
    }
    object OperatorList {
      
      inline def apply(): OperatorList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[OperatorList]
      }
      
      extension [Self <: OperatorList](x: Self) {
        
        inline def setEqualssign(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "=", value.asInstanceOf[js.Any])
        
        inline def setEqualssignUndefined: Self = StObject.set(x, "=", js.undefined)
        
        inline def setEqualssignVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "=", js.Array(value*))
        
        inline def setExclamationmarkEqualssign(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "!=", value.asInstanceOf[js.Any])
        
        inline def setExclamationmarkEqualssignUndefined: Self = StObject.set(x, "!=", js.undefined)
        
        inline def setExclamationmarkEqualssignVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "!=", js.Array(value*))
        
        inline def setGreaterthansign(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, ">", value.asInstanceOf[js.Any])
        
        inline def setGreaterthansignEqualssign(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, ">=", value.asInstanceOf[js.Any])
        
        inline def setGreaterthansignEqualssignUndefined: Self = StObject.set(x, ">=", js.undefined)
        
        inline def setGreaterthansignEqualssignVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, ">=", js.Array(value*))
        
        inline def setGreaterthansignUndefined: Self = StObject.set(x, ">", js.undefined)
        
        inline def setGreaterthansignVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, ">", js.Array(value*))
        
        inline def setLessthansign(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "<", value.asInstanceOf[js.Any])
        
        inline def setLessthansignEqualssign(value: js.Array[Double | js.Array[Double]]): Self = StObject.set(x, "<=", value.asInstanceOf[js.Any])
        
        inline def setLessthansignEqualssignUndefined: Self = StObject.set(x, "<=", js.undefined)
        
        inline def setLessthansignEqualssignVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "<=", js.Array(value*))
        
        inline def setLessthansignUndefined: Self = StObject.set(x, "<", js.undefined)
        
        inline def setLessthansignVarargs(value: (Double | js.Array[Double])*): Self = StObject.set(x, "<", js.Array(value*))
      }
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchResponse<T>, 'facets' | 'params'> ]: algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchResponse<T>[P]} */ @JSImport("algoliasearch-helper", "SearchResults")
  @js.native
  open class SearchResults[T] protected ()
    extends StObject
       with SearchResultsOptions {
    def this(state: SearchParameters, results: js.Array[SearchResponse[T]]) = this()
    def this(state: SearchParameters, results: js.Array[SearchResponse[T]], options: SearchResultsOptions) = this()
    
    var _rawResults: js.Array[SearchResponse[T]] = js.native
    
    var _state: SearchParameters = js.native
    
    /**
      * the relevancy threshold applied to search in a virtual index
      */
    var appliedRelevancyStrictness: js.UndefOr[Double] = js.native
    
    /**
      * The position if the position was guessed by IP.
      * @example "48.8637,2.3615",
      */
    var aroundLatLng: String = js.native
    
    /**
      * The radius computed by Algolia.
      * @example "126792922",
      */
    var automaticRadius: String = js.native
    
    /**
      * disjunctive facets results
      */
    var disjunctiveFacets: js.Array[typings.algoliasearchHelper.mod.SearchResults.Facet] = js.native
    
    /**
      * True if the counts of the facets is exhaustive
      */
    var exhaustiveFacetsCount: Boolean = js.native
    
    /**
      * True if the number of hits is exhaustive
      */
    var exhaustiveNbHits: Boolean = js.native
    
    /**
      * other facets results
      */
    var facets: js.Array[typings.algoliasearchHelper.mod.SearchResults.Facet] = js.native
    
    /**
      * Get a facet object with its name
      * @deprecated
      * @param name name of the faceted attribute
      * @return  the facet object
      */
    def getFacetByName(name: String): typings.algoliasearchHelper.mod.SearchResults.Facet = js.native
    
    /**
      * Returns the facet stats if attribute is defined and the facet contains some.
      * Otherwise returns undefined.
      * @param attribute name of the faceted attribute
      * @return The stats of the facet
      */
    def getFacetStats(attribute: String): Any = js.native
    
    /**
      * Get a the list of values for a given facet attribute. Those values are sorted
      * refinement first, descending count (bigger value on top), and name ascending
      * (alphabetical order). The sort formula can overridden using either string based
      * predicates or a function.
      *
      * This method will return all the values returned by the Algolia engine plus all
      * the values already refined. This means that it can happen that the
      * `maxValuesPerFacet` [configuration](https://www.algolia.com/doc/rest-api/search#param-maxValuesPerFacet)
      * might not be respected if you have facet values that are already refined.
      * @param attribute attribute name
      * @param opts configuration options.
      * @param opts.sortBy
      * When using strings, it consists of
      * the name of the [FacetValue](#SearchResults.FacetValue) or the
      * [HierarchicalFacet](#SearchResults.HierarchicalFacet) attributes with the
      * order (`asc` or `desc`). For example to order the value by count, the
      * argument would be `['count:asc']`.
      *
      * If only the attribute name is specified, the ordering defaults to the one
      * specified in the default value for this attribute.
      *
      * When not specified, the order is
      * ascending.  This parameter can also be a function which takes two facet
      * values and should return a number, 0 if equal, 1 if the first argument is
      * bigger or -1 otherwise.
      *
      * The default value for this attribute `['isRefined:desc', 'count:desc', 'name:asc']`
      * @return depending on the type of facet of
      * the attribute requested (hierarchical, disjunctive or conjunctive)
      * @example
      * helper.on('results', function(content){
      *   //get values ordered only by name ascending using the string predicate
      *   content.getFacetValues('city', {sortBy: ['name:asc']});
      *   //get values  ordered only by count ascending using a function
      *   content.getFacetValues('city', {
      *     // this is equivalent to ['count:asc']
      *     sortBy: function(a, b) {
      *       if (a.count === b.count) return 0;
      *       if (a.count > b.count)   return 1;
      *       if (b.count > a.count)   return -1;
      *     }
      *   });
      * });
      */
    def getFacetValues(attribute: String, opts: SortBy): js.UndefOr[
        js.Array[FacetValue] | typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet
      ] = js.native
    
    /**
      * Returns all refinements for all filters + tags. It also provides
      * additional information: count and exhaustiveness for each filter.
      *
      * See the [refinement type](#Refinement) for an exhaustive view of the available
      * data.
      *
      * @return all the refinements
      */
    def getRefinements(): js.Array[Refinement] = js.native
    
    /**
      * disjunctive facets results
      */
    var hierarchicalFacets: js.Array[typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet] = js.native
    
    /**
      * all the records that match the search parameters. Each record is
      * augmented with a new attribute `_highlightResult`
      * which is an object keyed by attribute and with the following properties:
      *  - `value` : the value of the facet highlighted (html)
      *  - `matchLevel`: full, partial or none depending on how the query terms match
      */
    var hits: js.Array[T & DistinctSeqID[T]] = js.native
    
    /**
      * number of hits per page requested
      */
    var hitsPerPage: Double = js.native
    
    /**
      * index where the results come from
      */
    var index: String = js.native
    
    /**
      * total number of hits of this query on the index
      */
    var nbHits: Double = js.native
    
    /**
      * total number of pages with respect to the number of hits per page and the total number of hits
      */
    var nbPages: Double = js.native
    
    /**
      * subset of hits selected when relevancyStrictness is applied
      */
    var nbSortedHits: js.UndefOr[Double] = js.native
    
    /**
      * current page
      */
    var page: Double = js.native
    
    /**
      * The query as parsed by the engine given all the rules.
      */
    var parsedQuery: String = js.native
    
    /**
      * sum of the processing time of all the queries
      */
    var processingTimeMS: Double = js.native
    
    /**
      * query used to generate the results
      */
    var query: String = js.native
    
    /**
      * queryID is the unique identifier of the query used to generate the current search results.
      * This value is only available if the `clickAnalytics` search parameter is set to `true`.
      */
    var queryID: js.UndefOr[String] = js.native
    
    /**
      * Content defining how the search interface should be rendered.
      * This is set via the settings for a default value and can be overridden via rules
      */
    var renderingContent: js.UndefOr[FacetOrdering] = js.native
    
    /**
      * String identifying the server used to serve this request.
      * @example "c7-use-2.algolia.net",
      */
    var serverUsed: String = js.native
    
    /**
      * Boolean that indicates if the computation of the counts did time out.
      * @deprecated
      */
    var timeoutCounts: Boolean = js.native
    
    /**
      * Boolean that indicates if the computation of the hits did time out.
      * @deprecated
      */
    var timeoutHits: Boolean = js.native
    
    /**
      * Contains the userData if they are set by a [query rule](https://www.algolia.com/doc/guides/query-rules/query-rules-overview/).
      */
    var userData: js.Array[Any] = js.native
  }
  object SearchResults {
    
    trait Facet extends StObject {
      
      var data: js.Object
      
      var name: String
      
      var stats: js.UndefOr[Avg] = js.undefined
    }
    object Facet {
      
      inline def apply(data: js.Object, name: String): typings.algoliasearchHelper.mod.SearchResults.Facet = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.algoliasearchHelper.mod.SearchResults.Facet]
      }
      
      extension [Self <: typings.algoliasearchHelper.mod.SearchResults.Facet](x: Self) {
        
        inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setStats(value: Avg): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
        
        inline def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      }
    }
    
    trait FacetValue extends StObject {
      
      var count: Double
      
      var escapedValue: String
      
      var isExcluded: Boolean
      
      var isRefined: Boolean
      
      var name: String
    }
    object FacetValue {
      
      inline def apply(count: Double, escapedValue: String, isExcluded: Boolean, isRefined: Boolean, name: String): FacetValue = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], escapedValue = escapedValue.asInstanceOf[js.Any], isExcluded = isExcluded.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[FacetValue]
      }
      
      extension [Self <: FacetValue](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setEscapedValue(value: String): Self = StObject.set(x, "escapedValue", value.asInstanceOf[js.Any])
        
        inline def setIsExcluded(value: Boolean): Self = StObject.set(x, "isExcluded", value.asInstanceOf[js.Any])
        
        inline def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    trait HierarchicalFacet extends StObject {
      
      var count: Double
      
      var data: js.Array[typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet]
      
      var escapedValue: String
      
      var isRefined: Boolean
      
      var name: String
      
      var path: String
    }
    object HierarchicalFacet {
      
      inline def apply(
        count: Double,
        data: js.Array[typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet],
        escapedValue: String,
        isRefined: Boolean,
        name: String,
        path: String
      ): typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], escapedValue = escapedValue.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet]
      }
      
      extension [Self <: typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setData(value: js.Array[typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataVarargs(value: typings.algoliasearchHelper.mod.SearchResults.HierarchicalFacet*): Self = StObject.set(x, "data", js.Array(value*))
        
        inline def setEscapedValue(value: String): Self = StObject.set(x, "escapedValue", value.asInstanceOf[js.Any])
        
        inline def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      }
    }
    
    trait Refinement extends StObject {
      
      var attributeName: String
      
      var count: Double
      
      var exhaustive: Boolean
      
      var name: String
      
      var numericValue: Double
      
      var operator: String
      
      var `type`: numeric | facet | exclude | disjunctive | hierarchical
    }
    object Refinement {
      
      inline def apply(
        attributeName: String,
        count: Double,
        exhaustive: Boolean,
        name: String,
        numericValue: Double,
        operator: String,
        `type`: numeric | facet | exclude | disjunctive | hierarchical
      ): Refinement = {
        val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], exhaustive = exhaustive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], numericValue = numericValue.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Refinement]
      }
      
      extension [Self <: Refinement](x: Self) {
        
        inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setExhaustive(value: Boolean): Self = StObject.set(x, "exhaustive", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNumericValue(value: Double): Self = StObject.set(x, "numericValue", value.asInstanceOf[js.Any])
        
        inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
        
        inline def setType(value: numeric | facet | exclude | disjunctive | hierarchical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("algoliasearch-helper", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait DerivedHelper extends default {
    
    def detach(): Unit = js.native
    
    def getModifiedState(): SearchParameters = js.native
    
    var lastResults: SearchResults[Any] | Null = js.native
    
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* res */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_result(event: result, cb: js.Function1[/* res */ ResultsState, Unit]): this.type = js.native
    @JSName("on")
    def on_search(event: search, cb: js.Function1[/* res */ Results, Unit]): this.type = js.native
  }
  
  type ISearchResponse[T] = (Omit[SearchResponse[T], facets | params]) & SearchResultsOptions
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientV5 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientShape ? algoliasearch-helper.anon.V4SearchOptions['v5'] : // @ts-ignore
  algoliasearch-helper.algoliasearch-helper/types/algoliasearch.ClientV3_4 extends algoliasearch-helper.algoliasearch-helper/types/algoliasearch.SearchClientV4Shape ? algoliasearch-helper.anon.V4SearchOptions['v4'] : algoliasearch-helper.anon.V4SearchOptions['v3'] */ trait PlainSearchParameters extends StObject {
    
    /**
      * This attribute contains the list of all the disjunctive facets
      * used. This list will be added to requested facets in the
      * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
      */
    var disjunctiveFacets: js.UndefOr[js.Array[String]] = js.undefined
    
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
    var disjunctiveFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.undefined
    
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
    var facetsExcludes: js.UndefOr[StringDictionary[FacetList]] = js.undefined
    
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
    var facetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.undefined
    
    /**
      * This attribute contains the list of all the hierarchical facets
      * used. This list will be added to requested facets in the
      * [facets attribute](https://www.algolia.com/doc/rest-api/search#param-facets) sent to algolia.
      * Hierarchical facets are a sub type of disjunctive facets that
      * let you filter faceted attributes hierarchically.
      */
    var hierarchicalFacets: js.UndefOr[js.Array[HierarchicalFacet]] = js.undefined
    
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
    var hierarchicalFacetsRefinements: js.UndefOr[StringDictionary[FacetList]] = js.undefined
    
    /**
      * Targeted index. This parameter is mandatory.
      */
    var index: js.UndefOr[String] = js.undefined
    
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
    var numericRefinements: js.UndefOr[StringDictionary[OperatorList]] = js.undefined
    
    var optionalFilters: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
    
    var queryLanguages: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The relevancy threshold to apply to search in a virtual index [0-100]. A bigger
      * value means fewer but more relevant results, a smaller value means more but
      * less relevant results.
      */
    var relevancyStrictness: js.UndefOr[Double] = js.undefined
    
    // types missing in @types/algoliasearch, so duplicated from v4
    var ruleContexts: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * This attribute contains all the tags used to refine the query.
      *
      * When querying algolia, the values stored in this attribute will
      * be translated into the `tagFilters` attribute.
      */
    var tagRefinements: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PlainSearchParameters {
    
    inline def apply(): PlainSearchParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PlainSearchParameters]
    }
    
    extension [Self <: PlainSearchParameters](x: Self) {
      
      inline def setDisjunctiveFacets(value: js.Array[String]): Self = StObject.set(x, "disjunctiveFacets", value.asInstanceOf[js.Any])
      
      inline def setDisjunctiveFacetsRefinements(value: StringDictionary[FacetList]): Self = StObject.set(x, "disjunctiveFacetsRefinements", value.asInstanceOf[js.Any])
      
      inline def setDisjunctiveFacetsRefinementsUndefined: Self = StObject.set(x, "disjunctiveFacetsRefinements", js.undefined)
      
      inline def setDisjunctiveFacetsUndefined: Self = StObject.set(x, "disjunctiveFacets", js.undefined)
      
      inline def setDisjunctiveFacetsVarargs(value: String*): Self = StObject.set(x, "disjunctiveFacets", js.Array(value*))
      
      inline def setFacetsExcludes(value: StringDictionary[FacetList]): Self = StObject.set(x, "facetsExcludes", value.asInstanceOf[js.Any])
      
      inline def setFacetsExcludesUndefined: Self = StObject.set(x, "facetsExcludes", js.undefined)
      
      inline def setFacetsRefinements(value: StringDictionary[FacetList]): Self = StObject.set(x, "facetsRefinements", value.asInstanceOf[js.Any])
      
      inline def setFacetsRefinementsUndefined: Self = StObject.set(x, "facetsRefinements", js.undefined)
      
      inline def setHierarchicalFacets(value: js.Array[HierarchicalFacet]): Self = StObject.set(x, "hierarchicalFacets", value.asInstanceOf[js.Any])
      
      inline def setHierarchicalFacetsRefinements(value: StringDictionary[FacetList]): Self = StObject.set(x, "hierarchicalFacetsRefinements", value.asInstanceOf[js.Any])
      
      inline def setHierarchicalFacetsRefinementsUndefined: Self = StObject.set(x, "hierarchicalFacetsRefinements", js.undefined)
      
      inline def setHierarchicalFacetsUndefined: Self = StObject.set(x, "hierarchicalFacets", js.undefined)
      
      inline def setHierarchicalFacetsVarargs(value: HierarchicalFacet*): Self = StObject.set(x, "hierarchicalFacets", js.Array(value*))
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setNumericRefinements(value: StringDictionary[OperatorList]): Self = StObject.set(x, "numericRefinements", value.asInstanceOf[js.Any])
      
      inline def setNumericRefinementsUndefined: Self = StObject.set(x, "numericRefinements", js.undefined)
      
      inline def setOptionalFilters(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "optionalFilters", value.asInstanceOf[js.Any])
      
      inline def setOptionalFiltersUndefined: Self = StObject.set(x, "optionalFilters", js.undefined)
      
      inline def setOptionalFiltersVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "optionalFilters", js.Array(value*))
      
      inline def setQueryLanguages(value: js.Array[String]): Self = StObject.set(x, "queryLanguages", value.asInstanceOf[js.Any])
      
      inline def setQueryLanguagesUndefined: Self = StObject.set(x, "queryLanguages", js.undefined)
      
      inline def setQueryLanguagesVarargs(value: String*): Self = StObject.set(x, "queryLanguages", js.Array(value*))
      
      inline def setRelevancyStrictness(value: Double): Self = StObject.set(x, "relevancyStrictness", value.asInstanceOf[js.Any])
      
      inline def setRelevancyStrictnessUndefined: Self = StObject.set(x, "relevancyStrictness", js.undefined)
      
      inline def setRuleContexts(value: js.Array[String]): Self = StObject.set(x, "ruleContexts", value.asInstanceOf[js.Any])
      
      inline def setRuleContextsUndefined: Self = StObject.set(x, "ruleContexts", js.undefined)
      
      inline def setRuleContextsVarargs(value: String*): Self = StObject.set(x, "ruleContexts", js.Array(value*))
      
      inline def setTagRefinements(value: js.Array[String]): Self = StObject.set(x, "tagRefinements", value.asInstanceOf[js.Any])
      
      inline def setTagRefinementsUndefined: Self = StObject.set(x, "tagRefinements", js.undefined)
      
      inline def setTagRefinementsVarargs(value: String*): Self = StObject.set(x, "tagRefinements", js.Array(value*))
    }
  }
  
  object SearchForFacetValues {
    
    trait Hit extends StObject {
      
      var count: Double
      
      var escapedValue: String
      
      var highlighted: String
      
      var isRefined: Boolean
      
      var value: String
    }
    object Hit {
      
      inline def apply(count: Double, escapedValue: String, highlighted: String, isRefined: Boolean, value: String): Hit = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], escapedValue = escapedValue.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[Hit]
      }
      
      extension [Self <: Hit](x: Self) {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setEscapedValue(value: String): Self = StObject.set(x, "escapedValue", value.asInstanceOf[js.Any])
        
        inline def setHighlighted(value: String): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
        
        inline def setIsRefined(value: Boolean): Self = StObject.set(x, "isRefined", value.asInstanceOf[js.Any])
        
        inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
    
    trait Result extends StObject {
      
      var facetHits: js.Array[Hit]
      
      var processingTimeMS: Double
    }
    object Result {
      
      inline def apply(facetHits: js.Array[Hit], processingTimeMS: Double): Result = {
        val __obj = js.Dynamic.literal(facetHits = facetHits.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any])
        __obj.asInstanceOf[Result]
      }
      
      extension [Self <: Result](x: Self) {
        
        inline def setFacetHits(value: js.Array[Hit]): Self = StObject.set(x, "facetHits", value.asInstanceOf[js.Any])
        
        inline def setFacetHitsVarargs(value: Hit*): Self = StObject.set(x, "facetHits", js.Array(value*))
        
        inline def setProcessingTimeMS(value: Double): Self = StObject.set(x, "processingTimeMS", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait SearchResultsOptions extends StObject {
    
    /**
      * Marker which can be added to search results to identify them as created without a search response.
      * This is for internal use, e.g., avoiding caching in infinite hits, or delaying the display of these results.
      */
    var __isArtificial: js.UndefOr[Boolean] = js.undefined
  }
  object SearchResultsOptions {
    
    inline def apply(): SearchResultsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchResultsOptions]
    }
    
    extension [Self <: SearchResultsOptions](x: Self) {
      
      inline def set__isArtificial(value: Boolean): Self = StObject.set(x, "__isArtificial", value.asInstanceOf[js.Any])
      
      inline def set__isArtificialUndefined: Self = StObject.set(x, "__isArtificial", js.undefined)
    }
  }
}
