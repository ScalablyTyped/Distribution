package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BIFJPY extends js.Object {
  var BIF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object BIFJPY {
  @scala.inline
  def apply(BIF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BIFJPY = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIFJPY]
  }
}

