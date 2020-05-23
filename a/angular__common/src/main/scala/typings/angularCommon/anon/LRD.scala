package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LRD extends js.Object {
  var JPY: js.Array[String]
  var LRD: js.Array[String]
  var USD: js.Array[String]
}

object LRD {
  @scala.inline
  def apply(JPY: js.Array[String], LRD: js.Array[String], USD: js.Array[String]): LRD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], LRD = LRD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LRD]
  }
}

