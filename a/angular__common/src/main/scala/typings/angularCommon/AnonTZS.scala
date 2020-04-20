package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTZS extends js.Object {
  var JPY: js.Array[String]
  var TZS: js.Array[String]
  var USD: js.Array[String]
}

object AnonTZS {
  @scala.inline
  def apply(JPY: js.Array[String], TZS: js.Array[String], USD: js.Array[String]): AnonTZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTZS]
  }
}

