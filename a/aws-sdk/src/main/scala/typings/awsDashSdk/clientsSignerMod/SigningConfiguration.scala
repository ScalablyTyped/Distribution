package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigningConfiguration extends js.Object {
  /**
    * The encryption algorithm options that are available for an AWS Signer job.
    */
  var encryptionAlgorithmOptions: EncryptionAlgorithmOptions
  /**
    * The hash algorithm options that are available for an AWS Signer job.
    */
  var hashAlgorithmOptions: HashAlgorithmOptions
}

object SigningConfiguration {
  @scala.inline
  def apply(encryptionAlgorithmOptions: EncryptionAlgorithmOptions, hashAlgorithmOptions: HashAlgorithmOptions): SigningConfiguration = {
    val __obj = js.Dynamic.literal(encryptionAlgorithmOptions = encryptionAlgorithmOptions, hashAlgorithmOptions = hashAlgorithmOptions)
  
    __obj.asInstanceOf[SigningConfiguration]
  }
}

