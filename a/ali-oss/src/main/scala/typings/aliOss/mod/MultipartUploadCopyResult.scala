package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipartUploadCopyResult extends StObject {
  
  var bucket: String = js.native
  
  var etag: String = js.native
  
  var name: String = js.native
  
  var res: NormalSuccessResponse = js.native
}
object MultipartUploadCopyResult {
  
  @scala.inline
  def apply(bucket: String, etag: String, name: String, res: NormalSuccessResponse): MultipartUploadCopyResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadCopyResult]
  }
  
  @scala.inline
  implicit class MultipartUploadCopyResultMutableBuilder[Self <: MultipartUploadCopyResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
