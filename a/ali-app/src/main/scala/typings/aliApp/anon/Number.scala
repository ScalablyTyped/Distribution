package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Number extends js.Object {
  var number: String
  var street: String
}

object Number {
  @scala.inline
  def apply(number: String, street: String): Number = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

