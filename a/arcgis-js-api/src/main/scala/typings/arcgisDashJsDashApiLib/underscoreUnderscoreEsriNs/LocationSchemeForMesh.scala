package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationSchemeForMesh
  extends stdLib.Object
     with LocationScheme {
  /**
    * The color of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForMesh)
    */
  var color: Color
  /**
    * The opacity of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-location.html#LocationSchemeForMesh)
    */
  var opacity: scala.Double
}

object LocationSchemeForMesh {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    opacity: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): LocationSchemeForMesh = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, opacity = opacity, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[LocationSchemeForMesh]
  }
}

