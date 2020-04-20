package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadCopySourceData extends js.Object {
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
}

