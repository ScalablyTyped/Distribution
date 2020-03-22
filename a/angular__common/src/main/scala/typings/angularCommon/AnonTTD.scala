package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTTD extends js.Object {
  var JPY: js.Array[String]
  var TTD: js.Array[String]
  var USD: js.Array[String]
}

object AnonTTD {
  @scala.inline
  def apply(JPY: js.Array[String], TTD: js.Array[String], USD: js.Array[String]): AnonTTD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TTD = TTD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTTD]
  }
}

