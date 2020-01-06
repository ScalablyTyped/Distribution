package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase1IntegrityAlgorithmsListValue extends js.Object {
  /**
    * The value for the integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.native
}

object Phase1IntegrityAlgorithmsListValue {
  @scala.inline
  def apply(Value: String = null): Phase1IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase1IntegrityAlgorithmsListValue]
  }
}

