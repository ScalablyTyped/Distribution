package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDCVE extends js.Object {
  var AUD: js.Array[String]
  var CVE: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUDCVE {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CVE: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): AnonAUDCVE = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CVE = CVE.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDCVE]
  }
}

