package typings
package antdDashMobileLib.libSwipeDashActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeActionProps
  extends antdDashMobileLib.libSwipeDashActionPropsTypeMod.SwipeActionPropsType[reactLib.reactMod.CSSProperties] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SwipeActionProps {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Array[antdDashMobileLib.Anon_ClassNameOnPress[reactLib.reactMod.CSSProperties]] = null,
    onClose: () => scala.Unit = null,
    onOpen: () => scala.Unit = null,
    prefixCls: java.lang.String = null,
    right: js.Array[antdDashMobileLib.Anon_ClassNameOnPress[reactLib.reactMod.CSSProperties]] = null,
    style: reactLib.reactMod.CSSProperties = null,
    title: java.lang.String = null
  ): SwipeActionProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (left != null) __obj.updateDynamic("left")(left)
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction0(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction0(onOpen))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (right != null) __obj.updateDynamic("right")(right)
    if (style != null) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SwipeActionProps]
  }
}

