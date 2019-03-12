package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSliderValues
  extends stdLib.Object {
  /**
    * The color used to represent features with values at the associated stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#values)
    */
  var color: Color
  /**
    * The label used to display the value to the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#values)
    */
  var label: java.lang.String
  /**
    * The value of the stop for the associated handle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ColorSlider.html#values)
    */
  var value: scala.Double
}

object ColorSliderValues {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    label: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    value: scala.Double
  ): ColorSliderValues = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
  
    __obj.asInstanceOf[ColorSliderValues]
  }
}

