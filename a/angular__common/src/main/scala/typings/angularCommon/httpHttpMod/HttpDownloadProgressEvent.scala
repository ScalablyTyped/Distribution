package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpDownloadProgressEvent extends HttpProgressEvent {
  /**
    * The partial response body as downloaded so far.
    *
    * Only present if the responseType was `text`.
    */
  var partialText: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_HttpDownloadProgressEvent: DownloadProgress
}

object HttpDownloadProgressEvent {
  @scala.inline
  def apply(
    loaded: Double,
    `type`: DownloadProgress,
    partialText: String = null,
    total: js.UndefOr[Double] = js.undefined
  ): HttpDownloadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (partialText != null) __obj.updateDynamic("partialText")(partialText.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadProgressEvent]
  }
}

