package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingStrategy extends js.Object {
  /**
    * The name of a sampling rule.
    */
  var Name: js.UndefOr[SamplingStrategyName] = js.native
  /**
    * The value of a sampling rule.
    */
  var Value: js.UndefOr[NullableDouble] = js.native
}

object SamplingStrategy {
  @scala.inline
  def apply(Name: SamplingStrategyName = null, Value: Int | scala.Double = null): SamplingStrategy = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingStrategy]
  }
}

