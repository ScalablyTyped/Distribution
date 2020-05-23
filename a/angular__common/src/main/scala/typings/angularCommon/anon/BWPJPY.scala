package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BWPJPY extends js.Object {
  var BWP: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object BWPJPY {
  @scala.inline
  def apply(BWP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BWPJPY = {
    val __obj = js.Dynamic.literal(BWP = BWP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BWPJPY]
  }
}

