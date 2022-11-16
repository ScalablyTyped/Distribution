package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastViewModelThresholdOptionsProperties extends StObject {
  
  /**
    * Color of the shadow visualization.
    *
    * @default [255, 0 , 0, 0.7]
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#thresholdOptions)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * The maximum time period (in milliseconds) selectable in the UI for the threshold value.
    *
    * @default 8 * 3600 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#thresholdOptions)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum time period (in milliseconds) selectable in the UI for the threshold value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#thresholdOptions)
    */
  var minValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Time period in milliseconds.
    *
    * @default 4 * 3600 * 1000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#thresholdOptions)
    */
  var value: js.UndefOr[Double] = js.undefined
}
object ShadowCastViewModelThresholdOptionsProperties {
  
  inline def apply(): ShadowCastViewModelThresholdOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowCastViewModelThresholdOptionsProperties]
  }
  
  extension [Self <: ShadowCastViewModelThresholdOptionsProperties](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
