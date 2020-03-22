package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGIP extends js.Object {
  var GBP: js.Array[String]
  var GIP: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonGIP {
  @scala.inline
  def apply(GBP: js.Array[String], GIP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonGIP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], GIP = GIP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGIP]
  }
}

