package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionPosition
  extends stdLib.Object {
  /**
    * A string representing the location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#Position)
    */
  var coordinate: java.lang.String
  /**
    * A point geometry representing the location described by the conversion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Conversion.html#Position)
    */
  var location: Point
}

object ConversionPosition {
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    location: Point,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): ConversionPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor, coordinate = coordinate, hasOwnProperty = hasOwnProperty, location = location, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[ConversionPosition]
  }
}

