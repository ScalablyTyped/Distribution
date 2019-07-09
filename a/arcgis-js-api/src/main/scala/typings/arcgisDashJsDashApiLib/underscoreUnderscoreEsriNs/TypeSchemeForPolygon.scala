package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSchemeForPolygon
  extends stdLib.Object
     with TypeScheme {
  /**
    * The fill colors of the symbols comprising the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var colors: js.Array[Color]
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var name: java.lang.String
  /**
    * The color of the fill symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var noDataColor: Color
  /**
    * The opacity of the symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var outline: TypeSchemeForPolygonOutline
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPolygon)
    */
  var tags: js.Array[java.lang.String]
}

object TypeSchemeForPolygon {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    noDataColor: Color,
    opacity: scala.Double,
    outline: TypeSchemeForPolygonOutline,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String]
  ): TypeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, noDataColor = noDataColor, opacity = opacity, outline = outline, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags)
  
    __obj.asInstanceOf[TypeSchemeForPolygon]
  }
}

