package typings
package awsDashSdkLib.clientsCloudsearchdomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse extends js.Object {
  /**
    * The requested facet information.
    */
  var facets: js.UndefOr[Facets] = js.undefined
  /**
    * The documents that match the search criteria.
    */
  var hits: js.UndefOr[Hits] = js.undefined
  /**
    * The requested field statistics information.
    */
  var stats: js.UndefOr[Stats] = js.undefined
  /**
    * The status information returned for the search request.
    */
  var status: js.UndefOr[SearchStatus] = js.undefined
}

object SearchResponse {
  @scala.inline
  def apply(facets: Facets = null, hits: Hits = null, stats: Stats = null, status: SearchStatus = null): SearchResponse = {
    val __obj = js.Dynamic.literal()
    if (facets != null) __obj.updateDynamic("facets")(facets)
    if (hits != null) __obj.updateDynamic("hits")(hits)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[SearchResponse]
  }
}

