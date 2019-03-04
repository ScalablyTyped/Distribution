package typings
package angularDashToastrLib.angularDashToastrMod.angularMod.toastrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToast extends js.Object {
  var el: angularLib.angularMod.angularNs.IAugmentedJQuery
  var iconClass: java.lang.String
  var isOpened: scala.Boolean
  var open: angularLib.angularMod.angularNs.IPromise[_]
  var scope: IToastScope
  var toastId: scala.Double
}

object IToast {
  @scala.inline
  def apply(
    el: angularLib.angularMod.angularNs.IAugmentedJQuery,
    iconClass: java.lang.String,
    isOpened: scala.Boolean,
    open: angularLib.angularMod.angularNs.IPromise[_],
    scope: IToastScope,
    toastId: scala.Double
  ): IToast = {
    val __obj = js.Dynamic.literal(el = el, iconClass = iconClass, isOpened = isOpened, open = open, scope = scope, toastId = toastId)
  
    __obj.asInstanceOf[IToast]
  }
}

