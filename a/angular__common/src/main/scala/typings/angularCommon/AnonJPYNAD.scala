package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYNAD extends js.Object {
  var JPY: js.Array[String]
  var NAD: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYNAD {
  @scala.inline
  def apply(JPY: js.Array[String], NAD: js.Array[String], USD: js.Array[String]): AnonJPYNAD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NAD = NAD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYNAD]
  }
}

