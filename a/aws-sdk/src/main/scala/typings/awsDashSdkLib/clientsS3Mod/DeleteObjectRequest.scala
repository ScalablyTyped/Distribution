package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteObjectRequest extends js.Object {
  /**
    * 
    */
  var Bucket: BucketName
  /**
    * Indicates whether S3 Object Lock should bypass Governance-mode restrictions to process this operation.
    */
  var BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined
  /**
    * 
    */
  var Key: ObjectKey
  /**
    * The concatenation of the authentication device's serial number, a space, and the value that is displayed on your authentication device.
    */
  var MFA: js.UndefOr[MFA] = js.undefined
  var RequestPayer: js.UndefOr[RequestPayer] = js.undefined
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}

object DeleteObjectRequest {
  @scala.inline
  def apply(
    Bucket: BucketName,
    Key: ObjectKey,
    BypassGovernanceRetention: js.UndefOr[BypassGovernanceRetention] = js.undefined,
    MFA: MFA = null,
    RequestPayer: RequestPayer = null,
    VersionId: ObjectVersionId = null
  ): DeleteObjectRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Key = Key)
    if (!js.isUndefined(BypassGovernanceRetention)) __obj.updateDynamic("BypassGovernanceRetention")(BypassGovernanceRetention)
    if (MFA != null) __obj.updateDynamic("MFA")(MFA)
    if (RequestPayer != null) __obj.updateDynamic("RequestPayer")(RequestPayer.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[DeleteObjectRequest]
  }
}

