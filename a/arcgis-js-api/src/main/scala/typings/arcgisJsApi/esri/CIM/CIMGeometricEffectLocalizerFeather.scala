package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectLocalizerFeather
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
    * The angle of the localizer feather.
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the localizer feather.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * The localizer feather style.
    */
  var style: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectLocalizerFeatherStyle * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectLocalizerFeather: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectLocalizerFeather
  
  /**
    * The width of the localizer feather.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CIMGeometricEffectLocalizerFeather {
  
  inline def apply(): CIMGeometricEffectLocalizerFeather = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectLocalizerFeather")
    __obj.asInstanceOf[CIMGeometricEffectLocalizerFeather]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectLocalizerFeather] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setStyle(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectLocalizerFeatherStyle * / any */ String
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectLocalizerFeather): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
