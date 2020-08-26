package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleRangeResult extends Object {
  /**
    * The suggested [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#ScaleRangeResult)
    */
  var maxScale: Double = js.native
  /**
    * The suggested [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#ScaleRangeResult)
    */
  var minScale: Double = js.native
}

object ScaleRangeResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxScale: Double,
    minScale: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ScaleRangeResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ScaleRangeResult]
  }
  @scala.inline
  implicit class ScaleRangeResultOps[Self <: ScaleRangeResult] (val x: Self) extends AnyVal {
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
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
  }
  
}

