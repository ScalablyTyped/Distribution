package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectOptions extends StObject {
  
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  /** user meta, will send with x-oss-meta- prefix string e.g.: { uid: 123, pid: 110 } */
  var meta: js.UndefOr[UserMeta] = js.undefined
  
  /** custom mime, will send with Content-Type entity header */
  var mime: js.UndefOr[String] = js.undefined
  
  /** the operation timeout */
  var timeout: js.UndefOr[Double] = js.undefined
}
object PutObjectOptions {
  
  inline def apply(): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectOptions]
  }
  
  extension [Self <: PutObjectOptions](x: Self) {
    
    inline def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
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
