package typings.ajv.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required[T] extends StObject {
  
  var required: js.Array[/* keyof T */ String]
}
object Required {
  
  inline def apply[T](required: js.Array[/* keyof T */ String]): Required[T] = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required[T]]
  }
  
  extension [Self <: Required[?], T](x: Self & Required[T]) {
    
    inline def setRequired(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "required", js.Array(value*))
  }
}
