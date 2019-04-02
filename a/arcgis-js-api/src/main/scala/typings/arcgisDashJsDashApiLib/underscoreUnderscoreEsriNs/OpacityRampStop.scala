package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpacityRampStop
  extends stdLib.Object {
  /**
    * The color of the visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops). The opacity corresponding to the given `value` is indicated in the [alpha](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html#a) property of the color object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampStop)
    */
  var color: Color
  /**
    * The label in the legend describing features with the given `color` and `value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampStop)
    */
  var label: java.lang.String
  /**
    * A number between `0` and `1` describing the position of the label on the ramp. For example, in a ramp with three stops, the first stop would have an offset of `0`, the second `0.5`, and the third `1`. These offsets are equally spaced for any given number of labels in the ramp. The interval of each offset value is equal to 1 divided by the number of stops minus 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampStop)
    */
  var offset: scala.Double
  /**
    * The value of the opacity visual variable [stop](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#OpacityRampStop)
    */
  var value: scala.Double
}

object OpacityRampStop {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String,
    offset: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: scala.Double
  ): OpacityRampStop = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, offset = offset, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
  
    __obj.asInstanceOf[OpacityRampStop]
  }
}

