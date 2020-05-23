package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceBucketName extends js.Object {
  var sourceBucketName: String
  var sourceKey: String
}

object SourceBucketName {
  @scala.inline
  def apply(sourceBucketName: String, sourceKey: String): SourceBucketName = {
    val __obj = js.Dynamic.literal(sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceBucketName]
  }
}

