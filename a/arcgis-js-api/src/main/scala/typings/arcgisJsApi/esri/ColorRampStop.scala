package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorRampStop extends Object {
  /**
    * The color of the visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var color: Color_ = js.native
  /**
    * The label in the legend describing features with the given `color` and `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var label: String = js.native
  /**
    * A number between `0` and `1` describing the position of the label on the color ramp. For example, in a color ramp with three stops, the first stop would have an offset of `0`, the second `0.5`, and the third `1`. These offsets are equally spaced for any given number of labels in the color ramp. The interval of each offset value is equal to 1 divided by the number of stops minus 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var offset: Double = js.native
  /**
    * The value of the color visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var value: Double = js.native
}

object ColorRampStop {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    offset: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double
  ): ColorRampStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorRampStop]
  }
  @scala.inline
  implicit class ColorRampStopOps[Self <: ColorRampStop] (val x: Self) extends AnyVal {
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
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

