package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthoringInfoField1ClassBreakInfos extends StObject {
  
  /**
    * The maximum bound of values to visualize in the given field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum bound of values to visualize in the given field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-AuthoringInfo.html#field1)
    */
  var minValue: js.UndefOr[Double] = js.undefined
}
object AuthoringInfoField1ClassBreakInfos {
  
  inline def apply(): AuthoringInfoField1ClassBreakInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthoringInfoField1ClassBreakInfos]
  }
  
  extension [Self <: AuthoringInfoField1ClassBreakInfos](x: Self) {
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
