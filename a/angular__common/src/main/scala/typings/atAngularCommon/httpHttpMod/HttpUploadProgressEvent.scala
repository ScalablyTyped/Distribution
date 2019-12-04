package typings.atAngularCommon.httpHttpMod

import typings.atAngularCommon.httpHttpMod.HttpEventType.UploadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpUploadProgressEvent extends HttpProgressEvent {
  @JSName("type")
  var type_HttpUploadProgressEvent: UploadProgress
}

object HttpUploadProgressEvent {
  @scala.inline
  def apply(loaded: Double, `type`: UploadProgress, total: Int | Double = null): HttpUploadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUploadProgressEvent]
  }
}

