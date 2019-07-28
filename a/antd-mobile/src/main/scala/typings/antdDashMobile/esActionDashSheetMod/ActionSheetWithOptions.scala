package typings.antdDashMobile.esActionDashSheetMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSheetWithOptions extends ActionSheetOptions {
  var badges: js.UndefOr[js.Array[BadgesOption]] = js.undefined
  var options: js.Array[String]
}

object ActionSheetWithOptions {
  @scala.inline
  def apply(
    options: js.Array[String],
    badges: js.Array[BadgesOption] = null,
    cancelButtonIndex: Int | Double = null,
    className: String = null,
    destructiveButtonIndex: Int | Double = null,
    maskClosable: js.UndefOr[Boolean] = js.undefined,
    maskTransitionName: String = null,
    message: ReactNode = null,
    title: ReactNode = null,
    transitionName: String = null
  ): ActionSheetWithOptions = {
    val __obj = js.Dynamic.literal(options = options)
    if (badges != null) __obj.updateDynamic("badges")(badges)
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[ActionSheetWithOptions]
  }
}

