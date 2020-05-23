package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DKKJPY extends js.Object {
  var DKK: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object DKKJPY {
  @scala.inline
  def apply(DKK: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): DKKJPY = {
    val __obj = js.Dynamic.literal(DKK = DKK.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[DKKJPY]
  }
}

