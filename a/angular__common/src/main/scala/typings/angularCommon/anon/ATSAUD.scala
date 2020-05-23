package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ATSAUD extends js.Object {
  var ATS: js.Array[String]
  var AUD: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object ATSAUD {
  @scala.inline
  def apply(ATS: js.Array[String], AUD: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): ATSAUD = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any], AUD = AUD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATSAUD]
  }
}

