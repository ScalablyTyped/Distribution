package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpUploadProgressEvent extends HttpProgressEvent {
  @JSName("type")
  var type_HttpUploadProgressEvent: UploadProgress
}

object HttpUploadProgressEvent {
  @scala.inline
  def apply(loaded: Double, `type`: UploadProgress, total: js.UndefOr[Double] = js.undefined): HttpUploadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUploadProgressEvent]
  }
}

