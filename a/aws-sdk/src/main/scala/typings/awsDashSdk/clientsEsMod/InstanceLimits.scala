package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceLimits extends js.Object {
  var InstanceCountLimits: js.UndefOr[typings.awsDashSdk.clientsEsMod.InstanceCountLimits] = js.undefined
}

object InstanceLimits {
  @scala.inline
  def apply(InstanceCountLimits: InstanceCountLimits = null): InstanceLimits = {
    val __obj = js.Dynamic.literal()
    if (InstanceCountLimits != null) __obj.updateDynamic("InstanceCountLimits")(InstanceCountLimits)
    __obj.asInstanceOf[InstanceLimits]
  }
}

