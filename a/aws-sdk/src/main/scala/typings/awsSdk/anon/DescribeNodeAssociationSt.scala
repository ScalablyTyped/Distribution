package typings.awsSdk.anon

import typings.awsSdk.opsworkscmMod.NodeAssociationStatusToken
import typings.awsSdk.opsworkscmMod.ServerName
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/opsworkscm.DescribeNodeAssociationStatusRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
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
  def apply(NodeAssociationStatusToken: NodeAssociationStatusToken, ServerName: ServerName): DescribeNodeAssociationSt = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationSt]
  }
  @scala.inline
  implicit class DescribeNodeAssociationStOps[Self <: DescribeNodeAssociationSt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = this.set("NodeAssociationStatusToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerName(value: ServerName): Self = this.set("ServerName", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

