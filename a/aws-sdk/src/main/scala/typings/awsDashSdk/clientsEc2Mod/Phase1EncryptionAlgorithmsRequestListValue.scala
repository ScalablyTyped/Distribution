package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase1EncryptionAlgorithmsRequestListValue extends js.Object {
  /**
    * The value for the encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object Phase1EncryptionAlgorithmsRequestListValue {
  @scala.inline
  def apply(Value: String = null): Phase1EncryptionAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Phase1EncryptionAlgorithmsRequestListValue]
  }
}

