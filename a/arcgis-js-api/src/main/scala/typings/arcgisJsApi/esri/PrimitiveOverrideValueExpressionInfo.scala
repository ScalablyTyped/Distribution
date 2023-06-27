package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.CIMExpressionInfo
import typings.arcgisJsApi.arcgisJsApiStrings.Default
import typings.arcgisJsApi.arcgisJsApiStrings.Numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimitiveOverrideValueExpressionInfo extends StObject {
  
  /**
  		 * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
  		 */
  var expression: String
  
  /**
  		 * The name of the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The return type of the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
  		 */
  var returnType: js.UndefOr[Default | typings.arcgisJsApi.arcgisJsApiStrings.String | Numeric] = js.undefined
  
  /**
  		 * The human readable text that describes the expression.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: CIMExpressionInfo
}
object PrimitiveOverrideValueExpressionInfo {
  
  inline def apply(expression: String): PrimitiveOverrideValueExpressionInfo = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMExpressionInfo")
    __obj.asInstanceOf[PrimitiveOverrideValueExpressionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrimitiveOverrideValueExpressionInfo] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReturnType(value: Default | typings.arcgisJsApi.arcgisJsApiStrings.String | Numeric): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: CIMExpressionInfo): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
