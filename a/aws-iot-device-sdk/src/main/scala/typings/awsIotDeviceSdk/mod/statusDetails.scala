package typings.awsIotDeviceSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait statusDetails extends js.Object {
  var progress: String = js.native
}

object statusDetails {
  @scala.inline
  def apply(progress: String): statusDetails = {
    val __obj = js.Dynamic.literal(progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[statusDetails]
  }
  @scala.inline
  implicit class statusDetailsOps[Self <: statusDetails] (val x: Self) extends AnyVal {
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
    def setProgress(value: String): Self = this.set("progress", value.asInstanceOf[js.Any])
  }
  
}

