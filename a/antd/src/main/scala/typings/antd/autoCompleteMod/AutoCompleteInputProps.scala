package typings.antd.autoCompleteMod

import typings.react.mod.FormEvent
import typings.react.mod.FormEventHandler
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
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[AutoCompleteInputProps]
  }
}

