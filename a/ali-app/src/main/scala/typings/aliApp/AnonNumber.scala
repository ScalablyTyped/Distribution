package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumber extends js.Object {
  var number: String
  var street: String
}

object AnonNumber {
  @scala.inline
  def apply(number: String, street: String): AnonNumber = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNumber]
  }
}

