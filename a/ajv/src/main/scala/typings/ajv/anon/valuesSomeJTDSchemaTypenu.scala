package typings.ajv.anon

import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  values :ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType} & {  nullable :boolean | undefined,   metadata :std.Record<string, unknown> | undefined,   definitions :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined} */
trait valuesSomeJTDSchemaTypenu extends StObject {
  
  var definitions: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var values: SomeJTDSchemaType
}
object valuesSomeJTDSchemaTypenu {
  
  inline def apply(values: SomeJTDSchemaType): valuesSomeJTDSchemaTypenu = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[valuesSomeJTDSchemaTypenu]
  }
  
  extension [Self <: valuesSomeJTDSchemaTypenu](x: Self) {
    
    inline def setDefinitions(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setValues(value: SomeJTDSchemaType): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
