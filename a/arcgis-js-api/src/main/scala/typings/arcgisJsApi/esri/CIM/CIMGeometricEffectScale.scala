package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectScale
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
  			 * The amount of change in size of a symbol in the x-axis. The value is expressed in terms of a ratio/percentage.
  			 */
  var XScaleFactor: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The amount of change in size of a symbol in the y-axis. The value is expressed in terms of a ratio/percentage.
  			 */
  var YScaleFactor: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectScale: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale
}
object CIMGeometricEffectScale {
  
  inline def apply(): CIMGeometricEffectScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectScale")
    __obj.asInstanceOf[CIMGeometricEffectScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectScale] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setXScaleFactor(value: Double): Self = StObject.set(x, "XScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setXScaleFactorUndefined: Self = StObject.set(x, "XScaleFactor", js.undefined)
    
    inline def setYScaleFactor(value: Double): Self = StObject.set(x, "YScaleFactor", value.asInstanceOf[js.Any])
    
    inline def setYScaleFactorUndefined: Self = StObject.set(x, "YScaleFactor", js.undefined)
  }
}
