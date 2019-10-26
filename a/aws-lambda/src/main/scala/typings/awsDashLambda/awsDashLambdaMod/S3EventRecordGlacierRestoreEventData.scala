package typings.awsDashLambda.awsDashLambdaMod

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
    val __obj = js.Dynamic.literal(lifecycleRestorationExpiryTime = lifecycleRestorationExpiryTime, lifecycleRestoreStorageClass = lifecycleRestoreStorageClass)
  
    __obj.asInstanceOf[S3EventRecordGlacierRestoreEventData]
  }
}

