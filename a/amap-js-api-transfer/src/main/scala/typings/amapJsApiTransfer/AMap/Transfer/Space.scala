package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Space extends js.Object {
  /**
    * 仓位费用
    */
  var cost: Double
  /**
    * 仓位编码，参考仓位级别表
    */
  var `type`: String | js.Array[scala.Nothing]
}

object Space {
  @scala.inline
  def apply(cost: Double, `type`: String | js.Array[scala.Nothing]): Space = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
}

