package typings.awsLambda.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3EventRecordGlacierEventData extends js.Object {
  var restoreEventData: S3EventRecordGlacierRestoreEventData
}

object S3EventRecordGlacierEventData {
  @scala.inline
  def apply(restoreEventData: S3EventRecordGlacierRestoreEventData): S3EventRecordGlacierEventData = {
    val __obj = js.Dynamic.literal(restoreEventData = restoreEventData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3EventRecordGlacierEventData]
  }
}

