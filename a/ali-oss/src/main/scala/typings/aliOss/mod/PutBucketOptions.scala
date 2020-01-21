package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketOptions extends js.Object {
  var storageClass: StorageType
  var timeout: Double
}

object PutBucketOptions {
  @scala.inline
  def apply(storageClass: StorageType, timeout: Double): PutBucketOptions = {
    val __obj = js.Dynamic.literal(storageClass = storageClass.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketOptions]
  }
}

