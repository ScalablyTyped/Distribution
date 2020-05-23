package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCR extends js.Object {
  var JPY: js.Array[String]
  var SCR: js.Array[String]
  var USD: js.Array[String]
}

object SCR {
  @scala.inline
  def apply(JPY: js.Array[String], SCR: js.Array[String], USD: js.Array[String]): SCR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SCR = SCR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCR]
  }
}

