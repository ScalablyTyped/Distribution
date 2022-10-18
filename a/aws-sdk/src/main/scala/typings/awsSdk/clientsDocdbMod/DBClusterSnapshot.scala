package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBClusterSnapshot extends StObject {
  
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the cluster snapshot can be restored in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsDocdbMod.AvailabilityZones] = js.undefined
  
  /**
    * Specifies the time when the cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the cluster identifier of the cluster that this cluster snapshot was created from.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the cluster snapshot.
    */
  var DBClusterSnapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the identifier for the cluster snapshot.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the version of the database engine for this cluster snapshot.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * If StorageEncrypted is true, the KMS key identifier for the encrypted cluster snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the master user name for the cluster snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies the port that the cluster was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * Provides the time when the snapshot was taken, in UTC.
    */
  var SnapshotCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Provides the type of the cluster snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.undefined
  
  /**
    * If the cluster snapshot was copied from a source cluster snapshot, the ARN for the source cluster snapshot; otherwise, a null value.
    */
  var SourceDBClusterSnapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the status of this cluster snapshot.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the cluster snapshot is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Provides the virtual private cloud (VPC) ID that is associated with the cluster snapshot.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}
object DBClusterSnapshot {
  
  inline def apply(): DBClusterSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshot]
  }
  
  extension [Self <: DBClusterSnapshot](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setClusterCreateTime(value: js.Date): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    inline def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    inline def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterIdentifierUndefined: Self = StObject.set(x, "DBClusterIdentifier", js.undefined)
    
    inline def setDBClusterSnapshotArn(value: String): Self = StObject.set(x, "DBClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotArnUndefined: Self = StObject.set(x, "DBClusterSnapshotArn", js.undefined)
    
    inline def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotIdentifierUndefined: Self = StObject.set(x, "DBClusterSnapshotIdentifier", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setSnapshotCreateTime(value: js.Date): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    inline def setSnapshotType(value: String): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    inline def setSourceDBClusterSnapshotArn(value: String): Self = StObject.set(x, "SourceDBClusterSnapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSourceDBClusterSnapshotArnUndefined: Self = StObject.set(x, "SourceDBClusterSnapshotArn", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    inline def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    inline def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
