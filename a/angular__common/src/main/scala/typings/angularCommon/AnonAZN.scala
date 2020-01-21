package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAZN extends js.Object {
  var AZN: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonAZN {
  @scala.inline
  def apply(AZN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonAZN = {
    val __obj = js.Dynamic.literal(AZN = AZN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAZN]
  }
}

