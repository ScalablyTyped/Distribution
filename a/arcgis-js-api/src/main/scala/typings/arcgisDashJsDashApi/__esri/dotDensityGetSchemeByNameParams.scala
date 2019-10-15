package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityGetSchemeByNameParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var basemapTheme: js.UndefOr[String] = js.undefined
  /**
    * The name of the scheme to retrieve.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var name: String
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemeByName)
    */
  var numColors: Double
}

object dotDensityGetSchemeByNameParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    basemap: String | Basemap = null,
    basemapTheme: String = null
  ): dotDensityGetSchemeByNameParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, numColors = numColors, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (basemapTheme != null) __obj.updateDynamic("basemapTheme")(basemapTheme)
    __obj.asInstanceOf[dotDensityGetSchemeByNameParams]
  }
}

