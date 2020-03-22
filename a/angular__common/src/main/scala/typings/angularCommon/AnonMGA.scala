package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMGA extends js.Object {
  var JPY: js.Array[String]
  var MGA: js.Array[String]
  var USD: js.Array[String]
}

object AnonMGA {
  @scala.inline
  def apply(JPY: js.Array[String], MGA: js.Array[String], USD: js.Array[String]): AnonMGA = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MGA = MGA.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMGA]
  }
}

