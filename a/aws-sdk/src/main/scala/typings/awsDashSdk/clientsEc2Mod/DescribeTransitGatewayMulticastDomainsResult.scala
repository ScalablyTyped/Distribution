package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayMulticastDomainsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the transit gateway multicast domains.
    */
  var TransitGatewayMulticastDomains: js.UndefOr[TransitGatewayMulticastDomainList] = js.native
}

object DescribeTransitGatewayMulticastDomainsResult {
  @scala.inline
  def apply(NextToken: String = null, TransitGatewayMulticastDomains: TransitGatewayMulticastDomainList = null): DescribeTransitGatewayMulticastDomainsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayMulticastDomains != null) __obj.updateDynamic("TransitGatewayMulticastDomains")(TransitGatewayMulticastDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewayMulticastDomainsResult]
  }
}

