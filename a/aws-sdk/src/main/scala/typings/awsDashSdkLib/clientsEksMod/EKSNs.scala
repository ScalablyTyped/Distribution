package typings
package awsDashSdkLib.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/eks", "EKS")
@js.native
object EKSNs extends js.Object {
  trait Certificate extends js.Object {
    /**
      * The base64 encoded certificate data required to communicate with your cluster. Add this to the certificate-authority-data section of the kubeconfig file for your cluster.
      */
    var data: js.UndefOr[String] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait Cluster extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the cluster.
      */
    var arn: js.UndefOr[String] = js.undefined
    /**
      * The certificate-authority-data for your cluster.
      */
    var certificateAuthority: js.UndefOr[Certificate] = js.undefined
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: js.UndefOr[String] = js.undefined
    /**
      * The Unix epoch timestamp in seconds for when the cluster was created.
      */
    var createdAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * The endpoint for your Kubernetes API server.
      */
    var endpoint: js.UndefOr[String] = js.undefined
    /**
      * The name of the cluster.
      */
    var name: js.UndefOr[String] = js.undefined
    /**
      * The platform version of your Amazon EKS cluster. For more information, see Platform Versions in the  Amazon EKS User Guide .
      */
    var platformVersion: js.UndefOr[String] = js.undefined
    /**
      * The VPC subnets and security groups used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide.
      */
    var resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
      */
    var roleArn: js.UndefOr[String] = js.undefined
    /**
      * The current status of the cluster.
      */
    var status: js.UndefOr[ClusterStatus] = js.undefined
    /**
      * The Kubernetes server version for the cluster.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  
  trait CreateClusterRequest extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: js.UndefOr[String] = js.undefined
    /**
      * The unique name to give to your cluster.
      */
    var name: ClusterName
    /**
      * The VPC subnets and security groups used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. You must specify at least two subnets. You may specify up to five security groups, but we recommend that you use a dedicated security group for your cluster control plane.
      */
    var resourcesVpcConfig: VpcConfigRequest
    /**
      * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other AWS API operations on your behalf. For more information, see Amazon EKS Service IAM Role in the  Amazon EKS User Guide .
      */
    var roleArn: String
    /**
      * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available in Amazon EKS is used.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  
  trait CreateClusterResponse extends js.Object {
    /**
      * The full description of your new cluster.
      */
    var cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DeleteClusterRequest extends js.Object {
    /**
      * The name of the cluster to delete.
      */
    var name: String
  }
  
  trait DeleteClusterResponse extends js.Object {
    /**
      * The full description of the cluster to delete.
      */
    var cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DescribeClusterRequest extends js.Object {
    /**
      * The name of the cluster to describe.
      */
    var name: String
  }
  
  trait DescribeClusterResponse extends js.Object {
    /**
      * The full description of your specified cluster.
      */
    var cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  trait DescribeUpdateRequest extends js.Object {
    /**
      * The name of the Amazon EKS cluster to update.
      */
    var name: String
    /**
      * The ID of the update to describe.
      */
    var updateId: String
  }
  
  trait DescribeUpdateResponse extends js.Object {
    /**
      * The full description of the specified update.
      */
    var update: js.UndefOr[Update] = js.undefined
  }
  
  trait ErrorDetail extends js.Object {
    /**
      * A brief description of the error.     SubnetNotFound: One of the subnets associated with the cluster could not be found.    SecurityGroupNotFound: One of the security groups associated with the cluster could not be found.    EniLimitReached: You have reached the elastic network interface limit for your account.    IpNotAvailable: A subnet associated with the cluster does not have any free IP addresses.    AccessDenied: You do not have permissions to perform the specified operation.    OperationNotPermitted: The service role associated with the cluster does not have the required access permissions for Amazon EKS.    VpcIdNotFound: The VPC associated with the cluster could not be found.  
      */
    var errorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * A more complete description of the error.
      */
    var errorMessage: js.UndefOr[String] = js.undefined
    /**
      * An optional field that contains the resource IDs associated with the error.
      */
    var resourceIds: js.UndefOr[StringList] = js.undefined
  }
  
