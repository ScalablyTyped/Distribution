package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUD extends js.Object {
  var AUD: js.Array[String]
  var CNH: js.Array[String]
  var ETB: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CNH: js.Array[String],
    ETB: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonAUD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNH = CNH.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUD]
  }
}

