package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawCreateDrawOptions extends Object {
  /**
    * The drawing mode. The drawing mode applies only when creating `polygon`, `polyline`, `segment` draw actions.  **Possible Values**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline` draw actions.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` and `segment` draw actions. Default for `segment` draw actions.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-Draw.html#create)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}

object DrawCreateDrawOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DrawCreateDrawOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[DrawCreateDrawOptions]
  }
  @scala.inline
  implicit class DrawCreateDrawOptionsOps[Self <: DrawCreateDrawOptions] (val x: Self) extends AnyVal {
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
    def setMode(value: hybrid | freehand | click): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

