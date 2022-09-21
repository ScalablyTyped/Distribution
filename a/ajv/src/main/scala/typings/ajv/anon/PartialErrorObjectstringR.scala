package typings.ajv.anon

import typings.ajv.distTypesMod.AnySchemaObject
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ajv.ajv/dist/types.ErrorObject<string, std.Record<string, any>, unknown>> */
trait PartialErrorObjectstringR extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var instancePath: js.UndefOr[String] = js.undefined
  
  var keyword: js.UndefOr[String] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var parentSchema: js.UndefOr[AnySchemaObject] = js.undefined
  
  var propertyName: js.UndefOr[String] = js.undefined
  
  var schema: js.UndefOr[Any] = js.undefined
  
  var schemaPath: js.UndefOr[String] = js.undefined
}
object PartialErrorObjectstringR {
  
  inline def apply(): PartialErrorObjectstringR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialErrorObjectstringR]
  }
  
  extension [Self <: PartialErrorObjectstringR](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setInstancePath(value: String): Self = StObject.set(x, "instancePath", value.asInstanceOf[js.Any])
    
    inline def setInstancePathUndefined: Self = StObject.set(x, "instancePath", js.undefined)
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "keyword", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParentSchema(value: AnySchemaObject): Self = StObject.set(x, "parentSchema", value.asInstanceOf[js.Any])
    
    inline def setParentSchemaUndefined: Self = StObject.set(x, "parentSchema", js.undefined)
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    
    inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
    
    inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
