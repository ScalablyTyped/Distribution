package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputValue extends js.Object {
  var inputValue: String
  var ok: Boolean
}

object InputValue {
  @scala.inline
  def apply(inputValue: String, ok: Boolean): InputValue = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue]
  }
}

