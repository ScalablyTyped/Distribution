package typings.appleMapkitJs

import typings.appleMapkitJs.mapkit.CoordinateRegion
import typings.appleMapkitJs.mapkit.Place
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayRegion[Q] extends js.Object {
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

object AnonDisplayRegion {
  @scala.inline
  def apply[Q](places: js.Array[Place], displayRegion: CoordinateRegion = null, query: String = null): AnonDisplayRegion[Q] = {
    val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
    if (displayRegion != null) __obj.updateDynamic("displayRegion")(displayRegion.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayRegion[Q]]
  }
}

