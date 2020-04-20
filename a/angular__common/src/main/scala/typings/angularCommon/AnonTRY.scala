package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTRY extends js.Object {
  var JPY: js.Array[String]
  var TRY: js.Array[String]
  var USD: js.Array[String]
}

object AnonTRY {
  @scala.inline
  def apply(JPY: js.Array[String], TRY: js.Array[String], USD: js.Array[String]): AnonTRY = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTRY]
  }
}

