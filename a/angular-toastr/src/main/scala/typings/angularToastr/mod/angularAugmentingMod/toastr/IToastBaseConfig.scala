package typings.angularToastr.mod.angularAugmentingMod.toastr

import typings.angularToastr.AnonProgressbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastBaseConfig extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var closeButton: js.UndefOr[Boolean] = js.undefined
  var closeHtml: js.UndefOr[String] = js.undefined
  var extendedTimeOut: js.UndefOr[Double] = js.undefined
  var extraData: js.UndefOr[js.Any] = js.undefined
  var messageClass: js.UndefOr[String] = js.undefined
  var onHidden: js.UndefOr[js.Function2[/* wasClicked */ Boolean, /* toast */ IToast, Unit]] = js.undefined
  var onShown: js.UndefOr[js.Function1[/* toast */ IToast, Unit]] = js.undefined
  var onTap: js.UndefOr[js.Function1[/* toast */ IToast, Unit]] = js.undefined
  var progressBar: js.UndefOr[Boolean] = js.undefined
  var tapToDismiss: js.UndefOr[Boolean] = js.undefined
  var templates: js.UndefOr[AnonProgressbar] = js.undefined
  var timeOut: js.UndefOr[Double] = js.undefined
  var titleClass: js.UndefOr[String] = js.undefined
  var toastClass: js.UndefOr[String] = js.undefined
}

object IToastBaseConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    closeButton: js.UndefOr[Boolean] = js.undefined,
    closeHtml: String = null,
    extendedTimeOut: Int | Double = null,
    extraData: js.Any = null,
    messageClass: String = null,
    onHidden: (/* wasClicked */ Boolean, /* toast */ IToast) => Unit = null,
    onShown: /* toast */ IToast => Unit = null,
    onTap: /* toast */ IToast => Unit = null,
    progressBar: js.UndefOr[Boolean] = js.undefined,
    tapToDismiss: js.UndefOr[Boolean] = js.undefined,
    templates: AnonProgressbar = null,
    timeOut: Int | Double = null,
    titleClass: String = null,
    toastClass: String = null
  ): IToastBaseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.asInstanceOf[js.Any])
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton.asInstanceOf[js.Any])
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml.asInstanceOf[js.Any])
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (messageClass != null) __obj.updateDynamic("messageClass")(messageClass.asInstanceOf[js.Any])
    if (onHidden != null) __obj.updateDynamic("onHidden")(js.Any.fromFunction2(onHidden))
    if (onShown != null) __obj.updateDynamic("onShown")(js.Any.fromFunction1(onShown))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (!js.isUndefined(progressBar)) __obj.updateDynamic("progressBar")(progressBar.asInstanceOf[js.Any])
    if (!js.isUndefined(tapToDismiss)) __obj.updateDynamic("tapToDismiss")(tapToDismiss.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (timeOut != null) __obj.updateDynamic("timeOut")(timeOut.asInstanceOf[js.Any])
    if (titleClass != null) __obj.updateDynamic("titleClass")(titleClass.asInstanceOf[js.Any])
    if (toastClass != null) __obj.updateDynamic("toastClass")(toastClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToastBaseConfig]
  }
}

