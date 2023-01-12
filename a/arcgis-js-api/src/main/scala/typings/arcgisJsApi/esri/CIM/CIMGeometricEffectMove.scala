package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectMove
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance to move the symbol along the X-axis of the feature geometry.
    */
  var offsetX: js.UndefOr[Double] = js.undefined
  
  /**
    * The distance to move the symbol along the Y-axis of the feature geometry.
    */
  var offsetY: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectMove: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove
}
object CIMGeometricEffectMove {
  
  inline def apply(): CIMGeometricEffectMove = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectMove")
    __obj.asInstanceOf[CIMGeometricEffectMove]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectMove] (val x: Self) extends AnyVal {
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectMove): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
