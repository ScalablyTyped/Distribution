package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonERNETB extends js.Object {
  var ERN: js.Array[String]
  var ETB: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonERNETB {
  @scala.inline
  def apply(ERN: js.Array[String], ETB: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonERNETB = {
    val __obj = js.Dynamic.literal(ERN = ERN.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonERNETB]
  }
}

