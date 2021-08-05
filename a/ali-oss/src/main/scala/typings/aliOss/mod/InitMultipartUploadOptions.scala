package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitMultipartUploadOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  // Mime file type
  var meta: js.UndefOr[UserMeta] = js.undefined
  
  var mime: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object InitMultipartUploadOptions {
  
  inline def apply(): InitMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitMultipartUploadOptions]
  }
  
  extension [Self <: InitMultipartUploadOptions](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
