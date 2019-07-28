package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSchemeForPolylineColorsForClassBreaks extends Object {
  /**
    * An array of hex color strings. Each color is assigned to a specific break in classed color visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var colors: js.Array[Color]
  /**
    * The number of classes used in the classed color visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolyline)
    */
  var numClasses: Double
}

object ColorSchemeForPolylineColorsForClassBreaks {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numClasses: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ColorSchemeForPolylineColorsForClassBreaks = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numClasses = numClasses, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ColorSchemeForPolylineColorsForClassBreaks]
  }
}

