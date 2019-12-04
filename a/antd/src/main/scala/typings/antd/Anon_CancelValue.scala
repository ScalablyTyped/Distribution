package typings.antd

import typings.antd.libCheckboxGroupMod.CheckboxOptionType
import typings.antd.libCheckboxGroupMod.CheckboxValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelValue extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Array[CheckboxValueType]
  def cancelValue(value: String): Unit
  def registerValue(value: String): Unit
  def toggleOption(option: CheckboxOptionType): Unit
}

object Anon_CancelValue {
  @scala.inline
  def apply(
    cancelValue: String => Unit,
    registerValue: String => Unit,
    toggleOption: CheckboxOptionType => Unit,
    value: js.Array[CheckboxValueType],
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Anon_CancelValue = {
    val __obj = js.Dynamic.literal(cancelValue = js.Any.fromFunction1(cancelValue), registerValue = js.Any.fromFunction1(registerValue), toggleOption = js.Any.fromFunction1(toggleOption), value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CancelValue]
  }
}

