package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYPEN extends js.Object {
  var JPY: js.Array[String]
  var PEN: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYPEN {
  @scala.inline
  def apply(JPY: js.Array[String], PEN: js.Array[String], USD: js.Array[String]): AnonJPYPEN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PEN = PEN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYPEN]
  }
}

