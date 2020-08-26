package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  var align: Overflow = js.native
  var placement: String = js.native
  var prefixCls: String = js.native
  var trigger: js.Array[String] = js.native
}

object Placement {
  @scala.inline
  def apply(align: Overflow, placement: String, prefixCls: String, trigger: js.Array[String]): Placement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
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
    def setAlign(value: Overflow): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlacement(value: String): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerVarargs(value: String*): Self = this.set("trigger", js.Array(value :_*))
    @scala.inline
    def setTrigger(value: js.Array[String]): Self = this.set("trigger", value.asInstanceOf[js.Any])
  }
  
}

