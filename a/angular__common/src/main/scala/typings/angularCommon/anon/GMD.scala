package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GMD extends js.Object {
  var GMD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object GMD {
  @scala.inline
  def apply(GMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GMD = {
    val __obj = js.Dynamic.literal(GMD = GMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GMD]
  }
}

