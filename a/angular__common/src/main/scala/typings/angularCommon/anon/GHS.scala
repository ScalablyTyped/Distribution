package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GHS extends js.Object {
  var GHS: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object GHS {
  @scala.inline
  def apply(GHS: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GHS = {
    val __obj = js.Dynamic.literal(GHS = GHS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHS]
  }
}

