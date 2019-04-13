package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingInfo extends js.Object {
  /**
    * The name of an Amazon S3 bucket where execution logs are stored .
    */
  var S3BucketName: awsDashSdkLib.clientsSsmMod.S3BucketName
  /**
    * (Optional) The Amazon S3 bucket subfolder. 
    */
  var S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
  /**
    * The region where the Amazon S3 bucket is located.
    */
  var S3Region: awsDashSdkLib.clientsSsmMod.S3Region
}

object LoggingInfo {
  @scala.inline
  def apply(S3BucketName: S3BucketName, S3Region: S3Region, S3KeyPrefix: S3KeyPrefix = null): LoggingInfo = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName, S3Region = S3Region)
    if (S3KeyPrefix != null) __obj.updateDynamic("S3KeyPrefix")(S3KeyPrefix)
    __obj.asInstanceOf[LoggingInfo]
  }
}

