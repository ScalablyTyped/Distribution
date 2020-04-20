package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIDRJPY extends js.Object {
  var IDR: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonIDRJPY {
  @scala.inline
  def apply(IDR: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonIDRJPY = {
    val __obj = js.Dynamic.literal(IDR = IDR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIDRJPY]
  }
}

