package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeServiceAccessPoliciesRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
}

object DescribeServiceAccessPoliciesRequest {
  @scala.inline
  def apply(DomainName: DomainName, Deployed: js.UndefOr[Boolean] = js.undefined): DescribeServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName)
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed)
    __obj.asInstanceOf[DescribeServiceAccessPoliciesRequest]
  }
}

