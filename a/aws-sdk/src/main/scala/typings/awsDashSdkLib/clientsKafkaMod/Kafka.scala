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
    * Creates a new MSK cluster.
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
    * Creates a new MSK cluster.
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
    * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
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
    * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
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
    * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
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
    * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
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
    * A list of brokers that a client application can use to bootstrap.
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
    * A list of brokers that a client application can use to bootstrap.
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
    * Returns a list of clusters in an account.
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
    * Returns a list of clusters in an account.
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
    * Returns a list of the broker nodes in the cluster.
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
    * Returns a list of the broker nodes in the cluster.
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
}

