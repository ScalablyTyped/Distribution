package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNZDUSD extends js.Object {
  var NZD: js.Array[String]
  var USD: js.Array[String]
}

object AnonNZDUSD {
  @scala.inline
  def apply(NZD: js.Array[String], USD: js.Array[String]): AnonNZDUSD = {
    val __obj = js.Dynamic.literal(NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNZDUSD]
  }
}

