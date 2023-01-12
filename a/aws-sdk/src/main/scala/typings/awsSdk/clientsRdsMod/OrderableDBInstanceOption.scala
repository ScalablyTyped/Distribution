package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableDBInstanceOption extends StObject {
  
  /**
    * The Availability Zone group for a DB instance.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * A list of the available processor features for the DB instance class of a DB instance.
    */
  var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.undefined
  
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Maximum storage throughput for a DB instance.
    */
  var MaxStorageThroughputPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Maximum storage throughput to provisioned IOPS ratio for a DB instance.
    */
  var MaxStorageThroughputPerIops: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Minimum storage throughput for a DB instance.
    */
  var MinStorageThroughputPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Minimum storage throughput to provisioned IOPS ratio for a DB instance.
    */
  var MinStorageThroughputPerIops: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a DB instance supports RDS on Outposts. For more information about RDS on Outposts, see Amazon RDS on Amazon Web Services Outposts in the Amazon RDS User Guide. 
    */
  var OutpostCapable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance can have a read replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * The list of supported modes for Database Activity Streams. Aurora PostgreSQL returns the value [sync, async]. Aurora MySQL and RDS for Oracle return [async] only. If Database Activity Streams isn't supported, the return value is an empty list.
    */
  var SupportedActivityStreamModes: js.UndefOr[ActivityStreamModeList] = js.undefined
  
  /**
    * A list of the supported DB engine modes.
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.undefined
  
  /**
    * The network types supported by the DB instance (IPV4 or DUAL). A DB instance can support only the IPv4 protocol or the IPv4 and the IPv6 protocols (DUAL). For more information, see  Working with a DB instance in a VPC in the Amazon RDS User Guide. 
    */
  var SupportedNetworkTypes: js.UndefOr[StringList] = js.undefined
  
  /**
    * Whether DB instances can be configured as a Multi-AZ DB cluster. For more information on Multi-AZ DB clusters, see  Multi-AZ deployments with two readable standby DB instances in the Amazon RDS User Guide. 
    */
  var SupportsClusters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine attributes.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether a DB instance supports Kerberos Authentication.
    */
  var SupportsKerberosAuthentication: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * True if a DB instance supports Performance Insights, otherwise false.
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports storage throughput.
    */
  var SupportsStorageThroughput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.undefined
}
object OrderableDBInstanceOption {
  
