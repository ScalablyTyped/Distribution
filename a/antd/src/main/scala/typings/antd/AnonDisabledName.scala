package typings.antd

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisabledName extends js.Object {
  var disabled: Boolean
  var name: String
  var onChange: ChangeEventHandler[HTMLInputElement]
  var value: js.Any
}

object AnonDisabledName {
  @scala.inline
  def apply(disabled: Boolean, name: String, onChange: ChangeEvent[HTMLInputElement] => Unit, value: js.Any): AnonDisabledName = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDisabledName]
  }
}

