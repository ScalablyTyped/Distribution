package typings.angularCommon.httpHttpMod

import typings.angularCommon.httpHttpMod.HttpEventType.DownloadProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpDownloadProgressEvent
  extends StObject
     with HttpProgressEvent {
  
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
  def apply(loaded: Double, `type`: DownloadProgress): HttpDownloadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadProgressEvent]
  }
  
  @scala.inline
  implicit class HttpDownloadProgressEventMutableBuilder[Self <: HttpDownloadProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartialText(value: String): Self = StObject.set(x, "partialText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialTextUndefined: Self = StObject.set(x, "partialText", js.undefined)
    
    @scala.inline
    def setType(value: DownloadProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
