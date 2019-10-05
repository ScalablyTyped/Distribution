package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatPosition extends Object {
  /**
    * A string representing the location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position)
    */
  var coordinate: String
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
    coordinate: String,
    hasOwnProperty: PropertyKey => Boolean,
    location: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): FormatPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor, coordinate = coordinate, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), location = location, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[FormatPosition]
  }
}

