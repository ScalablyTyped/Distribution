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
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForMesh)
    */
  var name: java.lang.String
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
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForMesh)
    */
  var tags: js.Array[java.lang.String]
}

object TypeSchemeForMesh {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    noDataColor: Color,
    opacity: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String]
  ): TypeSchemeForMesh = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, noDataColor = noDataColor, opacity = opacity, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags)
  
    __obj.asInstanceOf[TypeSchemeForMesh]
  }
}

