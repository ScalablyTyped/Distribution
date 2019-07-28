package typings.antd.libAutoDashCompleteMod

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
  def apply(value: js.Any, onChange: FormEventHandler[_] = null): AutoCompleteInputProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    __obj.asInstanceOf[AutoCompleteInputProps]
  }
}

