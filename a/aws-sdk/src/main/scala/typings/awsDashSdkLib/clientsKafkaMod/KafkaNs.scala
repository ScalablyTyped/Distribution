package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/kafka", "Kafka")
@js.native
object KafkaNs extends js.Object {
  
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
  
  
  trait BrokerNodeInfo extends js.Object {
    /**
         * The attached elastic network interface of the broker.
         */
    var AttachedENIId: js.UndefOr[__string] = js.undefined
    /**
         * The ID of the broker.
         */
    var BrokerId: js.UndefOr[__double] = js.undefined
    /**
         * The client subnet to which this broker node belongs.
         */
    var ClientSubnet: js.UndefOr[__string] = js.undefined
    /**
         * The virtual private cloud (VPC) of the client.
         */
    var ClientVpcIpAddress: js.UndefOr[__string] = js.undefined
    /**
         * Information about the version of software currently deployed on the Kafka brokers in the cluster.
         */
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
  }
  
  
  trait BrokerSoftwareInfo extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the configuration used for the cluster.
         */
    var ConfigurationArn: js.UndefOr[__string] = js.undefined
    /**
         * The revision of the configuration to use.
         */
    var ConfigurationRevision: js.UndefOr[__string] = js.undefined
    /**
         * The version of Apache Kafka.
         */
    var KafkaVersion: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait ClusterInfo extends js.Object {
    /**
         * Information about the broker nodes.
         */
    var BrokerNodeGroupInfo: js.UndefOr[BrokerNodeGroupInfo] = js.undefined
    /**
         * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
         */
    var ClusterArn: js.UndefOr[__string] = js.undefined
    /**
         * The name of the cluster.
         */
    var ClusterName: js.UndefOr[__string] = js.undefined
    /**
         * The time when the cluster was created.
         */
    var CreationTime: js.UndefOr[__timestampIso8601] = js.undefined
    /**
         * Information about the version of software currently deployed on the Kafka brokers in the cluster.
         */
    var CurrentBrokerSoftwareInfo: js.UndefOr[BrokerSoftwareInfo] = js.undefined
    /**
         * The current version of the MSK cluster.
         */
    var CurrentVersion: js.UndefOr[__string] = js.undefined
    /**
         * Includes all encryption-related information.
         */
    var EncryptionInfo: js.UndefOr[EncryptionInfo] = js.undefined
    /**
         * Specifies which metrics are gathered for the MSK cluster. This property has three possible values: DEFAULT, PER_BROKER, and PER_TOPIC_PER_BROKER.
         */
    var EnhancedMonitoring: js.UndefOr[EnhancedMonitoring] = js.undefined
    /**
         * The number of Kafka broker nodes in the cluster.
         */
    var NumberOfBrokerNodes: js.UndefOr[__integer] = js.undefined
    /**
         * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
         */
    var State: js.UndefOr[ClusterState] = js.undefined
    /**
         * The connection string to use to connect to the Apache ZooKeeper cluster.
         */
    var ZookeeperConnectString: js.UndefOr[__string] = js.undefined
  }
  
  
  trait CreateClusterRequest extends js.Object {
    /**
         * Information about the broker nodes in the cluster.
         */
    var BrokerNodeGroupInfo: BrokerNodeGroupInfo
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
  
  
  trait CreateClusterResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the cluster.
         */
    var ClusterArn: js.UndefOr[__string] = js.undefined
    /**
         * The name of the MSK cluster.
         */
    var ClusterName: js.UndefOr[__string] = js.undefined
    /**
         * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
         */
    var State: js.UndefOr[ClusterState] = js.undefined
  }
  
  
  trait DeleteClusterRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
         */
    var ClusterArn: __string
    /**
         * The current version of the MSK cluster.
         */
    var CurrentVersion: js.UndefOr[__string] = js.undefined
  }
  
  
  trait DeleteClusterResponse extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the cluster.
         */
    var ClusterArn: js.UndefOr[__string] = js.undefined
    /**
         * The state of the cluster. The possible states are CREATING, ACTIVE, and FAILED.
         */
    var State: js.UndefOr[ClusterState] = js.undefined
  }
  
  
  trait DescribeClusterRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
         */
    var ClusterArn: __string
  }
  
  
  trait DescribeClusterResponse extends js.Object {
    /**
         * The cluster information.
         */
    var ClusterInfo: js.UndefOr[ClusterInfo] = js.undefined
  }
  
  
  trait EBSStorageInfo extends js.Object {
    /**
         * The size in GiB of the EBS volume for the data drive on each broker node.
         */
    var VolumeSize: js.UndefOr[__integerMin1Max16384] = js.undefined
  }
  
  
  trait EncryptionAtRest extends js.Object {
    /**
         * The AWS KMS key used for data encryption.
         */
    var DataVolumeKMSKeyId: __string
  }
  
  
  trait EncryptionInfo extends js.Object {
    /**
         * The data volume encryption details.
         */
    var EncryptionAtRest: js.UndefOr[EncryptionAtRest] = js.undefined
  }
  
  
  trait GetBootstrapBrokersRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
         */
    var ClusterArn: __string
  }
  
  
  trait GetBootstrapBrokersResponse extends js.Object {
    /**
         * A string containing one or more hostname:port pairs.
         */
    var BootstrapBrokerString: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListClustersRequest extends js.Object {
    /**
         * Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
         */
    var ClusterNameFilter: js.UndefOr[__string] = js.undefined
    /**
         * The maximum number of clusters to return in the response. If there are more clusters, the response includes a NextToken parameter.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
     To get another batch of clusters, provide this token in your next request.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListClustersResponse extends js.Object {
    /**
         * Information on each of the MSK clusters in the response.
         */
    var ClusterInfoList: js.UndefOr[__listOfClusterInfo] = js.undefined
    /**
         * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
     To get another batch of clusters, provide this token in your next request.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListNodesRequest extends js.Object {
    /**
         * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
         */
    var ClusterArn: __string
    /**
         * The maximum number of clusters to return in the response. If there are more clusters, the response includes a NextToken parameter.
         */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
         * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
     To get another batch of clusters, provide this token in your next request.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListNodesResponse extends js.Object {
    /**
         * The paginated results marker. When the result of a ListNodes operation is truncated, the call returns NextToken in the response. 
     To get another batch of nodes, provide this token in your next request.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
         * List containing a NodeInfo object.
         */
    var NodeInfoList: js.UndefOr[__listOfNodeInfo] = js.undefined
  }
  
  
  trait NodeInfo extends js.Object {
    /**
         * The start time.
         */
    var AddedToClusterTime: js.UndefOr[__string] = js.undefined
    /**
         * The broker node info.
         */
    var BrokerNodeInfo: js.UndefOr[BrokerNodeInfo] = js.undefined
    /**
         * The instance type.
         */
    var InstanceType: js.UndefOr[__string] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the node.
         */
    var NodeARN: js.UndefOr[__string] = js.undefined
    /**
         * The node type.
         */
    var NodeType: js.UndefOr[NodeType] = js.undefined
    /**
         * The ZookeeperNodeInfo.
         */
    var ZookeeperNodeInfo: js.UndefOr[ZookeeperNodeInfo] = js.undefined
  }
  
  
  trait StorageInfo extends js.Object {
    /**
         * EBS volume information.
         */
    var EbsStorageInfo: js.UndefOr[EBSStorageInfo] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Creates a new MSK cluster.
       */
    def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new MSK cluster.
       */
    def createCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new MSK cluster.
       */
    def createCluster(params: CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a new MSK cluster.
       */
    def createCluster(
      params: CreateClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
       */
    def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
       */
    def deleteCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
       */
    def deleteCluster(params: DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
       */
    def deleteCluster(
      params: DeleteClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
       */
    def describeCluster(): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
       */
    def describeCluster(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
       */
    def describeCluster(params: DescribeClusterRequest): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
       */
    def describeCluster(
      params: DescribeClusterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A list of brokers that a client application can use to bootstrap.
       */
    def getBootstrapBrokers(): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A list of brokers that a client application can use to bootstrap.
       */
    def getBootstrapBrokers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBootstrapBrokersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A list of brokers that a client application can use to bootstrap.
       */
    def getBootstrapBrokers(params: GetBootstrapBrokersRequest): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * A list of brokers that a client application can use to bootstrap.
       */
    def getBootstrapBrokers(
      params: GetBootstrapBrokersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetBootstrapBrokersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of clusters in an account.
       */
    def listClusters(): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of clusters in an account.
       */
    def listClusters(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of clusters in an account.
       */
    def listClusters(params: ListClustersRequest): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of clusters in an account.
       */
    def listClusters(
      params: ListClustersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the broker nodes in the cluster.
       */
    def listNodes(): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the broker nodes in the cluster.
       */
    def listNodes(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNodesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the broker nodes in the cluster.
       */
    def listNodes(params: ListNodesRequest): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the broker nodes in the cluster.
       */
    def listNodes(
      params: ListNodesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListNodesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait ZookeeperNodeInfo extends js.Object {
    /**
         * The attached elastic network interface of the broker.
         */
    var AttachedENIId: js.UndefOr[__string] = js.undefined
    /**
         * The virtual private cloud (VPC) IP address of the client.
         */
    var ClientVpcIpAddress: js.UndefOr[__string] = js.undefined
    /**
         * The role-specific ID for Zookeeper.
         */
    var ZookeeperId: js.UndefOr[__double] = js.undefined
    /**
         * The version of Zookeeper.
         */
    var ZookeeperVersion: js.UndefOr[__string] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type BrokerAZDistribution = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterState = awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type EnhancedMonitoring = awsDashSdkLib.awsDashSdkLibStrings.DEFAULT | awsDashSdkLib.awsDashSdkLibStrings.PER_BROKER | awsDashSdkLib.awsDashSdkLibStrings.PER_TOPIC_PER_BROKER | java.lang.String
  type MaxResults = scala.Double
  type NodeType = awsDashSdkLib.awsDashSdkLibStrings.BROKER | java.lang.String
  type __double = scala.Double
  type __integer = scala.Double
  type __integerMin1Max15 = scala.Double
  type __integerMin1Max16384 = scala.Double
  type __listOfClusterInfo = js.Array[ClusterInfo]
  type __listOfNodeInfo = js.Array[NodeInfo]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  type __stringMin1Max128 = java.lang.String
  type __stringMin1Max64 = java.lang.String
  type __stringMin5Max32 = java.lang.String
  type __timestampIso8601 = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-11-14` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

