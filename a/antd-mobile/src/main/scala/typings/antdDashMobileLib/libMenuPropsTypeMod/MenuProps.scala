package typings
package antdDashMobileLib.libMenuPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var MenuSelectContanerPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[DataItem]] = js.undefined
  var defaultValue: js.UndefOr[ValueType] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibNumbers.`1` | antdDashMobileLib.antdDashMobileLibNumbers.`2`
  ] = js.undefined
  var multiSelect: js.UndefOr[scala.Boolean] = js.undefined
  var multiSelectMenuBtnsCls: js.UndefOr[java.lang.String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], scala.Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var radioPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var subMenuPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[ValueType] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: java.lang.String = null,
    className: java.lang.String = null,
    data: js.Array[DataItem] = null,
    defaultValue: ValueType = null,
    height: scala.Int | scala.Double = null,
    level: antdDashMobileLib.antdDashMobileLibNumbers.`1` | antdDashMobileLib.antdDashMobileLibNumbers.`2` = null,
    multiSelect: js.UndefOr[scala.Boolean] = js.undefined,
    multiSelectMenuBtnsCls: java.lang.String = null,
    onCancel: () => scala.Unit = null,
    onChange: /* value */ js.UndefOr[ValueType] => scala.Unit = null,
    onOk: /* value */ js.UndefOr[ValueType] => scala.Unit = null,
    prefixCls: java.lang.String = null,
    radioPrefixCls: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    subMenuPrefixCls: java.lang.String = null,
    value: ValueType = null
  ): MenuProps = {
    val __obj = js.Dynamic.literal()
    if (MenuSelectContanerPrefixCls != null) __obj.updateDynamic("MenuSelectContanerPrefixCls")(MenuSelectContanerPrefixCls)
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect)
    if (multiSelectMenuBtnsCls != null) __obj.updateDynamic("multiSelectMenuBtnsCls")(multiSelectMenuBtnsCls)
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1(onOk))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (radioPrefixCls != null) __obj.updateDynamic("radioPrefixCls")(radioPrefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (subMenuPrefixCls != null) __obj.updateDynamic("subMenuPrefixCls")(subMenuPrefixCls)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[MenuProps]
  }
}

