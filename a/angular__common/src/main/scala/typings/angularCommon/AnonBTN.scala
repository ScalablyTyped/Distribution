package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBTN extends js.Object {
  var AUD: js.Array[String]
  var BTN: js.Array[String]
  var ILS: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var KRW: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
  var XAF: js.Array[scala.Nothing]
}

object AnonBTN {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BTN: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    KRW: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String],
    XAF: js.Array[scala.Nothing]
  ): AnonBTN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BTN = BTN.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XAF = XAF.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBTN]
  }
}

