package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateRouteTableResult extends js.Object {
  /**
    * The route table association ID. This ID is required for disassociating the route table.
    */
  var AssociationId: js.UndefOr[String] = js.undefined
}

object AssociateRouteTableResult {
  @scala.inline
  def apply(AssociationId: String = null): AssociateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    __obj.asInstanceOf[AssociateRouteTableResult]
  }
}

