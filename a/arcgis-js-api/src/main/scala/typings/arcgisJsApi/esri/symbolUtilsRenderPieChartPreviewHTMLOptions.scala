package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderPieChartPreviewHTMLOptions extends StObject {
  
  /**
  		 * The hole percentage of the chart on a scale of 0-1.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPieChartPreviewHTML)
  		 */
  var holePercentage: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The outline of the pie chart.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPieChartPreviewHTML)
  		 */
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  
  /**
  		 * The radius of the pie chart in pixels.
  		 *
  		 * @default 40
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPieChartPreviewHTML)
  		 */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The values used to indicate the area each color should represent as a percentage when creating the pie chart.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPieChartPreviewHTML)
  		 */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object symbolUtilsRenderPieChartPreviewHTMLOptions {
  
  inline def apply(): symbolUtilsRenderPieChartPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsRenderPieChartPreviewHTMLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsRenderPieChartPreviewHTMLOptions] (val x: Self) extends AnyVal {
    
    inline def setHolePercentage(value: Double): Self = StObject.set(x, "holePercentage", value.asInstanceOf[js.Any])
    
    inline def setHolePercentageUndefined: Self = StObject.set(x, "holePercentage", js.undefined)
    
    inline def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
