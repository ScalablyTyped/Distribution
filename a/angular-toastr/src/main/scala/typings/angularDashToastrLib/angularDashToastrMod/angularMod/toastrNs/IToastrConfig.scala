package typings
package angularDashToastrLib.angularDashToastrMod.angularMod.toastrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastrConfig
  extends IToastConfig
     with IToastContainerConfig

object IToastrConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    autoDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeHtml: java.lang.String = null,
    containerId: java.lang.String = null,
    extendedTimeOut: scala.Int | scala.Double = null,
    extraData: js.Any = null,
    iconClasses: angularDashToastrLib.Anon_Error = null,
    maxOpened: scala.Int | scala.Double = null,
    messageClass: java.lang.String = null,
    newestOnTop: js.UndefOr[scala.Boolean] = js.undefined,
    onHidden: (/* wasClicked */ scala.Boolean, /* toast */ IToast) => scala.Unit = null,
    onShown: /* toast */ IToast => scala.Unit = null,
    onTap: /* toast */ IToast => scala.Unit = null,
    positionClass: java.lang.String = null,
    preventDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    preventOpenDuplicates: js.UndefOr[scala.Boolean] = js.undefined,
    progressBar: js.UndefOr[scala.Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String = null,
    templates: angularDashToastrLib.Anon_Progressbar = null,
    timeOut: scala.Int | scala.Double = null,
    titleClass: java.lang.String = null,
    toastClass: java.lang.String = null
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

