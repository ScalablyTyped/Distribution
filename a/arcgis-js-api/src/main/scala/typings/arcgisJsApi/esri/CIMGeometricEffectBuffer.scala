package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectBuffer
  extends StObject
     with CIMGeometricEffect {
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectBuffer)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The distance from the feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectBuffer)
    */
  var size: Double
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer
}
object CIMGeometricEffectBuffer {
  
  inline def apply(size: Double): CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectBuffer")
    __obj.asInstanceOf[CIMGeometricEffectBuffer]
  }
  
  extension [Self <: CIMGeometricEffectBuffer](x: Self) {
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
