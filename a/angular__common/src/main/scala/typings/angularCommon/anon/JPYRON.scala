package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JPYRON extends js.Object {
  var JPY: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object JPYRON {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): JPYRON = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYRON]
  }
}

