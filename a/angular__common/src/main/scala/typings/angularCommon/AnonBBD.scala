package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBBD extends js.Object {
  var BBD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBBD {
  @scala.inline
  def apply(BBD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBBD = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBBD]
  }
}

