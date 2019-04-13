package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptionAlgorithmOptions extends js.Object {
  /**
    * The set of accepted encryption algorithms that are allowed in an AWS Signer job.
    */
  var allowedValues: EncryptionAlgorithms
  /**
    * The default encryption algorithm that is used by an AWS Signer job.
    */
  var defaultValue: EncryptionAlgorithm
}

object EncryptionAlgorithmOptions {
  @scala.inline
  def apply(allowedValues: EncryptionAlgorithms, defaultValue: EncryptionAlgorithm): EncryptionAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues, defaultValue = defaultValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncryptionAlgorithmOptions]
  }
}

