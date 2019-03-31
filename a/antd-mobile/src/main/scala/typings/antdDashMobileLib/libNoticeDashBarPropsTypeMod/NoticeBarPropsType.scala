package typings
package antdDashMobileLib.libNoticeDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeBarPropsType extends js.Object {
  var action: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  var mode: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.closable | antdDashMobileLib.antdDashMobileLibStrings.link
  ] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object NoticeBarPropsType {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    icon: reactLib.reactMod.ReactNs.ReactElement[_] = null,
    mode: antdDashMobileLib.antdDashMobileLibStrings.closable | antdDashMobileLib.antdDashMobileLibStrings.link = null,
    onClick: () => scala.Unit = null
  ): NoticeBarPropsType = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[NoticeBarPropsType]
  }
}

