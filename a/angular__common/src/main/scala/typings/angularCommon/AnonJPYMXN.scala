package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYMXN extends js.Object {
  var JPY: js.Array[String]
  var MXN: js.Array[js.UndefOr[String]]
  var RON: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
  var ZAR: js.Array[String]
}

object AnonJPYMXN {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    ZAR: js.Array[String]
  ): AnonJPYMXN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYMXN]
  }
}

