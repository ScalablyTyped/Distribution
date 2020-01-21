package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCAD extends js.Object {
  var CAD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonCAD {
  @scala.inline
  def apply(CAD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonCAD = {
    val __obj = js.Dynamic.literal(CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCAD]
  }
}

