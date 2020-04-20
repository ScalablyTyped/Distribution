package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKHR extends js.Object {
  var JPY: js.Array[String]
  var KHR: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonKHR {
  @scala.inline
  def apply(JPY: js.Array[String], KHR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonKHR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KHR = KHR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKHR]
  }
}

