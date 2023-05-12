package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieChartRendererOthersCategory extends StObject {
  
  /**
    * Defines the color used to represent all categories whose pie slices are smaller than the percentage defined by `threshold`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#othersCategory)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * Describes the `color` grouping categories smaller than the `threshold` in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](global.html)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the minimum size of individual slices as a percentage of the entire pie.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PieChartRenderer.html#othersCategory)
    */
  var threshold: js.UndefOr[Double] = js.undefined
}
object PieChartRendererOthersCategory {
  
  inline def apply(): PieChartRendererOthersCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartRendererOthersCategory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PieChartRendererOthersCategory] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
