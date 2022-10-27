package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MutableClusterInfo extends StObject {
  
  /**
    * 
    Specifies the size of the EBS volume and the ID of the associated broker.
    
    */
  var BrokerEBSVolumeInfo: js.UndefOr[listOfBrokerEBSVolumeInfo] = js.undefined
  
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClientAuthentication] = js.undefined
  
  /**
    * 
    Information about the changes in the configuration of the brokers.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.ConfigurationInfo] = js.undefined
  
  /**
    * 
    Information about the broker access configuration.
    
    */
  var ConnectivityInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.ConnectivityInfo] = js.undefined
  
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.EncryptionInfo] = js.undefined
  
  /**
    * 
    Specifies which Apache Kafka metrics Amazon MSK gathers and sends to Amazon CloudWatch for this cluster.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.clientsKafkaMod.EnhancedMonitoring] = js.undefined
  
  /**
    * 
    Information about the Amazon MSK broker type.
    
    */
  var InstanceType: js.UndefOr[stringMin5Max32] = js.undefined
  
  /**
    * 
    The Apache Kafka version.
    
    */
  var KafkaVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    You can configure your MSK cluster to send broker logs to different destination types. This is a container for the configuration details related to broker logs.
    
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.LoggingInfo] = js.undefined
  
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[integer] = js.undefined
  
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[typings.awsSdk.clientsKafkaMod.OpenMonitoring] = js.undefined
  
  /**
    * 
    This controls storage mode for supported storage tiers.
    
    */
  var StorageMode: js.UndefOr[typings.awsSdk.clientsKafkaMod.StorageMode] = js.undefined
}
object MutableClusterInfo {
  
  inline def apply(): MutableClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutableClusterInfo]
  }
  
  extension [Self <: MutableClusterInfo](x: Self) {
    
    inline def setBrokerEBSVolumeInfo(value: listOfBrokerEBSVolumeInfo): Self = StObject.set(x, "BrokerEBSVolumeInfo", value.asInstanceOf[js.Any])
    
    inline def setBrokerEBSVolumeInfoUndefined: Self = StObject.set(x, "BrokerEBSVolumeInfo", js.undefined)
    
    inline def setBrokerEBSVolumeInfoVarargs(value: BrokerEBSVolumeInfo*): Self = StObject.set(x, "BrokerEBSVolumeInfo", js.Array(value*))
    
    inline def setClientAuthentication(value: ClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    inline def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigurationInfoUndefined: Self = StObject.set(x, "ConfigurationInfo", js.undefined)
    
    inline def setConnectivityInfo(value: ConnectivityInfo): Self = StObject.set(x, "ConnectivityInfo", value.asInstanceOf[js.Any])
    
    inline def setConnectivityInfoUndefined: Self = StObject.set(x, "ConnectivityInfo", js.undefined)
    
    inline def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "EncryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "EncryptionInfo", js.undefined)
    
    inline def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    inline def setInstanceType(value: stringMin5Max32): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setKafkaVersion(value: string): Self = StObject.set(x, "KafkaVersion", value.asInstanceOf[js.Any])
    
    inline def setKafkaVersionUndefined: Self = StObject.set(x, "KafkaVersion", js.undefined)
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setNumberOfBrokerNodes(value: integer): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfBrokerNodesUndefined: Self = StObject.set(x, "NumberOfBrokerNodes", js.undefined)
    
    inline def setOpenMonitoring(value: OpenMonitoring): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
    
    inline def setStorageMode(value: StorageMode): Self = StObject.set(x, "StorageMode", value.asInstanceOf[js.Any])
    
    inline def setStorageModeUndefined: Self = StObject.set(x, "StorageMode", js.undefined)
  }
}
