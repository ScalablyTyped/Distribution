package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SamplingStrategy extends js.Object {
  /**
    * The name of a sampling rule.
    */
  var Name: js.UndefOr[SamplingStrategyName] = js.undefined
  /**
    * The value of a sampling rule.
    */
  var Value: js.UndefOr[NullableDouble] = js.undefined
}

object SamplingStrategy {
  @scala.inline
  def apply(Name: SamplingStrategyName = null, Value: js.UndefOr[NullableDouble] = js.undefined): SamplingStrategy = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[SamplingStrategy]
  }
}

