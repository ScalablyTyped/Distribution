package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase2IntegrityAlgorithmsRequestListValue extends js.Object {
  /**
    * The integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase2IntegrityAlgorithmsRequestListValue {
  @scala.inline
  def apply(Value: String = null): Phase2IntegrityAlgorithmsRequestListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase2IntegrityAlgorithmsRequestListValue]
  }
}

