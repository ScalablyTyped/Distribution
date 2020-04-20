package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNZD extends js.Object {
  var JPY: js.Array[String]
  var NZD: js.Array[String]
  var USD: js.Array[String]
}

object AnonNZD {
  @scala.inline
  def apply(JPY: js.Array[String], NZD: js.Array[String], USD: js.Array[String]): AnonNZD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNZD]
  }
}

