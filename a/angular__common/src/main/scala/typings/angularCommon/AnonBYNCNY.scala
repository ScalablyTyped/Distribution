package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBYNCNY extends js.Object {
  var BYN: js.Array[js.UndefOr[String]]
  var CNY: js.Array[String]
  var ILP: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonBYNCNY {
  @scala.inline
  def apply(
    BYN: js.Array[js.UndefOr[String]],
    CNY: js.Array[String],
    ILP: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): AnonBYNCNY = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], ILP = ILP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBYNCNY]
  }
}

