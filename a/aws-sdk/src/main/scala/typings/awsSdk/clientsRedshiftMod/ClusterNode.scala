package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterNode extends StObject {
  
  /**
    * Whether the node is a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[String] = js.undefined
  
  /**
    * The private IP address of a node within a cluster.
    */
  var PrivateIPAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The public IP address of a node within a cluster.
    */
  var PublicIPAddress: js.UndefOr[String] = js.undefined
}
object ClusterNode {
  
  inline def apply(): ClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterNode]
  }
  
  extension [Self <: ClusterNode](x: Self) {
    
    inline def setNodeRole(value: String): Self = StObject.set(x, "NodeRole", value.asInstanceOf[js.Any])
    
    inline def setNodeRoleUndefined: Self = StObject.set(x, "NodeRole", js.undefined)
    
    inline def setPrivateIPAddress(value: String): Self = StObject.set(x, "PrivateIPAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIPAddressUndefined: Self = StObject.set(x, "PrivateIPAddress", js.undefined)
    
    inline def setPublicIPAddress(value: String): Self = StObject.set(x, "PublicIPAddress", value.asInstanceOf[js.Any])
    
    inline def setPublicIPAddressUndefined: Self = StObject.set(x, "PublicIPAddress", js.undefined)
  }
}
