package typings.awsLambda.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3EventRecordGlacierRestoreEventData extends js.Object {
  var lifecycleRestorationExpiryTime: String
  var lifecycleRestoreStorageClass: String
}

object S3EventRecordGlacierRestoreEventData {
  @scala.inline
  def apply(lifecycleRestorationExpiryTime: String, lifecycleRestoreStorageClass: String): S3EventRecordGlacierRestoreEventData = {
    val __obj = js.Dynamic.literal(lifecycleRestorationExpiryTime = lifecycleRestorationExpiryTime.asInstanceOf[js.Any], lifecycleRestoreStorageClass = lifecycleRestoreStorageClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3EventRecordGlacierRestoreEventData]
  }
}

