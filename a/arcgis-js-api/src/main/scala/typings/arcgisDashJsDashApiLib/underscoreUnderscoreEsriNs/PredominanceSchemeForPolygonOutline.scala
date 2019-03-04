package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominanceSchemeForPolygonOutline
  extends stdLib.Object {
  /**
    * The outline color of the fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var color: Color
  /**
    * The width of the fill symbol's outline in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolygon)
    */
  var width: scala.Double
}

object PredominanceSchemeForPolygonOutline {
  @scala.inline
  def apply(
    color: Color,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    width: scala.Double
  ): PredominanceSchemeForPolygonOutline = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, width = width)
  
    __obj.asInstanceOf[PredominanceSchemeForPolygonOutline]
  }
}

