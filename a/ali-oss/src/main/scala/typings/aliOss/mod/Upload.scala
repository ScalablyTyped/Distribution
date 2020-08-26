package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Upload extends js.Object {
  var initiated: js.Any = js.native
  var name: String = js.native
  var uploadId: String = js.native
}

object Upload {
  @scala.inline
  def apply(initiated: js.Any, name: String, uploadId: String): Upload = {
    val __obj = js.Dynamic.literal(initiated = initiated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Upload]
  }
  @scala.inline
  implicit class UploadOps[Self <: Upload] (val x: Self) extends AnyVal {
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
    def setInitiated(value: js.Any): Self = this.set("initiated", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
  }
  
}

