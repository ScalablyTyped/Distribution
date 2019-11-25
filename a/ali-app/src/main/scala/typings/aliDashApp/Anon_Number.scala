package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Number extends js.Object {
  var number: String
  var street: String
}

object Anon_Number {
  @scala.inline
  def apply(number: String, street: String): Anon_Number = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Number]
  }
}

