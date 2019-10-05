package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTableAssociation extends js.Object {
  /**
    * Indicates whether this is the main route table.
    */
  var Main: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the association between a route table and a subnet.
    */
  var RouteTableAssociationId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the subnet. A subnet ID is not returned for an implicit association.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}

object RouteTableAssociation {
  @scala.inline
  def apply(
    Main: js.UndefOr[scala.Boolean] = js.undefined,
    RouteTableAssociationId: String = null,
    RouteTableId: String = null,
    SubnetId: String = null
  ): RouteTableAssociation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Main)) __obj.updateDynamic("Main")(Main)
    if (RouteTableAssociationId != null) __obj.updateDynamic("RouteTableAssociationId")(RouteTableAssociationId)
    if (RouteTableId != null) __obj.updateDynamic("RouteTableId")(RouteTableId)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    __obj.asInstanceOf[RouteTableAssociation]
  }
}

