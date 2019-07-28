package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNodeAssociationStatusRequest extends js.Object {
  /**
    * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
    */
  var NodeAssociationStatusToken: typings.awsDashSdk.clientsOpsworkscmMod.NodeAssociationStatusToken
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typings.awsDashSdk.clientsOpsworkscmMod.ServerName
}

object DescribeNodeAssociationStatusRequest {
  @scala.inline
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken, ServerName: ServerName): DescribeNodeAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken, ServerName = ServerName)
  
    __obj.asInstanceOf[DescribeNodeAssociationStatusRequest]
  }
}

