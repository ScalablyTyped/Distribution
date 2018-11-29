package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kafka
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Kafka: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsKafkaMod.KafkaNs.ClientConfiguration = js.native
  /**
     * Creates a new MSK cluster.
     */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new MSK cluster.
     */
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new MSK cluster.
     */
  def createCluster(params: awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new MSK cluster.
     */
  def createCluster(
    params: awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     */
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     */
  def deleteCluster(params: awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the MSK cluster specified by the Amazon Resource Name (ARN) in the request.
     */
  def deleteCluster(
    params: awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     */
  def describeCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     */
  def describeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     */
  def describeCluster(params: awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a description of the MSK cluster whose Amazon Resource Name (ARN) is specified in the request.
     */
  def describeCluster(
    params: awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * A list of brokers that a client application can use to bootstrap.
     */
  def getBootstrapBrokers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * A list of brokers that a client application can use to bootstrap.
     */
  def getBootstrapBrokers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * A list of brokers that a client application can use to bootstrap.
     */
  def getBootstrapBrokers(params: awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * A list of brokers that a client application can use to bootstrap.
     */
  def getBootstrapBrokers(
    params: awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.GetBootstrapBrokersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of clusters in an account.
     */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of clusters in an account.
     */
  def listClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of clusters in an account.
     */
  def listClusters(params: awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of clusters in an account.
     */
  def listClusters(
    params: awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the broker nodes in the cluster.
     */
  def listNodes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the broker nodes in the cluster.
     */
  def listNodes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the broker nodes in the cluster.
     */
  def listNodes(params: awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of the broker nodes in the cluster.
     */
  def listNodes(
    params: awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsKafkaMod.KafkaNs.ListNodesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

