package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFJD extends js.Object {
  var FJD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonFJD {
  @scala.inline
  def apply(FJD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonFJD = {
    val __obj = js.Dynamic.literal(FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFJD]
  }
}

