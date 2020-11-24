package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress
import typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProgressEvent
  extends HttpEvent[js.Any] {
  
  /**
    * Number of bytes uploaded or downloaded.
    */
  var loaded: Double = js.native
  
  /**
    * Total number of bytes to upload or download. Depending on the request or
    * response, this may not be computable and thus may not be present.
    */
  var total: js.UndefOr[Double] = js.native
  
  /**
    * Progress event type is either upload or download.
    */
  var `type`: DownloadProgress | UploadProgress = js.native
}
object HttpProgressEvent {
  
  @scala.inline
  def apply(loaded: Double, `type`: DownloadProgress | UploadProgress): HttpProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgressEvent]
  }
  
  @scala.inline
  implicit class HttpProgressEventOps[Self <: HttpProgressEvent] (val x: Self) extends AnyVal {
    
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
    def setLoaded(value: Double): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DownloadProgress | UploadProgress): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
