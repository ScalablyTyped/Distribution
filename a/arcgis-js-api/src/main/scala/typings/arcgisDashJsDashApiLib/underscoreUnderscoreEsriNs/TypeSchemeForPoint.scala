package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSchemeForPoint
  extends stdLib.Object
     with TypeScheme {
  /**
    * The fill colors of the point symbols comprising the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var colors: js.Array[Color]
  /**
    * The color of the point symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var noDataColor: Color
  /**
    * The opacity of the point symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var outline: TypeSchemeForPointOutline
  /**
    * The default size of the point symbol in pixels, points, or real-world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var size: scala.Double
}

object TypeSchemeForPoint {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    noDataColor: Color,
    opacity: scala.Double,
    outline: TypeSchemeForPointOutline,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    size: scala.Double
  ): TypeSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), noDataColor = noDataColor, opacity = opacity, outline = outline, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), size = size)
  
    __obj.asInstanceOf[TypeSchemeForPoint]
  }
}

