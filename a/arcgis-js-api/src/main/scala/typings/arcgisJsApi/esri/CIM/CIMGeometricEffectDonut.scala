package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectDonut
  extends StObject
     with CIMGeometricEffectBase
     with CIMGeometricEffectType {
  
  /**
  			 * The method which specifies the way the strokes are displayed at convex corners of the polygon.
  			 */
  var method: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectDonutMethod * / any */ String
  ] = js.undefined
  
  /**
  			 * The option for the way the symbol handles complex geometries.
  			 */
  var option: js.UndefOr[
    /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
  ] = js.undefined
  
  @JSName("type")
  var type_CIMGeometricEffectDonut: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut
  
  /**
  			 * The distance from the edge of the polygon that the fill symbol is to be displayed.
  			 */
  var width: js.UndefOr[Double] = js.undefined
}
object CIMGeometricEffectDonut {
  
  inline def apply(): CIMGeometricEffectDonut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMGeometricEffectDonut")
    __obj.asInstanceOf[CIMGeometricEffectDonut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectDonut] (val x: Self) extends AnyVal {
    
    inline def setMethod(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectDonutMethod * / any */ String
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOption(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GeometricEffectOffsetOption * / any */ String
    ): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
