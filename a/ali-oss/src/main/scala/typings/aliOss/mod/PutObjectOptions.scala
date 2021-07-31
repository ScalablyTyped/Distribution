package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectOptions extends StObject {
  
  // user meta, will send with x-oss-meta- prefix string e.g.: { uid: 123, pid: 110 }
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.undefined
  
  // the operation timeout
  var mime: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object PutObjectOptions {
  
  @scala.inline
  def apply(): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectOptions]
  }
  
  @scala.inline
  implicit class PutObjectOptionsMutableBuilder[Self <: PutObjectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
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
