package typings
package angularDashToastrLib.angularDashToastrMod.angularMod.toastrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastConfig extends IToastBaseConfig {
  var iconClasses: js.UndefOr[angularDashToastrLib.Anon_Error] = js.undefined
}

object IToastConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeHtml: java.lang.String = null,
    extendedTimeOut: scala.Int | scala.Double = null,
    extraData: js.Any = null,
    iconClasses: angularDashToastrLib.Anon_Error = null,
    messageClass: java.lang.String = null,
    onHidden: js.Function2[/* wasClicked */ scala.Boolean, /* toast */ IToast, scala.Unit] = null,
    onShown: js.Function1[/* toast */ IToast, scala.Unit] = null,
    onTap: js.Function1[/* toast */ IToast, scala.Unit] = null,
    progressBar: js.UndefOr[scala.Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined,
    templates: angularDashToastrLib.Anon_Progressbar = null,
    timeOut: scala.Int | scala.Double = null,
    titleClass: java.lang.String = null,
    toastClass: java.lang.String = null
  ): IToastConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
    if (iconClasses != null) __obj.updateDynamic("iconClasses")(iconClasses)
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass)
    if (onHidden != null) __obj.updateDynamic("onHidden")(onHidden)
    if (onShown != null) __obj.updateDynamic("onShown")(onShown)
    if (onTap != null) __obj.updateDynamic("onTap")(onTap)
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar)
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass)
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass)
    __obj.asInstanceOf[IToastConfig]
  }
}

