package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointAccess extends StObject {
  
  /**
    * The DNS address of the endpoint.
    */
  var Address: js.UndefOr[String] = js.undefined
  
  /**
    * The cluster identifier of the cluster associated with the endpoint.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The time (UTC) that the endpoint was created.
    */
  var EndpointCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the endpoint.
    */
  var EndpointName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the endpoint.
    */
  var EndpointStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on which the cluster accepts incoming connections.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the cluster.
    */
  var ResourceOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet group name where Amazon Redshift chooses to deploy the endpoint.
    */
  var SubnetGroupName: js.UndefOr[String] = js.undefined
  
  var VpcEndpoint: js.UndefOr[typings.awsSdk.clientsRedshiftMod.VpcEndpoint] = js.undefined
  
  /**
    * The security groups associated with the endpoint.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.undefined
}
object EndpointAccess {
  
  inline def apply(): EndpointAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointAccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndpointAccess] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setEndpointCreateTime(value: js.Date): Self = StObject.set(x, "EndpointCreateTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointCreateTimeUndefined: Self = StObject.set(x, "EndpointCreateTime", js.undefined)
    
    inline def setEndpointName(value: String): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setEndpointStatus(value: String): Self = StObject.set(x, "EndpointStatus", value.asInstanceOf[js.Any])
    
    inline def setEndpointStatusUndefined: Self = StObject.set(x, "EndpointStatus", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setResourceOwner(value: String): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
    
    inline def setSubnetGroupName(value: String): Self = StObject.set(x, "SubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupNameUndefined: Self = StObject.set(x, "SubnetGroupName", js.undefined)
    
    inline def setVpcEndpoint(value: VpcEndpoint): Self = StObject.set(x, "VpcEndpoint", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointUndefined: Self = StObject.set(x, "VpcEndpoint", js.undefined)
    
    inline def setVpcSecurityGroups(value: VpcSecurityGroupMembershipList): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    inline def setVpcSecurityGroupsVarargs(value: VpcSecurityGroupMembership*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value*))
  }
}
