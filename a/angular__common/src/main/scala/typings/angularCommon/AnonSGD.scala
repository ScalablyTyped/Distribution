package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSGD extends js.Object {
  var JPY: js.Array[String]
  var SGD: js.Array[String]
  var USD: js.Array[String]
}

object AnonSGD {
  @scala.inline
  def apply(JPY: js.Array[String], SGD: js.Array[String], USD: js.Array[String]): AnonSGD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSGD]
  }
}

