package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDKK extends js.Object {
  var DKK: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonDKK {
  @scala.inline
  def apply(DKK: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonDKK = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDKK]
  }
}

