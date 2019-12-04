package typings.atAngularCommon.httpHttpMod

import typings.atAngularCommon.httpHttpMod.HttpEventType.DownloadProgress
import typings.atAngularCommon.httpHttpMod.HttpEventType.UploadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpProgressEvent
  extends HttpEvent[js.Any] {
  /**
    * Number of bytes uploaded or downloaded.
    */
  var loaded: Double
  /**
    * Total number of bytes to upload or download. Depending on the request or
    * response, this may not be computable and thus may not be present.
    */
  var total: js.UndefOr[Double] = js.undefined
  /**
    * Progress event type is either upload or download.
    */
  var `type`: DownloadProgress | UploadProgress
}

object HttpProgressEvent {
  @scala.inline
  def apply(loaded: Double, `type`: DownloadProgress | UploadProgress, total: Int | Double = null): HttpProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgressEvent]
  }
}

