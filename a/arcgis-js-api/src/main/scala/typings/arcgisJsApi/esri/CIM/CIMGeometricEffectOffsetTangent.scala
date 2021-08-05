package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectOffsetTangent
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The origin of the tangent offset for the line. The beginning and end of the lines are defined by how the line was digitized.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetTangentMethod * / any */ String
  ] = js.undefined
  
  /**
    * The distance the geometry is moved tangent.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectOffsetTangent: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent
}
object CIMGeometricEffectOffsetTangent {
  
  inline def apply(): CIMGeometricEffectOffsetTangent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectOffsetTangent")
    __obj.asInstanceOf[CIMGeometricEffectOffsetTangent]
  }
  
  extension [Self <: CIMGeometricEffectOffsetTangent](x: Self) {
    
    inline def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetTangentMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffsetTangent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