  trait ListClustersRequest extends js.Object {
    /**
      * The maximum number of cluster results returned by ListClusters in paginated output. When this parameter is used, ListClusters only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListClusters request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListClusters returns up to 100 results and a nextToken value if applicable.
      */
    var maxResults: js.UndefOr[ListClustersRequestMaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListClusters request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListClustersResponse extends js.Object {
    /**
      * A list of all of the clusters for your account in the specified Region.
      */
    var clusters: js.UndefOr[StringList] = js.undefined
    /**
      * The nextToken value to include in a future ListClusters request. When the results of a ListClusters request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListUpdatesRequest extends js.Object {
    /**
      * The maximum number of update results returned by ListUpdates in paginated output. When this parameter is used, ListUpdates only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListUpdates request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListUpdates returns up to 100 results and a nextToken value if applicable.
      */
    var maxResults: js.UndefOr[ListUpdatesRequestMaxResults] = js.undefined
    /**
      * The name of the Amazon EKS cluster for which to list updates.
      */
    var name: String
    /**
      * The nextToken value returned from a previous paginated ListUpdates request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
      */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListUpdatesResponse extends js.Object {
    /**
      * The nextToken value to include in a future ListUpdates request. When the results of a ListUpdates request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
      */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
      * A list of all the updates for the specified cluster and Region.
      */
    var updateIds: js.UndefOr[StringList] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
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
      * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
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
      * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
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
      * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
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
      * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
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
      * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
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
      * Returns descriptive information about an update against your Amazon EKS cluster. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
      */
    def describeUpdate(): awsDashSdkLib.libRequestMod.Request[DescribeUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUpdate(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns descriptive information about an update against your Amazon EKS cluster. When the status of the update is Succeeded, the update is complete. If an update fails, the status is Failed, and an error detail explains the reason for the failure.
      */
    def describeUpdate(params: DescribeUpdateRequest): awsDashSdkLib.libRequestMod.Request[DescribeUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeUpdate(
      params: DescribeUpdateRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeUpdateResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeUpdateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the Amazon EKS clusters in your AWS account in the specified Region.
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
      * Lists the Amazon EKS clusters in your AWS account in the specified Region.
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
      * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
      */
    def listUpdates(): awsDashSdkLib.libRequestMod.Request[ListUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUpdates(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUpdatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the updates associated with an Amazon EKS cluster in your AWS account, in the specified Region.
      */
    def listUpdates(params: ListUpdatesRequest): awsDashSdkLib.libRequestMod.Request[ListUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listUpdates(
      params: ListUpdatesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListUpdatesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListUpdatesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
      */
    def updateClusterVersion(): awsDashSdkLib.libRequestMod.Request[UpdateClusterVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateClusterVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClusterVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClusterVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an Amazon EKS cluster to the specified Kubernetes version. Your cluster continues to function during the update. The response output includes an update ID that you can use to track the status of your cluster update with the DescribeUpdate API operation. Cluster updates are asynchronous, and they should finish within a few minutes. During an update, the cluster status moves to UPDATING (this status transition is eventually consistent). When the update is complete (either Failed or Successful), the cluster status moves to Active.
      */
    def updateClusterVersion(params: UpdateClusterVersionRequest): awsDashSdkLib.libRequestMod.Request[UpdateClusterVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateClusterVersion(
      params: UpdateClusterVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateClusterVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateClusterVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_clusterActive(state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterActive(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterActive state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_clusterActive(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive,
      params: DescribeClusterRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterActive(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterActive,
      params: DescribeClusterRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_clusterDeleted(state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Waits for the clusterDeleted state by periodically calling the underlying EKS.describeClusteroperation every 30 seconds (at most 40 times).
      */
    @JSName("waitFor")
    def waitFor_clusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
      params: DescribeClusterRequest with awsDashSdkLib.Anon_Waiter
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    @JSName("waitFor")
    def waitFor_clusterDeleted(
      state: awsDashSdkLib.awsDashSdkLibStrings.clusterDeleted,
      params: DescribeClusterRequest with awsDashSdkLib.Anon_Waiter,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeClusterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait Update extends js.Object {
    /**
      * The Unix epoch timestamp in seconds for when the update was created.
      */
    var createdAt: js.UndefOr[Timestamp] = js.undefined
    /**
      * Any errors associated with a Failed update.
      */
    var errors: js.UndefOr[ErrorDetails] = js.undefined
    /**
      * A UUID that is used to track the update.
      */
    var id: js.UndefOr[String] = js.undefined
    /**
      * A key-value map that contains the parameters associated with the update.
      */
    var params: js.UndefOr[UpdateParams] = js.undefined
    /**
      * The current status of the update.
      */
    var status: js.UndefOr[UpdateStatus] = js.undefined
    /**
      * The type of the update.
      */
    var `type`: js.UndefOr[UpdateType] = js.undefined
  }
  
  trait UpdateClusterVersionRequest extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: js.UndefOr[String] = js.undefined
    /**
      * The name of the Amazon EKS cluster to update.
      */
    var name: String
    /**
      * The desired Kubernetes version following a successful update.
      */
    var version: String
  }
  
  trait UpdateClusterVersionResponse extends js.Object {
    /**
      * The full description of the specified update
      */
    var update: js.UndefOr[Update] = js.undefined
  }
  
  trait UpdateParam extends js.Object {
    /**
      * The keys associated with an update request.
      */
    var `type`: js.UndefOr[UpdateParamType] = js.undefined
    /**
      * The value of the keys submitted as part of an update request.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  
  trait VpcConfigRequest extends js.Object {
    /**
      * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane. If you do not specify a security group, the default security group for your VPC is used.
      */
    var securityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
      * Specify subnets for your Amazon EKS worker nodes. Amazon EKS creates cross-account elastic network interfaces in these subnets to allow communication between your worker nodes and the Kubernetes control plane.
      */
    var subnetIds: StringList
  }
  
  trait VpcConfigResponse extends js.Object {
    /**
      * The security groups associated with the cross-account elastic network interfaces that are used to allow communication between your worker nodes and the Kubernetes control plane.
      */
    var securityGroupIds: js.UndefOr[StringList] = js.undefined
    /**
      * The subnets associated with your cluster.
      */
    var subnetIds: js.UndefOr[StringList] = js.undefined
    /**
      * The VPC associated with your cluster.
      */
    var vpcId: js.UndefOr[String] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterName = java.lang.String
  type ClusterStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type ErrorCode = awsDashSdkLib.awsDashSdkLibStrings.SubnetNotFound | awsDashSdkLib.awsDashSdkLibStrings.SecurityGroupNotFound | awsDashSdkLib.awsDashSdkLibStrings.EniLimitReached | awsDashSdkLib.awsDashSdkLibStrings.IpNotAvailable | awsDashSdkLib.awsDashSdkLibStrings.AccessDenied | awsDashSdkLib.awsDashSdkLibStrings.OperationNotPermitted | awsDashSdkLib.awsDashSdkLibStrings.VpcIdNotFound | awsDashSdkLib.awsDashSdkLibStrings.Unknown | java.lang.String
  type ErrorDetails = js.Array[ErrorDetail]
  type ListClustersRequestMaxResults = scala.Double
  type ListUpdatesRequestMaxResults = scala.Double
  type String = java.lang.String
  type StringList = js.Array[String]
  type Timestamp = stdLib.Date
  type UpdateParamType = awsDashSdkLib.awsDashSdkLibStrings.Version | awsDashSdkLib.awsDashSdkLibStrings.PlatformVersion | java.lang.String
  type UpdateParams = js.Array[UpdateParam]
  type UpdateStatus = awsDashSdkLib.awsDashSdkLibStrings.InProgress | awsDashSdkLib.awsDashSdkLibStrings.Failed | awsDashSdkLib.awsDashSdkLibStrings.Cancelled | awsDashSdkLib.awsDashSdkLibStrings.Successful | java.lang.String
  type UpdateType = awsDashSdkLib.awsDashSdkLibStrings.VersionUpdate | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

