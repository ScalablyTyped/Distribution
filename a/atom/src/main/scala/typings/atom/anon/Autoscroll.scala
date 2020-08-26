package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autoscroll extends js.Object {
  var autoscroll: js.UndefOr[Boolean] = js.native
}

object Autoscroll {
  @scala.inline
  def apply(): Autoscroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Autoscroll]
  }
  @scala.inline
  implicit class AutoscrollOps[Self <: Autoscroll] (val x: Self) extends AnyVal {
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
    def setAutoscroll(value: Boolean): Self = this.set("autoscroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscroll: Self = this.set("autoscroll", js.undefined)
  }
  
}

