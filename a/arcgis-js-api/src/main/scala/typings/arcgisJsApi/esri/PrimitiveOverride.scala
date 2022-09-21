package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.CIMPrimitiveOverride
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimitiveOverride
  extends StObject
     with Object {
  
  /**
    * The primitive name this override applies to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var primitiveName: String
  
  /**
    * The name of the property in the primitive this override applies to (e.g.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var propertyName: String
  
  var `type`: CIMPrimitiveOverride
  
  /**
    * Contains the Arcade expression that returns a value to be applied to the property on the primitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#PrimitiveOverride)
    */
  var valueExpressionInfo: PrimitiveOverrideValueExpressionInfo
}
object PrimitiveOverride {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    primitiveName: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    propertyName: String,
    valueExpressionInfo: PrimitiveOverrideValueExpressionInfo
  ): PrimitiveOverride = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), primitiveName = primitiveName.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), propertyName = propertyName.asInstanceOf[js.Any], valueExpressionInfo = valueExpressionInfo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPrimitiveOverride")
    __obj.asInstanceOf[PrimitiveOverride]
  }
  
  extension [Self <: PrimitiveOverride](x: Self) {
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setType(value: CIMPrimitiveOverride): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValueExpressionInfo(value: PrimitiveOverrideValueExpressionInfo): Self = StObject.set(x, "valueExpressionInfo", value.asInstanceOf[js.Any])
  }
}
