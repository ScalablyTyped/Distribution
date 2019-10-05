package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShrinkPolicy extends js.Object {
  /**
    * The desired timeout for decommissioning an instance. Overrides the default YARN decommissioning timeout.
    */
  var DecommissionTimeout: js.UndefOr[Integer] = js.undefined
  /**
    * Custom policy for requesting termination protection or termination of specific instances when shrinking an instance group.
    */
  var InstanceResizePolicy: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceResizePolicy] = js.undefined
}

object ShrinkPolicy {
  @scala.inline
  def apply(DecommissionTimeout: Int | Double = null, InstanceResizePolicy: InstanceResizePolicy = null): ShrinkPolicy = {
    val __obj = js.Dynamic.literal()
    if (DecommissionTimeout != null) __obj.updateDynamic("DecommissionTimeout")(DecommissionTimeout.asInstanceOf[js.Any])
    if (InstanceResizePolicy != null) __obj.updateDynamic("InstanceResizePolicy")(InstanceResizePolicy)
    __obj.asInstanceOf[ShrinkPolicy]
  }
}

