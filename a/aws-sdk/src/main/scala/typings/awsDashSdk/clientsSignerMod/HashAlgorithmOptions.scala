package typings.awsDashSdk.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HashAlgorithmOptions extends js.Object {
  /**
    * The set of accepted hash algorithms allowed in a code signing job.
    */
  var allowedValues: HashAlgorithms = js.native
  /**
    * The default hash algorithm that is used in a code signing job.
    */
  var defaultValue: HashAlgorithm = js.native
}

object HashAlgorithmOptions {
  @scala.inline
  def apply(allowedValues: HashAlgorithms, defaultValue: HashAlgorithm): HashAlgorithmOptions = {
    val __obj = js.Dynamic.literal(allowedValues = allowedValues.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HashAlgorithmOptions]
  }
}

