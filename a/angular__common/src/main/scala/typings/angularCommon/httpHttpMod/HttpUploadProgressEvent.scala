package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpUploadProgressEvent extends HttpProgressEvent {
  @JSName("type")
  var type_HttpUploadProgressEvent: UploadProgress = js.native
}

object HttpUploadProgressEvent {
  @scala.inline
  def apply(loaded: Double, `type`: UploadProgress): HttpUploadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUploadProgressEvent]
  }
  @scala.inline
  implicit class HttpUploadProgressEventOps[Self <: HttpUploadProgressEvent] (val x: Self) extends AnyVal {
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
    def setType(value: UploadProgress): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

