package typings.ajv.anon

import org.scalablytyped.runtime.TopLevel
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11`[T, D /* <: Record[String, Any] */] extends StObject {
  
  var properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in ajv.ajv/dist/types/jtd-schema.RequiredKeys<T> ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<T[K], D>}
    */ typings.ajv.ajvStrings.`11` & TopLevel[T]
}
object `11` {
  
  inline def apply[T, D /* <: Record[String, Any] */](
    properties: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in ajv.ajv/dist/types/jtd-schema.RequiredKeys<T> ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<T[K], D>}
    */ typings.ajv.ajvStrings.`11` & TopLevel[T]
  ): `11`[T, D] = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`[T, D]]
  }
  
  extension [Self <: `11`[?, ?], T, D /* <: Record[String, Any] */](x: Self & (`11`[T, D])) {
    
    inline def setProperties(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in ajv.ajv/dist/types/jtd-schema.RequiredKeys<T> ]: ajv.ajv/dist/types/jtd-schema.JTDSchemaType<T[K], D>}
      */ typings.ajv.ajvStrings.`11` & TopLevel[T]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
