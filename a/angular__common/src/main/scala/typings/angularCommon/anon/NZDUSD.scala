package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NZDUSD extends js.Object {
  var NZD: js.Array[String]
  var USD: js.Array[String]
}

object NZDUSD {
  @scala.inline
  def apply(NZD: js.Array[String], USD: js.Array[String]): NZDUSD = {
    val __obj = js.Dynamic.literal(NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NZDUSD]
  }
}

