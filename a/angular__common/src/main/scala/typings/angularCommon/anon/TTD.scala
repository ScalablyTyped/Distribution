package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TTD extends js.Object {
  var JPY: js.Array[String]
  var TTD: js.Array[String]
  var USD: js.Array[String]
}

object TTD {
  @scala.inline
  def apply(JPY: js.Array[String], TTD: js.Array[String], USD: js.Array[String]): TTD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TTD = TTD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TTD]
  }
}

