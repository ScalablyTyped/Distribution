package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketVersioningOutput extends js.Object {
  /**
    * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
    */
  var MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined
  /**
    * The versioning state of the bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
}

object GetBucketVersioningOutput {
  @scala.inline
  def apply(MFADelete: MFADeleteStatus = null, Status: BucketVersioningStatus = null): GetBucketVersioningOutput = {
    val __obj = js.Dynamic.literal()
    if (MFADelete != null) __obj.updateDynamic("MFADelete")(MFADelete.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketVersioningOutput]
  }
}

