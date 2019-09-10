package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase1DHGroupNumbersListValue extends js.Object {
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.undefined
}

object Phase1DHGroupNumbersListValue {
  @scala.inline
  def apply(Value: js.UndefOr[Integer] = js.undefined): Phase1DHGroupNumbersListValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Phase1DHGroupNumbersListValue]
  }
}

