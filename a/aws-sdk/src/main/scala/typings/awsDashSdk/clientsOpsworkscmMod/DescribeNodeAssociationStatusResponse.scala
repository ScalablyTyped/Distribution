package typings.awsDashSdk.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNodeAssociationStatusResponse extends js.Object {
  /**
    * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). 
    */
  var EngineAttributes: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.EngineAttributes] = js.native
  /**
    * The status of the association or disassociation request.   Possible values:     SUCCESS: The association or disassociation succeeded.     FAILED: The association or disassociation failed.     IN_PROGRESS: The association or disassociation is still in progress.   
    */
  var NodeAssociationStatus: js.UndefOr[typings.awsDashSdk.clientsOpsworkscmMod.NodeAssociationStatus] = js.native
}

object DescribeNodeAssociationStatusResponse {
  @scala.inline
  def apply(EngineAttributes: EngineAttributes = null, NodeAssociationStatus: NodeAssociationStatus = null): DescribeNodeAssociationStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (EngineAttributes != null) __obj.updateDynamic("EngineAttributes")(EngineAttributes.asInstanceOf[js.Any])
    if (NodeAssociationStatus != null) __obj.updateDynamic("NodeAssociationStatus")(NodeAssociationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationStatusResponse]
  }
}

