package typings
package atAntDashDesignReactDashNativeLib.libCheckboxPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxItemPropsType extends CheckboxPropsType {
  var extra: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object CheckboxItemPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    defaultChecked: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    onChange: /* params */ OnChangeParams => scala.Unit = null,
    onPress: /* e */ js.UndefOr[js.Any] => scala.Unit = null,
    prefixCls: java.lang.String = null
  ): CheckboxItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[CheckboxItemPropsType]
  }
}

