package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeakRef[T /* <: js.Object */] extends StObject {
  
  def deref(): js.UndefOr[T]
}
object WeakRef {
  
  inline def apply[T /* <: js.Object */](deref: () => js.UndefOr[T]): WeakRef[T] = {
    val __obj = js.Dynamic.literal(deref = js.Any.fromFunction0(deref))
    __obj.asInstanceOf[WeakRef[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WeakRef[?], T /* <: js.Object */] (val x: Self & WeakRef[T]) extends AnyVal {
    
    inline def setDeref(value: () => js.UndefOr[T]): Self = StObject.set(x, "deref", js.Any.fromFunction0(value))
  }
}
