package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kafka
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Kafka: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * 
    Creates a new MSK cluster.
    
    */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Creates a new MSK cluster.
    
    */
  def createCluster(params: CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Creates a new MSK configuration.
    
    */
  def createConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Creates a new MSK configuration.
    
    */
  def createConfiguration(params: CreateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConfiguration(
    params: CreateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
    
    */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
    
    */
  def deleteCluster(params: DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
    
    */
  def describeCluster(): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
    
    */
  def describeCluster(params: DescribeClusterRequest): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeCluster(
    params: DescribeClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of the cluster operation specified by the ARN.
    
    */
  def describeClusterOperation(): awsDashSdkLib.libRequestMod.Request[DescribeClusterOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeClusterOperation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClusterOperationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of the cluster operation specified by the ARN.
    
    */
  def describeClusterOperation(params: DescribeClusterOperationRequest): awsDashSdkLib.libRequestMod.Request[DescribeClusterOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeClusterOperation(
    params: DescribeClusterOperationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeClusterOperationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeClusterOperationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of this MSK configuration.
    
    */
  def describeConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of this MSK configuration.
    
    */
  def describeConfiguration(params: DescribeConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfiguration(
    params: DescribeConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of this revision of the configuration.
    
    */
  def describeConfigurationRevision(): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfigurationRevision(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationRevisionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a description of this revision of the configuration.
    
    */
  def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeConfigurationRevision(
    params: DescribeConfigurationRevisionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeConfigurationRevisionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeConfigurationRevisionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    A list of brokers that a client application can use to bootstrap.
    
    */
  def getBootstrapBrokers(): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBootstrapBrokers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBootstrapBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    A list of brokers that a client application can use to bootstrap.
    
    */
  def getBootstrapBrokers(params: GetBootstrapBrokersRequest): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBootstrapBrokers(
    params: GetBootstrapBrokersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBootstrapBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBootstrapBrokersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the operations that have been performed on the specified MSK cluster.
    
    */
  def listClusterOperations(): awsDashSdkLib.libRequestMod.Request[ListClusterOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listClusterOperations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListClusterOperationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListClusterOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the operations that have been performed on the specified MSK cluster.
    
    */
  def listClusterOperations(params: ListClusterOperationsRequest): awsDashSdkLib.libRequestMod.Request[ListClusterOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listClusterOperations(
    params: ListClusterOperationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListClusterOperationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListClusterOperationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK clusters in the current Region.
    
    */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK clusters in the current Region.
    
    */
  def listClusters(params: ListClustersRequest): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurationRevisions(): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurationRevisions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurationRevisions(
    params: ListConfigurationRevisionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationRevisionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationRevisionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurations(): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of all the MSK configurations in this Region.
    
    */
  def listConfigurations(params: ListConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConfigurations(
    params: ListConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of the broker nodes in the cluster.
    
    */
  def listNodes(): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNodes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNodesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of the broker nodes in the cluster.
    
    */
  def listNodes(params: ListNodesRequest): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNodes(
    params: ListNodesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNodesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNodesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of the tags associated with the specified resource.
    
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Returns a list of the tags associated with the specified resource.
    
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Adds tags to the specified MSK resource.
    
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Adds tags to the specified MSK resource.
    
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Removes the tags associated with the keys that are provided in the query.
    
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Removes the tags associated with the keys that are provided in the query.
    
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Updates the EBS storage associated with MSK brokers.
    
    */
  def updateBrokerStorage(): awsDashSdkLib.libRequestMod.Request[UpdateBrokerStorageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBrokerStorage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBrokerStorageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBrokerStorageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Updates the EBS storage associated with MSK brokers.
    
    */
  def updateBrokerStorage(params: UpdateBrokerStorageRequest): awsDashSdkLib.libRequestMod.Request[UpdateBrokerStorageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBrokerStorage(
    params: UpdateBrokerStorageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBrokerStorageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBrokerStorageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Updates the cluster with the configuration that is specified in the request body.
    
    */
  def updateClusterConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateClusterConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateClusterConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateClusterConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateClusterConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    Updates the cluster with the configuration that is specified in the request body.
    
    */
  def updateClusterConfiguration(params: UpdateClusterConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateClusterConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateClusterConfiguration(
    params: UpdateClusterConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateClusterConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateClusterConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

