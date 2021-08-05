package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadObjectOptions extends StObject {
  
  var headers: js.UndefOr[js.Object] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
}
object HeadObjectOptions {
  
  inline def apply(): HeadObjectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadObjectOptions]
  }
  
  extension [Self <: HeadObjectOptions](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
