package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs.SearchForFacetValuesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters
  extends algoliasearchLib.algoliasearchMod.algoliasearchNs.QueryParameters {
  /**
    * The facet to search in
    */
  var facetName: java.lang.String
  /**
    * The query for the search in this facet
    */
  var facetQuery: java.lang.String
  /**
    * The maximum number of facets to fetch
    */
  var maxFacetHits: js.UndefOr[scala.Double] = js.undefined
}

