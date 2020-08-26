package typings.athenajs.anon

import typings.athenajs.athenajsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loop extends js.Object {
  var loop: js.UndefOr[`false`] = js.native
  var pan: js.UndefOr[Boolean] = js.native
}

object Loop {
  @scala.inline
  def apply(): Loop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loop]
  }
  @scala.inline
  implicit class LoopOps[Self <: Loop] (val x: Self) extends AnyVal {
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
    def setLoop(value: `false`): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setPan(value: Boolean): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
  }
  
}

