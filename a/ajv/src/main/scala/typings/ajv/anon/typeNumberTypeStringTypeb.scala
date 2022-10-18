package typings.ajv.anon

import typings.ajv.ajvStrings.boolean
import typings.ajv.distTypesJtdSchemaMod.NumberType
import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.ajv.distTypesJtdSchemaMod.StringType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :ajv.ajv/dist/types/jtd-schema.NumberType | ajv.ajv/dist/types/jtd-schema.StringType | 'boolean'} & {  nullable :boolean | undefined,   metadata :std.Record<string, unknown> | undefined,   definitions :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined} */
trait typeNumberTypeStringTypeb
  extends StObject
     with SomeJTDSchemaType {
  
  var definitions: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var `type`: NumberType | StringType | boolean
}
object typeNumberTypeStringTypeb {
  
  inline def apply(`type`: NumberType | StringType | boolean): typeNumberTypeStringTypeb = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeNumberTypeStringTypeb]
  }
  
  extension [Self <: typeNumberTypeStringTypeb](x: Self) {
    
    inline def setDefinitions(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setType(value: NumberType | StringType | boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
