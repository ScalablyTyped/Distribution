package typings.ajv.anon

import typings.ajv.typesJtdSchemaMod.JTDSchemaType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementsJTDSchemaType[D /* <: Record[String, Any] */] extends StObject {
  
  var elements: JTDSchemaType[Any, D]
}
object ElementsJTDSchemaType {
  
  inline def apply[D /* <: Record[String, Any] */](elements: JTDSchemaType[Any, D]): ElementsJTDSchemaType[D] = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsJTDSchemaType[D]]
  }
  
  extension [Self <: ElementsJTDSchemaType[?], D /* <: Record[String, Any] */](x: Self & ElementsJTDSchemaType[D]) {
    
    inline def setElements(value: JTDSchemaType[Any, D]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
  }
}
