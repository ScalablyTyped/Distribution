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
  /**
     * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
     */
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
  /**
     * Creates an Amazon EKS control plane.  The Amazon EKS control plane consists of control plane instances that run the Kubernetes software, like etcd and the API server. The control plane runs in an account managed by AWS, and the Kubernetes API is exposed via the Amazon EKS API server endpoint. Amazon EKS worker nodes run in your AWS account and connect to your cluster's control plane via the Kubernetes API server endpoint and a certificate file that is created for your cluster. The cluster control plane is provisioned across multiple Availability Zones and fronted by an Elastic Load Balancing Network Load Balancer. Amazon EKS also provisions elastic network interfaces in your VPC subnets to provide connectivity from the control plane instances to the worker nodes (for example, to support kubectl exec, logs, and proxy data flows). After you create an Amazon EKS cluster, you must configure your Kubernetes tooling to communicate with the API server and launch worker nodes into your cluster. For more information, see Managing Cluster Authentication and Launching Amazon EKS Worker Nodesin the Amazon EKS User Guide.
     */
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
  /**
     * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
     */
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
  /**
     * Deletes the Amazon EKS cluster control plane.   If you have active services in your cluster that are associated with a load balancer, you must delete those services before deleting the cluster so that the load balancers are deleted properly. Otherwise, you can have orphaned resources in your VPC that prevent you from being able to delete the VPC. For more information, see Deleting a Cluster in the Amazon EKS User Guide. 
     */
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
  /**
     * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
     */
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
  /**
     * Returns descriptive information about an Amazon EKS cluster. The API server endpoint and certificate authority data returned by this operation are required for kubelet and kubectl to communicate with your Kubernetes API server. For more information, see Create a kubeconfig for Amazon EKS.  The API server endpoint and certificate authority data are not available until the cluster reaches the ACTIVE state. 
     */
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
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEksMod.EKSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     */
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
  /**
     * Lists the Amazon EKS clusters in your AWS account in the specified Region.
     */
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
}

