package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSchemeForPolygonBackgroundOutline
  extends stdLib.Object {
  /**
    * The outline color of the background fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var color: Color
  /**
    * The width of the background fill symbol's outline in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var width: scala.Double
}

object SizeSchemeForPolygonBackgroundOutline {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): SizeSchemeForPolygonBackgroundOutline = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, width = width)
  
    __obj.asInstanceOf[SizeSchemeForPolygonBackgroundOutline]
  }
}

