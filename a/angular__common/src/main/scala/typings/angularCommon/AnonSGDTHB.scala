package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSGDTHB extends js.Object {
  var MYR: js.Array[String]
  var SGD: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonSGDTHB {
  @scala.inline
  def apply(
    MYR: js.Array[String],
    SGD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonSGDTHB = {
    val __obj = js.Dynamic.literal(MYR = MYR.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSGDTHB]
  }
}

