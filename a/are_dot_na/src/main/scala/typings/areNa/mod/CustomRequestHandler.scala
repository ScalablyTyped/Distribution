package typings.areNa.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom request handler function
  */
trait CustomRequestHandler extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * Request method (GET, POST, etc.)
    */
  var method: String
  
  var options: js.UndefOr[Params] = js.undefined
  
  var url: String
}
object CustomRequestHandler {
  
  inline def apply(method: String, url: String): CustomRequestHandler = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRequestHandler]
  }
  
  extension [Self <: CustomRequestHandler](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Params): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
