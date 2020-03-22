package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPKR extends js.Object {
  var JPY: js.Array[String]
  var PKR: js.Array[String]
  var USD: js.Array[String]
}

object AnonPKR {
  @scala.inline
  def apply(JPY: js.Array[String], PKR: js.Array[String], USD: js.Array[String]): AnonPKR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPKR]
  }
}

