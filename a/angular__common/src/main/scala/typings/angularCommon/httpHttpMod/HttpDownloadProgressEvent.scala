package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpDownloadProgressEvent extends HttpProgressEvent {
  /**
    * The partial response body as downloaded so far.
    *
    * Only present if the responseType was `text`.
    */
  var partialText: js.UndefOr[String] = js.native
  @JSName("type")
  var type_HttpDownloadProgressEvent: DownloadProgress = js.native
}

object HttpDownloadProgressEvent {
  @scala.inline
  def apply(loaded: Double, `type`: DownloadProgress): HttpDownloadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadProgressEvent]
  }
  @scala.inline
  implicit class HttpDownloadProgressEventOps[Self <: HttpDownloadProgressEvent] (val x: Self) extends AnyVal {
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
    def setType(value: DownloadProgress): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartialText(value: String): Self = this.set("partialText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialText: Self = this.set("partialText", js.undefined)
  }
  
}

