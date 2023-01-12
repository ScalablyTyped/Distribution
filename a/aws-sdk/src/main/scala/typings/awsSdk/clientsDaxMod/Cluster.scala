package typings.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cluster extends StObject {
  
  /**
    * The number of nodes in the cluster that are active (i.e., capable of serving requests).
    */
  var ActiveNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
    */
  var ClusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint for this DAX cluster, consisting of a DNS name, a port number, and a URL. Applications should use the URL to configure the DAX client to find their cluster.
    */
  var ClusterDiscoveryEndpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The type of encryption supported by the cluster's endpoint. Values are:    NONE for no encryption  TLS for Transport Layer Security  
    */
  var ClusterEndpointEncryptionType: js.UndefOr[typings.awsSdk.clientsDaxMod.ClusterEndpointEncryptionType] = js.undefined
  
  /**
    * The name of the DAX cluster.
    */
  var ClusterName: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cluster.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A valid Amazon Resource Name (ARN) that identifies an IAM role. At runtime, DAX will assume this role and use the role's permissions to access DynamoDB on your behalf.
    */
  var IamRoleArn: js.UndefOr[String] = js.undefined
  
  /**
    * A list of nodes to be removed from the cluster.
    */
  var NodeIdsToRemove: js.UndefOr[NodeIdentifierList] = js.undefined
  
  /**
    * The node type for the nodes in the cluster. (All nodes in a DAX cluster are of the same type.)
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of nodes that are currently in the cluster.
    */
  var Nodes: js.UndefOr[NodeList] = js.undefined
  
  /**
    * Describes a notification topic and its status. Notification topics are used for publishing DAX events to subscribers using Amazon Simple Notification Service (SNS).
    */
  var NotificationConfiguration: js.UndefOr[typings.awsSdk.clientsDaxMod.NotificationConfiguration] = js.undefined
  
  /**
    * The parameter group being used by nodes in the cluster.
    */
  var ParameterGroup: js.UndefOr[ParameterGroupStatus] = js.undefined
  
  /**
    * A range of time when maintenance of DAX cluster software will be performed. For example: sun:01:00-sun:09:00. Cluster maintenance normally takes less than 30 minutes, and is performed automatically within the maintenance window.
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the server-side encryption status on the specified DAX cluster.
    */
  var SSEDescription: js.UndefOr[typings.awsSdk.clientsDaxMod.SSEDescription] = js.undefined
  
  /**
    * A list of security groups, and the status of each, for the nodes in the cluster.
    */
  var SecurityGroups: js.UndefOr[SecurityGroupMembershipList] = js.undefined
  
  /**
    * The current status of the cluster.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The subnet group where the DAX cluster is running.
    */
  var SubnetGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of nodes in the cluster.
    */
  var TotalNodes: js.UndefOr[IntegerOptional] = js.undefined
}
object Cluster {
  
  inline def apply(): Cluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cluster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cluster] (val x: Self) extends AnyVal {
    
    inline def setActiveNodes(value: IntegerOptional): Self = StObject.set(x, "ActiveNodes", value.asInstanceOf[js.Any])
    
    inline def setActiveNodesUndefined: Self = StObject.set(x, "ActiveNodes", js.undefined)
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterDiscoveryEndpoint(value: Endpoint): Self = StObject.set(x, "ClusterDiscoveryEndpoint", value.asInstanceOf[js.Any])
    
    inline def setClusterDiscoveryEndpointUndefined: Self = StObject.set(x, "ClusterDiscoveryEndpoint", js.undefined)
    
    inline def setClusterEndpointEncryptionType(value: ClusterEndpointEncryptionType): Self = StObject.set(x, "ClusterEndpointEncryptionType", value.asInstanceOf[js.Any])
    
    inline def setClusterEndpointEncryptionTypeUndefined: Self = StObject.set(x, "ClusterEndpointEncryptionType", js.undefined)
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIamRoleArn(value: String): Self = StObject.set(x, "IamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "IamRoleArn", js.undefined)
    
    inline def setNodeIdsToRemove(value: NodeIdentifierList): Self = StObject.set(x, "NodeIdsToRemove", value.asInstanceOf[js.Any])
    
    inline def setNodeIdsToRemoveUndefined: Self = StObject.set(x, "NodeIdsToRemove", js.undefined)
    
    inline def setNodeIdsToRemoveVarargs(value: String*): Self = StObject.set(x, "NodeIdsToRemove", js.Array(value*))
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNodes(value: NodeList): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    inline def setNodesVarargs(value: Node*): Self = StObject.set(x, "Nodes", js.Array(value*))
    
    inline def setNotificationConfiguration(value: NotificationConfiguration): Self = StObject.set(x, "NotificationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigurationUndefined: Self = StObject.set(x, "NotificationConfiguration", js.undefined)
    
    inline def setParameterGroup(value: ParameterGroupStatus): Self = StObject.set(x, "ParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupUndefined: Self = StObject.set(x, "ParameterGroup", js.undefined)
    
    inline def setPreferredMaintenanceWindow(value: String): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    inline def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    inline def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
    
    inline def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
    
    inline def setSecurityGroups(value: SecurityGroupMembershipList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: SecurityGroupMembership*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetGroup(value: String): Self = StObject.set(x, "SubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setSubnetGroupUndefined: Self = StObject.set(x, "SubnetGroup", js.undefined)
    
    inline def setTotalNodes(value: IntegerOptional): Self = StObject.set(x, "TotalNodes", value.asInstanceOf[js.Any])
    
    inline def setTotalNodesUndefined: Self = StObject.set(x, "TotalNodes", js.undefined)
  }
}
