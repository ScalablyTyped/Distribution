package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectsRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Specifies whether you want to delete this object even if it has a Governance-type Object Lock in place. You must have sufficient permissions to perform this operation.
    */
  var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined
  /**
    * 
    */
  var Delete: awsDashSdkLib.clientsS3Mod.Delete
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[MFA] = js.undefined
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
}

object DeleteObjectsRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Delete: Delete,
    BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined,
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

