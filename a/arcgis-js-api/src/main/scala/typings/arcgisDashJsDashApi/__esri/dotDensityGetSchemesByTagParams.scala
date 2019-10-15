package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dotDensityGetSchemesByTagParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best symbol color for visualizing features with the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var basemapTheme: js.UndefOr[String] = js.undefined
  /**
    * When provided, only schemes missing all the provided tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var excludedTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * When provided, only schemes containing all the matching tags will be returned.  **Known Tags:** light | dark | reds | yellows | oranges | greens | blues | purples | pinks | browns | grays | bright | subdued | deuteranopia | protanopia | tritanopia | grayscale | types | dot-density
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var includedTags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The number of colors to visualize.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-dotDensity.html#getSchemesByTag)
    */
  var numColors: Double
}

object dotDensityGetSchemesByTagParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    numColors: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    basemap: String | Basemap = null,
    basemapTheme: String = null,
    excludedTags: js.Array[String] = null,
    includedTags: js.Array[String] = null
  ): dotDensityGetSchemesByTagParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), numColors = numColors, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (basemapTheme != null) __obj.updateDynamic("basemapTheme")(basemapTheme)
    if (excludedTags != null) __obj.updateDynamic("excludedTags")(excludedTags)
    if (includedTags != null) __obj.updateDynamic("includedTags")(includedTags)
    __obj.asInstanceOf[dotDensityGetSchemesByTagParams]
  }
}

