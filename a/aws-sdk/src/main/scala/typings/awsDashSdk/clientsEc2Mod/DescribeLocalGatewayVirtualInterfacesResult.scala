package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayVirtualInterfacesResult extends js.Object {
  /**
    * Information about the virtual interfaces.
    */
  var LocalGatewayVirtualInterfaces: js.UndefOr[LocalGatewayVirtualInterfaceSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayVirtualInterfacesResult {
  @scala.inline
  def apply(LocalGatewayVirtualInterfaces: LocalGatewayVirtualInterfaceSet = null, NextToken: String = null): DescribeLocalGatewayVirtualInterfacesResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayVirtualInterfaces != null) __obj.updateDynamic("LocalGatewayVirtualInterfaces")(LocalGatewayVirtualInterfaces.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfacesResult]
  }
}

