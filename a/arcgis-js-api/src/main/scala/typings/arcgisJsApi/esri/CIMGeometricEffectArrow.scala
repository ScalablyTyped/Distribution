package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Block
import typings.arcgisJsApi.arcgisJsApiStrings.Crossed
import typings.arcgisJsApi.arcgisJsApiStrings.OpenEnded
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMGeometricEffectArrow
  extends StObject
     with CIMGeometricEffect {
  
  /**
  		 * The type of arrow to be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectArrow)
  		 */
  var geometricEffectArrowType: OpenEnded | Block | Crossed
  
  /**
  		 * The primitive name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectArrow)
  		 */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow
  
  /**
  		 * The distance between the lines that construct the body of the arrow.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMGeometricEffectArrow)
  		 */
  var width: Double
}
object CIMGeometricEffectArrow {
  
  inline def apply(geometricEffectArrowType: OpenEnded | Block | Crossed, width: Double): CIMGeometricEffectArrow = {
    val __obj = js.Dynamic.literal(geometricEffectArrowType = geometricEffectArrowType.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMGeometricEffectArrow")
    __obj.asInstanceOf[CIMGeometricEffectArrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMGeometricEffectArrow] (val x: Self) extends AnyVal {
    
    inline def setGeometricEffectArrowType(value: OpenEnded | Block | Crossed): Self = StObject.set(x, "geometricEffectArrowType", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMGeometricEffectArrow): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
