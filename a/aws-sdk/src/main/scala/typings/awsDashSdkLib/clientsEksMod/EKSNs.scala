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
    var data: js.UndefOr[java.lang.String] = js.undefined
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
    var arn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The certificate-authority-data for your cluster.
         */
    var certificateAuthority: js.UndefOr[Certificate] = js.undefined
    /**
         * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
         */
    var clientRequestToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The Unix epoch time stamp in seconds for when the cluster was created.
         */
    var createdAt: js.UndefOr[Timestamp] = js.undefined
    /**
         * The endpoint for your Kubernetes API server.
         */
    var endpoint: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The name of the cluster.
         */
    var name: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The platform version of your Amazon EKS cluster. For more information, see Platform Versions in the  Amazon EKS User Guide .
         */
    var platformVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The VPC subnets and security groups used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide.
         */
    var resourcesVpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
    /**
         * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf.
         */
    var roleArn: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The current status of the cluster.
         */
    var status: js.UndefOr[ClusterStatus] = js.undefined
    /**
         * The Kubernetes server version for the cluster.
         */
    var version: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait CreateClusterRequest extends js.Object {
    /**
         * Unique, case-sensitive identifier you provide to ensure the idempotency of the request.
         */
    var clientRequestToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The unique name to give to your cluster.
         */
    var name: ClusterName
    /**
         * The VPC subnets and security groups used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. You must specify at least two subnets. You may specify up to 5 security groups, but we recommend that you use a dedicated security group for your cluster control plane.
         */
    var resourcesVpcConfig: VpcConfigRequest
    /**
         * The Amazon Resource Name (ARN) of the IAM role that provides permissions for Amazon EKS to make calls to other AWS API operations on your behalf. For more information, see Amazon EKS Service IAM Role in the  Amazon EKS User Guide .
         */
    var roleArn: java.lang.String
    /**
         * The desired Kubernetes version for your cluster. If you do not specify a value here, the latest version available in Amazon EKS is used.
         */
    var version: js.UndefOr[java.lang.String] = js.undefined
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
    var name: java.lang.String
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
    var name: java.lang.String
  }
  
  
  trait DescribeClusterResponse extends js.Object {
    /**
         * The full description of your specified cluster.
         */
    var cluster: js.UndefOr[Cluster] = js.undefined
  }
  
  
  trait ListClustersRequest extends js.Object {
    /**
         * The maximum number of cluster results returned by ListClusters in paginated output. When this parameter is used, ListClusters only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListClusters request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListClusters returns up to 100 results and a nextToken value if applicable.
         */
    var maxResults: js.UndefOr[ListClustersRequestMaxResults] = js.undefined
    /**
         * The nextToken value returned from a previous paginated ListClusters request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
         */
    var nextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ListClustersResponse extends js.Object {
    /**
         * A list of all of the clusters for your account in the specified Region.
         */
    var clusters: js.UndefOr[StringList] = js.undefined
    /**
         * The nextToken value to include in a future ListClusters request. When the results of a ListClusters request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
         */
    var nextToken: js.UndefOr[java.lang.String] = js.undefined
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
    /**
       * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
       */
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
    /**
       * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
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
       * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
       */
    def deleteCluster(): awsDashSdkLib.libRequestMod.Request[DeleteClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
       */
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
    /**
       * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
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
       * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
       */
    def describeCluster(): awsDashSdkLib.libRequestMod.Request[DescribeClusterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
       */
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
    /**
       * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
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
       * Lists the Amazon EKS clusters in your AWS account in the specified Region.
       */
    def listClusters(): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the Amazon EKS clusters in your AWS account in the specified Region.
       */
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
    /**
       * Lists the Amazon EKS clusters in your AWS account in the specified Region.
       */
    def listClusters(
      params: ListClustersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListClustersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListClustersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait VpcConfigRequest extends js.Object {
    /**
         * Specify one or more security groups for the cross-account elastic network interfaces that Amazon EKS creates to use to allow communication between your worker nodes and the Kubernetes control plane.
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
    var vpcId: js.UndefOr[java.lang.String] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterName = java.lang.String
  type ClusterStatus = awsDashSdkLib.awsDashSdkLibStrings.CREATING | awsDashSdkLib.awsDashSdkLibStrings.ACTIVE | awsDashSdkLib.awsDashSdkLibStrings.DELETING | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
  type ListClustersRequestMaxResults = scala.Double
  type String = java.lang.String
  type StringList = js.Array[java.lang.String]
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

