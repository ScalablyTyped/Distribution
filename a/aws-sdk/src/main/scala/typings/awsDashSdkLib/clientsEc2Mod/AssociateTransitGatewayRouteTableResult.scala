package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateTransitGatewayRouteTableResult extends js.Object {
  /**
    * The ID of the association.
    */
  var Association: js.UndefOr[TransitGatewayAssociation] = js.undefined
}

object AssociateTransitGatewayRouteTableResult {
  @scala.inline
  def apply(Association: TransitGatewayAssociation = null): AssociateTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association)
    __obj.asInstanceOf[AssociateTransitGatewayRouteTableResult]
  }
}

