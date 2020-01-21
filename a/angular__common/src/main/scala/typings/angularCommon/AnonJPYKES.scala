package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYKES extends js.Object {
  var JPY: js.Array[String]
  var KES: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYKES {
  @scala.inline
  def apply(JPY: js.Array[String], KES: js.Array[String], USD: js.Array[String]): AnonJPYKES = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYKES]
  }
}

