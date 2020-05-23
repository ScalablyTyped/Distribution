package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VUV extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var VUV: js.Array[String]
}

object VUV {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], VUV: js.Array[String]): VUV = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VUV = VUV.asInstanceOf[js.Any])
    __obj.asInstanceOf[VUV]
  }
}

