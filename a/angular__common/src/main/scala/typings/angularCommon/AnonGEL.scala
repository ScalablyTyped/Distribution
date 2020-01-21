package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGEL extends js.Object {
  var GEL: js.Array[String]
  var JPY: js.Array[String]
}

object AnonGEL {
  @scala.inline
  def apply(GEL: js.Array[String], JPY: js.Array[String]): AnonGEL = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGEL]
  }
}

