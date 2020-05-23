package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NGN extends js.Object {
  var JPY: js.Array[String]
  var NGN: js.Array[String]
  var USD: js.Array[String]
}

object NGN {
  @scala.inline
  def apply(JPY: js.Array[String], NGN: js.Array[String], USD: js.Array[String]): NGN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGN]
  }
}

