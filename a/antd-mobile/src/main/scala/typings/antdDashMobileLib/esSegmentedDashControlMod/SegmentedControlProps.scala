package typings
package antdDashMobileLib.esSegmentedDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentedControlProps
  extends antdDashMobileLib.esSegmentedDashControlPropsTypeMod.SegmentedControlPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object SegmentedControlProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    onChange: /* e */ js.Any => scala.Unit = null,
    onValueChange: /* value */ java.lang.String => scala.Unit = null,
    prefixCls: java.lang.String = null,
    selectedIndex: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    tintColor: java.lang.String = null,
    values: js.Array[java.lang.String] = null
  ): SegmentedControlProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SegmentedControlProps]
  }
}

