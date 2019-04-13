package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateNodeRequest extends js.Object {
  /**
    * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.   Attributes required in a DisassociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node was associated. By default only one organization named default can exist.   
    */
  var EngineAttributes: js.UndefOr[EngineAttributes] = js.undefined
  /**
    * The name of the client node. 
    */
  var NodeName: awsDashSdkLib.clientsOpsworkscmMod.NodeName
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: awsDashSdkLib.clientsOpsworkscmMod.ServerName
}

object DisassociateNodeRequest {
  @scala.inline
  def apply(NodeName: NodeName, ServerName: ServerName, EngineAttributes: EngineAttributes = null): DisassociateNodeRequest = {
    val __obj = js.Dynamic.literal(NodeName = NodeName, ServerName = ServerName)
    if (EngineAttributes != null) __obj.updateDynamic("EngineAttributes")(EngineAttributes)
    __obj.asInstanceOf[DisassociateNodeRequest]
  }
}

