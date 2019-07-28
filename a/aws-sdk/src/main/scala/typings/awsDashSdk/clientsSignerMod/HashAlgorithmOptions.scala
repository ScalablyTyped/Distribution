package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashAlgorithmOptions extends js.Object {
  /**
    * The set of accepted hash algorithms allowed in an AWS Signer job.
    */
  var allowedValues: HashAlgorithms
  /**
    * The default hash algorithm that is used in an AWS Signer job.
    */
  var defaultValue: HashAlgorithm
}

object HashAlgorithmOptions {
  @scala.inline
  def apply(allowedValues: HashAlgorithms, defaultValue: HashAlgorithm): HashAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues, defaultValue = defaultValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashAlgorithmOptions]
  }
}

