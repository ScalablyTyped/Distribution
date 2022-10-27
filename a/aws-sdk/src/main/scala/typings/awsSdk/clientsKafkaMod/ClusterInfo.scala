package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterInfo extends StObject {
  
  /**
    * 
    Arn of active cluster operation.
    
    */
  var ActiveOperationArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Information about the broker nodes.
    
    */
  var BrokerNodeGroupInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.BrokerNodeGroupInfo] = js.undefined
  
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClientAuthentication] = js.undefined
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The time when the cluster was created.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    Information about the version of software currently deployed on the Apache Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
  
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.EncryptionInfo] = js.undefined
  
  /**
    * 
    Specifies which metrics are gathered for the MSK cluster. This property has the following possible values: DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION. For a list of the metrics associated with each of these levels of monitoring, see Monitoring.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.clientsKafkaMod.EnhancedMonitoring] = js.undefined
  
  var LoggingInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.LoggingInfo] = js.undefined
  
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.undefined
  
  /**
    * 
    Settings for open monitoring using Prometheus.
    
    */
  var OpenMonitoring: js.UndefOr[typings.awsSdk.clientsKafkaMod.OpenMonitoring] = js.undefined
  
  /**
    * 
    The state of the cluster. The possible states are ACTIVE, CREATING, DELETING, FAILED, HEALING, MAINTENANCE, REBOOTING_BROKER, and UPDATING.
    
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  
  var StateInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.StateInfo] = js.undefined
  
  /**
    * 
    This controls storage mode for supported storage tiers.
    
    */
  var StorageMode: js.UndefOr[typings.awsSdk.clientsKafkaMod.StorageMode] = js.undefined
  
  /**
    * 
    Tags attached to the cluster.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * 
    The connection string to use to connect to the Apache ZooKeeper cluster.
    
    */
  var ZookeeperConnectString: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The connection string to use to connect to zookeeper cluster on Tls port.
    
    */
  var ZookeeperConnectStringTls: js.UndefOr[string] = js.undefined
}
object ClusterInfo {
  
  inline def apply(): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterInfo]
  }
  
  extension [Self <: ClusterInfo](x: Self) {
    
    inline def setActiveOperationArn(value: string): Self = StObject.set(x, "ActiveOperationArn", value.asInstanceOf[js.Any])
    
    inline def setActiveOperationArnUndefined: Self = StObject.set(x, "ActiveOperationArn", js.undefined)
    
    inline def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = StObject.set(x, "BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    
    inline def setBrokerNodeGroupInfoUndefined: Self = StObject.set(x, "BrokerNodeGroupInfo", js.undefined)
    
    inline def setClientAuthentication(value: ClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "ClusterArn", js.undefined)
    
    inline def setClusterName(value: string): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setClusterNameUndefined: Self = StObject.set(x, "ClusterName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentBrokerSoftwareInfo(value: BrokerSoftwareInfo): Self = StObject.set(x, "CurrentBrokerSoftwareInfo", value.asInstanceOf[js.Any])
    
    inline def setCurrentBrokerSoftwareInfoUndefined: Self = StObject.set(x, "CurrentBrokerSoftwareInfo", js.undefined)
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "EncryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "EncryptionInfo", js.undefined)
    
    inline def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setNumberOfBrokerNodes(value: integer): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBrokerNodesUndefined: Self = StObject.set(x, "NumberOfBrokerNodes", js.undefined)
    
    inline def setOpenMonitoring(value: OpenMonitoring): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
    
    inline def setState(value: ClusterState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateInfo(value: StateInfo): Self = StObject.set(x, "StateInfo", value.asInstanceOf[js.Any])
    
    inline def setStateInfoUndefined: Self = StObject.set(x, "StateInfo", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStorageMode(value: StorageMode): Self = StObject.set(x, "StorageMode", value.asInstanceOf[js.Any])
    
    inline def setStorageModeUndefined: Self = StObject.set(x, "StorageMode", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setZookeeperConnectString(value: string): Self = StObject.set(x, "ZookeeperConnectString", value.asInstanceOf[js.Any])
    
    inline def setZookeeperConnectStringTls(value: string): Self = StObject.set(x, "ZookeeperConnectStringTls", value.asInstanceOf[js.Any])
    
    inline def setZookeeperConnectStringTlsUndefined: Self = StObject.set(x, "ZookeeperConnectStringTls", js.undefined)
    
    inline def setZookeeperConnectStringUndefined: Self = StObject.set(x, "ZookeeperConnectString", js.undefined)
  }
}
