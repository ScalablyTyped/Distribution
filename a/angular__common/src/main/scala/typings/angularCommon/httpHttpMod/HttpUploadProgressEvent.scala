package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.UploadProgress
import org.scalablytyped.runtime.StObject
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
  implicit class HttpUploadProgressEventMutableBuilder[Self <: HttpUploadProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UploadProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
