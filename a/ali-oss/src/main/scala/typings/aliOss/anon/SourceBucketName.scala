package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceBucketName extends js.Object {
  var sourceBucketName: String = js.native
  var sourceKey: String = js.native
}

object SourceBucketName {
  @scala.inline
  def apply(sourceBucketName: String, sourceKey: String): SourceBucketName = {
    val __obj = js.Dynamic.literal(sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBucketName]
  }
  @scala.inline
  implicit class SourceBucketNameOps[Self <: SourceBucketName] (val x: Self) extends AnyVal {
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
    def setSourceBucketName(value: String): Self = this.set("sourceBucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceKey(value: String): Self = this.set("sourceKey", value.asInstanceOf[js.Any])
  }
  
}

