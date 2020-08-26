package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignSelf extends js.Object {
  var alignSelf: String = js.native
  var marginRight: Double = js.native
}

object AlignSelf {
  @scala.inline
  def apply(alignSelf: String, marginRight: Double): AlignSelf = {
    val __obj = js.Dynamic.literal(alignSelf = alignSelf.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignSelf]
  }
  @scala.inline
  implicit class AlignSelfOps[Self <: AlignSelf] (val x: Self) extends AnyVal {
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
    def setAlignSelf(value: String): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginRight(value: Double): Self = this.set("marginRight", value.asInstanceOf[js.Any])
  }
  
}

