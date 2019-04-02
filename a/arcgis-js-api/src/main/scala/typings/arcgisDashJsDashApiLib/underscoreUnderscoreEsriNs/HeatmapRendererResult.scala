package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapRendererResult
  extends stdLib.Object {
  /**
    * The ID of the basemap used to determine the optimal color stops of the heatmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#HeatmapRendererResult)
    */
  var basemapId: java.lang.String
  /**
    * Indicates whether default values are used in the absence of sufficient data and/or statistics from the layer. Default values are typically used when all features have the same field value or no value at all.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#HeatmapRendererResult)
    */
  var defaultValuesUsed: scala.Boolean
  /**
    * The renderer object configured to best match the given basemap and the spread of the data. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#HeatmapRendererResult)
    */
  var renderer: HeatmapRenderer
  /**
    * The color scheme used by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#HeatmapRendererResult)
    */
  var scheme: HeatmapScheme
  /**
    * Basic statistics returned from a query to the service for data from the given field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#HeatmapRendererResult)
    */
  var statistics: HeatmapStatisticsResult
}

object HeatmapRendererResult {
  @scala.inline
  def apply(
    basemapId: java.lang.String,
    constructor: js.Function,
    defaultValuesUsed: scala.Boolean,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    renderer: HeatmapRenderer,
    scheme: HeatmapScheme,
    statistics: HeatmapStatisticsResult
  ): HeatmapRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId, constructor = constructor, defaultValuesUsed = defaultValuesUsed, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer, scheme = scheme, statistics = statistics)
  
    __obj.asInstanceOf[HeatmapRendererResult]
  }
}

