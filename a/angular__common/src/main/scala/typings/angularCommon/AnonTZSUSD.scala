package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTZSUSD extends js.Object {
  var JPY: js.Array[String]
  var KES: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var TZS: js.Array[String]
  var USD: js.Array[String]
}

object AnonTZSUSD {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    KES: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    TZS: js.Array[String],
    USD: js.Array[String]
  ): AnonTZSUSD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTZSUSD]
  }
}

