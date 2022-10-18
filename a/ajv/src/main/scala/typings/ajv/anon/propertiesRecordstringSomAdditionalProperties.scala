package typings.ajv.anon

import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  properties :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined,   optionalProperties :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType>,   additionalProperties :boolean | undefined} & {  nullable :boolean | undefined,   metadata :std.Record<string, unknown> | undefined,   definitions :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined} */
trait propertiesRecordstringSomAdditionalProperties
  extends StObject
     with SomeJTDSchemaType {
  
  var additionalProperties: js.UndefOr[Boolean] = js.undefined
  
  var definitions: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var optionalProperties: Record[String, SomeJTDSchemaType]
  
  var properties: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
}
object propertiesRecordstringSomAdditionalProperties {
  
  inline def apply(optionalProperties: Record[String, SomeJTDSchemaType]): propertiesRecordstringSomAdditionalProperties = {
    val __obj = js.Dynamic.literal(optionalProperties = optionalProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[propertiesRecordstringSomAdditionalProperties]
  }
  
  extension [Self <: propertiesRecordstringSomAdditionalProperties](x: Self) {
    
    inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
    
    inline def setDefinitions(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setOptionalProperties(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "optionalProperties", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
