package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEbsDefaultKmsKeyIdResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the default CMK for encryption by default.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
}

object GetEbsDefaultKmsKeyIdResult {
  @scala.inline
  def apply(KmsKeyId: String = null): GetEbsDefaultKmsKeyIdResult = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    __obj.asInstanceOf[GetEbsDefaultKmsKeyIdResult]
  }
}

