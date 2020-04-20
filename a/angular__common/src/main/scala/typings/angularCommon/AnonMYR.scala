package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMYR extends js.Object {
  var JPY: js.Array[String]
  var MYR: js.Array[String]
  var USD: js.Array[String]
}

object AnonMYR {
  @scala.inline
  def apply(JPY: js.Array[String], MYR: js.Array[String], USD: js.Array[String]): AnonMYR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMYR]
  }
}

