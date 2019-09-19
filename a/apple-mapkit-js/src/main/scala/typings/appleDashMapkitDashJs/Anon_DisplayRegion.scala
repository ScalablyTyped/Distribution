package typings.appleDashMapkitDashJs

import typings.appleDashMapkitDashJs.mapkitNs.CoordinateRegion
import typings.appleDashMapkitDashJs.mapkitNs.Place
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayRegion[Q] extends js.Object {
  /**
    * A region that encloses the search results. This property is not present
    * if there are no results.
    */
  var displayRegion: js.UndefOr[CoordinateRegion] = js.undefined
  /**
    * An array of Place objects. The places array is empty if there is no match.
    */
  var places: js.Array[Place]
  /**
    * The query corresponding to the results  The query corresponding to the
    * results, if a SearchAutocompleteResult was not used to perform the search.
    */
  var query: js.UndefOr[String] = js.undefined
}

object Anon_DisplayRegion {
  @scala.inline
  def apply[Q](places: js.Array[Place], displayRegion: CoordinateRegion = null, query: String = null): Anon_DisplayRegion[Q] = {
    val __obj = js.Dynamic.literal(places = places)
    if (displayRegion != null) __obj.updateDynamic("displayRegion")(displayRegion)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_DisplayRegion[Q]]
  }
}

