package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMUR extends js.Object {
  var JPY: js.Array[String]
  var MUR: js.Array[String]
  var USD: js.Array[String]
}

object AnonMUR {
  @scala.inline
  def apply(JPY: js.Array[String], MUR: js.Array[String], USD: js.Array[String]): AnonMUR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MUR = MUR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMUR]
  }
}

