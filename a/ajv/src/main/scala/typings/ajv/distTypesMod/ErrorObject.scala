package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorObject[K /* <: String */, P, S] extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var instancePath: String
  
  var keyword: K
  
  var message: js.UndefOr[String] = js.undefined
  
  var params: P
  
  var parentSchema: js.UndefOr[AnySchemaObject] = js.undefined
  
  var propertyName: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[S] = js.undefined
  
  var schemaPath: String
}
object ErrorObject {
  
  inline def apply[K /* <: String */, P, S](instancePath: String, keyword: K, params: P, schemaPath: String): ErrorObject[K, P, S] = {
    val __obj = js.Dynamic.literal(instancePath = instancePath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject[K, P, S]]
  }
  
  extension [Self <: ErrorObject[?, ?, ?], K /* <: String */, P, S](x: Self & (ErrorObject[K, P, S])) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setInstancePath(value: String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
    
    inline def setKeyword(value: K): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParentSchema(value: AnySchemaObject): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
    
    inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    inline def setSchema(value: S): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
