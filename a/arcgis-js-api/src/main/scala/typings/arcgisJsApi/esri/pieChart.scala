package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a pie chart for every feature.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html)
  */
trait pieChart extends StObject {
  
  /**
    * Generates a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html) based on a set of numeric fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRenderer)
    */
  def createRenderer(params: pieChartCreateRendererParams): js.Promise[pieChartRendererResult]
  
  /**
    * Generates a [PieChartRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html) to use for a [FeatureReductionCluster](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html) visualization based off an input layer's [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) or [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
    */
  def createRendererForClustering(params: pieChartCreateRendererForClusteringParams): js.Promise[ClusterRendererResult]
}
object pieChart {
  
  inline def apply(
    createRenderer: pieChartCreateRendererParams => js.Promise[pieChartRendererResult],
    createRendererForClustering: pieChartCreateRendererForClusteringParams => js.Promise[ClusterRendererResult]
  ): pieChart = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer), createRendererForClustering = js.Any.fromFunction1(createRendererForClustering))
    __obj.asInstanceOf[pieChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pieChart] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: pieChartCreateRendererParams => js.Promise[pieChartRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateRendererForClustering(value: pieChartCreateRendererForClusteringParams => js.Promise[ClusterRendererResult]): Self = StObject.set(x, "createRendererForClustering", js.Any.fromFunction1(value))
  }
}
