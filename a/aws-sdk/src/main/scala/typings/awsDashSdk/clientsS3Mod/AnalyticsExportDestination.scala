package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsExportDestination extends js.Object {
  /**
    * A destination signifying output to an S3 bucket.
    */
  var S3BucketDestination: AnalyticsS3BucketDestination
}

object AnalyticsExportDestination {
  @scala.inline
  def apply(S3BucketDestination: AnalyticsS3BucketDestination): AnalyticsExportDestination = {
    val __obj = js.Dynamic.literal(S3BucketDestination = S3BucketDestination)
  
    __obj.asInstanceOf[AnalyticsExportDestination]
  }
}

