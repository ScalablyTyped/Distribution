package typings.angularTouchspin.mod.angularTouchspin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITouchSpinConfigProvider extends js.Object {
  
  def defaults(touchSpinOptions: ITouchSpinOptions): Unit = js.native
}
object ITouchSpinConfigProvider {
  
  @scala.inline
  def apply(defaults: ITouchSpinOptions => Unit): ITouchSpinConfigProvider = {
    val __obj = js.Dynamic.literal(defaults = js.Any.fromFunction1(defaults))
    __obj.asInstanceOf[ITouchSpinConfigProvider]
  }
  
  @scala.inline
  implicit class ITouchSpinConfigProviderOps[Self <: ITouchSpinConfigProvider] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: ITouchSpinOptions => Unit): Self = this.set("defaults", js.Any.fromFunction1(value))
  }
}
