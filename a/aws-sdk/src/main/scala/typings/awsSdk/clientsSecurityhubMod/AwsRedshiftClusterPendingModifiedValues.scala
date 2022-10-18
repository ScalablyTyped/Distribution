package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRedshiftClusterPendingModifiedValues extends StObject {
  
  /**
    * The pending or in-progress change to the automated snapshot retention period.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pending or in-progress change to the identifier for the cluster.
    */
  var ClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The pending or in-progress change to the cluster type.
    */
  var ClusterType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The pending or in-progress change to the service version.
    */
  var ClusterVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The encryption type for a cluster.
    */
  var EncryptionType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether to create the cluster with enhanced VPC routing enabled.
    */
  var EnhancedVpcRouting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the maintenance track that the cluster changes to during the next maintenance window.
    */
  var MaintenanceTrackName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The pending or in-progress change to the master user password for the cluster.
    */
  var MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The pending or in-progress change to the cluster's node type.
    */
  var NodeType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The pending or in-progress change to the number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pending or in-progress change to whether the cluster can be connected to from the public network.
    */
  var PubliclyAccessible: js.UndefOr[Boolean] = js.undefined
}
object AwsRedshiftClusterPendingModifiedValues {
  
  inline def apply(): AwsRedshiftClusterPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterPendingModifiedValues]
  }
  
  extension [Self <: AwsRedshiftClusterPendingModifiedValues](x: Self) {
    
    inline def setAutomatedSnapshotRetentionPeriod(value: Integer): Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setAutomatedSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "AutomatedSnapshotRetentionPeriod", js.undefined)
    
    inline def setClusterIdentifier(value: NonEmptyString): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    inline def setClusterType(value: NonEmptyString): Self = StObject.set(x, "ClusterType", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeUndefined: Self = StObject.set(x, "ClusterType", js.undefined)
    
    inline def setClusterVersion(value: NonEmptyString): Self = StObject.set(x, "ClusterVersion", value.asInstanceOf[js.Any])
    
    inline def setClusterVersionUndefined: Self = StObject.set(x, "ClusterVersion", js.undefined)
    
    inline def setEncryptionType(value: NonEmptyString): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setEnhancedVpcRouting(value: Boolean): Self = StObject.set(x, "EnhancedVpcRouting", value.asInstanceOf[js.Any])
    
    inline def setEnhancedVpcRoutingUndefined: Self = StObject.set(x, "EnhancedVpcRouting", js.undefined)
    
    inline def setMaintenanceTrackName(value: NonEmptyString): Self = StObject.set(x, "MaintenanceTrackName", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceTrackNameUndefined: Self = StObject.set(x, "MaintenanceTrackName", js.undefined)
    
    inline def setMasterUserPassword(value: NonEmptyString): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setNodeType(value: NonEmptyString): Self = StObject.set(x, "NodeType", value.asInstanceOf[js.Any])
    
    inline def setNodeTypeUndefined: Self = StObject.set(x, "NodeType", js.undefined)
    
    inline def setNumberOfNodes(value: Integer): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "PubliclyAccessible", value.asInstanceOf[js.Any])
    
    inline def setPubliclyAccessibleUndefined: Self = StObject.set(x, "PubliclyAccessible", js.undefined)
  }
}
