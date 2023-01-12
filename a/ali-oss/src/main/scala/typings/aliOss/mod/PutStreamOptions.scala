package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutStreamOptions extends StObject {
  
  var callback: ObjectCallback
  
  /** the stream length, chunked encoding will be used if absent */
  var contentLength: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var meta: UserMeta
  
  /** custom mime, will send with Content-Type entity header */
  var mime: String
  
  /** the operation timeout */
  var timeout: Double
}
object PutStreamOptions {
  
  inline def apply(callback: ObjectCallback, meta: UserMeta, mime: String, timeout: Double): PutStreamOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
