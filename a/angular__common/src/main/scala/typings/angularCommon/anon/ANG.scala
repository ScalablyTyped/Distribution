package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANG extends js.Object {
  var ANG: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object ANG {
  @scala.inline
  def apply(ANG: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): ANG = {
    val __obj = js.Dynamic.literal(ANG = ANG.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANG]
  }
}

