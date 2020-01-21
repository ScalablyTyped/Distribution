package typings.antDesignReactNative.noticeBarPropsTypeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.closable
import typings.antDesignReactNative.antDesignReactNativeStrings.link
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeBarPropsType extends js.Object {
  var action: js.UndefOr[ReactElement] = js.undefined
  var icon: js.UndefOr[ReactElement] = js.undefined
  var mode: js.UndefOr[closable | link] = js.undefined
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object NoticeBarPropsType {
  @scala.inline
  def apply(
    action: ReactElement = null,
    icon: ReactElement = null,
    mode: closable | link = null,
    onPress: () => Unit = null
  ): NoticeBarPropsType = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[NoticeBarPropsType]
  }
}

