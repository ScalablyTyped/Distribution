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
trait SketchViewModelDefaultCreateOptions extends Object {
  /**
    * The default z-value of the newly created geometry. Ignored when `hasZ` is `false` or the layer's elevation mode is set to `absolute-height`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultZ: js.UndefOr[Double] = js.native
  /**
    * Controls whether the created geometry has z-values or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var hasZ: js.UndefOr[Boolean] = js.native
  /**
    * Create operation mode how the graphic can be created.
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | This is the default. Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline`.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` `rectangle` and `circle`. Default for `rectangle` and `circle`.
    * click | Vertices are added when the pointer is clicked.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}

object SketchViewModelDefaultCreateOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchViewModelDefaultCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchViewModelDefaultCreateOptions]
  }
  @scala.inline
  implicit class SketchViewModelDefaultCreateOptionsOps[Self <: SketchViewModelDefaultCreateOptions] (val x: Self) extends AnyVal {
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
    def setDefaultZ(value: Double): Self = this.set("defaultZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultZ: Self = this.set("defaultZ", js.undefined)
    @scala.inline
    def setHasZ(value: Boolean): Self = this.set("hasZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasZ: Self = this.set("hasZ", js.undefined)
    @scala.inline
    def setMode(value: hybrid | freehand | click): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
  
}

