package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceRouteTableAssociationResult extends js.Object {
  /**
    * The state of the association.
    */
  var AssociationState: js.UndefOr[RouteTableAssociationState] = js.native
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.native
}

object ReplaceRouteTableAssociationResult {
  @scala.inline
  def apply(AssociationState: RouteTableAssociationState = null, NewAssociationId: String = null): ReplaceRouteTableAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationState != null) __obj.updateDynamic("AssociationState")(AssociationState.asInstanceOf[js.Any])
    if (NewAssociationId != null) __obj.updateDynamic("NewAssociationId")(NewAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceRouteTableAssociationResult]
  }
}

