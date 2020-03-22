package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSTN extends js.Object {
  var AUD: js.Array[String]
  var JPY: js.Array[String]
  var PTE: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var STN: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonSTN {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    JPY: js.Array[String],
    PTE: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    STN: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonSTN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PTE = PTE.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], STN = STN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSTN]
  }
}

