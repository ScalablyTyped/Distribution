package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToast extends js.Object {
  
  var el: IAugmentedJQuery = js.native
  
  var iconClass: String = js.native
  
  var isOpened: Boolean = js.native
  
  var open: IPromise[_] = js.native
  
  var scope: IToastScope = js.native
  
  var toastId: Double = js.native
}
object IToast {
  
  @scala.inline
  def apply(
    el: IAugmentedJQuery,
    iconClass: String,
    isOpened: Boolean,
    open: IPromise[_],
    scope: IToastScope,
    toastId: Double
  ): IToast = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], isOpened = isOpened.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], toastId = toastId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToast]
  }
  
  @scala.inline
  implicit class IToastOps[Self <: IToast] (val x: Self) extends AnyVal {
    
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
    def setEl(value: IAugmentedJQuery): Self = this.set("el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOpened(value: Boolean): Self = this.set("isOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: IPromise[_]): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: IToastScope): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToastId(value: Double): Self = this.set("toastId", value.asInstanceOf[js.Any])
  }
}
