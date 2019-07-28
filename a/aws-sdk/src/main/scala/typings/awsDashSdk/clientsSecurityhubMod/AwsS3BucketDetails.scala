package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsS3BucketDetails extends js.Object {
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The display name of the owner of the S3 bucket.
    */
  var OwnerName: js.UndefOr[NonEmptyString] = js.undefined
}

object AwsS3BucketDetails {
  @scala.inline
  def apply(OwnerId: NonEmptyString = null, OwnerName: NonEmptyString = null): AwsS3BucketDetails = {
    val __obj = js.Dynamic.literal()
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (OwnerName != null) __obj.updateDynamic("OwnerName")(OwnerName)
    __obj.asInstanceOf[AwsS3BucketDetails]
  }
}

