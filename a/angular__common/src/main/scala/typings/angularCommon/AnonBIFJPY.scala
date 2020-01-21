package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBIFJPY extends js.Object {
  var BIF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBIFJPY {
  @scala.inline
  def apply(BIF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBIFJPY = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBIFJPY]
  }
}

