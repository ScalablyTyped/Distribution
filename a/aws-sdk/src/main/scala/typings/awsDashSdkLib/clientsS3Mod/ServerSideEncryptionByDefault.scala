package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSideEncryptionByDefault extends js.Object {
  /**
    * KMS master key ID to use for the default encryption. This parameter is allowed if SSEAlgorithm is aws:kms.
    */
  var KMSMasterKeyID: js.UndefOr[SSEKMSKeyId] = js.undefined
  /**
    * Server-side encryption algorithm to use for the default encryption.
    */
  var SSEAlgorithm: ServerSideEncryption
}

object ServerSideEncryptionByDefault {
  @scala.inline
  def apply(SSEAlgorithm: ServerSideEncryption, KMSMasterKeyID: SSEKMSKeyId = null): ServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(SSEAlgorithm = SSEAlgorithm.asInstanceOf[js.Any])
    if (KMSMasterKeyID != null) __obj.updateDynamic("KMSMasterKeyID")(KMSMasterKeyID)
    __obj.asInstanceOf[ServerSideEncryptionByDefault]
  }
}

