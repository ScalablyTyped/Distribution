package typings.awsSdk.anon

import typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken
import typings.awsSdk.opsworkscmMod.ServerName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworkscm.DescribeNodeAssociationStatusRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeNodeAssociationSt extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
    */
  var NodeAssociationStatusToken: typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken = js.native
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typings.awsSdk.opsworkscmMod.ServerName = js.native
}

object DescribeNodeAssociationSt {
  @scala.inline
  def apply(
    NodeAssociationStatusToken: NodeAssociationStatusToken,
    ServerName: ServerName,
    $waiter: WaiterConfiguration = null
  ): DescribeNodeAssociationSt = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationSt]
  }
}

