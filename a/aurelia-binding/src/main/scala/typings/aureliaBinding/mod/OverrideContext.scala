package typings.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverrideContext extends js.Object {
  
  var bindingContext: js.Any = js.native
  
  var parentOverrideContext: js.UndefOr[OverrideContext] = js.native
}
object OverrideContext {
  
  @scala.inline
  def apply(bindingContext: js.Any): OverrideContext = {
    val __obj = js.Dynamic.literal(bindingContext = bindingContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideContext]
  }
  
  @scala.inline
  implicit class OverrideContextOps[Self <: OverrideContext] (val x: Self) extends AnyVal {
    
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
    def setBindingContext(value: js.Any): Self = this.set("bindingContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentOverrideContext(value: OverrideContext): Self = this.set("parentOverrideContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentOverrideContext: Self = this.set("parentOverrideContext", js.undefined)
  }
}
