package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadObjectResult extends StObject {
  
  // response status, maybe 200 or 304
  var meta: UserMeta
  
  var res: NormalSuccessResponse
  
  var status: Double
}
object HeadObjectResult {
  
  inline def apply(meta: UserMeta, res: NormalSuccessResponse, status: Double): HeadObjectResult = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadObjectResult]
  }
  
  extension [Self <: HeadObjectResult](x: Self) {
    
    inline def setMeta(value: UserMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
