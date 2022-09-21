package typings.ajv.anon

import typings.ajv.jsonSchemaMod.UncheckedRequiredMembers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredReadonly[T] extends StObject {
  
  var required: js.Array[UncheckedRequiredMembers[T]]
}
object RequiredReadonly {
  
  inline def apply[T](required: js.Array[UncheckedRequiredMembers[T]]): RequiredReadonly[T] = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredReadonly[T]]
  }
  
  extension [Self <: RequiredReadonly[?], T](x: Self & RequiredReadonly[T]) {
    
    inline def setRequired(value: js.Array[UncheckedRequiredMembers[T]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredVarargs(value: UncheckedRequiredMembers[T]*): Self = StObject.set(x, "required", js.Array(value*))
  }
}
