package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPHP extends js.Object {
  var JPY: js.Array[String]
  var PHP: js.Array[String]
  var USD: js.Array[String]
}

object AnonPHP {
  @scala.inline
  def apply(JPY: js.Array[String], PHP: js.Array[String], USD: js.Array[String]): AnonPHP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPHP]
  }
}

