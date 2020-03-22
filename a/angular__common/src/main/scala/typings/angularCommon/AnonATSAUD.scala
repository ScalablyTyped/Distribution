package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonATSAUD extends js.Object {
  var ATS: js.Array[String]
  var AUD: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonATSAUD {
  @scala.inline
  def apply(ATS: js.Array[String], AUD: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonATSAUD = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any], AUD = AUD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonATSAUD]
  }
}

