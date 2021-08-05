package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectOffset
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The way the strokes or fills are displayed at corners.
    */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetMethod * / any */ String
  ] = js.undefined
  
  /**
    * The distance of the symbol perpendicular to the feature geometry.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * The way the symbol handles complex geometries.
    */
  var option: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectOffset: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset
}
object CIMGeometricEffectOffset {
  
  inline def apply(): CIMGeometricEffectOffset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectOffset")
    __obj.asInstanceOf[CIMGeometricEffectOffset]
  }
  
  extension [Self <: CIMGeometricEffectOffset](x: Self) {
    
    inline def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOption(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
    ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectOffset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
