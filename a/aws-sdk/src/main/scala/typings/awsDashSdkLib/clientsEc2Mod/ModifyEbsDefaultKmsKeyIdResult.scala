package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyEbsDefaultKmsKeyIdResult extends js.Object {
  /**
    * The full ARN of the default CMK that your account uses to encrypt an EBS volume when no CMK is specified in the API call that creates the volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
}

object ModifyEbsDefaultKmsKeyIdResult {
  @scala.inline
  def apply(KmsKeyId: String = null): ModifyEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[ModifyEbsDefaultKmsKeyIdResult]
  }
}

