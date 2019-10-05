package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait heatmapGetSchemesParams extends Object {
  /**
    * The basemap to pair with the visualization. This value indicates the best colors for overlaying a heatmap against the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-heatmap.html#getSchemes)
    */
  var basemap: String | Basemap
}

object heatmapGetSchemesParams {
  @scala.inline
  def apply(
    basemap: String | Basemap,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): heatmapGetSchemesParams = {
    val __obj = js.Dynamic.literal(basemap = basemap.asInstanceOf[js.Any], constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[heatmapGetSchemesParams]
  }
}

