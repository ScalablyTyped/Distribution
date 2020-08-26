package typings.activexShdocvw.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LCauseFlag extends js.Object {
  var Cancel: Boolean = js.native
  val lCauseFlag: Double = js.native
  val pWB2: js.Any = js.native
}

object LCauseFlag {
  @scala.inline
  def apply(Cancel: Boolean, lCauseFlag: Double, pWB2: js.Any): LCauseFlag = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], lCauseFlag = lCauseFlag.asInstanceOf[js.Any], pWB2 = pWB2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LCauseFlag]
  }
  @scala.inline
  implicit class LCauseFlagOps[Self <: LCauseFlag] (val x: Self) extends AnyVal {
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
    def setLCauseFlag(value: Double): Self = this.set("lCauseFlag", value.asInstanceOf[js.Any])
    @scala.inline
    def setPWB2(value: js.Any): Self = this.set("pWB2", value.asInstanceOf[js.Any])
  }
  
}

