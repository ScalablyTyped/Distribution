package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationSchemeForPoint
  extends Object
     with LocationScheme {
  /**
    * The fill color of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var color: Color
  /**
    * The opacity of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var opacity: Double
  /**
    * Properties for defining the outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var outline: LocationSchemeForPointOutline
  /**
    * The size of the marker symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForPoint)
    */
  var size: Double
}

object LocationSchemeForPoint {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    opacity: Double,
    outline: LocationSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    size: Double
  ): LocationSchemeForPoint = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), opacity = opacity, outline = outline, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size)
  
    __obj.asInstanceOf[LocationSchemeForPoint]
  }
}

