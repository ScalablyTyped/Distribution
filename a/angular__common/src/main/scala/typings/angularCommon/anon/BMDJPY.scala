package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BMDJPY extends js.Object {
  var BMD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object BMDJPY {
  @scala.inline
  def apply(BMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BMDJPY = {
    val __obj = js.Dynamic.literal(BMD = BMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BMDJPY]
  }
}

