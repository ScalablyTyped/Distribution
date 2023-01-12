package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToArray[T] extends StObject {
  
  def toArray(): js.Array[T]
}
object ToArray {
  
  inline def apply[T](toArray: () => js.Array[T]): ToArray[T] = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ToArray[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToArray[?], T] (val x: Self & ToArray[T]) extends AnyVal {
    
    inline def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
