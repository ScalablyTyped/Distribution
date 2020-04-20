package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonANG extends js.Object {
  var ANG: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonANG {
  @scala.inline
  def apply(ANG: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonANG = {
    val __obj = js.Dynamic.literal(ANG = ANG.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonANG]
  }
}

