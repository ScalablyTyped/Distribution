package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PpDisp extends js.Object {
  var Cancel: Boolean = js.native
  var ppDisp: js.Any = js.native
}

object PpDisp {
  @scala.inline
  def apply(Cancel: Boolean, ppDisp: js.Any): PpDisp = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ppDisp = ppDisp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpDisp]
  }
  @scala.inline
  implicit class PpDispOps[Self <: PpDisp] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPpDisp(value: js.Any): Self = this.set("ppDisp", value.asInstanceOf[js.Any])
  }
  
}

