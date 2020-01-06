package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewayAssociationsResult extends js.Object {
  /**
    * Information about the associations.
    */
  var directConnectGatewayAssociations: js.UndefOr[DirectConnectGatewayAssociationList] = js.native
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeDirectConnectGatewayAssociationsResult {
  @scala.inline
  def apply(
    directConnectGatewayAssociations: DirectConnectGatewayAssociationList = null,
    nextToken: PaginationToken = null
  ): DescribeDirectConnectGatewayAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAssociations != null) __obj.updateDynamic("directConnectGatewayAssociations")(directConnectGatewayAssociations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationsResult]
  }
}

