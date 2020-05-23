package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NZD extends js.Object {
  var JPY: js.Array[String]
  var NZD: js.Array[String]
  var USD: js.Array[String]
}

object NZD {
  @scala.inline
  def apply(JPY: js.Array[String], NZD: js.Array[String], USD: js.Array[String]): NZD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NZD]
  }
}

