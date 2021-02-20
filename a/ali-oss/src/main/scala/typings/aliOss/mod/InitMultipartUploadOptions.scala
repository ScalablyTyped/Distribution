package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitMultipartUploadOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.native
  
  // Mime file type
  var meta: js.UndefOr[UserMeta] = js.native
  
  var mime: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object InitMultipartUploadOptions {
  
  @scala.inline
  def apply(): InitMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitMultipartUploadOptions]
  }
  
  @scala.inline
  implicit class InitMultipartUploadOptionsMutableBuilder[Self <: InitMultipartUploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
