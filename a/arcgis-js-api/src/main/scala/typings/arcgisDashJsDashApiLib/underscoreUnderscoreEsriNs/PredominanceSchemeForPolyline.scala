package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominanceSchemeForPolyline
  extends stdLib.Object
     with PredominanceScheme {
  /**
    * The colors of the line symbols used for each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var colors: js.Array[Color]
  /**
    * The color of the line symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var noDataColor: Color
  /**
    * The opacity of the line symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var opacity: scala.Double
  /**
    * The scheme defining the size visual variable if included in a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var sizeScheme: SizeSchemeForPolyline
  /**
    * The default width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var width: scala.Double
}

object PredominanceSchemeForPolyline {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataColor: Color,
    opacity: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sizeScheme: SizeSchemeForPolyline,
    width: scala.Double
  ): PredominanceSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = hasOwnProperty, noDataColor = noDataColor, opacity = opacity, propertyIsEnumerable = propertyIsEnumerable, sizeScheme = sizeScheme, width = width)
  
    __obj.asInstanceOf[PredominanceSchemeForPolyline]
  }
}

