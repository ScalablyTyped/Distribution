package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallerID extends js.Object {
  /* Properties */
  var name: String
  var number: String
}

object CallerID {
  @scala.inline
  def apply(name: String, number: String): CallerID = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallerID]
  }
}

