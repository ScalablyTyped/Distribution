package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultipartUploadCopySourceData extends StObject {
  
  // data copy start byte offset, e.g: 0
  var endOffset: Double
  
  // the source object name
  var sourceBucketName: String
  
  var sourceKey: String
  
  // sourceData.  the source bucket name
  var startOffset: Double
}
object MultipartUploadCopySourceData {
  
  @scala.inline
  def apply(endOffset: Double, sourceBucketName: String, sourceKey: String, startOffset: Double): MultipartUploadCopySourceData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadCopySourceData]
  }
  
  @scala.inline
  implicit class MultipartUploadCopySourceDataMutableBuilder[Self <: MultipartUploadCopySourceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndOffset(value: Double): Self = StObject.set(x, "endOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBucketName(value: String): Self = StObject.set(x, "sourceBucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceKey(value: String): Self = StObject.set(x, "sourceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartOffset(value: Double): Self = StObject.set(x, "startOffset", value.asInstanceOf[js.Any])
  }
}
