package typings.antDesignReactNative.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  children ? :react.react.ReactNode}> & std.Readonly<@ant-design/react-native.@ant-design/react-native/lib/picker/PickerTypes.PickerProps> */
trait ReadonlychildrenReactNodeChildren extends js.Object {
  val children: js.UndefOr[ReactNode] = js.undefined
  val defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val indicatorClassName: js.UndefOr[String] = js.undefined
  val indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  val itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  val noAnimate: js.UndefOr[Boolean] = js.undefined
  val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  val selectedValue: js.UndefOr[js.Any] = js.undefined
  val style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ReadonlychildrenReactNodeChildren {
  @scala.inline
  def apply(
    children: ReactNode = null,
    defaultSelectedValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorClassName: String = null,
    indicatorStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    itemStyle: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    noAnimate: js.UndefOr[Boolean] = js.undefined,
    onScrollChange: /* value */ js.Any => Unit = null,
    onValueChange: /* value */ js.Any => Unit = null,
    selectedValue: js.Any = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined
  ): ReadonlychildrenReactNodeChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (defaultSelectedValue != null) __obj.updateDynamic("defaultSelectedValue")(defaultSelectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (indicatorClassName != null) __obj.updateDynamic("indicatorClassName")(indicatorClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(indicatorStyle)) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(itemStyle)) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimate)) __obj.updateDynamic("noAnimate")(noAnimate.get.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1(onScrollChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlychildrenReactNodeChildren]
  }
}

