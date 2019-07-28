package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSchemeForPolygon
  extends Object
     with ColorScheme {
  /**
    * The continuous color ramp that will be applied to the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var colors: js.Array[Color]
  /**
    * Predefined classed color schemes to use for the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var colorsForClassBreaks: js.Array[ColorSchemeForPolygonColorsForClassBreaks]
  /**
    * The unique id of the color scheme to usee in the visualization. The id is assigned based on the following template: `<themeName>/<basemapName>/<schemeName>`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var id: String
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var name: String
  /**
    * The color of the symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var noDataColor: Color
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var opacity: Double
  /**
    * Properties for defining the outline of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var outline: ColorSchemeForPolygonOutline
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var tags: js.Array[String]
  /**
    * Indicates which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#ColorSchemeForPolygon)
    */
  var theme: String
}

object ColorSchemeForPolygon {
  @scala.inline
  def apply(
    colors: js.Array[Color],
    colorsForClassBreaks: js.Array[ColorSchemeForPolygonColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    noDataColor: Color,
    opacity: Double,
    outline: ColorSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => Boolean,
    tags: js.Array[String],
    theme: String
  ): ColorSchemeForPolygon = {
    val __obj = js.Dynamic.literal(colors = colors, colorsForClassBreaks = colorsForClassBreaks, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, noDataColor = noDataColor, opacity = opacity, outline = outline, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), tags = tags, theme = theme)
  
    __obj.asInstanceOf[ColorSchemeForPolygon]
  }
}

