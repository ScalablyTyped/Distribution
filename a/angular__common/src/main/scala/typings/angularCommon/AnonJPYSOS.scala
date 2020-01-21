package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYSOS extends js.Object {
  var JPY: js.Array[String]
  var SOS: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYSOS {
  @scala.inline
  def apply(JPY: js.Array[String], SOS: js.Array[String], USD: js.Array[String]): AnonJPYSOS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYSOS]
  }
}

