package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pieChartCreateRendererForClusteringParamsLegendOptions extends StObject {
  
  /**
  		 * The title used to describe the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-pieChart.html#createRendererForClustering)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object pieChartCreateRendererForClusteringParamsLegendOptions {
  
  inline def apply(): pieChartCreateRendererForClusteringParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pieChartCreateRendererForClusteringParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: pieChartCreateRendererForClusteringParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
