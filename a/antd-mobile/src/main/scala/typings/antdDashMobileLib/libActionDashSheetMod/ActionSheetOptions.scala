package typings
package antdDashMobileLib.libActionDashSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var cancelButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var destructiveButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var maskClosable: js.UndefOr[scala.Boolean] = js.undefined
  var maskTransitionName: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    cancelButtonIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    destructiveButtonIndex: scala.Int | scala.Double = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskTransitionName: java.lang.String = null,
    message: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null,
    transitionName: java.lang.String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

