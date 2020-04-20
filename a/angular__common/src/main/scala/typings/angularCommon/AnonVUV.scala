package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVUV extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var VUV: js.Array[String]
}

object AnonVUV {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], VUV: js.Array[String]): AnonVUV = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VUV = VUV.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVUV]
  }
}

