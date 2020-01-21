package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBMD extends js.Object {
  var BMD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBMD {
  @scala.inline
  def apply(BMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBMD = {
    val __obj = js.Dynamic.literal(BMD = BMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBMD]
  }
}

