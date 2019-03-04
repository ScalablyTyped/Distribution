package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominanceSchemeForPoint
  extends stdLib.Object
     with PredominanceScheme {
  /**
    * The fill colors of the point symbols used for each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var colors: js.Array[Color]
  /**
    * The color of the point symbol used to indicate features with no data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var noDataColor: Color
  /**
    * The opacity of the point symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var outline: PredominanceSchemeForPointOutline
  /**
    * The scheme defining the size visual variable if included in a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPoint)
    */
  var sizeScheme: SizeSchemeForPoint
}

object PredominanceSchemeForPoint {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    noDataColor: Color,
    opacity: scala.Double,
    outline: PredominanceSchemeForPointOutline,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    sizeScheme: SizeSchemeForPoint
  ): PredominanceSchemeForPoint = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = hasOwnProperty, noDataColor = noDataColor, opacity = opacity, outline = outline, propertyIsEnumerable = propertyIsEnumerable, sizeScheme = sizeScheme)
  
    __obj.asInstanceOf[PredominanceSchemeForPoint]
  }
}

