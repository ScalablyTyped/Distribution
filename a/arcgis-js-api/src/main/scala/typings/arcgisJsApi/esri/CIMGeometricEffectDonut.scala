package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Accurate
import typings.arcgisJsApi.arcgisJsApiStrings.Fast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectDonut
  extends StObject
     with CIMGeometricEffect {
  
  /**
    * The option for the way the symbol handles complex geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDonut)
    */
  var option: Fast | Accurate
  
  /**
    * The primitive name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDonut)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut
  
  /**
    * The distance from the edge of the polygon that the fill symbol is to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectDonut)
    */
  var width: Double
}
object CIMGeometricEffectDonut {
  
  inline def apply(option: Fast | Accurate, width: Double): CIMGeometricEffectDonut = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectDonut")
    __obj.asInstanceOf[CIMGeometricEffectDonut]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectDonut] (val x: Self) extends AnyVal {
    
    inline def setOption(value: Fast | Accurate): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectDonut): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
