package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYKYD extends js.Object {
  var JPY: js.Array[String]
  var KYD: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYKYD {
  @scala.inline
  def apply(JPY: js.Array[String], KYD: js.Array[String], USD: js.Array[String]): AnonJPYKYD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KYD = KYD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYKYD]
  }
}

