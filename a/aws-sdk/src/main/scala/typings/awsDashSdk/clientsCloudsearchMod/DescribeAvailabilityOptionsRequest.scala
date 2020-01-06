package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAvailabilityOptionsRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName = js.native
}

object DescribeAvailabilityOptionsRequest {
  @scala.inline
  def apply(DomainName: DomainName, Deployed: js.UndefOr[scala.Boolean] = js.undefined): DescribeAvailabilityOptionsRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAvailabilityOptionsRequest]
  }
}

