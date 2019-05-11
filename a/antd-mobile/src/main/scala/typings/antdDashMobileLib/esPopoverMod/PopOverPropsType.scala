package typings
package antdDashMobileLib.esPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverPropsType
  extends antdDashMobileLib.esPopoverPropsTypeMod.PopoverPropsType {
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var placement: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.right | antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.bottom | antdDashMobileLib.antdDashMobileLibStrings.topLeft | antdDashMobileLib.antdDashMobileLibStrings.topRight | antdDashMobileLib.antdDashMobileLibStrings.bottomLeft | antdDashMobileLib.antdDashMobileLibStrings.bottomRight
  ] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object PopOverPropsType {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNode,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    onSelect: (/* node */ js.Any, /* index */ js.UndefOr[scala.Double]) => scala.Unit = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    placement: antdDashMobileLib.antdDashMobileLibStrings.left | antdDashMobileLib.antdDashMobileLibStrings.right | antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.bottom | antdDashMobileLib.antdDashMobileLibStrings.topLeft | antdDashMobileLib.antdDashMobileLibStrings.topRight | antdDashMobileLib.antdDashMobileLibStrings.bottomLeft | antdDashMobileLib.antdDashMobileLibStrings.bottomRight = null,
    prefixCls: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): PopOverPropsType = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2(onSelect))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PopOverPropsType]
  }
}

