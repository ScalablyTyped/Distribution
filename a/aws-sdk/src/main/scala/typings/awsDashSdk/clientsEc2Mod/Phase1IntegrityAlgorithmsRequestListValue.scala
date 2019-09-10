package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase1IntegrityAlgorithmsRequestListValue extends js.Object {
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object Phase1IntegrityAlgorithmsRequestListValue {
  @scala.inline
  def apply(Value: String = null): Phase1IntegrityAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsRequestListValue]
  }
}

