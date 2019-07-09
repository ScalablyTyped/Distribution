package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotDensityScheme
  extends stdLib.Object {
  /**
    * The dot color for each attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var colors: js.Array[Color]
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var name: java.lang.String
  /**
    * The opacity of the symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var opacity: scala.Double
  /**
    * Properties for defining the outline of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var outline: DotDensitySchemeOutline
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var tags: js.Array[java.lang.String]
}

object DotDensityScheme {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    opacity: scala.Double,
    outline: DotDensitySchemeOutline,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    tags: js.Array[java.lang.String]
  ): DotDensityScheme = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, opacity = opacity, outline = outline, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags)
  
    __obj.asInstanceOf[DotDensityScheme]
  }
}

