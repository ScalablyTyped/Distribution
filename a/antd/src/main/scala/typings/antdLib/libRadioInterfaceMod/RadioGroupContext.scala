package typings
package antdLib.libRadioInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioGroupContext extends js.Object {
  var radioGroup: antdLib.Anon_DisabledEvent
}

object RadioGroupContext {
  @scala.inline
  def apply(radioGroup: antdLib.Anon_DisabledEvent): RadioGroupContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("radioGroup")(radioGroup)
    __obj.asInstanceOf[RadioGroupContext]
  }
}

