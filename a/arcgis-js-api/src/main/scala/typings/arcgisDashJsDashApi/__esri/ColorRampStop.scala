package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorRampStop extends Object {
  /**
    * The color of the visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var color: Color
  /**
    * The label in the legend describing features with the given `color` and `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var label: String
  /**
    * A number between `0` and `1` describing the position of the label on the color ramp. For example, in a color ramp with three stops, the first stop would have an offset of `0`, the second `0.5`, and the third `1`. These offsets are equally spaced for any given number of labels in the color ramp. The interval of each offset value is equal to 1 divided by the number of stops minus 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var offset: Double
  /**
    * The value of the color visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ColorRampStop)
    */
  var value: Double
}

object ColorRampStop {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    offset: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double
  ): ColorRampStop = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, offset = offset, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
  
    __obj.asInstanceOf[ColorRampStop]
  }
}

