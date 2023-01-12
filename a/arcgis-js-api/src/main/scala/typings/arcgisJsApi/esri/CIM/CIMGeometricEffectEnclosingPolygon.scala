package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectEnclosingPolygon
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The method which specifies the way in which the polygon geometry is generated around the feature geometry.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectEnclosingPolygonMethod * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectEnclosingPolygon: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectEnclosingPolygon
}
object CIMGeometricEffectEnclosingPolygon {
  
  inline def apply(): CIMGeometricEffectEnclosingPolygon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectEnclosingPolygon")
    __obj.asInstanceOf[CIMGeometricEffectEnclosingPolygon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectEnclosingPolygon] (val x: Self) extends AnyVal {
    
    inline def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectEnclosingPolygonMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectEnclosingPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
