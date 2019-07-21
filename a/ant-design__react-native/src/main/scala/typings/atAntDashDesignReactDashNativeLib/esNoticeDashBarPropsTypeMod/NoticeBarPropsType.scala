package typings
package atAntDashDesignReactDashNativeLib.esNoticeDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeBarPropsType extends js.Object {
  var action: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactElement] = js.undefined
  var mode: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.closable | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.link
  ] = js.undefined
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object NoticeBarPropsType {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactElement = null,
    icon: reactLib.reactMod.ReactElement = null,
    mode: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.closable | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.link = null,
    onPress: () => scala.Unit = null
  ): NoticeBarPropsType = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[NoticeBarPropsType]
  }
}

