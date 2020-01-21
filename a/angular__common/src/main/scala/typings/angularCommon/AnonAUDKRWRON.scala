package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDKRWRON extends js.Object {
  var AUD: js.Array[String]
  var KRW: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUDKRWRON {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    KRW: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonAUDKRWRON = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDKRWRON]
  }
}

