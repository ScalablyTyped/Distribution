package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Direction extends js.Object {
  var current: Double = js.native
  var direction: String = js.native
  var iconPrefix: String = js.native
  var labelPlacement: String = js.native
  var prefixCls: String = js.native
}

object Direction {
  @scala.inline
  def apply(current: Double, direction: String, iconPrefix: String, labelPlacement: String, prefixCls: String): Direction = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], labelPlacement = labelPlacement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[Direction]
  }
  @scala.inline
  implicit class DirectionOps[Self <: Direction] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconPrefix(value: String): Self = this.set("iconPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelPlacement(value: String): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

