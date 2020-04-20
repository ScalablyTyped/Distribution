package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRUBArray extends js.Object {
  var JPY: js.Array[String]
  var RUB: js.Array[String]
}

object AnonRUBArray {
  @scala.inline
  def apply(JPY: js.Array[String], RUB: js.Array[String]): AnonRUBArray = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRUBArray]
  }
}

