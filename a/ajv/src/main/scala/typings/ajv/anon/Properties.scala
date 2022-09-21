package typings.ajv.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var optionalProperties: Record[String, Any]
  
  var properties: js.UndefOr[Record[String, Any]] = js.undefined
}
object Properties {
  
  inline def apply(optionalProperties: Record[String, Any]): Properties = {
    val __obj = js.Dynamic.literal(optionalProperties = optionalProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  extension [Self <: Properties](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setOptionalProperties(value: Record[String, Any]): Self = StObject.set(x, "optionalProperties", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Record[String, Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
