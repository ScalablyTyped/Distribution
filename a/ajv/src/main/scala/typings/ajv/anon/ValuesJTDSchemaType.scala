package typings.ajv.anon

import typings.ajv.typesJtdSchemaMod.JTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValuesJTDSchemaType[D /* <: Record[String, Any] */] extends StObject {
  
  var values: JTDSchemaType[Any, D]
}
object ValuesJTDSchemaType {
  
  inline def apply[D /* <: Record[String, Any] */](values: JTDSchemaType[Any, D]): ValuesJTDSchemaType[D] = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValuesJTDSchemaType[D]]
  }
  
  extension [Self <: ValuesJTDSchemaType[?], D /* <: Record[String, Any] */](x: Self & ValuesJTDSchemaType[D]) {
    
    inline def setValues(value: JTDSchemaType[Any, D]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
  }
}
