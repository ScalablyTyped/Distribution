package typings.agGrid.floatingFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseFloatingFilterChange[M] extends FloatingFilterChange {
  
  @JSName("apply")
  var apply: Boolean = js.native
  
  var model: M = js.native
}
object BaseFloatingFilterChange {
  
  @scala.inline
  def apply[M](apply: Boolean, model: M): BaseFloatingFilterChange[M] = {
    val __obj = js.Dynamic.literal(apply = apply.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseFloatingFilterChange[M]]
  }
  
  @scala.inline
  implicit class BaseFloatingFilterChangeOps[Self <: BaseFloatingFilterChange[_], M] (val x: Self with BaseFloatingFilterChange[M]) extends AnyVal {
    
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
    def setApply(value: Boolean): Self = this.set("apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: M): Self = this.set("model", value.asInstanceOf[js.Any])
  }
}
