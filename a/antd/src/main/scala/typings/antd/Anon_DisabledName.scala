package typings.antd

import typings.react.reactMod.ChangeEventHandler
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledName extends js.Object {
  var disabled: Boolean
  var name: String
  var onChange: ChangeEventHandler[HTMLInputElement]
  var value: js.Any
}

object Anon_DisabledName {
  @scala.inline
  def apply(disabled: Boolean, name: String, onChange: ChangeEventHandler[HTMLInputElement], value: js.Any): Anon_DisabledName = {
    val __obj = js.Dynamic.literal(disabled = disabled, name = name, onChange = onChange, value = value)
  
    __obj.asInstanceOf[Anon_DisabledName]
  }
}

