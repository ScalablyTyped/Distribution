package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleRangeLayer extends js.Object {
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  var maxScale: Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  var minScale: Double = js.native
}

object ScaleRangeLayer {
  @scala.inline
  def apply(maxScale: Double, minScale: Double): ScaleRangeLayer = {
    val __obj = js.Dynamic.literal(maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleRangeLayer]
  }
  @scala.inline
  implicit class ScaleRangeLayerOps[Self <: ScaleRangeLayer] (val x: Self) extends AnyVal {
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

