package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTWDUSD extends js.Object {
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object AnonTWDUSD {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AnonTWDUSD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTWDUSD]
  }
}

