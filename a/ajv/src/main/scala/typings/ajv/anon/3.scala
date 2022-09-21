package typings.ajv.anon

import typings.ajv.jsonSchemaMod.UncheckedRequiredMembers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[T] extends StObject {
  
  var required: js.UndefOr[js.Array[UncheckedRequiredMembers[T]]] = js.undefined
}
object `3` {
  
  inline def apply[T](): `3`[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`3`[T]]
  }
  
  extension [Self <: `3`[?], T](x: Self & `3`[T]) {
    
    inline def setRequired(value: js.Array[UncheckedRequiredMembers[T]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRequiredVarargs(value: UncheckedRequiredMembers[T]*): Self = StObject.set(x, "required", js.Array(value*))
  }
}
