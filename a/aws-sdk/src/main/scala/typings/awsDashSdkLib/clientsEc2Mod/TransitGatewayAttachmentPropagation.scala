package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayAttachmentPropagation extends js.Object {
  /**
    * The state of the propagation route table.
    */
  var State: js.UndefOr[TransitGatewayPropagationState] = js.undefined
  /**
    * The ID of the propagation route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.undefined
}

object TransitGatewayAttachmentPropagation {
  @scala.inline
  def apply(State: TransitGatewayPropagationState = null, TransitGatewayRouteTableId: String = null): TransitGatewayAttachmentPropagation = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayRouteTableId != null) __obj.updateDynamic("TransitGatewayRouteTableId")(TransitGatewayRouteTableId)
    __obj.asInstanceOf[TransitGatewayAttachmentPropagation]
  }
}

