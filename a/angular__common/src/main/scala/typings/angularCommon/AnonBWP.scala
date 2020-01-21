package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBWP extends js.Object {
  var BWP: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBWP {
  @scala.inline
  def apply(BWP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBWP = {
    val __obj = js.Dynamic.literal(BWP = BWP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBWP]
  }
}

