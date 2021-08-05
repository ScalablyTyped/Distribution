package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectBuffer
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The distance from the feature. This distance is either from the edge of the marker, the edge of the stroke or the edge of the polygon outline.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectBuffer: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer
}
object CIMGeometricEffectBuffer {
  
  inline def apply(): CIMGeometricEffectBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectBuffer")
    __obj.asInstanceOf[CIMGeometricEffectBuffer]
  }
  
  extension [Self <: CIMGeometricEffectBuffer](x: Self) {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectBuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
