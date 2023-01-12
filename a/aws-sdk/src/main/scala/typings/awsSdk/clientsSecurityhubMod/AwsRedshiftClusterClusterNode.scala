package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterClusterNode extends StObject {
  
  /**
    * The role of the node. A node might be a leader node or a compute node.
    */
  var NodeRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The private IP address of the node.
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The public IP address of the node.
    */
  var PublicIpAddress: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRedshiftClusterClusterNode {
  
  inline def apply(): AwsRedshiftClusterClusterNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRedshiftClusterClusterNode] (val x: Self) extends AnyVal {
    
    inline def setNodeRole(value: NonEmptyString): Self = StObject.set(x, "NodeRole", value.asInstanceOf[js.Any])
    
    inline def setNodeRoleUndefined: Self = StObject.set(x, "NodeRole", js.undefined)
    
    inline def setPrivateIpAddress(value: NonEmptyString): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPublicIpAddress(value: NonEmptyString): Self = StObject.set(x, "PublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPublicIpAddressUndefined: Self = StObject.set(x, "PublicIpAddress", js.undefined)
  }
}
