package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingModifiedValues extends StObject {
  
  /**
    * The pending or in-progress change of the automated snapshot retention period.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The pending or in-progress change of the new identifier for the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The pending or in-progress change of the cluster type.
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  
  /**
    * The pending or in-progress change of the service version.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The encryption type for a cluster. Possible values are: KMS and None. 
    */
  var EncryptionType: js.UndefOr[String] = js.undefined
  
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * The name of the maintenance track that the cluster will change to during the next maintenance window.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  
  /**
    * The pending or in-progress change of the admin user password for the cluster.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The pending or in-progress change of the cluster's node type.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  
  /**
    * The pending or in-progress change of the number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The pending or in-progress change of the ability to connect to the cluster from the public network.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
}
object PendingModifiedValues {
  
  inline def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  extension [Self <: PendingModifiedValues](x: Self) {
    
    inline def setAutomatedSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", js.undefined)
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setClusterType(value: String): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    inline def setClusterVersion(value: String): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setEnhancedVpcRouting(value: BooleanOptional): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    inline def setMaintenanceTrackName(value: String): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setNodeType(value: String): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfNodes(value: IntegerOptional): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setPubliclyAccessible(value: BooleanOptional): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
  }
}
