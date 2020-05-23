package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WST extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var WST: js.Array[String]
}

object WST {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], WST: js.Array[String]): WST = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], WST = WST.asInstanceOf[js.Any])
    __obj.asInstanceOf[WST]
  }
}

