package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBMDJPY extends js.Object {
  var BMD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBMDJPY {
  @scala.inline
  def apply(BMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBMDJPY = {
    val __obj = js.Dynamic.literal(BMD = BMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBMDJPY]
  }
}

