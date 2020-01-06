package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerSideEncryptionByDefault extends js.Object {
  /**
    * KMS master key ID to use for the default encryption. This parameter is allowed if and only if SSEAlgorithm is set to aws:kms.
    */
  var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.native
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: ServerSideEncryption = js.native
}

object ServerSideEncryptionByDefault {
  @scala.inline
  def apply(SSEAlgorithm: ServerSideEncryption, KMSMasterKeyID: SSEKMSKeyId = null): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    if (KMSMasterKeyID != null) __obj.updateDynamic("KMSMasterKeyID")(KMSMasterKeyID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
}

