package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiOptions extends StObject {
  
  var quite: js.UndefOr[Boolean] = js.undefined
  
  // quite mode or verbose mode, default is false
  var timeout: js.UndefOr[Double] = js.undefined
}
object DeleteMultiOptions {
  
  inline def apply(): DeleteMultiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMultiOptions]
  }
  
  extension [Self <: DeleteMultiOptions](x: Self) {
    
    inline def setQuite(value: Boolean): Self = StObject.set(x, "quite", value.asInstanceOf[js.Any])
    
    inline def setQuiteUndefined: Self = StObject.set(x, "quite", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
