package typings.antd.radioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupContextProps extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Any
  def onChange(e: RadioChangeEvent): Unit
}

object RadioGroupContextProps {
  @scala.inline
  def apply(
    onChange: RadioChangeEvent => Unit,
    value: js.Any,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): RadioGroupContextProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioGroupContextProps]
  }
}

