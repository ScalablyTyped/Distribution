package typings.actionsOnGoogle.frameworkFrameworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Framework[THandler] extends js.Object {
  
  /** @public */
  def check(args: js.Any*): Boolean = js.native
  
  /** @public */
  def handle(base: StandardHandler): THandler = js.native
}
object Framework {
  
  @scala.inline
  def apply[THandler](check: /* repeated */ js.Any => Boolean, handle: StandardHandler => THandler): Framework[THandler] = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[Framework[THandler]]
  }
  
  @scala.inline
  implicit class FrameworkOps[Self <: Framework[_], THandler] (val x: Self with Framework[THandler]) extends AnyVal {
    
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
    def setCheck(value: /* repeated */ js.Any => Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandle(value: StandardHandler => THandler): Self = this.set("handle", js.Any.fromFunction1(value))
  }
}
