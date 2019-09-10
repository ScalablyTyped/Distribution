package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phase2IntegrityAlgorithmsListValue extends js.Object {
  /**
    * The integrity algorithm.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object Phase2IntegrityAlgorithmsListValue {
  @scala.inline
  def apply(Value: String = null): Phase2IntegrityAlgorithmsListValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Phase2IntegrityAlgorithmsListValue]
  }
}

