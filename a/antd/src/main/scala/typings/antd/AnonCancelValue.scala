package typings.antd

import typings.antd.groupMod.CheckboxOptionType
import typings.antd.groupMod.CheckboxValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelValue extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Array[CheckboxValueType]
  def cancelValue(value: String): Unit
  def registerValue(value: String): Unit
  def toggleOption(option: CheckboxOptionType): Unit
}

object AnonCancelValue {
  @scala.inline
  def apply(
    cancelValue: String => Unit,
    registerValue: String => Unit,
    toggleOption: CheckboxOptionType => Unit,
    value: js.Array[CheckboxValueType],
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): AnonCancelValue = {
    val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue), toggleOption = js.Any.fromFunction1(toggleOption), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelValue]
  }
}

