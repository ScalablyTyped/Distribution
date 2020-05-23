package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RON extends js.Object {
  var AZN: js.Array[String]
  var JPY: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var SYP: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object RON {
  @scala.inline
  def apply(
    AZN: js.Array[String],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    SYP: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): RON = {
    val __obj = js.Dynamic.literal(AZN = AZN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], SYP = SYP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RON]
  }
}

