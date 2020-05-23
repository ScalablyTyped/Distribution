package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XCD extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var XCD: js.Array[String]
}

object XCD {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], XCD: js.Array[String]): XCD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCD]
  }
}

