package typings.angularCommon.httpMod

import typings.angularCommon.httpMod.HttpEventType.DownloadProgress
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
  
  inline def apply(loaded: Double, `type`: DownloadProgress): HttpDownloadProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpDownloadProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpDownloadProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setPartialText(value: String): Self = StObject.set(x, "partialText", value.asInstanceOf[js.Any])
    
    inline def setPartialTextUndefined: Self = StObject.set(x, "partialText", js.undefined)
    
    inline def setType(value: DownloadProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
