package typings.aliOss.mod

import typings.aliOss.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitMultipartUploadResult extends StObject {
  
  var bucket: String = js.native
  
  // bucket name
  var name: String = js.native
  
  var res: Headers = js.native
  
  // object name store on OSS
  var uploadId: String = js.native
}
object InitMultipartUploadResult {
  
  @scala.inline
  def apply(bucket: String, name: String, res: Headers, uploadId: String): InitMultipartUploadResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitMultipartUploadResult]
  }
  
  @scala.inline
  implicit class InitMultipartUploadResultMutableBuilder[Self <: InitMultipartUploadResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: Headers): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
  }
}
