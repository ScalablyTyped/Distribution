package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress
import typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress
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
  def apply(
    loaded: Double,
    `type`: DownloadProgress | UploadProgress,
    total: js.UndefOr[Double] = js.undefined
  ): HttpProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgressEvent]
  }
}

