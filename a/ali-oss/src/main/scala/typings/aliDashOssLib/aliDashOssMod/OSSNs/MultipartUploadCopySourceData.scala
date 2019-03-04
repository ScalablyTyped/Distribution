package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadCopySourceData extends js.Object {
   // data copy start byte offset, e.g: 0
  var endOffset: scala.Double
   // the source object name
  var sourceBucketName: java.lang.String
  var sourceKey: java.lang.String
   // sourceData.  the source bucket name
  var startOffset: scala.Double
}

object MultipartUploadCopySourceData {
  @scala.inline
  def apply(
    endOffset: scala.Double,
    sourceBucketName: java.lang.String,
    sourceKey: java.lang.String,
    startOffset: scala.Double
  ): MultipartUploadCopySourceData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset, sourceBucketName = sourceBucketName, sourceKey = sourceKey, startOffset = startOffset)
  
    __obj.asInstanceOf[MultipartUploadCopySourceData]
  }
}

