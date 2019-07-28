package typings.angularDashToastr.angularDashToastrMod.angularMod.toastrNs

import typings.angularDashToastr.Anon_Error
import typings.angularDashToastr.Anon_Progressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastrConfig
  extends typings.angularDashToastr.angularDashToastrMod.angularMod.toastrNs.IToastConfig
     with typings.angularDashToastr.angularDashToastrMod.angularMod.toastrNs.IToastContainerConfig

object IToastrConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    autoDismiss: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeHtml: String = null,
    containerId: String = null,
    extendedTimeOut: Int | Double = null,
    extraData: js.Any = null,
    iconClasses: Anon_Error = null,
    maxOpened: Int | Double = null,
    messageClass: String = null,
    newestOnTop: js.UndefOr[Boolean] = js.undefined,
    onHidden: (/* wasClicked */ Boolean, /* toast */ typings.angularDashToastr.angularDashToastrMod.angularMod.toastrNs.IToast) => Unit = null,
    onShown: /* toast */ typings.angularDashToastr.angularDashToastrMod.angularMod.toastrNs.IToast => Unit = null,
    onTap: /* toast */ typings.angularDashToastr.angularDashToastrMod.angularMod.toastrNs.IToast => Unit = null,
    positionClass: String = null,
    preventDuplicates: js.UndefOr[Boolean] = js.undefined,
    preventOpenDuplicates: js.UndefOr[Boolean] = js.undefined,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    templates: Anon_Progressbar = null,
    timeOut: Int | Double = null,
    titleClass: String = null,
    toastClass: String = null
  ): IToastrConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(autoDismiss)) __obj.updateDynamic("autoDismiss")(autoDismiss)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (iconClasses != null) __obj.updateDynamic("iconClasses")(iconClasses)
    if (maxOpened != null) __obj.updateDynamic("maxOpened")(maxOpened.asInstanceOf[js.Any])
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass)
    if (!js.isUndefined(newestOnTop)) __obj.updateDynamic("newestOnTop")(newestOnTop)
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (positionClass != null) __obj.updateDynamic("positionClass")(positionClass)
    if (!js.isUndefined(preventDuplicates)) __obj.updateDynamic("preventDuplicates")(preventDuplicates)
    if (!js.isUndefined(preventOpenDuplicates)) __obj.updateDynamic("preventOpenDuplicates")(preventOpenDuplicates)
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss)
    if (target != null) __obj.updateDynamic("target")(target)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass)
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass)
    __obj.asInstanceOf[IToastrConfig]
  }
}

