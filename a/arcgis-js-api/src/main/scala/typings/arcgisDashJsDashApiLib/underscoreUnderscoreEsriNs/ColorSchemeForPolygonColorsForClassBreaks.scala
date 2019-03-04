package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSchemeForPolygonColorsForClassBreaks
  extends stdLib.Object {
  /**
    * An array of hex color strings. Each color is assigned to a specific break in classed color visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var colors: js.Array[Color]
  /**
    * The number of classes used in the classed color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var numClasses: scala.Double
}

object ColorSchemeForPolygonColorsForClassBreaks {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    numClasses: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): ColorSchemeForPolygonColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = hasOwnProperty, numClasses = numClasses, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[ColorSchemeForPolygonColorsForClassBreaks]
  }
}

