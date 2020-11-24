package typings.aureliaTemplating.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicComponentGetViewStrategy extends js.Object {
  
  /**
    * Implement this hook if you want to provide custom view strategy when this component is used with the compose element or the router.
    */
  def getViewStrategy(): String | ViewStrategy_ = js.native
}
object DynamicComponentGetViewStrategy {
  
  @scala.inline
  def apply(getViewStrategy: () => String | ViewStrategy_): DynamicComponentGetViewStrategy = {
    val __obj = js.Dynamic.literal(getViewStrategy = js.Any.fromFunction0(getViewStrategy))
    __obj.asInstanceOf[DynamicComponentGetViewStrategy]
  }
  
  @scala.inline
  implicit class DynamicComponentGetViewStrategyOps[Self <: DynamicComponentGetViewStrategy] (val x: Self) extends AnyVal {
    
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
    def setGetViewStrategy(value: () => String | ViewStrategy_): Self = this.set("getViewStrategy", js.Any.fromFunction0(value))
  }
}
