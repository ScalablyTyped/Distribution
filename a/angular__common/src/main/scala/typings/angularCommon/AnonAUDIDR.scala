package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDIDR extends js.Object {
  var AUD: js.Array[String]
  var IDR: js.Array[String]
  var INR: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUDIDR {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    IDR: js.Array[String],
    INR: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonAUDIDR = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], IDR = IDR.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDIDR]
  }
}

