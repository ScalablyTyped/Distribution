package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonILR extends js.Object {
  var AUD: js.Array[String]
  var ILR: js.Array[String]
  var JPY: js.Array[String]
  var KRW: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object AnonILR {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    ILR: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AnonILR = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], ILR = ILR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonILR]
  }
}

