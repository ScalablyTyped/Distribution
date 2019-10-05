package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Specifies whether you want to delete this object even if it has a Governance-type object lock in place. You must have sufficient permissions to perform this operation.
    */
  var BypassGovernanceRetention: js.UndefOr[typings.awsDashSdk.clientsS3Mod.BypassGovernanceRetention] = js.undefined
  /**
    * 
    */
  var Delete: typings.awsDashSdk.clientsS3Mod.Delete
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[typings.awsDashSdk.clientsS3Mod.MFA] = js.undefined
  var RequestPayer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.RequestPayer] = js.undefined
}

object DeleteObjectsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delete: Delete,
    BypassGovernanceRetention: js.UndefOr[Boolean] = js.undefined,
    MFA: MFA = null,
    RequestPayer: RequestPayer = null
  ): DeleteObjectsRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Delete = Delete)
    if (!js.isUndefined(BypassGovernanceRetention)) __obj.updateDynamic("BypassGovernanceRetention")(BypassGovernanceRetention)
    if (MFA != null) __obj.updateDynamic("MFA")(MFA)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectsRequest]
  }
}

