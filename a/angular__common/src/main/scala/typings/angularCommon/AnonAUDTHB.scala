package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDTHB extends js.Object {
  var AUD: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object AnonAUDTHB {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AnonAUDTHB = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUDTHB]
  }
}

