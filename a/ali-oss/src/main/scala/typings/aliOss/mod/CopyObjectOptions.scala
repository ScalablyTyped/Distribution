package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyObjectOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var meta: js.UndefOr[UserMeta] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object CopyObjectOptions {
  
  inline def apply(): CopyObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyObjectOptions]
  }
  
  extension [Self <: CopyObjectOptions](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
