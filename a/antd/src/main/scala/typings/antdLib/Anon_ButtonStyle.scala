package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonStyle extends js.Object {
  var buttonStyle: antdLib.libRadioInterfaceMod.RadioGroupButtonStyle
  var disabled: scala.Boolean
}

object Anon_ButtonStyle {
  @scala.inline
  def apply(buttonStyle: antdLib.libRadioInterfaceMod.RadioGroupButtonStyle, disabled: scala.Boolean): Anon_ButtonStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttonStyle")(buttonStyle)
    __obj.updateDynamic("disabled")(disabled)
    __obj.asInstanceOf[Anon_ButtonStyle]
  }
}

