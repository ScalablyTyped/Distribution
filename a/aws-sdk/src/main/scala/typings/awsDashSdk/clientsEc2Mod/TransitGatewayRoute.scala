package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayRoute extends js.Object {
  /**
    * The CIDR block used for destination matches.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The state of the route.
    */
  var State: js.UndefOr[TransitGatewayRouteState] = js.undefined
  /**
    * The attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayRouteAttachmentList] = js.undefined
  /**
    * The route type.
    */
  var Type: js.UndefOr[TransitGatewayRouteType] = js.undefined
}

object TransitGatewayRoute {
  @scala.inline
  def apply(
    DestinationCidrBlock: String = null,
    State: TransitGatewayRouteState = null,
    TransitGatewayAttachments: TransitGatewayRouteAttachmentList = null,
    Type: TransitGatewayRouteType = null
  ): TransitGatewayRoute = {
    val __obj = js.Dynamic.literal()
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayAttachments != null) __obj.updateDynamic("TransitGatewayAttachments")(TransitGatewayAttachments)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayRoute]
  }
}

