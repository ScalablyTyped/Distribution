package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sizeRangeSizeRangeParams extends Object {
  /**
    * The layer for which to generate a suggested min/max size range based on scale for a size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  var layer: FeatureLayer | GeoJSONLayer = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-sizeRange.html#sizeRange)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * The [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView = js.native
}

object sizeRangeSizeRangeParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView
  ): sizeRangeSizeRangeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[sizeRangeSizeRangeParams]
  }
  @scala.inline
  implicit class sizeRangeSizeRangeParamsOps[Self <: sizeRangeSizeRangeParams] (val x: Self) extends AnyVal {
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
    def setLayer(value: FeatureLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: MapView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

