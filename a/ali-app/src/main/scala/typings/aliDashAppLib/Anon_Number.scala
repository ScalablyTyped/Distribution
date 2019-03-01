package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Number extends js.Object {
  var number: java.lang.String
  var street: java.lang.String
}

object Anon_Number {
  @scala.inline
  def apply(number: java.lang.String, street: java.lang.String): Anon_Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("street")(street)
    __obj.asInstanceOf[Anon_Number]
  }
}

