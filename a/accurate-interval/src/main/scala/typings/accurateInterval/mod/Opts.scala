package typings.accurateInterval.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts extends js.Object {
  var aligned: Boolean = js.native
  var immediate: Boolean = js.native
}

object Opts {
  @scala.inline
  def apply(aligned: Boolean, immediate: Boolean): Opts = {
    val __obj = js.Dynamic.literal(aligned = aligned.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  @scala.inline
  implicit class OptsOps[Self <: Opts] (val x: Self) extends AnyVal {
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
    def setAligned(value: Boolean): Self = this.set("aligned", value.asInstanceOf[js.Any])
    @scala.inline
    def setImmediate(value: Boolean): Self = this.set("immediate", value.asInstanceOf[js.Any])
  }
  
}

