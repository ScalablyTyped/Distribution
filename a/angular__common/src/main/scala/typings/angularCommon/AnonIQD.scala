package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIQD extends js.Object {
  var IQD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonIQD {
  @scala.inline
  def apply(IQD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonIQD = {
    val __obj = js.Dynamic.literal(IQD = IQD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIQD]
  }
}

