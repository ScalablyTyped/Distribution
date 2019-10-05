package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase2DHGroupNumbersListValue extends js.Object {
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}

object Phase2DHGroupNumbersListValue {
  @scala.inline
  def apply(Value: Int | scala.Double = null): Phase2DHGroupNumbersListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase2DHGroupNumbersListValue]
  }
}

