package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBucketAnalyticsConfigurationsRequest extends js.Object {
  /**
    * The name of the bucket from which analytics configurations are retrieved.
    */
  var Bucket: BucketName = js.native
  /**
    * The ContinuationToken that represents a placeholder from where this request should begin.
    */
  var ContinuationToken: js.UndefOr[Token] = js.native
}

object ListBucketAnalyticsConfigurationsRequest {
  @scala.inline
  def apply(Bucket: BucketName, ContinuationToken: Token = null): ListBucketAnalyticsConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketAnalyticsConfigurationsRequest]
  }
}

