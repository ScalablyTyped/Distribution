package typings
package angularDashToastrLib.angularDashToastrMod.angularMod.toastrNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToastBaseConfig extends js.Object {
  var allowHtml: js.UndefOr[scala.Boolean] = js.undefined
  var closeButton: js.UndefOr[scala.Boolean] = js.undefined
  var closeHtml: js.UndefOr[java.lang.String] = js.undefined
  var extendedTimeOut: js.UndefOr[scala.Double] = js.undefined
  var extraData: js.UndefOr[js.Any] = js.undefined
  var messageClass: js.UndefOr[java.lang.String] = js.undefined
  var onHidden: js.UndefOr[js.Function2[/* wasClicked */ scala.Boolean, /* toast */ IToast, scala.Unit]] = js.undefined
  var onShown: js.UndefOr[js.Function1[/* toast */ IToast, scala.Unit]] = js.undefined
  var onTap: js.UndefOr[js.Function1[/* toast */ IToast, scala.Unit]] = js.undefined
  var progressBar: js.UndefOr[scala.Boolean] = js.undefined
  var tapToDismiss: js.UndefOr[scala.Boolean] = js.undefined
  var templates: js.UndefOr[angularDashToastrLib.Anon_Progressbar] = js.undefined
  var timeOut: js.UndefOr[scala.Double] = js.undefined
  var titleClass: js.UndefOr[java.lang.String] = js.undefined
  var toastClass: js.UndefOr[java.lang.String] = js.undefined
}

object IToastBaseConfig {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[scala.Boolean] = js.undefined,
    closeButton: js.UndefOr[scala.Boolean] = js.undefined,
    closeHtml: java.lang.String = null,
    extendedTimeOut: scala.Int | scala.Double = null,
    extraData: js.Any = null,
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
  ): IToastBaseConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(closeButton)) __obj.updateDynamic("closeButton")(closeButton)
    if (closeHtml != null) __obj.updateDynamic("closeHtml")(closeHtml)
    if (extendedTimeOut != null) __obj.updateDynamic("extendedTimeOut")(extendedTimeOut.asInstanceOf[js.Any])
    if (extraData != null) __obj.updateDynamic("extraData")(extraData)
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
    __obj.asInstanceOf[IToastBaseConfig]
  }
}

