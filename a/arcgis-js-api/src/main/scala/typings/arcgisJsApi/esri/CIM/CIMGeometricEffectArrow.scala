package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectArrow
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The type of arrow to be displayed.
    */
  var geometricEffectArrowType: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectArrowType * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectArrow: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow
  
  /**
    * The distance between the lines that construct the body of the arrow.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CIMGeometricEffectArrow {
  
  inline def apply(): CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectArrow")
    __obj.asInstanceOf[CIMGeometricEffectArrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectArrow] (val x: Self) extends AnyVal {
    
    inline def setGeometricEffectArrowType(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectArrowType * / any */ String
    ): Self = StObject.set(x, "geometricEffectArrowType", value.asInstanceOf[js.Any])
    
    inline def setGeometricEffectArrowTypeUndefined: Self = StObject.set(x, "geometricEffectArrowType", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
