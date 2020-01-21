package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBZD extends js.Object {
  var BZD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBZD {
  @scala.inline
  def apply(BZD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBZD = {
    val __obj = js.Dynamic.literal(BZD = BZD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBZD]
  }
}

