package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Limit extends js.Object {
  /**
    * The maximum value of the limit.
    */
  var Max: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Max] = js.native
  /**
    * The name of the limit. The possible values are:   application-load-balancers   listeners-per-application-load-balancer   listeners-per-network-load-balancer   network-load-balancers   rules-per-application-load-balancer   target-groups   target-groups-per-action-on-application-load-balancer   target-groups-per-action-on-network-load-balancer   target-groups-per-application-load-balancer   targets-per-application-load-balancer   targets-per-availability-zone-per-network-load-balancer   targets-per-network-load-balancer  
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Name] = js.native
}

object Limit {
  @scala.inline
  def apply(Max: Max = null, Name: Name = null): Limit = {
    val __obj = js.Dynamic.literal()
    if (Max != null) __obj.updateDynamic("Max")(Max.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Limit]
  }
}

