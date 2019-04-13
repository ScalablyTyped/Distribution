package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limit extends js.Object {
  /**
    * The maximum value of the limit.
    */
  var Max: js.UndefOr[Max] = js.undefined
  /**
    * The name of the limit. The possible values are:   application-load-balancers   listeners-per-application-load-balancer   listeners-per-network-load-balancer   network-load-balancers   rules-per-application-load-balancer   target-groups   targets-per-application-load-balancer   targets-per-availability-zone-per-network-load-balancer   targets-per-network-load-balancer  
    */
  var Name: js.UndefOr[Name] = js.undefined
}

object Limit {
  @scala.inline
  def apply(Max: Max = null, Name: Name = null): Limit = {
    val __obj = js.Dynamic.literal()
    if (Max != null) __obj.updateDynamic("Max")(Max)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[Limit]
  }
}

