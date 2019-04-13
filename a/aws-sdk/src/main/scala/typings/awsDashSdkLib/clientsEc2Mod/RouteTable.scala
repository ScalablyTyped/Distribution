package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteTable extends js.Object {
  /**
    * The associations between the route table and one or more subnets.
    */
  var Associations: js.UndefOr[RouteTableAssociationList] = js.undefined
  /**
    * The ID of the AWS account that owns the route table.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Any virtual private gateway (VGW) propagating routes.
    */
  var PropagatingVgws: js.UndefOr[PropagatingVgwList] = js.undefined
  /**
    * The ID of the route table.
    */
  var RouteTableId: js.UndefOr[String] = js.undefined
  /**
    * The routes in the route table.
    */
  var Routes: js.UndefOr[RouteList] = js.undefined
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object RouteTable {
  @scala.inline
  def apply(
    Associations: RouteTableAssociationList = null,
    OwnerId: String = null,
    PropagatingVgws: PropagatingVgwList = null,
    RouteTableId: String = null,
    Routes: RouteList = null,
    Tags: TagList = null,
    VpcId: String = null
  ): RouteTable = {
    val __obj = js.Dynamic.literal()
    if (Associations != null) __obj.updateDynamic("Associations")(Associations)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (PropagatingVgws != null) __obj.updateDynamic("PropagatingVgws")(PropagatingVgws)
    if (RouteTableId != null) __obj.updateDynamic("RouteTableId")(RouteTableId)
    if (Routes != null) __obj.updateDynamic("Routes")(Routes)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[RouteTable]
  }
}

