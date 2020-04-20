package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKYD extends js.Object {
  var JPY: js.Array[String]
  var KYD: js.Array[String]
  var USD: js.Array[String]
}

object AnonKYD {
  @scala.inline
  def apply(JPY: js.Array[String], KYD: js.Array[String], USD: js.Array[String]): AnonKYD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KYD = KYD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKYD]
  }
}

