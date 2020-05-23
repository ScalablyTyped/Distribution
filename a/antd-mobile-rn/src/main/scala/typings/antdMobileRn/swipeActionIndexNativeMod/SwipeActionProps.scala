package typings.antdMobileRn.swipeActionIndexNativeMod

import typings.antdMobileRn.anon.ClassName
import typings.antdMobileRn.swipeActionPropsTypeMod.SwipeActionPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionProps extends SwipeActionPropsType[TextStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object SwipeActionProps {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[ClassName[TextStyle]] = null,
    onClose: () => Unit = null,
    onOpen: () => Unit = null,
    right: js.Array[ClassName[TextStyle]] = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: js.Any = null,
    title: String = null
  ): SwipeActionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeActionProps]
  }
}

