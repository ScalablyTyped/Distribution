package typings.antdDashMobile.esMenuPropsTypeMod

import typings.antdDashMobile.antdDashMobileNumbers.`1`
import typings.antdDashMobile.antdDashMobileNumbers.`2`
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuProps extends js.Object {
  var MenuSelectContanerPrefixCls: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Array[DataItem]] = js.undefined
  var defaultValue: js.UndefOr[ValueType] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[`1` | `2`] = js.undefined
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  var multiSelectMenuBtnsCls: js.UndefOr[String] = js.undefined
  var onCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* value */ js.UndefOr[ValueType], Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var radioPrefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuPrefixCls: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[ValueType] = js.undefined
}

object MenuProps {
  @scala.inline
  def apply(
    MenuSelectContanerPrefixCls: String = null,
    className: String = null,
    data: js.Array[DataItem] = null,
    defaultValue: ValueType = null,
    height: Int | Double = null,
    level: `1` | `2` = null,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    multiSelectMenuBtnsCls: String = null,
    onCancel: () => Unit = null,
    onChange: /* value */ js.UndefOr[ValueType] => Unit = null,
    onOk: /* value */ js.UndefOr[ValueType] => Unit = null,
    prefixCls: String = null,
    radioPrefixCls: String = null,
    style: CSSProperties = null,
    subMenuPrefixCls: String = null,
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