  inline def apply(): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderableDBInstanceOption] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneGroup(value: String): Self = StObject.set(x, "AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneGroupUndefined: Self = StObject.set(x, "AvailabilityZoneGroup", js.undefined)
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setAvailableProcessorFeatures(value: AvailableProcessorFeatureList): Self = StObject.set(x, "AvailableProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setAvailableProcessorFeaturesUndefined: Self = StObject.set(x, "AvailableProcessorFeatures", js.undefined)
    
    inline def setAvailableProcessorFeaturesVarargs(value: AvailableProcessorFeature*): Self = StObject.set(x, "AvailableProcessorFeatures", js.Array(value*))
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMaxIopsPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MaxIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxIopsPerDbInstanceUndefined: Self = StObject.set(x, "MaxIopsPerDbInstance", js.undefined)
    
    inline def setMaxIopsPerGib(value: DoubleOptional): Self = StObject.set(x, "MaxIopsPerGib", value.asInstanceOf[js.Any])
    
    inline def setMaxIopsPerGibUndefined: Self = StObject.set(x, "MaxIopsPerGib", js.undefined)
    
    inline def setMaxStorageSize(value: IntegerOptional): Self = StObject.set(x, "MaxStorageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageSizeUndefined: Self = StObject.set(x, "MaxStorageSize", js.undefined)
    
    inline def setMaxStorageThroughputPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MaxStorageThroughputPerDbInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageThroughputPerDbInstanceUndefined: Self = StObject.set(x, "MaxStorageThroughputPerDbInstance", js.undefined)
    
    inline def setMaxStorageThroughputPerIops(value: DoubleOptional): Self = StObject.set(x, "MaxStorageThroughputPerIops", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageThroughputPerIopsUndefined: Self = StObject.set(x, "MaxStorageThroughputPerIops", js.undefined)
    
    inline def setMinIopsPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MinIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    inline def setMinIopsPerDbInstanceUndefined: Self = StObject.set(x, "MinIopsPerDbInstance", js.undefined)
    
    inline def setMinIopsPerGib(value: DoubleOptional): Self = StObject.set(x, "MinIopsPerGib", value.asInstanceOf[js.Any])
    
    inline def setMinIopsPerGibUndefined: Self = StObject.set(x, "MinIopsPerGib", js.undefined)
    
    inline def setMinStorageSize(value: IntegerOptional): Self = StObject.set(x, "MinStorageSize", value.asInstanceOf[js.Any])
    
    inline def setMinStorageSizeUndefined: Self = StObject.set(x, "MinStorageSize", js.undefined)
    
    inline def setMinStorageThroughputPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MinStorageThroughputPerDbInstance", value.asInstanceOf[js.Any])
    
    inline def setMinStorageThroughputPerDbInstanceUndefined: Self = StObject.set(x, "MinStorageThroughputPerDbInstance", js.undefined)
    
    inline def setMinStorageThroughputPerIops(value: DoubleOptional): Self = StObject.set(x, "MinStorageThroughputPerIops", value.asInstanceOf[js.Any])
    
    inline def setMinStorageThroughputPerIopsUndefined: Self = StObject.set(x, "MinStorageThroughputPerIops", js.undefined)
    
    inline def setMultiAZCapable(value: Boolean): Self = StObject.set(x, "MultiAZCapable", value.asInstanceOf[js.Any])
    
    inline def setMultiAZCapableUndefined: Self = StObject.set(x, "MultiAZCapable", js.undefined)
    
    inline def setOutpostCapable(value: Boolean): Self = StObject.set(x, "OutpostCapable", value.asInstanceOf[js.Any])
    
    inline def setOutpostCapableUndefined: Self = StObject.set(x, "OutpostCapable", js.undefined)
    
    inline def setReadReplicaCapable(value: Boolean): Self = StObject.set(x, "ReadReplicaCapable", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaCapableUndefined: Self = StObject.set(x, "ReadReplicaCapable", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSupportedActivityStreamModes(value: ActivityStreamModeList): Self = StObject.set(x, "SupportedActivityStreamModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedActivityStreamModesUndefined: Self = StObject.set(x, "SupportedActivityStreamModes", js.undefined)
    
    inline def setSupportedActivityStreamModesVarargs(value: String*): Self = StObject.set(x, "SupportedActivityStreamModes", js.Array(value*))
    
    inline def setSupportedEngineModes(value: EngineModeList): Self = StObject.set(x, "SupportedEngineModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedEngineModesUndefined: Self = StObject.set(x, "SupportedEngineModes", js.undefined)
    
    inline def setSupportedEngineModesVarargs(value: String*): Self = StObject.set(x, "SupportedEngineModes", js.Array(value*))
    
    inline def setSupportedNetworkTypes(value: StringList): Self = StObject.set(x, "SupportedNetworkTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworkTypesUndefined: Self = StObject.set(x, "SupportedNetworkTypes", js.undefined)
    
    inline def setSupportedNetworkTypesVarargs(value: String*): Self = StObject.set(x, "SupportedNetworkTypes", js.Array(value*))
    
    inline def setSupportsClusters(value: Boolean): Self = StObject.set(x, "SupportsClusters", value.asInstanceOf[js.Any])
    
    inline def setSupportsClustersUndefined: Self = StObject.set(x, "SupportsClusters", js.undefined)
    
    inline def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "SupportsEnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setSupportsEnhancedMonitoringUndefined: Self = StObject.set(x, "SupportsEnhancedMonitoring", js.undefined)
    
    inline def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "SupportsGlobalDatabases", js.undefined)
    
    inline def setSupportsIAMDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "SupportsIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setSupportsIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "SupportsIAMDatabaseAuthentication", js.undefined)
    
    inline def setSupportsIops(value: Boolean): Self = StObject.set(x, "SupportsIops", value.asInstanceOf[js.Any])
    
    inline def setSupportsIopsUndefined: Self = StObject.set(x, "SupportsIops", js.undefined)
    
    inline def setSupportsKerberosAuthentication(value: BooleanOptional): Self = StObject.set(x, "SupportsKerberosAuthentication", value.asInstanceOf[js.Any])
    
    inline def setSupportsKerberosAuthenticationUndefined: Self = StObject.set(x, "SupportsKerberosAuthentication", js.undefined)
    
    inline def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "SupportsPerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setSupportsPerformanceInsightsUndefined: Self = StObject.set(x, "SupportsPerformanceInsights", js.undefined)
    
    inline def setSupportsStorageAutoscaling(value: BooleanOptional): Self = StObject.set(x, "SupportsStorageAutoscaling", value.asInstanceOf[js.Any])
    
    inline def setSupportsStorageAutoscalingUndefined: Self = StObject.set(x, "SupportsStorageAutoscaling", js.undefined)
    
    inline def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "SupportsStorageEncryption", value.asInstanceOf[js.Any])
    
    inline def setSupportsStorageEncryptionUndefined: Self = StObject.set(x, "SupportsStorageEncryption", js.undefined)
    
    inline def setSupportsStorageThroughput(value: Boolean): Self = StObject.set(x, "SupportsStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setSupportsStorageThroughputUndefined: Self = StObject.set(x, "SupportsStorageThroughput", js.undefined)
    
    inline def setVpc(value: Boolean): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
