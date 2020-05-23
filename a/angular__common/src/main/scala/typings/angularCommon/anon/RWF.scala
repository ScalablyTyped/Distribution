package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RWF extends js.Object {
  var JPY: js.Array[String]
  var RWF: js.Array[String]
  var USD: js.Array[String]
}

object RWF {
  @scala.inline
  def apply(JPY: js.Array[String], RWF: js.Array[String], USD: js.Array[String]): RWF = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RWF = RWF.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RWF]
  }
}

