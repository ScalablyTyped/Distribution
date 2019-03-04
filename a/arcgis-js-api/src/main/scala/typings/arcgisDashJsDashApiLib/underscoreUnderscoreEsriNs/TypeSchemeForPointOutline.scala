package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeSchemeForPointOutline
  extends stdLib.Object {
  /**
    * The outline color of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var color: Color
  /**
    * The width of the marker symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-type.html#TypeSchemeForPoint)
    */
  var width: scala.Double
}

object TypeSchemeForPointOutline {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): TypeSchemeForPointOutline = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, width = width)
  
    __obj.asInstanceOf[TypeSchemeForPointOutline]
  }
}

