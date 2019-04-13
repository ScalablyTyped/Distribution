package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBucketInventoryConfigurationsRequest extends js.Object {
  /**
    * The name of the bucket containing the inventory configurations to retrieve.
    */
  var Bucket: BucketName
  /**
    * The marker used to continue an inventory configuration listing that has been truncated. Use the NextContinuationToken from a previously truncated list response to continue the listing. The continuation token is an opaque value that Amazon S3 understands.
    */
  var ContinuationToken: js.UndefOr[Token] = js.undefined
}

object ListBucketInventoryConfigurationsRequest {
  @scala.inline
  def apply(Bucket: BucketName, ContinuationToken: Token = null): ListBucketInventoryConfigurationsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket)
    if (ContinuationToken != null) __obj.updateDynamic("ContinuationToken")(ContinuationToken)
    __obj.asInstanceOf[ListBucketInventoryConfigurationsRequest]
  }
}

