package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tuple, or pair.
  *
  * This structure allows for conveniently packing together two values of any type, and could be useful as the result type of methods.
  * @since OOo 3.0
  */
@js.native
trait Pair[T, U] extends js.Object {
  
  var First: T = js.native
  
  var Second: U = js.native
}
object Pair {
  
  @scala.inline
  def apply[T, U](First: T, Second: U): Pair[T, U] = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair[T, U]]
  }
  
  @scala.inline
  implicit class PairOps[Self <: Pair[_, _], T, U] (val x: Self with (Pair[T, U])) extends AnyVal {
    
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
    def setFirst(value: T): Self = this.set("First", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecond(value: U): Self = this.set("Second", value.asInstanceOf[js.Any])
  }
}
