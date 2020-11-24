package typings.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoOp extends js.Object {
  
  def end(): Unit = js.native
  
  def params(types: String*): NoOp = js.native
}
object NoOp {
  
  @scala.inline
  def apply(end: () => Unit, params: /* repeated */ String => NoOp): NoOp = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), params = js.Any.fromFunction1(params))
    __obj.asInstanceOf[NoOp]
  }
  
  @scala.inline
  implicit class NoOpOps[Self <: NoOp] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParams(value: /* repeated */ String => NoOp): Self = this.set("params", js.Any.fromFunction1(value))
  }
}
