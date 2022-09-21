package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullableType[T /* <: String */] extends StObject {
  
  var nullable: Boolean
  
  var `type`: T
}
object NullableType {
  
  inline def apply[T /* <: String */](nullable: Boolean, `type`: T): NullableType[T] = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullableType[T]]
  }
  
  extension [Self <: NullableType[?], T /* <: String */](x: Self & NullableType[T]) {
    
    inline def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
