package typings.antDesignProProvider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Prev extends js.Object {
  
  var next: String = js.native
  
  var prev: String = js.native
  
  var submit: String = js.native
}
object Prev {
  
  @scala.inline
  def apply(next: String, prev: String, submit: String): Prev = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prev]
  }
  
  @scala.inline
  implicit class PrevOps[Self <: Prev] (val x: Self) extends AnyVal {
    
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
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrev(value: String): Self = this.set("prev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmit(value: String): Self = this.set("submit", value.asInstanceOf[js.Any])
  }
}
