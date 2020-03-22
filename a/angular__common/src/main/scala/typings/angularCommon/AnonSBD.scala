package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSBD extends js.Object {
  var JPY: js.Array[String]
  var SBD: js.Array[String]
  var USD: js.Array[String]
}

object AnonSBD {
  @scala.inline
  def apply(JPY: js.Array[String], SBD: js.Array[String], USD: js.Array[String]): AnonSBD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSBD]
  }
}

