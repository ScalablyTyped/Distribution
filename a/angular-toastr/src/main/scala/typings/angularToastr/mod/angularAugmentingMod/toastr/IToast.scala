package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angular.mod.IAugmentedJQuery
import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToast extends js.Object {
  var el: IAugmentedJQuery
  var iconClass: String
  var isOpened: Boolean
  var open: IPromise[_]
  var scope: IToastScope
  var toastId: Double
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
}

