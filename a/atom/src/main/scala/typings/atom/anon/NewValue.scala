package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue[T] extends StObject {
  
  var newValue: T
  
  var oldValue: T
}
object NewValue {
  
  inline def apply[T](newValue: T, oldValue: T): NewValue[T] = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewValue[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewValue[?], T] (val x: Self & NewValue[T]) extends AnyVal {
    
    inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
  }
}
