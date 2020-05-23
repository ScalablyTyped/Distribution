package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LVL extends js.Object {
  var AUD: js.Array[String]
  var LVL: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object LVL {
  @scala.inline
  def apply(AUD: js.Array[String], LVL: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): LVL = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], LVL = LVL.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVL]
  }
}

