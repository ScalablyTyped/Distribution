package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsViewModelStopSymbols extends Object {
  /**
    * The first stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var first: js.UndefOr[Symbol] = js.native
  /**
    * The last stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var last: js.UndefOr[Symbol] = js.native
  /**
    * The middle stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var middle: js.UndefOr[Symbol] = js.native
  /**
    * An unlocated stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var unlocated: js.UndefOr[Symbol] = js.native
  /**
    * A waypoint stop symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#stopSymbols)
    */
  var waypoint: js.UndefOr[Symbol] = js.native
}

object DirectionsViewModelStopSymbols {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DirectionsViewModelStopSymbols = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DirectionsViewModelStopSymbols]
  }
  @scala.inline
  implicit class DirectionsViewModelStopSymbolsOps[Self <: DirectionsViewModelStopSymbols] (val x: Self) extends AnyVal {
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
    def setFirst(value: Symbol): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    @scala.inline
    def setLast(value: Symbol): Self = this.set("last", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast: Self = this.set("last", js.undefined)
    @scala.inline
    def setMiddle(value: Symbol): Self = this.set("middle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiddle: Self = this.set("middle", js.undefined)
    @scala.inline
    def setUnlocated(value: Symbol): Self = this.set("unlocated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnlocated: Self = this.set("unlocated", js.undefined)
    @scala.inline
    def setWaypoint(value: Symbol): Self = this.set("waypoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaypoint: Self = this.set("waypoint", js.undefined)
  }
  
}

