package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeGroupMember extends StObject {
  
  /**
    * The ID of the cluster to which the node belongs.
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the node within its cluster. A node ID is a numeric identifier (0001, 0002, etc.).
    */
  var CacheNodeId: js.UndefOr[String] = js.undefined
  
  /**
    * The role that is currently assigned to the node - primary or replica. This member is only applicable for Redis (cluster mode disabled) replication groups.
    */
  var CurrentRole: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Availability Zone in which the node is located.
    */
  var PreferredAvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The outpost ARN of the node group member.
    */
  var PreferredOutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The information required for client programs to connect to a node for read operations. The read endpoint is only applicable on Redis (cluster mode disabled) clusters.
    */
  var ReadEndpoint: js.UndefOr[Endpoint] = js.undefined
}
object NodeGroupMember {
  
  inline def apply(): NodeGroupMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeGroupMember]
  }
  
  extension [Self <: NodeGroupMember](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setCacheNodeId(value: String): Self = StObject.set(x, "CacheNodeId", value.asInstanceOf[js.Any])
    
    inline def setCacheNodeIdUndefined: Self = StObject.set(x, "CacheNodeId", js.undefined)
    
    inline def setCurrentRole(value: String): Self = StObject.set(x, "CurrentRole", value.asInstanceOf[js.Any])
    
    inline def setCurrentRoleUndefined: Self = StObject.set(x, "CurrentRole", js.undefined)
    
    inline def setPreferredAvailabilityZone(value: String): Self = StObject.set(x, "PreferredAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setPreferredAvailabilityZoneUndefined: Self = StObject.set(x, "PreferredAvailabilityZone", js.undefined)
    
    inline def setPreferredOutpostArn(value: String): Self = StObject.set(x, "PreferredOutpostArn", value.asInstanceOf[js.Any])
    
    inline def setPreferredOutpostArnUndefined: Self = StObject.set(x, "PreferredOutpostArn", js.undefined)
    
    inline def setReadEndpoint(value: Endpoint): Self = StObject.set(x, "ReadEndpoint", value.asInstanceOf[js.Any])
    
    inline def setReadEndpointUndefined: Self = StObject.set(x, "ReadEndpoint", js.undefined)
  }
}
