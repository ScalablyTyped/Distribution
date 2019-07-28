package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningConfigurationOverrides extends js.Object {
  /**
    * A specified override of the default encryption algorithm that is used in an AWS Signer job.
    */
  var encryptionAlgorithm: js.UndefOr[EncryptionAlgorithm] = js.undefined
  /**
    * A specified override of the default hash algorithm that is used in an AWS Signer job.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.undefined
}

object SigningConfigurationOverrides {
  @scala.inline
  def apply(encryptionAlgorithm: EncryptionAlgorithm = null, hashAlgorithm: HashAlgorithm = null): SigningConfigurationOverrides = {
    val __obj = js.Dynamic.literal()
    if (encryptionAlgorithm != null) __obj.updateDynamic("encryptionAlgorithm")(encryptionAlgorithm.asInstanceOf[js.Any])
    if (hashAlgorithm != null) __obj.updateDynamic("hashAlgorithm")(hashAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningConfigurationOverrides]
  }
}

