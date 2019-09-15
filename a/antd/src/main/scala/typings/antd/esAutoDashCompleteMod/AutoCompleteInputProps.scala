package typings.antd.esAutoDashCompleteMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCompleteInputProps extends js.Object {
  var onChange: js.UndefOr[FormEventHandler[_]] = js.undefined
  var value: js.Any
}

object AutoCompleteInputProps {
  @scala.inline
  def apply(value: js.Any, onChange: FormEvent[_] => Unit = null): AutoCompleteInputProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AutoCompleteInputProps]
  }
}

