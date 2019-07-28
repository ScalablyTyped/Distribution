package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpRoute extends js.Object {
  /**
    * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example 10.0.0.0/32.
    */
  var CidrIp: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.CidrIp] = js.undefined
  /**
    * Description of the address block.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Description] = js.undefined
}

object IpRoute {
  @scala.inline
  def apply(CidrIp: CidrIp = null, Description: Description = null): IpRoute = {
    val __obj = js.Dynamic.literal()
    if (CidrIp != null) __obj.updateDynamic("CidrIp")(CidrIp)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[IpRoute]
  }
}

