package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RONTWD extends js.Object {
  var AUD: js.Array[String]
  var JPY: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object RONTWD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): RONTWD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RONTWD]
  }
}

