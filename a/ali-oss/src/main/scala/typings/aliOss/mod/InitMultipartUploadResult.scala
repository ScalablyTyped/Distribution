package typings.aliOss.mod

import typings.aliOss.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitMultipartUploadResult extends StObject {
  
  var bucket: String
  
  // bucket name
  var name: String
  
  var res: Headers
  
  // object name store on OSS
  var uploadId: String
}
object InitMultipartUploadResult {
  
  inline def apply(bucket: String, name: String, res: Headers, uploadId: String): InitMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitMultipartUploadResult]
  }
  
  extension [Self <: InitMultipartUploadResult](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRes(value: Headers): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
