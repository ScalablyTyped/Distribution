package typings.ajv.anon

import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  enum :std.Array<string>} & {  nullable :boolean | undefined,   metadata :std.Record<string, unknown> | undefined,   definitions :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined} */
trait enumArraystringnullablebo extends StObject {
  
  var definitions: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
  
  var `enum`: js.Array[String]
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
}
object enumArraystringnullablebo {
  
  inline def apply(`enum`: js.Array[String]): enumArraystringnullablebo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[enumArraystringnullablebo]
  }
  
  extension [Self <: enumArraystringnullablebo](x: Self) {
    
    inline def setDefinitions(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
  }
}
