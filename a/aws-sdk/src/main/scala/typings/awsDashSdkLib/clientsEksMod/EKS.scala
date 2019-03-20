package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EKS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_EKS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsEksMod.EKSNs.ClientConfiguration = js.native
  /**
    * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
    */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
    */
  def createCluster(params: awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCluster(
    params: awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
    */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
    */
  def deleteCluster(params: awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCluster(
    params: awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
    */
  def describeCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
    */
  def describeCluster(params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeCluster(
    params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptive information about an update against your Amazon EKS cluster. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
    */
  def describeUpdate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUpdate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns descriptive information about an update against your Amazon EKS cluster. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
    */
  def describeUpdate(params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUpdate(
    params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeUpdateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon EKS clusters in your AWS account in the specified Region.
    */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon EKS clusters in your AWS account in the specified Region.
    */
  def listClusters(params: awsDashSdkLib.clientsEksMod.EKSNs.ListClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listClusters(
    params: awsDashSdkLib.clientsEksMod.EKSNs.ListClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
    */
  def listUpdates(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUpdates(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
    */
  def listUpdates(params: awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUpdates(
    params: awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListUpdatesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Currently, the only cluster configuration changes supported are to enable or disable Amazon EKS public and private API server endpoints. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide . Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClusterConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Currently, the only cluster configuration changes supported are to enable or disable Amazon EKS public and private API server endpoints. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide . Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterConfig(params: awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClusterConfig(
    params: awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClusterVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterVersion(params: awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClusterVersion(
    params: awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.UpdateClusterVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterActive(state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive,
    params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive,
    params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
    params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
    params: awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.DescribeClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

