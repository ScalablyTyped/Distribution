package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMYRSGD extends js.Object {
  var MYR: js.Array[String]
  var SGD: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonMYRSGD {
  @scala.inline
  def apply(MYR: js.Array[String], SGD: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonMYRSGD = {
    val __obj = js.Dynamic.literal(MYR = MYR.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMYRSGD]
  }
}

