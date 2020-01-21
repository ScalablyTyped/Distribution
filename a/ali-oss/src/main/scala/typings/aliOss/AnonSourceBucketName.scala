package typings.aliOss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSourceBucketName extends js.Object {
  var sourceBucketName: String
  var sourceKey: String
}

object AnonSourceBucketName {
  @scala.inline
  def apply(sourceBucketName: String, sourceKey: String): AnonSourceBucketName = {
    val __obj = js.Dynamic.literal(sourceBucketName = sourceBucketName.asInstanceOf[js.Any], sourceKey = sourceKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSourceBucketName]
  }
}

