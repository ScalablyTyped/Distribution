package typings.ajv.anon

import typings.ajv.distTypesJtdSchemaMod.SomeJTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined // ref
{  ref :string} & {  nullable :boolean | undefined,   metadata :std.Record<string, unknown> | undefined,   definitions :std.Record<string, ajv.ajv/dist/types/jtd-schema.SomeJTDSchemaType> | undefined} */
trait refstringnullablebooleanu
  extends StObject
     with SomeJTDSchemaType {
  
  var definitions: js.UndefOr[Record[String, SomeJTDSchemaType]] = js.undefined
  
  var metadata: js.UndefOr[Record[String, Any]] = js.undefined
  
  var nullable: js.UndefOr[Boolean] = js.undefined
  
  var ref: String
}
object refstringnullablebooleanu {
  
  inline def apply(ref: String): refstringnullablebooleanu = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[refstringnullablebooleanu]
  }
  
  extension [Self <: refstringnullablebooleanu](x: Self) {
    
    inline def setDefinitions(value: Record[String, SomeJTDSchemaType]): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setMetadata(value: Record[String, Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setNullableUndefined: Self = StObject.set(x, "nullable", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
