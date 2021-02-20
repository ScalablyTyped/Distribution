package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutStreamOptions extends StObject {
  
  var callback: ObjectCallback = js.native
  
  var contentLength: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  // custom mime, will send with Content-Type entity header
  var meta: UserMeta = js.native
  
  // the operation timeout
  var mime: String = js.native
  
  // the stream length, chunked encoding will be used if absent
  var timeout: Double = js.native
}
object PutStreamOptions {
  
  @scala.inline
  def apply(callback: ObjectCallback, meta: UserMeta, mime: String, timeout: Double): PutStreamOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStreamOptions]
  }
  
  @scala.inline
  implicit class PutStreamOptionsMutableBuilder[Self <: PutStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLength(value: Double): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
