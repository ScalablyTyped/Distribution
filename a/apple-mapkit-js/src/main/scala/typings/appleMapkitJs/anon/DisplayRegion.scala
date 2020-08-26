package typings.appleMapkitJs.anon

import typings.appleMapkitJs.mapkit.CoordinateRegion
import typings.appleMapkitJs.mapkit.Place
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayRegion[Q] extends js.Object {
  /**
    * A region that encloses the search results. This property is not present
    * if there are no results.
    */
  var displayRegion: js.UndefOr[CoordinateRegion] = js.native
  /**
    * An array of Place objects. The places array is empty if there is no match.
    */
  var places: js.Array[Place] = js.native
  /**
    * The query corresponding to the results  The query corresponding to the
    * results, if a SearchAutocompleteResult was not used to perform the search.
    */
  var query: js.UndefOr[String] = js.native
}

object DisplayRegion {
  @scala.inline
  def apply[Q](places: js.Array[Place]): DisplayRegion[Q] = {
    val __obj = js.Dynamic.literal(places = places.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayRegion[Q]]
  }
  @scala.inline
  implicit class DisplayRegionOps[Self <: DisplayRegion[_], Q] (val x: Self with DisplayRegion[Q]) extends AnyVal {
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
    def setPlacesVarargs(value: Place*): Self = this.set("places", js.Array(value :_*))
    @scala.inline
    def setPlaces(value: js.Array[Place]): Self = this.set("places", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayRegion(value: CoordinateRegion): Self = this.set("displayRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayRegion: Self = this.set("displayRegion", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

