package typings.antd

import typings.antd.esRadioInterfaceMod.RadioChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledEv extends js.Object {
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var value: js.Any
  def onChange(ev: RadioChangeEvent): Unit
}

object Anon_DisabledEv {
  @scala.inline
  def apply(
    onChange: RadioChangeEvent => Unit,
    value: js.Any,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): Anon_DisabledEv = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), value = value)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_DisabledEv]
  }
}

