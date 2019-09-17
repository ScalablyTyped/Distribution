package typings.awsDashSdk.clientsEksMod

import typings.awsDashSdk.Anon_Waiter
import typings.awsDashSdk.awsDashSdkStrings.clusterActive
import typings.awsDashSdk.awsDashSdkStrings.clusterDeleted
import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EKS extends Service {
  @JSName("config")
  var config_EKS: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and unique and runs on its own set of Amazon EC2 instances. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. You can use the endpointPublicAccess and endpointPrivateAccess parameters to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .  You can use the logging parameter to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodes in the Amazon EKS User Guide.
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, such as etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Each Amazon EKS cluster control plane is single-tenant and unique and runs on its own set of Amazon EC2 instances. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. You can use the endpointPublicAccess and endpointPrivateAccess parameters to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .  You can use the logging parameter to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  Cluster creation typically takes between 10 and 15 minutes. After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodes in the Amazon EKS User Guide.
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data aren't available until the cluster reaches the ACTIVE state. 
    */
  def describeCluster(): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data aren't available until the cluster reaches the ACTIVE state. 
    */
  def describeCluster(params: DescribeClusterRequest): Request[DescribeClusterResponse, AWSError] = js.native
  def describeCluster(
    params: DescribeClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an update against your Amazon EKS cluster. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
    */
  def describeUpdate(): Request[DescribeUpdateResponse, AWSError] = js.native
  def describeUpdate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUpdateResponse, Unit]): Request[DescribeUpdateResponse, AWSError] = js.native
  /**
    * Returns descriptive information about an update against your Amazon EKS cluster. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
    */
  def describeUpdate(params: DescribeUpdateRequest): Request[DescribeUpdateResponse, AWSError] = js.native
  def describeUpdate(
    params: DescribeUpdateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUpdateResponse, Unit]
  ): Request[DescribeUpdateResponse, AWSError] = js.native
  /**
    * Lists the Amazon EKS clusters in your AWS account in the specified Region.
    */
  def listClusters(): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]): Request[ListClustersResponse, AWSError] = js.native
  /**
    * Lists the Amazon EKS clusters in your AWS account in the specified Region.
    */
  def listClusters(params: ListClustersRequest): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]
  ): Request[ListClustersResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon EKS resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon EKS resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
    */
  def listUpdates(): Request[ListUpdatesResponse, AWSError] = js.native
  def listUpdates(callback: js.Function2[/* err */ AWSError, /* data */ ListUpdatesResponse, Unit]): Request[ListUpdatesResponse, AWSError] = js.native
  /**
    * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
    */
  def listUpdates(params: ListUpdatesRequest): Request[ListUpdatesResponse, AWSError] = js.native
  def listUpdates(
    params: ListUpdatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUpdatesResponse, Unit]
  ): Request[ListUpdatesResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .   At this time, you can not update the subnets or security group IDs for an existing cluster.  Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterConfig(): Request[UpdateClusterConfigResponse, AWSError] = js.native
  def updateClusterConfig(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterConfigResponse, Unit]): Request[UpdateClusterConfigResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS cluster configuration. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. You can use this API operation to enable or disable exporting the Kubernetes control plane logs for your cluster to CloudWatch Logs. By default, cluster control plane logs aren't exported to CloudWatch Logs. For more information, see Amazon EKS Cluster Control Plane Logs in the  Amazon EKS User Guide .  CloudWatch Logs ingestion, archive storage, and data scanning rates apply to exported control plane logs. For more information, see Amazon CloudWatch Pricing.  You can also use this API operation to enable or disable public and private access to your cluster's Kubernetes API server endpoint. By default, public access is enabled, and private access is disabled. For more information, see Amazon EKS Cluster Endpoint Access Control in the  Amazon EKS User Guide .   At this time, you can not update the subnets or security group IDs for an existing cluster.  Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterConfig(params: UpdateClusterConfigRequest): Request[UpdateClusterConfigResponse, AWSError] = js.native
  def updateClusterConfig(
    params: UpdateClusterConfigRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterConfigResponse, Unit]
  ): Request[UpdateClusterConfigResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterVersion(): Request[UpdateClusterVersionResponse, AWSError] = js.native
  def updateClusterVersion(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterVersionResponse, Unit]): Request[UpdateClusterVersionResponse, AWSError] = js.native
  /**
    * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
    */
  def updateClusterVersion(params: UpdateClusterVersionRequest): Request[UpdateClusterVersionResponse, AWSError] = js.native
  def updateClusterVersion(
    params: UpdateClusterVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterVersionResponse, Unit]
  ): Request[UpdateClusterVersionResponse, AWSError] = js.native
  /**
    * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterActive(state: clusterActive): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: clusterActive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterActive(state: clusterActive, params: DescribeClusterRequest with Anon_Waiter): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterActive(
    state: clusterActive,
    params: DescribeClusterRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
  /**
    * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_clusterDeleted(state: clusterDeleted, params: DescribeClusterRequest with Anon_Waiter): Request[DescribeClusterResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_clusterDeleted(
    state: clusterDeleted,
    params: DescribeClusterRequest with Anon_Waiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClusterResponse, Unit]
  ): Request[DescribeClusterResponse, AWSError] = js.native
}

