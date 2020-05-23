package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CADJPY extends js.Object {
  var CAD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object CADJPY {
  @scala.inline
  def apply(CAD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): CADJPY = {
    val __obj = js.Dynamic.literal(CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADJPY]
  }
}

