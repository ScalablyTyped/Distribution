package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartUploadCopySourceData extends js.Object {
   // data copy start byte offset, e.g: 0
  var endOffset: Double = js.native
   // the source object name
  var sourceBucketName: String = js.native
  var sourceKey: String = js.native
   // sourceData.  the source bucket name
  var startOffset: Double = js.native
}

object MultipartUploadCopySourceData {
  @scala.inline
  def apply(endOffset: Double, sourceBucketName: String, sourceKey: String, startOffset: Double): MultipartUploadCopySourceData = {
    val __obj = js.Dynamic.literal(endOffset = endOffset.asInstanceOf[js.Any], sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadCopySourceData]
  }
  @scala.inline
  implicit class MultipartUploadCopySourceDataOps[Self <: MultipartUploadCopySourceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndOffset(value: Double): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceBucketName(value: String): Self = this.set("sourceBucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceKey(value: String): Self = this.set("sourceKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: Double): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}

