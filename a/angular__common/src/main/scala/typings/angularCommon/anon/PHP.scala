package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PHP extends js.Object {
  var JPY: js.Array[String]
  var PHP: js.Array[String]
  var USD: js.Array[String]
}

object PHP {
  @scala.inline
  def apply(JPY: js.Array[String], PHP: js.Array[String], USD: js.Array[String]): PHP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHP]
  }
}

