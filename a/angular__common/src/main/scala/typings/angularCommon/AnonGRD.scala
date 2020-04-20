package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGRD extends js.Object {
  var GRD: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
}

object AnonGRD {
  @scala.inline
  def apply(GRD: js.Array[String], JPY: js.Array[String], THB: js.Array[String]): AnonGRD = {
    val __obj = js.Dynamic.literal(GRD = GRD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGRD]
  }
}

