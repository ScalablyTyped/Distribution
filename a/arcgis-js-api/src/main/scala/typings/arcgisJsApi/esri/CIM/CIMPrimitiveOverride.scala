package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPrimitiveOverride extends StObject {
  
  /**
    * The expression.
    */
  var expression: js.UndefOr[String] = js.undefined
  
  /**
    * The primitive name this override applies to.
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The property name in the primitive this override applies to.
    */
  var propertyName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride
  
  /**
    * ExpressionInfo that contains the Arcade expression that returns value as a number or a string depending on the PropertyName.
    */
  var valueExpressionInfo: js.UndefOr[CIMExpressionInfo] = js.undefined
}
object CIMPrimitiveOverride {
  
  inline def apply(): CIMPrimitiveOverride = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMPrimitiveOverride")
    __obj.asInstanceOf[CIMPrimitiveOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPrimitiveOverride] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionInfo(value: CIMExpressionInfo): Self = StObject.set(x, "valueExpressionInfo", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionInfoUndefined: Self = StObject.set(x, "valueExpressionInfo", js.undefined)
  }
}
