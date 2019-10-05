package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DotDensityScheme extends Object {
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
  var name: String
  /**
    * The opacity of the symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#DotDensityScheme)
    */
  var opacity: Double
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
  var tags: js.Array[String]
}

object DotDensityScheme {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    opacity: Double,
    outline: DotDensitySchemeOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String]
  ): DotDensityScheme = {
    val __obj = js.Dynamic.literal(colors = colors, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, opacity = opacity, outline = outline, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags)
  
    __obj.asInstanceOf[DotDensityScheme]
  }
}

