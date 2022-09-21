package typings.ajv.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionalProperties extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var optionalProperties: js.UndefOr[Record[String, Any]] = js.undefined
  
  var properties: Record[String, Any]
}
object OptionalProperties {
  
  inline def apply(properties: Record[String, Any]): OptionalProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionalProperties]
  }
  
  extension [Self <: OptionalProperties](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setOptionalProperties(value: Record[String, Any]): Self = StObject.set(x, "optionalProperties", value.asInstanceOf[js.Any])
    
    inline def setOptionalPropertiesUndefined: Self = StObject.set(x, "optionalProperties", js.undefined)
    
    inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
