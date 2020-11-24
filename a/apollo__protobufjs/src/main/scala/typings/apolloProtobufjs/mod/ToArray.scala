package typings.apolloProtobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToArray[T] extends js.Object {
  
  def toArray(): js.Array[T] = js.native
}
object ToArray {
  
  @scala.inline
  def apply[T](toArray: () => js.Array[T]): ToArray[T] = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction0(toArray))
    __obj.asInstanceOf[ToArray[T]]
  }
  
  @scala.inline
  implicit class ToArrayOps[Self <: ToArray[_], T] (val x: Self with ToArray[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToArray(value: () => js.Array[T]): Self = this.set("toArray", js.Any.fromFunction0(value))
  }
}
