package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryption extends js.Object {
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3 (e.g., AES256, aws:kms).
    */
  var EncryptionType: ServerSideEncryption
  /**
    * If the encryption type is aws:kms, this optional value can be used to specify the encryption context for the restore results.
    */
  var KMSContext: js.UndefOr[KMSContext] = js.undefined
  /**
    * If the encryption type is aws:kms, this optional value specifies the AWS KMS key ID to use for encryption of job results.
    */
  var KMSKeyId: js.UndefOr[SSEKMSKeyId] = js.undefined
}

object Encryption {
  @scala.inline
  def apply(EncryptionType: ServerSideEncryption, KMSContext: KMSContext = null, KMSKeyId: SSEKMSKeyId = null): Encryption = {
    val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any])
    if (KMSContext != null) __obj.updateDynamic("KMSContext")(KMSContext)
    if (KMSKeyId != null) __obj.updateDynamic("KMSKeyId")(KMSKeyId)
    __obj.asInstanceOf[Encryption]
  }
}

