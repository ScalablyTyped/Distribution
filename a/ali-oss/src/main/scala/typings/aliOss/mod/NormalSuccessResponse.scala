package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NormalSuccessResponse extends StObject {
  
  // response headers
  var headers: js.Object = js.native
  
  //  request total use time (ms)
  var rt: Double = js.native
  
  // todo the object in detail
  // response size
  var size: Double = js.native
  
  // response status
  var status: Double = js.native
}
object NormalSuccessResponse {
  
  @scala.inline
  def apply(headers: js.Object, rt: Double, size: Double, status: Double): NormalSuccessResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], rt = rt.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalSuccessResponse]
  }
  
  @scala.inline
  implicit class NormalSuccessResponseMutableBuilder[Self <: NormalSuccessResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRt(value: Double): Self = StObject.set(x, "rt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
