package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartUploadCopyResult extends StObject {
  
  var bucket: String
  
  var etag: String
  
  var name: String
  
  var res: NormalSuccessResponse
}
object MultipartUploadCopyResult {
  
  inline def apply(bucket: String, etag: String, name: String, res: NormalSuccessResponse): MultipartUploadCopyResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadCopyResult]
  }
  
  extension [Self <: MultipartUploadCopyResult](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
