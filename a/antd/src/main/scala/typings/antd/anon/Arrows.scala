package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrows extends js.Object {
  var arrows: Boolean = js.native
  var dots: Boolean = js.native
  var draggable: Boolean = js.native
}

object Arrows {
  @scala.inline
  def apply(arrows: Boolean, dots: Boolean, draggable: Boolean): Arrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrows]
  }
  @scala.inline
  implicit class ArrowsOps[Self <: Arrows] (val x: Self) extends AnyVal {
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
    def setArrows(value: Boolean): Self = this.set("arrows", value.asInstanceOf[js.Any])
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
  }
  
}

