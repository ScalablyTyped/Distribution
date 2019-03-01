package typings
package antdLib.libInputPasswordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordState extends js.Object {
  var visible: scala.Boolean
}

object PasswordState {
  @scala.inline
  def apply(visible: scala.Boolean): PasswordState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PasswordState]
  }
}

