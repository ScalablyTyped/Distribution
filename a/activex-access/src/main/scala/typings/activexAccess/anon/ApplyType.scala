package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplyType extends js.Object {
  var ApplyType: Double = js.native
  var Cancel: Double = js.native
}

object ApplyType {
  @scala.inline
  def apply(ApplyType: Double, Cancel: Double): ApplyType = {
    val __obj = js.Dynamic.literal(ApplyType = ApplyType.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyType]
  }
  @scala.inline
  implicit class ApplyTypeOps[Self <: ApplyType] (val x: Self) extends AnyVal {
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
    def setApplyType(value: Double): Self = this.set("ApplyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: Double): Self = this.set("Cancel", value.asInstanceOf[js.Any])
  }
  
}

