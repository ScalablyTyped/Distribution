package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolution extends js.Object {
  var authority: String = js.native
  var status: ResolutionStatus = js.native
  var values: js.Array[ResolutionValueContainer] = js.native
}

object Resolution {
  @scala.inline
  def apply(authority: String, status: ResolutionStatus, values: js.Array[ResolutionValueContainer]): Resolution = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolution]
  }
  @scala.inline
  implicit class ResolutionOps[Self <: Resolution] (val x: Self) extends AnyVal {
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
    def setAuthority(value: String): Self = this.set("authority", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: ResolutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: ResolutionValueContainer*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[ResolutionValueContainer]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

