package typings.antdMobile.actionSheetMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetOptions extends js.Object {
  var cancelButtonIndex: js.UndefOr[Double] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var destructiveButtonIndex: js.UndefOr[Double] = js.undefined
  var maskClosable: js.UndefOr[Boolean] = js.undefined
  var maskTransitionName: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
  var transitionName: js.UndefOr[String] = js.undefined
}

object ActionSheetOptions {
  @scala.inline
  def apply(
    cancelButtonIndex: js.UndefOr[Double] = js.undefined,
    className: String = null,
    destructiveButtonIndex: js.UndefOr[Double] = js.undefined,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    message: ReactNode = null,
    title: ReactNode = null,
    transitionName: String = null
  ): ActionSheetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancelButtonIndex)) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(destructiveButtonIndex)) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable.get.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSheetOptions]
  }
}

