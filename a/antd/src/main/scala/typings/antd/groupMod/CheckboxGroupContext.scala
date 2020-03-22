package typings.antd.groupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckboxGroupContext extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var toggleOption: js.UndefOr[js.Function1[/* option */ CheckboxOptionType, Unit]] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object CheckboxGroupContext {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    toggleOption: /* option */ CheckboxOptionType => Unit = null,
    value: js.Any = null
  ): CheckboxGroupContext = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (toggleOption != null) __obj.updateDynamic("toggleOption")(js.Any.fromFunction1(toggleOption))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupContext]
  }
}

