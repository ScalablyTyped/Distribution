package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDRJPY extends js.Object {
  var IDR: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object IDRJPY {
  @scala.inline
  def apply(IDR: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): IDRJPY = {
    val __obj = js.Dynamic.literal(IDR = IDR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDRJPY]
  }
}

