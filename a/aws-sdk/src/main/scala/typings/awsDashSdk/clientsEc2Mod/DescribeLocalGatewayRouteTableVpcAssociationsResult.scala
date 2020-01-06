package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocalGatewayRouteTableVpcAssociationsResult extends js.Object {
  /**
    * Information about the associations.
    */
  var LocalGatewayRouteTableVpcAssociations: js.UndefOr[LocalGatewayRouteTableVpcAssociationSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeLocalGatewayRouteTableVpcAssociationsResult {
  @scala.inline
  def apply(
    LocalGatewayRouteTableVpcAssociations: LocalGatewayRouteTableVpcAssociationSet = null,
    NextToken: String = null
  ): DescribeLocalGatewayRouteTableVpcAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (LocalGatewayRouteTableVpcAssociations != null) __obj.updateDynamic("LocalGatewayRouteTableVpcAssociations")(LocalGatewayRouteTableVpcAssociations.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocalGatewayRouteTableVpcAssociationsResult]
  }
}

