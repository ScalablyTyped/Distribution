package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InputValue extends js.Object {
  var inputValue: java.lang.String
  var ok: scala.Boolean
}

object Anon_InputValue {
  @scala.inline
  def apply(inputValue: java.lang.String, ok: scala.Boolean): Anon_InputValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inputValue")(inputValue)
    __obj.updateDynamic("ok")(ok)
    __obj.asInstanceOf[Anon_InputValue]
  }
}

