package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
  /**
    * The name of the bucket from which analytics configurations are retrieved.
    */
  var Bucket: BucketName
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
}

object ListBucketAnalyticsConfigurationsRequest {
  @scala.inline
  def apply(Bucket: BucketName, ContinuationToken: Token = null): ListBucketAnalyticsConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
  }
}

