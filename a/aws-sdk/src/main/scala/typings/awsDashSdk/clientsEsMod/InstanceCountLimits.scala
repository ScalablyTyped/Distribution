package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceCountLimits extends js.Object {
  var MaximumInstanceCount: js.UndefOr[typings.awsDashSdk.clientsEsMod.MaximumInstanceCount] = js.undefined
  var MinimumInstanceCount: js.UndefOr[typings.awsDashSdk.clientsEsMod.MinimumInstanceCount] = js.undefined
}

object InstanceCountLimits {
  @scala.inline
  def apply(
    MaximumInstanceCount: js.UndefOr[MaximumInstanceCount] = js.undefined,
    MinimumInstanceCount: js.UndefOr[MinimumInstanceCount] = js.undefined
  ): InstanceCountLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaximumInstanceCount)) __obj.updateDynamic("MaximumInstanceCount")(MaximumInstanceCount)
    if (!js.isUndefined(MinimumInstanceCount)) __obj.updateDynamic("MinimumInstanceCount")(MinimumInstanceCount)
    __obj.asInstanceOf[InstanceCountLimits]
  }
}

