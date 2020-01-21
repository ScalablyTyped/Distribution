package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDJPY extends js.Object {
  var AUD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUDJPY {
  @scala.inline
  def apply(AUD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonAUDJPY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDJPY]
  }
}

