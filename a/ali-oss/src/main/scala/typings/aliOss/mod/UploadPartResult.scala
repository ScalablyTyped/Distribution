package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadPartResult extends StObject {
  
  var etag: String
  
  var name: String
  
  var res: NormalSuccessResponse
}
object UploadPartResult {
  
  inline def apply(etag: String, name: String, res: NormalSuccessResponse): UploadPartResult = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadPartResult]
  }
  
  extension [Self <: UploadPartResult](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
