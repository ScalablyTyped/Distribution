package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClusterRequest extends js.Object {
  /**
    * Information about the broker nodes in the cluster.
    */
  var BrokerNodeGroupInfo: awsDashSdkLib.clientsKafkaMod.BrokerNodeGroupInfo
  /**
    * The name of the cluster.
    */
  var ClusterName: __stringMin1Max64
  /**
    * Includes all encryption-related information.
    */
  var EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
  /**
    * Specifies the level of monitoring for the MSK cluster. The possible values are DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
    */
  var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined
  /**
    * The version of Apache Kafka.
    */
  var KafkaVersion: __stringMin1Max128
  /**
    * The number of Kafka broker nodes in the Amazon MSK cluster.
    */
  var NumberOfBrokerNodes: __integerMin1Max15
}

object CreateClusterRequest {
  @scala.inline
  def apply(
    BrokerNodeGroupInfo: BrokerNodeGroupInfo,
    ClusterName: __stringMin1Max64,
    KafkaVersion: __stringMin1Max128,
    NumberOfBrokerNodes: __integerMin1Max15,
    EncryptionInfo: EncryptionInfo = null,
    EnhancedMonitoring: EnhancedMonitoring = null
  ): CreateClusterRequest = {
    val __obj = js.Dynamic.literal(BrokerNodeGroupInfo = BrokerNodeGroupInfo, ClusterName = ClusterName, KafkaVersion = KafkaVersion, NumberOfBrokerNodes = NumberOfBrokerNodes)
    if (EncryptionInfo != null) __obj.updateDynamic("EncryptionInfo")(EncryptionInfo)
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterRequest]
  }
}

