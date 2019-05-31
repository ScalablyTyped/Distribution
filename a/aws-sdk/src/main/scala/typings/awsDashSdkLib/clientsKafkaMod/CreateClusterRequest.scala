package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * 
    Information about the broker nodes in the cluster.
    
    */
  var BrokerNodeGroupInfo: awsDashSdkLib.clientsKafkaMod.BrokerNodeGroupInfo
  /**
    * 
    Includes all client authentication related information.
    
    */
  var ClientAuthentication: js.UndefOr[ClientAuthentication] = js.undefined
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: __stringMin1Max64
  /**
    * 
    Represents the configuration that you want MSK to use for the brokers in a cluster.
    
    */
  var ConfigurationInfo: js.UndefOr[ConfigurationInfo] = js.undefined
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  /**
    * 
    Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
    
    */
  var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined
  /**
    * 
    The version of Apache Kafka.
    
    */
  var KafkaVersion: __stringMin1Max128
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: __integerMin1Max15
  /**
    * 
    Create tags when creating the cluster.
    
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    BrokerNodeGroupInfo: BrokerNodeGroupInfo,
    ClusterName: __stringMin1Max64,
    KafkaVersion: __stringMin1Max128,
    NumberOfBrokerNodes: __integerMin1Max15,
    ClientAuthentication: ClientAuthentication = null,
    ConfigurationInfo: ConfigurationInfo = null,
    EncryptionInfo: EncryptionInfo = null,
    EnhancedMonitoring: EnhancedMonitoring = null,
    Tags: __mapOf__string = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo, ClusterName = ClusterName, KafkaVersion = KafkaVersion, NumberOfBrokerNodes = NumberOfBrokerNodes)
    if (ClientAuthentication != null) __obj.updateDynamic("ClientAuthentication")(ClientAuthentication)
    if (ConfigurationInfo != null) __obj.updateDynamic("ConfigurationInfo")(ConfigurationInfo)
    if (EncryptionInfo != null) __obj.updateDynamic("EncryptionInfo")(EncryptionInfo)
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

