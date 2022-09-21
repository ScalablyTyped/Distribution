package typings.angularCommon.httpMod

import typings.angularCommon.httpMod.HttpEventType.DownloadProgress
import typings.angularCommon.httpMod.HttpEventType.UploadProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpProgressEvent
  extends StObject
     with HttpEvent[Any] {
  
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
  
  inline def apply(loaded: Double, `type`: DownloadProgress | UploadProgress): HttpProgressEvent = {
    val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProgressEvent]
  }
  
  extension [Self <: HttpProgressEvent](x: Self) {
    
    inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: DownloadProgress | UploadProgress): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
