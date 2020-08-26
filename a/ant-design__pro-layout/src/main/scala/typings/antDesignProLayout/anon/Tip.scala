package typings.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tip extends js.Object {
  var tip: js.UndefOr[String] = js.native
}

object Tip {
  @scala.inline
  def apply(): Tip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tip]
  }
  @scala.inline
  implicit class TipOps[Self <: Tip] (val x: Self) extends AnyVal {
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
    def setTip(value: String): Self = this.set("tip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
  }
  
}

