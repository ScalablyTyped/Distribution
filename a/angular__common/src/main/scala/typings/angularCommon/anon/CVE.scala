package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CVE extends js.Object {
  var AUD: js.Array[String]
  var CVE: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
}

object CVE {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CVE: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): CVE = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CVE = CVE.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CVE]
  }
}

