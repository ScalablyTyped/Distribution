package typings.angularDashToastr.angularDashToastrMod.angularMod.toastr

import typings.angularDashToastr.Anon_Error
import typings.angularDashToastr.Anon_Progressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastConfig
  extends typings.angularDashToastr.angularDashToastrMod.angularMod.toastr.IToastBaseConfig {
  var iconClasses: js.UndefOr[Anon_Error] = js.undefined
}

object IToastConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeHtml: String = null,
    extendedTimeOut: Int | Double = null,
    extraData: js.Any = null,
    iconClasses: Anon_Error = null,
    messageClass: String = null,
    onHidden: (/* wasClicked */ Boolean, /* toast */ typings.angularDashToastr.angularDashToastrMod.angularMod.toastr.IToast) => Unit = null,
    onShown: /* toast */ typings.angularDashToastr.angularDashToastrMod.angularMod.toastr.IToast => Unit = null,
    onTap: /* toast */ typings.angularDashToastr.angularDashToastrMod.angularMod.toastr.IToast => Unit = null,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    templates: Anon_Progressbar = null,
    timeOut: Int | Double = null,
    titleClass: String = null,
    toastClass: String = null
  ): IToastConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (iconClasses != null) __obj.updateDynamic("iconClasses")(iconClasses)
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass)
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass)
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass)
    __obj.asInstanceOf[IToastConfig]
  }
}

