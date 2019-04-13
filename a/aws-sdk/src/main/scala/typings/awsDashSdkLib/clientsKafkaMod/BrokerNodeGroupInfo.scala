package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerNodeGroupInfo extends js.Object {
  /**
    * The distribution of broker nodes across Availability Zones.
    */
  var BrokerAZDistribution: js.UndefOr[BrokerAZDistribution] = js.undefined
  /**
    * The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data. Client subnets can't be in Availability Zone us-east-1e.
    */
  var ClientSubnets: __listOf__string
  /**
    * The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed: kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge,
  kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
    */
  var InstanceType: __stringMin5Max32
  /**
    * The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to and communicate with the Amazon MSK cluster.
    */
  var SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
  /**
    * Contains information about storage volumes attached to MSK broker nodes.
    */
  var StorageInfo: js.UndefOr[StorageInfo] = js.undefined
}

object BrokerNodeGroupInfo {
  @scala.inline
  def apply(
    ClientSubnets: __listOf__string,
    InstanceType: __stringMin5Max32,
    BrokerAZDistribution: BrokerAZDistribution = null,
    SecurityGroups: __listOf__string = null,
    StorageInfo: StorageInfo = null
  ): BrokerNodeGroupInfo = {
    val __obj = js.Dynamic.literal(ClientSubnets = ClientSubnets, InstanceType = InstanceType)
    if (BrokerAZDistribution != null) __obj.updateDynamic("BrokerAZDistribution")(BrokerAZDistribution.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (StorageInfo != null) __obj.updateDynamic("StorageInfo")(StorageInfo)
    __obj.asInstanceOf[BrokerNodeGroupInfo]
  }
}

