package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMultipartUploadOptions extends StObject {
  
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object CompleteMultipartUploadOptions {
  
  inline def apply(): CompleteMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteMultipartUploadOptions]
  }
  
  extension [Self <: CompleteMultipartUploadOptions](x: Self) {
    
    inline def setCallback(value: ObjectCallback): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
