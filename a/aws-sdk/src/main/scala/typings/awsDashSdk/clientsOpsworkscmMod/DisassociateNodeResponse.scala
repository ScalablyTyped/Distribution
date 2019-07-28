package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateNodeResponse extends js.Object {
  /**
    * Contains a token which can be passed to the DescribeNodeAssociationStatus API call to get the status of the disassociation request. 
    */
  var NodeAssociationStatusToken: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NodeAssociationStatusToken] = js.undefined
}

object DisassociateNodeResponse {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken = null): DisassociateNodeResponse = {
    val __obj = js.Dynamic.literal()
    if (NodeAssociationStatusToken != null) __obj.updateDynamic("NodeAssociationStatusToken")(NodeAssociationStatusToken)
    __obj.asInstanceOf[DisassociateNodeResponse]
  }
}

