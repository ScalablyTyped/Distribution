package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase2EncryptionAlgorithmsRequestListValue extends js.Object {
  /**
    * The encryption algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object Phase2EncryptionAlgorithmsRequestListValue {
  @scala.inline
  def apply(Value: String = null): Phase2EncryptionAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Phase2EncryptionAlgorithmsRequestListValue]
  }
}

