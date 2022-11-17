package typings.ajv.anon

import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  discriminator :string,   mapping :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType>} & {  nullable :boolean | undefined,   metadata :std.Record<string, unknown> | undefined,   definitions :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined} */
trait discriminatorstringmappin extends StObject {
  
  var definitions: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
  
  var discriminator: String
  
  var mapping: Record[String, SomeJTDSchemaType]
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
}
object discriminatorstringmappin {
  
  inline def apply(discriminator: String, mapping: Record[String, SomeJTDSchemaType]): discriminatorstringmappin = {
    val __obj = js.Dynamic.literal(discriminator = discriminator.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[discriminatorstringmappin]
  }
  
  extension [Self <: discriminatorstringmappin](x: Self) {
    
    inline def setDefinitions(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setDiscriminator(value: String): Self = StObject.set(x, "discriminator", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
  }
}
