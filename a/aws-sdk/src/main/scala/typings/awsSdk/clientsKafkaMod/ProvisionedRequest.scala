package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionedRequest extends StObject {
  
  /**
    * 
    Information about the brokers.
    
    */
  var BrokerNodeGroupInfo: typings.awsSdk.clientsKafkaMod.BrokerNodeGroupInfo
  
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsSdk.clientsKafkaMod.ClientAuthentication] = js.undefined
  
  /**
    * 
    Represents the configuration that you want Amazon MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.ConfigurationInfo] = js.undefined
  
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.EncryptionInfo] = js.undefined
  
  /**
    * 
    Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, PER_TOPIC_PER_BROKER, and PER_TOPIC_PER_PARTITION.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsSdk.clientsKafkaMod.EnhancedMonitoring] = js.undefined
  
  /**
    * 
    The Apache Kafka version that you want for the cluster.
    
    */
  var KafkaVersion: stringMin1Max128
  
  /**
    * 
    Log delivery information for the cluster.
    
    */
  var LoggingInfo: js.UndefOr[typings.awsSdk.clientsKafkaMod.LoggingInfo] = js.undefined
  
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: integerMin1Max15
  
  /**
    * 
    The settings for open monitoring.
    
    */
  var OpenMonitoring: js.UndefOr[OpenMonitoringInfo] = js.undefined
}
object ProvisionedRequest {
  
  inline def apply(
    BrokerNodeGroupInfo: BrokerNodeGroupInfo,
    KafkaVersion: stringMin1Max128,
    NumberOfBrokerNodes: integerMin1Max15
  ): ProvisionedRequest = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo.asInstanceOf[js.Any], KafkaVersion = KafkaVersion.asInstanceOf[js.Any], NumberOfBrokerNodes = NumberOfBrokerNodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionedRequest]
  }
  
  extension [Self <: ProvisionedRequest](x: Self) {
    
    inline def setBrokerNodeGroupInfo(value: BrokerNodeGroupInfo): Self = StObject.set(x, "BrokerNodeGroupInfo", value.asInstanceOf[js.Any])
    
    inline def setClientAuthentication(value: ClientAuthentication): Self = StObject.set(x, "ClientAuthentication", value.asInstanceOf[js.Any])
    
    inline def setClientAuthenticationUndefined: Self = StObject.set(x, "ClientAuthentication", js.undefined)
    
    inline def setConfigurationInfo(value: ConfigurationInfo): Self = StObject.set(x, "ConfigurationInfo", value.asInstanceOf[js.Any])
    
    inline def setConfigurationInfoUndefined: Self = StObject.set(x, "ConfigurationInfo", js.undefined)
    
    inline def setEncryptionInfo(value: EncryptionInfo): Self = StObject.set(x, "EncryptionInfo", value.asInstanceOf[js.Any])
    
    inline def setEncryptionInfoUndefined: Self = StObject.set(x, "EncryptionInfo", js.undefined)
    
    inline def setEnhancedMonitoring(value: EnhancedMonitoring): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setEnhancedMonitoringUndefined: Self = StObject.set(x, "EnhancedMonitoring", js.undefined)
    
    inline def setKafkaVersion(value: stringMin1Max128): Self = StObject.set(x, "KafkaVersion", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfo(value: LoggingInfo): Self = StObject.set(x, "LoggingInfo", value.asInstanceOf[js.Any])
    
    inline def setLoggingInfoUndefined: Self = StObject.set(x, "LoggingInfo", js.undefined)
    
    inline def setNumberOfBrokerNodes(value: integerMin1Max15): Self = StObject.set(x, "NumberOfBrokerNodes", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoring(value: OpenMonitoringInfo): Self = StObject.set(x, "OpenMonitoring", value.asInstanceOf[js.Any])
    
    inline def setOpenMonitoringUndefined: Self = StObject.set(x, "OpenMonitoring", js.undefined)
  }
}
