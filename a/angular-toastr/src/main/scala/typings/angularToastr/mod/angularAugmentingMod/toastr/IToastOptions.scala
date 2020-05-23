package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angularToastr.anon.Progressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastOptions extends IToastBaseConfig {
  var iconClass: js.UndefOr[String] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object IToastOptions {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeHtml: String = null,
    extendedTimeOut: js.UndefOr[Double] = js.undefined,
    extraData: js.Any = null,
    iconClass: String = null,
    messageClass: String = null,
    onHidden: (/* wasClicked */ Boolean, /* toast */ IToast) => Unit = null,
    onShown: /* toast */ IToast => Unit = null,
    onTap: /* toast */ IToast => Unit = null,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    target: String = null,
    templates: Progressbar = null,
    timeOut: js.UndefOr[Double] = js.undefined,
    titleClass: String = null,
    toastClass: String = null
  ): IToastOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.get.asInstanceOf[js.Any])
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(extendedTimeOut)) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.get.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (!js.isUndefined(timeOut)) __obj.updateDynamic("timeOut")(timeOut.get.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass.asInstanceOf[js.Any])
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastOptions]
  }
}

