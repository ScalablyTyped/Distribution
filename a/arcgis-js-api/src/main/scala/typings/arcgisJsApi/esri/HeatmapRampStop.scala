package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapRampStop extends Object {
  /**
    * The color of the pixel corresponding to the appropriate pixel `ratio`. This value is typically between `0` and `1`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var color: Color_ = js.native
  /**
    * The label of the color stop displayed in the legend. Typically only the first and last stops have labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var label: String = js.native
  /**
    * A number between `0` and `1` describing the position of the label on the ramp. For example, in a ramp with three stops, the first stop would have an offset of `0`, the second `0.5`, and the third `1`. These offset values are equally spaced for any given number of labels in the ramp. The interval of each offset value is equal to 1 divided by the number of stops minus 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var offset: Double = js.native
  /**
    * The ratio of a pixel's intensity value to the minPixelIntensity of the renderer. The ratio of each pixel is matched to the corresponding color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var ratio: Double = js.native
}

object HeatmapRampStop {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    offset: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    ratio: Double
  ): HeatmapRampStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ratio = ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapRampStop]
  }
  @scala.inline
  implicit class HeatmapRampStopOps[Self <: HeatmapRampStop] (val x: Self) extends AnyVal {
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
    def setColor(value: Color_): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setRatio(value: Double): Self = this.set("ratio", value.asInstanceOf[js.Any])
  }
  
}

