package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AZN extends js.Object {
  var AZN: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AZN {
  @scala.inline
  def apply(AZN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AZN = {
    val __obj = js.Dynamic.literal(AZN = AZN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AZN]
  }
}

