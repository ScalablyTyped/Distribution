package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PKR extends js.Object {
  var JPY: js.Array[String]
  var PKR: js.Array[String]
  var USD: js.Array[String]
}

object PKR {
  @scala.inline
  def apply(JPY: js.Array[String], PKR: js.Array[String], USD: js.Array[String]): PKR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PKR]
  }
}

