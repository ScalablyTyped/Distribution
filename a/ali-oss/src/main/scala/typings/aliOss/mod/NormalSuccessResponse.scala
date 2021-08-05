package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalSuccessResponse extends StObject {
  
  // response headers
  var headers: js.Object
  
  //  request total use time (ms)
  var rt: Double
  
  // todo the object in detail
  // response size
  var size: Double
  
  // response status
  var status: Double
}
object NormalSuccessResponse {
  
  inline def apply(headers: js.Object, rt: Double, size: Double, status: Double): NormalSuccessResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalSuccessResponse]
  }
  
  extension [Self <: NormalSuccessResponse](x: Self) {
    
    inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setRt(value: Double): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
