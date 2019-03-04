package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsViewModelTimeAttribute
  extends stdLib.Object {
  /**
    * The name of the network attribute to use for the drive time when computing directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#timeAttribute)
    */
  var name: java.lang.String
  /**
    * The units to use when calculating drive time for directions.  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#timeAttribute)
    */
  var units: js.UndefOr[java.lang.String] = js.undefined
}

object DirectionsViewModelTimeAttribute {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    units: java.lang.String = null
  ): DirectionsViewModelTimeAttribute = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, name = name, propertyIsEnumerable = propertyIsEnumerable)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[DirectionsViewModelTimeAttribute]
  }
}

