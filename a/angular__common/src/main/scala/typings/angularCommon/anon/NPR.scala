package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NPR extends js.Object {
  var JPY: js.Array[String]
  var NPR: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
}

object NPR {
  @scala.inline
  def apply(JPY: js.Array[String], NPR: js.Array[String], THB: js.Array[String], USD: js.Array[String]): NPR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NPR = NPR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NPR]
  }
}

