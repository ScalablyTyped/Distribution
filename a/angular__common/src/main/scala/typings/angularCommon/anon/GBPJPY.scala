package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GBPJPY extends js.Object {
  var GBP: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object GBPJPY {
  @scala.inline
  def apply(GBP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GBPJPY = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GBPJPY]
  }
}

