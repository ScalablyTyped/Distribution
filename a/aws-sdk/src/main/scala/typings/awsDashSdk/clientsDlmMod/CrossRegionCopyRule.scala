package typings.awsDashSdk.clientsDlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossRegionCopyRule extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS KMS customer master key (CMK) to use for EBS encryption. If this parameter is not specified, your AWS managed CMK for EBS is used.
    */
  var CmkArn: js.UndefOr[typings.awsDashSdk.clientsDlmMod.CmkArn] = js.native
  /**
    * Copy all user-defined tags from the source snapshot to the copied snapshot.
    */
  var CopyTags: js.UndefOr[CopyTagsNullable] = js.native
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
    */
  var Encrypted: typings.awsDashSdk.clientsDlmMod.Encrypted = js.native
  /**
    * The retention rule.
    */
  var RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.native
  /**
    * The target Region.
    */
  var TargetRegion: typings.awsDashSdk.clientsDlmMod.TargetRegion = js.native
}

object CrossRegionCopyRule {
  @scala.inline
  def apply(
    Encrypted: Encrypted,
    TargetRegion: TargetRegion,
    CmkArn: CmkArn = null,
    CopyTags: js.UndefOr[Boolean] = js.undefined,
    RetainRule: CrossRegionCopyRetainRule = null
  ): CrossRegionCopyRule = {
    val __obj = js.Dynamic.literal(Encrypted = Encrypted.asInstanceOf[js.Any], TargetRegion = TargetRegion.asInstanceOf[js.Any])
    if (CmkArn != null) __obj.updateDynamic("CmkArn")(CmkArn.asInstanceOf[js.Any])
    if (!js.isUndefined(CopyTags)) __obj.updateDynamic("CopyTags")(CopyTags.asInstanceOf[js.Any])
    if (RetainRule != null) __obj.updateDynamic("RetainRule")(RetainRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyRule]
  }
}

