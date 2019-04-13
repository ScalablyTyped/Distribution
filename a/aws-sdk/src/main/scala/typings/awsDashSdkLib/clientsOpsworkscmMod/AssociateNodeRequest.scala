package typings
package awsDashSdkLib.clientsOpsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateNodeRequest extends js.Object {
  /**
    * Engine attributes used for associating the node.   Attributes accepted in a AssociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node is associated. By default only one organization named default can exist.     CHEF_NODE_PUBLIC_KEY: A PEM-formatted public key. This key is required for the chef-client agent to access the Chef API.     Attributes accepted in a AssociateNode request for Puppet     PUPPET_NODE_CSR: A PEM-formatted certificate-signing request (CSR) that is created by the node.   
    */
  var EngineAttributes: awsDashSdkLib.clientsOpsworkscmMod.EngineAttributes
  /**
    * The name of the node. 
    */
  var NodeName: awsDashSdkLib.clientsOpsworkscmMod.NodeName
  /**
    * The name of the server with which to associate the node. 
    */
  var ServerName: awsDashSdkLib.clientsOpsworkscmMod.ServerName
}

object AssociateNodeRequest {
  @scala.inline
  def apply(EngineAttributes: EngineAttributes, NodeName: NodeName, ServerName: ServerName): AssociateNodeRequest = {
    val __obj = js.Dynamic.literal(EngineAttributes = EngineAttributes, NodeName = NodeName, ServerName = ServerName)
  
    __obj.asInstanceOf[AssociateNodeRequest]
  }
}

