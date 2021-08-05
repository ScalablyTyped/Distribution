package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectReverse
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * A value indicating whether the dynamic output of a previous geometric effect is to be flipped or not.
    */
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectReverse: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse
}
object CIMGeometricEffectReverse {
  
  inline def apply(): CIMGeometricEffectReverse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectReverse")
    __obj.asInstanceOf[CIMGeometricEffectReverse]
  }
  
  extension [Self <: CIMGeometricEffectReverse](x: Self) {
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectReverse): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
