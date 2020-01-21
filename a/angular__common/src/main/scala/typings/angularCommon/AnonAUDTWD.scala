package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDTWD extends js.Object {
  var AUD: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object AnonAUDTWD {
  @scala.inline
  def apply(AUD: js.Array[String], TWD: js.Array[String], USD: js.Array[String]): AnonAUDTWD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDTWD]
  }
}

