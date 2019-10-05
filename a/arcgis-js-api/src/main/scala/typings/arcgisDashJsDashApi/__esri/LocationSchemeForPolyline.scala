package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationSchemeForPolyline
  extends Object
     with LocationScheme {
  /**
    * The color of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPolyline)
    */
  var color: Color
  /**
    * The opacity of the line symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPolyline)
    */
  var opacity: Double
  /**
    * The width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPolyline)
    */
  var width: Double
}

object LocationSchemeForPolyline {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    width: Double
  ): LocationSchemeForPolyline = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), width = width)
  
    __obj.asInstanceOf[LocationSchemeForPolyline]
  }
}

