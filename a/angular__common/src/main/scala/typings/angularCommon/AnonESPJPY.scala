package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonESPJPY extends js.Object {
  var ESP: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonESPJPY {
  @scala.inline
  def apply(
    ESP: js.Array[String],
    JPY: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): AnonESPJPY = {
    val __obj = js.Dynamic.literal(ESP = ESP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonESPJPY]
  }
}

