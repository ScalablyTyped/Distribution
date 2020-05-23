package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BBDJPY extends js.Object {
  var BBD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object BBDJPY {
  @scala.inline
  def apply(BBD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BBDJPY = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBDJPY]
  }
}

