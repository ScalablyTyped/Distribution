package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLRD extends js.Object {
  var JPY: js.Array[String]
  var LRD: js.Array[String]
  var USD: js.Array[String]
}

object AnonLRD {
  @scala.inline
  def apply(JPY: js.Array[String], LRD: js.Array[String], USD: js.Array[String]): AnonLRD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], LRD = LRD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLRD]
  }
}

