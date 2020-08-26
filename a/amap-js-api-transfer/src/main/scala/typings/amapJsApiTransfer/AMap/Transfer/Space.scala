package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Space extends js.Object {
  /**
    * 仓位费用
    */
  var cost: Double = js.native
  /**
    * 仓位编码，参考仓位级别表
    */
  var `type`: String | js.Array[scala.Nothing] = js.native
}

object Space {
  @scala.inline
  def apply(cost: Double, `type`: String | js.Array[scala.Nothing]): Space = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Space]
  }
  @scala.inline
  implicit class SpaceOps[Self <: Space] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCost(value: Double): Self = this.set("cost", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeVarargs(value: scala.Nothing*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: String | js.Array[scala.Nothing]): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

