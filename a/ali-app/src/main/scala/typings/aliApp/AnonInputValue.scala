package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputValue extends js.Object {
  var inputValue: String
  var ok: Boolean
}

object AnonInputValue {
  @scala.inline
  def apply(inputValue: String, ok: Boolean): AnonInputValue = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInputValue]
  }
}

