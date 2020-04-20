package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEEK extends js.Object {
  var AUD: js.Array[String]
  var EEK: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonEEK {
  @scala.inline
  def apply(AUD: js.Array[String], EEK: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonEEK = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], EEK = EEK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEEK]
  }
}

