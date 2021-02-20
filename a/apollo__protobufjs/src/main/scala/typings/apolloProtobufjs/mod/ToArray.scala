package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToArray[T] extends StObject {
  
  def toArray(): js.Array[T] = js.native
}
object ToArray {
  
  @scala.inline
  def apply[T](toArray: () => js.Array[T]): ToArray[T] = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ToArray[T]]
  }
  
  @scala.inline
  implicit class ToArrayMutableBuilder[Self <: ToArray[_], T] (val x: Self with ToArray[T]) extends AnyVal {
    
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
  }
}
