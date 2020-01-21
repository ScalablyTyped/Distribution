package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLKR extends js.Object {
  var LKR: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonLKR {
  @scala.inline
  def apply(LKR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonLKR = {
    val __obj = js.Dynamic.literal(LKR = LKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLKR]
  }
}

