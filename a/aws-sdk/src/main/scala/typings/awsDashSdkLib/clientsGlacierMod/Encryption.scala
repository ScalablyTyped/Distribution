package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryption extends js.Object {
  /**
    * The server-side encryption algorithm used when storing job results in Amazon S3, for example AES256 or aws:kms.
    */
  var EncryptionType: js.UndefOr[EncryptionType] = js.undefined
  /**
    * Optional. If the encryption type is aws:kms, you can use this value to specify the encryption context for the job results.
    */
  var KMSContext: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The AWS KMS key ID to use for object encryption. All GET and PUT requests for an object protected by AWS KMS fail if not made by using Secure Sockets Layer (SSL) or Signature Version 4. 
    */
  var KMSKeyId: js.UndefOr[java.lang.String] = js.undefined
}

object Encryption {
  @scala.inline
  def apply(
    EncryptionType: EncryptionType = null,
    KMSContext: java.lang.String = null,
    KMSKeyId: java.lang.String = null
  ): Encryption = {
    val __obj = js.Dynamic.literal()
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (KMSContext != null) __obj.updateDynamic("KMSContext")(KMSContext)
    if (KMSKeyId != null) __obj.updateDynamic("KMSKeyId")(KMSKeyId)
    __obj.asInstanceOf[Encryption]
  }
}

