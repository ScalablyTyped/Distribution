package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Function for generating statistics from a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) for a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html) visualization.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html)
  */
trait heatmapStatistics extends StObject {
  
  /**
    * Returns an object containing various statistics describing the intensity values for a heatmap visualization of a given point [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html#heatmapStatistics)
    */
  def heatmapStatistics(params: heatmapStatisticsHeatmapStatisticsParams): js.Promise[HeatmapStatisticsResult]
}
object heatmapStatistics {
  
  @scala.inline
  def apply(heatmapStatistics: heatmapStatisticsHeatmapStatisticsParams => js.Promise[HeatmapStatisticsResult]): heatmapStatistics = {
    val __obj = js.Dynamic.literal(heatmapStatistics = js.Any.fromFunction1(heatmapStatistics))
    __obj.asInstanceOf[heatmapStatistics]
  }
  
  @scala.inline
  implicit class heatmapStatisticsMutableBuilder[Self <: heatmapStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeatmapStatistics(value: heatmapStatisticsHeatmapStatisticsParams => js.Promise[HeatmapStatisticsResult]): Self = StObject.set(x, "heatmapStatistics", js.Any.fromFunction1(value))
  }
}
