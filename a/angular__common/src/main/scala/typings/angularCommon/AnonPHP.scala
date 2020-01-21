package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPHP extends js.Object {
  var PHP: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonPHP {
  @scala.inline
  def apply(PHP: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AnonPHP = {
    val __obj = js.Dynamic.literal(PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPHP]
  }
}

