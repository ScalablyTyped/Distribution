package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTHB extends js.Object {
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonTHB {
  @scala.inline
  def apply(THB: js.Array[String], TWD: js.Array[String]): AnonTHB = {
    val __obj = js.Dynamic.literal(THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTHB]
  }
}

