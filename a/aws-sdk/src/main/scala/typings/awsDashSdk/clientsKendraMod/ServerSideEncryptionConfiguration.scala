package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionConfiguration extends js.Object {
  /**
    * The identifier of the AWS KMS customer master key (CMK). Amazon Kendra doesn't support asymmetric CMKs.
    */
  var KmsKeyId: js.UndefOr[typings.awsDashSdk.clientsKendraMod.KmsKeyId] = js.native
}

object ServerSideEncryptionConfiguration {
  @scala.inline
  def apply(KmsKeyId: KmsKeyId = null): ServerSideEncryptionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionConfiguration]
  }
}

