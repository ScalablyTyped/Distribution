package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetEbsDefaultKmsKeyIdResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the default CMK for EBS encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
}

object ResetEbsDefaultKmsKeyIdResult {
  @scala.inline
  def apply(KmsKeyId: String = null): ResetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[ResetEbsDefaultKmsKeyIdResult]
  }
}

