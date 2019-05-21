package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledName extends js.Object {
  var disabled: scala.Boolean
  var name: java.lang.String
  var onChange: reactLib.reactMod.ChangeEventHandler[stdLib.HTMLInputElement]
  var value: js.Any
}

object Anon_DisabledName {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    name: java.lang.String,
    onChange: reactLib.reactMod.ChangeEventHandler[stdLib.HTMLInputElement],
    value: js.Any
  ): Anon_DisabledName = {
    val __obj = js.Dynamic.literal(disabled = disabled, name = name, onChange = onChange, value = value)
  
    __obj.asInstanceOf[Anon_DisabledName]
  }
}

