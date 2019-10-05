package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterInfo extends js.Object {
  /**
    * 
    Arn of active cluster operation.
    
    */
  var ActiveOperationArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    Information about the broker nodes.
    
    */
  var BrokerNodeGroupInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.BrokerNodeGroupInfo] = js.undefined
  /**
    * 
    Includes all client authentication information.
    
    */
  var ClientAuthentication: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ClientAuthentication] = js.undefined
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: js.UndefOr[__string] = js.undefined
  /**
    * 
    The name of the cluster.
    
    */
  var ClusterName: js.UndefOr[__string] = js.undefined
  /**
    * 
    The time when the cluster was created.
    
    */
  var CreationTime: js.UndefOr[__timestampIso8601] = js.undefined
  /**
    * 
    Information about the version of software currently deployed on the Kafka brokers in the cluster.
    
    */
  var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
  /**
    * 
    The current version of the MSK cluster.
    
    */
  var CurrentVersion: js.UndefOr[__string] = js.undefined
  /**
    * 
    Includes all encryption-related information.
    
    */
  var EncryptionInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.EncryptionInfo] = js.undefined
  /**
    * 
    Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER. For a list of the metrics associated with each of these three levels of monitoring, see Monitoring.
    
    */
  var EnhancedMonitoring: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.EnhancedMonitoring] = js.undefined
  /**
    * 
    The number of broker nodes in the cluster.
    
    */
  var NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined
  /**
    * 
    The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
    
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  /**
    * 
    Tags attached to the cluster.
    
    */
  var Tags: js.UndefOr[__mapOf__string] = js.undefined
  /**
    * 
    The connection string to use to connect to the Apache ZooKeeper cluster.
    
    */
  var ZookeeperConnectString: js.UndefOr[__string] = js.undefined
}

object ClusterInfo {
  @scala.inline
  def apply(
    ActiveOperationArn: __string = null,
    BrokerNodeGroupInfo: BrokerNodeGroupInfo = null,
    ClientAuthentication: ClientAuthentication = null,
    ClusterArn: __string = null,
    ClusterName: __string = null,
    CreationTime: __timestampIso8601 = null,
    CurrentBrokerSoftwareInfo: BrokerSoftwareInfo = null,
    CurrentVersion: __string = null,
    EncryptionInfo: EncryptionInfo = null,
    EnhancedMonitoring: EnhancedMonitoring = null,
    NumberOfBrokerNodes: Int | Double = null,
    State: ClusterState = null,
    Tags: __mapOf__string = null,
    ZookeeperConnectString: __string = null
  ): ClusterInfo = {
    val __obj = js.Dynamic.literal()
    if (ActiveOperationArn != null) __obj.updateDynamic("ActiveOperationArn")(ActiveOperationArn)
    if (BrokerNodeGroupInfo != null) __obj.updateDynamic("BrokerNodeGroupInfo")(BrokerNodeGroupInfo)
    if (ClientAuthentication != null) __obj.updateDynamic("ClientAuthentication")(ClientAuthentication)
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn)
    if (ClusterName != null) __obj.updateDynamic("ClusterName")(ClusterName)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (CurrentBrokerSoftwareInfo != null) __obj.updateDynamic("CurrentBrokerSoftwareInfo")(CurrentBrokerSoftwareInfo)
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion)
    if (EncryptionInfo != null) __obj.updateDynamic("EncryptionInfo")(EncryptionInfo)
    if (EnhancedMonitoring != null) __obj.updateDynamic("EnhancedMonitoring")(EnhancedMonitoring.asInstanceOf[js.Any])
    if (NumberOfBrokerNodes != null) __obj.updateDynamic("NumberOfBrokerNodes")(NumberOfBrokerNodes.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (ZookeeperConnectString != null) __obj.updateDynamic("ZookeeperConnectString")(ZookeeperConnectString)
    __obj.asInstanceOf[ClusterInfo]
  }
}

