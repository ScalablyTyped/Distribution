package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait heatmapGetSchemesParams extends Object {
  /**
    * The Esri basemap to pair with the visualization. This value indicates the best colors for visualizing features against the given basemap. If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, then use the `basemapTheme` parameter instead of this parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemes)
    */
  var basemap: js.UndefOr[String | Basemap] = js.undefined
  /**
    * If you have a non-Esri basemap (e.g. a VectorTileLayer basemap with a custom style) or no basemap at all, use this parameter to indicate whether the background of the visualization is `light` or `dark`.  **Possible Values:** light | dark
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemes)
    */
  var basemapTheme: js.UndefOr[String] = js.undefined
}

object heatmapGetSchemesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    basemap: String | Basemap = null,
    basemapTheme: String = null
  ): heatmapGetSchemesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (basemapTheme != null) __obj.updateDynamic("basemapTheme")(basemapTheme)
    __obj.asInstanceOf[heatmapGetSchemesParams]
  }
}

