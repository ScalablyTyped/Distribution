package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSZL extends js.Object {
  var JPY: js.Array[String]
  var SZL: js.Array[String]
  var USD: js.Array[String]
}

object AnonSZL {
  @scala.inline
  def apply(JPY: js.Array[String], SZL: js.Array[String], USD: js.Array[String]): AnonSZL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SZL = SZL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSZL]
  }
}

