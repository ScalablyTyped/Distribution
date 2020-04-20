package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function for generating statistics from a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) for a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) visualization.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html)
  */
trait heatmapStatistics extends js.Object {
  /**
    * Returns an object containing various statistics describing the intensity values for a heatmap visualization of a given point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to generate statistics for the pixel intensity values and a given `field` if provided.
    * @param params.view A [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance used to calculate pixel intensity values based on the features in the current view.
    * @param params.field The name of the numeric field for which the statistics will be generated.
    * @param params.blurRadius The area of influence for each point as a radius in pixels from the point.
    * @param params.features A subset of features for which to calculate the statistics.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def heatmapStatistics(params: heatmapStatisticsHeatmapStatisticsParams): js.Promise[HeatmapStatisticsResult]
}

@JSGlobal("__esri.heatmapStatistics")
@js.native
object heatmapStatistics extends TopLevel[heatmapStatistics]

