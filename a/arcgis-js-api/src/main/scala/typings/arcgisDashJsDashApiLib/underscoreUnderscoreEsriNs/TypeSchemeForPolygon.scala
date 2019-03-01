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
}

object TypeSchemeForPolygon {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataColor: Color,
    opacity: scala.Double,
    outline: TypeSchemeForPolygonOutline,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): TypeSchemeForPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("colors")(colors)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("noDataColor")(noDataColor)
    __obj.updateDynamic("opacity")(opacity)
    __obj.updateDynamic("outline")(outline)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[TypeSchemeForPolygon]
  }
}

