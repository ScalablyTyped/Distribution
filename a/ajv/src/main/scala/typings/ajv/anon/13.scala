package typings.ajv.anon

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[T, D /* <: Record[String, Any] */] extends StObject {
  
  var optionalProperties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in ajv.ajv/dist/types/jtd-schema.OptionalKeys<T> ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<std.Exclude<T[K], undefined>, D>}
    */ typings.ajv.ajvStrings.`13` & TopLevel[T]
}
object `13` {
  
  inline def apply[T, D /* <: Record[String, Any] */](
    optionalProperties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in ajv.ajv/dist/types/jtd-schema.OptionalKeys<T> ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<std.Exclude<T[K], undefined>, D>}
    */ typings.ajv.ajvStrings.`13` & TopLevel[T]
  ): `13`[T, D] = {
    val __obj = js.Dynamic.literal(optionalProperties = optionalProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`[T, D]]
  }
  
  extension [Self <: `13`[?, ?], T, D /* <: Record[String, Any] */](x: Self & (`13`[T, D])) {
    
    inline def setOptionalProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ajv.ajv/dist/types/jtd-schema.OptionalKeys<T> ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<std.Exclude<T[K], undefined>, D>}
      */ typings.ajv.ajvStrings.`13` & TopLevel[T]
    ): Self = StObject.set(x, "optionalProperties", value.asInstanceOf[js.Any])
  }
}
