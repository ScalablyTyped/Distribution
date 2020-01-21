package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYMWK extends js.Object {
  var JPY: js.Array[String]
  var MWK: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYMWK {
  @scala.inline
  def apply(JPY: js.Array[String], MWK: js.Array[String], USD: js.Array[String]): AnonJPYMWK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MWK = MWK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYMWK]
  }
}

