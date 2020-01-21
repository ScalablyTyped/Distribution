package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYUSD extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYUSD {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String]): AnonJPYUSD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYUSD]
  }
}

