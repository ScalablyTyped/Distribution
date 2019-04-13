package typings
package antdDashMobileLib.libActionDashSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareActionSheetWithOptions extends ActionSheetOptions {
  var badges: js.UndefOr[js.Array[BadgesOption]] = js.undefined
  var options: js.Array[ShareOption] | js.Array[js.Array[ShareOption]]
}

object ShareActionSheetWithOptions {
  @scala.inline
  def apply(
    options: js.Array[ShareOption] | js.Array[js.Array[ShareOption]],
    badges: js.Array[BadgesOption] = null,
    cancelButtonIndex: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    destructiveButtonIndex: scala.Int | scala.Double = null,
    maskClosable: js.UndefOr[scala.Boolean] = js.undefined,
    maskTransitionName: java.lang.String = null,
    message: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null,
    transitionName: java.lang.String = null
  ): ShareActionSheetWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (badges != null) __obj.updateDynamic("badges")(badges)
    if (cancelButtonIndex != null) __obj.updateDynamic("cancelButtonIndex")(cancelButtonIndex.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (destructiveButtonIndex != null) __obj.updateDynamic("destructiveButtonIndex")(destructiveButtonIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(maskClosable)) __obj.updateDynamic("maskClosable")(maskClosable)
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName)
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    __obj.asInstanceOf[ShareActionSheetWithOptions]
  }
}

