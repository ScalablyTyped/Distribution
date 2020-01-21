package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDCNYJPY extends js.Object {
  var AUD: js.Array[String]
  var CNY: js.Array[String]
  var JPY: js.Array[String]
  var KRW: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUDCNYJPY {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CNY: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[String],
    USD: js.Array[String]
  ): AnonAUDCNYJPY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDCNYJPY]
  }
}

