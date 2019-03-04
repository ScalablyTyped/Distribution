package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSchemeForMesh
  extends stdLib.Object
     with TypeScheme {
  /**
    * The fill colors of the symbols comprising the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForMesh)
    */
  var colors: js.Array[Color]
  /**
    * The color of the fill symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForMesh)
    */
  var noDataColor: Color
  /**
    * The opacity of the symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForMesh)
    */
  var opacity: scala.Double
}

object TypeSchemeForMesh {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataColor: Color,
    opacity: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): TypeSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = hasOwnProperty, noDataColor = noDataColor, opacity = opacity, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[TypeSchemeForMesh]
  }
}

