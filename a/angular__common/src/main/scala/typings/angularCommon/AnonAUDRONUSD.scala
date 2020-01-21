package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDRONUSD extends js.Object {
  var AUD: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var USD: js.Array[String]
}

object AnonAUDRONUSD {
  @scala.inline
  def apply(AUD: js.Array[String], RON: js.Array[js.UndefOr[String]], USD: js.Array[String]): AnonAUDRONUSD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDRONUSD]
  }
}

