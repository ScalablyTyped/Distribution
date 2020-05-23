package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BSDJPY extends js.Object {
  var BSD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object BSDJPY {
  @scala.inline
  def apply(BSD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BSDJPY = {
    val __obj = js.Dynamic.literal(BSD = BSD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSDJPY]
  }
}

