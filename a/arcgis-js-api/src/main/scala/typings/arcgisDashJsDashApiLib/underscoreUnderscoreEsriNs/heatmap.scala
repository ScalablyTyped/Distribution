package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains a helper method for generating a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) for a point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html)
  */
trait heatmap extends js.Object {
  /**
    * Generates a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) that may be applied directly to the layer used to call this method. The renderer represents points as a continuous surface using optimal colors for the indicated basemap.  This method should be called when at least some points are visible in the input view's extent. If no points are visible in the view, then the response will not return a useful visualization.  In most cases you will provide a `layer`, `basemap`, and optional `field` to generate this renderer. This is a scenario in which the statistics and the distribution of the data aren't well known and the user doesn't know what colors to use in the visualization.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the statistics object to the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-heatmap.html#createRenderer)
    *
    * @param params Input parameters for generating a heatmap visualization based on data returned from a given field. See the table below for details of each parameter.
    * @param params.layer The point layer for which the visualization is generated.
    * @param params.view The view instance in which the visualization will be rendered.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. The value of the `field` is used as a multiplier in the heatmap, making areas with high field values hotter than areas where the features have low field values.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    * @param params.heatmapScheme In authoring apps, the user may select a pre-defined heatmap scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.statistics A statistics object generated from the [heatmapStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.fadeToTransparent Indicates whether to fade the lower color stops to a transparent color to create a fuzzy boundary on the edge of the heatmap. A value of `false` makes a discrete boundary on the lower color stop.
    * @param params.blurRadius The [blurRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius) in pixels that determines the area of influence of each point. A higher blur radius indicates points have more influence on surrounding points.
    * @param params.minRatio The minimum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
    * @param params.maxRatio The maximum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
    *
    */
  def createRenderer(params: heatmapCreateRendererParams): arcgisDashJsDashApiLib.IPromise[HeatmapRendererResult]
}

object heatmap {
  @scala.inline
  def apply(
    createRenderer: heatmapCreateRendererParams => arcgisDashJsDashApiLib.IPromise[HeatmapRendererResult]
  ): heatmap = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
  
    __obj.asInstanceOf[heatmap]
  }
}

