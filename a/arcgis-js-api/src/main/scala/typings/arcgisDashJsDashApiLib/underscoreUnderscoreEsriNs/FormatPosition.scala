package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatPosition
  extends stdLib.Object {
  /**
    * A string representing the location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position)
    */
  var coordinate: java.lang.String
  /**
    * A point geometry representing the location described by the conversion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position)
    */
  var location: Point
}

object FormatPosition {
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    location: Point,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): FormatPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor, coordinate = coordinate, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[FormatPosition]
  }
}

