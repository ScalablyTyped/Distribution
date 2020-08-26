package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateListItemParams extends js.Object {
  var status: ListItemObjectStatus = js.native
  var value: String = js.native
  var version: Double = js.native
}

object UpdateListItemParams {
  @scala.inline
  def apply(status: ListItemObjectStatus, value: String, version: Double): UpdateListItemParams = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListItemParams]
  }
  @scala.inline
  implicit class UpdateListItemParamsOps[Self <: UpdateListItemParams] (val x: Self) extends AnyVal {
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
    def setStatus(value: ListItemObjectStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

