package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGHSJPY extends js.Object {
  var GHS: js.Array[String]
  var JPY: js.Array[String]
  var NGN: js.Array[String]
  var USD: js.Array[String]
}

object AnonGHSJPY {
  @scala.inline
  def apply(GHS: js.Array[String], JPY: js.Array[String], NGN: js.Array[String], USD: js.Array[String]): AnonGHSJPY = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGHSJPY]
  }
}

