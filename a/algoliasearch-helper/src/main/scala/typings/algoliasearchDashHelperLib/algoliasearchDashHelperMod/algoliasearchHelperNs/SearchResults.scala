package typings
package algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var _rawResults: js.Any
  var _state: SearchParameters
  /**
    * The position if the position was guessed by IP.
    * @example "48.8637,2.3615",
    */
  var aroundLatLng: java.lang.String
  /**
    * The radius computed by Algolia.
    * @example "126792922",
    */
  var automaticRadius: java.lang.String
  /**
    * disjunctive facets results
    */
  var disjunctiveFacets: js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Facet
  ]
  /**
    * True if the counts of the facets is exhaustive
    */
  var exhaustiveFacetsCount: scala.Boolean
  /**
    * True if the number of hits is exhaustive
    */
  var exhaustiveNbHits: scala.Boolean
  /**
    * other facets results
    */
  var facets: js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Facet
  ]
  /**
    * disjunctive facets results
    */
  var hierarchicalFacets: js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.HierarchicalFacet
  ]
  /**
    * all the records that match the search parameters. Each record is
    * augmented with a new attribute `_highlightResult`
    * which is an object keyed by attribute and with the following properties:
    *  - `value` : the value of the facet highlighted (html)
    *  - `matchLevel`: full, partial or none depending on how the query terms match
    */
  var hits: js.Array[_]
  /**
    * number of hits per page requested
    */
  var hitsPerPage: scala.Double
  /**
    * index where the results come from
    */
  var index: java.lang.String
  /**
    * total number of hits of this query on the index
    */
  var nbHits: scala.Double
  /**
    * total number of pages with respect to the number of hits per page and the total number of hits
    */
  var nbPages: scala.Double
  /**
    * current page
    */
  var page: scala.Double
  /**
    * The query as parsed by the engine given all the rules.
    */
  var parsedQuery: java.lang.String
  /**
    * sum of the processing time of all the queries
    */
  var processingTimeMS: scala.Double
  /**
    * query used to generate the results
    */
  var query: java.lang.String
  /**
    * queryID is the unique identifier of the query used to generate the current search results.
    * This value is only available if the `clickAnalytics` search parameter is set to `true`.
    */
  var queryID: java.lang.String
  /**
    * String identifying the server used to serve this request.
    * @example "c7-use-2.algolia.net",
    */
  var serverUsed: java.lang.String
  /**
    * Boolean that indicates if the computation of the counts did time out.
    * @deprecated
    */
  var timeoutCounts: scala.Boolean
  /**
    * Boolean that indicates if the computation of the hits did time out.
    * @deprecated
    */
  var timeoutHits: scala.Boolean
  /**
    * Contains the userData if they are set by a [query rule](https://www.algolia.com/doc/guides/query-rules/query-rules-overview/).
    */
  var userData: js.Array[_]
  /**
    * Get a facet object with its name
    * @deprecated
    * @param name name of the faceted attribute
    * @return  the facet object
    */
  def getFacetByName(name: java.lang.String): algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Facet
  /**
    * Returns the facet stats if attribute is defined and the facet contains some.
    * Otherwise returns undefined.
    * @param attribute name of the faceted attribute
    * @return The stats of the facet
    */
  def getFacetStats(attribute: java.lang.String): js.Any
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
  def getFacetValues(attribute: java.lang.String, opts: js.Any): (js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.FacetValue
  ]) | algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.HierarchicalFacet
  /**
    * Returns all refinements for all filters + tags. It also provides
    * additional information: count and exhausistivity for each filter.
    *
    * See the [refinement type](#Refinement) for an exhaustive view of the available
    * data.
    *
    * @return all the refinements
    */
  def getRefinements(): js.Array[
    algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Refinement
  ]
}

object SearchResults {
  @scala.inline
  def apply(
    _rawResults: js.Any,
    _state: SearchParameters,
    aroundLatLng: java.lang.String,
    automaticRadius: java.lang.String,
    disjunctiveFacets: js.Array[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Facet
    ],
    exhaustiveFacetsCount: scala.Boolean,
    exhaustiveNbHits: scala.Boolean,
    facets: js.Array[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Facet
    ],
    getFacetByName: java.lang.String => algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Facet,
    getFacetStats: java.lang.String => js.Any,
    getFacetValues: (java.lang.String, js.Any) => (js.Array[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.FacetValue
    ]) | algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.HierarchicalFacet,
    getRefinements: () => js.Array[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.Refinement
    ],
    hierarchicalFacets: js.Array[
      algoliasearchDashHelperLib.algoliasearchDashHelperMod.algoliasearchHelperNs.SearchResultsNs.HierarchicalFacet
    ],
    hits: js.Array[_],
    hitsPerPage: scala.Double,
    index: java.lang.String,
    nbHits: scala.Double,
    nbPages: scala.Double,
    page: scala.Double,
    parsedQuery: java.lang.String,
    processingTimeMS: scala.Double,
    query: java.lang.String,
    queryID: java.lang.String,
    serverUsed: java.lang.String,
    timeoutCounts: scala.Boolean,
    timeoutHits: scala.Boolean,
    userData: js.Array[_]
  ): SearchResults = {
    val __obj = js.Dynamic.literal(_rawResults = _rawResults, _state = _state, aroundLatLng = aroundLatLng, automaticRadius = automaticRadius, disjunctiveFacets = disjunctiveFacets, exhaustiveFacetsCount = exhaustiveFacetsCount, exhaustiveNbHits = exhaustiveNbHits, facets = facets, getFacetByName = js.Any.fromFunction1(getFacetByName), getFacetStats = js.Any.fromFunction1(getFacetStats), getFacetValues = js.Any.fromFunction2(getFacetValues), getRefinements = js.Any.fromFunction0(getRefinements), hierarchicalFacets = hierarchicalFacets, hits = hits, hitsPerPage = hitsPerPage, index = index, nbHits = nbHits, nbPages = nbPages, page = page, parsedQuery = parsedQuery, processingTimeMS = processingTimeMS, query = query, queryID = queryID, serverUsed = serverUsed, timeoutCounts = timeoutCounts, timeoutHits = timeoutHits, userData = userData)
  
    __obj.asInstanceOf[SearchResults]
  }
}

