package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSTD extends js.Object {
  var BDT: js.Array[String]
  var JPY: js.Array[String]
  var STD: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonSTD {
  @scala.inline
  def apply(
    BDT: js.Array[String],
    JPY: js.Array[String],
    STD: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonSTD = {
    val __obj = js.Dynamic.literal(BDT = BDT.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], STD = STD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSTD]
  }
}

