package typings.atAntDashDesignReactDashNative.esCheckboxPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxPropsType extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* params */ OnChangeParams, Unit]] = js.undefined
}

object CheckboxPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* params */ OnChangeParams => Unit = null
  ): CheckboxPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[CheckboxPropsType]
  }
}

