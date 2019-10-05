package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayRouteTable extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether this is the default association route table for the transit gateway.
    */
  var DefaultAssociationRouteTable: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether this is the default propagation route table for the transit gateway.
    */
  var DefaultPropagationRouteTable: js.UndefOr[Boolean] = js.undefined
  /**
    * The state of the transit gateway route table.
    */
  var State: js.UndefOr[TransitGatewayRouteTableState] = js.undefined
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.undefined
}

object TransitGatewayRouteTable {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    DefaultAssociationRouteTable: js.UndefOr[scala.Boolean] = js.undefined,
    DefaultPropagationRouteTable: js.UndefOr[scala.Boolean] = js.undefined,
    State: TransitGatewayRouteTableState = null,
    Tags: TagList = null,
    TransitGatewayId: String = null,
    TransitGatewayRouteTableId: String = null
  ): TransitGatewayRouteTable = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (!js.isUndefined(DefaultAssociationRouteTable)) __obj.updateDynamic("DefaultAssociationRouteTable")(DefaultAssociationRouteTable)
    if (!js.isUndefined(DefaultPropagationRouteTable)) __obj.updateDynamic("DefaultPropagationRouteTable")(DefaultPropagationRouteTable)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (TransitGatewayRouteTableId != null) __obj.updateDynamic("TransitGatewayRouteTableId")(TransitGatewayRouteTableId)
    __obj.asInstanceOf[TransitGatewayRouteTable]
  }
}

