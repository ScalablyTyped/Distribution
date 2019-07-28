package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateNodeResponse extends js.Object {
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the association request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NodeAssociationStatusToken] = js.undefined
}

object AssociateNodeResponse {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken = null): AssociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    if (NodeAssociationStatusToken != null) __obj.updateDynamic("NodeAssociationStatusToken")(NodeAssociationStatusToken)
    __obj.asInstanceOf[AssociateNodeResponse]
  }
}

