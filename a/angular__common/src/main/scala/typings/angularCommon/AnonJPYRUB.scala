package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYRUB extends js.Object {
  var JPY: js.Array[String]
  var RUB: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYRUB {
  @scala.inline
  def apply(JPY: js.Array[String], RUB: js.Array[String], USD: js.Array[String]): AnonJPYRUB = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJPYRUB]
  }
}

