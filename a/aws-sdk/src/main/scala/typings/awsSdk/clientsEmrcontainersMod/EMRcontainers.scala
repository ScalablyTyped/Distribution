package typings.awsSdk.clientsEmrcontainersMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EMRcontainers extends Service {
  
  /**
    * Cancels a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def cancelJobRun(): Request[CancelJobRunResponse, AWSError] = js.native
  def cancelJobRun(callback: js.Function2[/* err */ AWSError, /* data */ CancelJobRunResponse, Unit]): Request[CancelJobRunResponse, AWSError] = js.native
  /**
    * Cancels a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def cancelJobRun(params: CancelJobRunRequest): Request[CancelJobRunResponse, AWSError] = js.native
  def cancelJobRun(
    params: CancelJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelJobRunResponse, Unit]
  ): Request[CancelJobRunResponse, AWSError] = js.native
  
  @JSName("config")
  var config_EMRcontainers: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a job template. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def createJobTemplate(): Request[CreateJobTemplateResponse, AWSError] = js.native
  def createJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobTemplateResponse, Unit]): Request[CreateJobTemplateResponse, AWSError] = js.native
  /**
    * Creates a job template. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def createJobTemplate(params: CreateJobTemplateRequest): Request[CreateJobTemplateResponse, AWSError] = js.native
  def createJobTemplate(
    params: CreateJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobTemplateResponse, Unit]
  ): Request[CreateJobTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a managed endpoint. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def createManagedEndpoint(): Request[CreateManagedEndpointResponse, AWSError] = js.native
  def createManagedEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateManagedEndpointResponse, Unit]): Request[CreateManagedEndpointResponse, AWSError] = js.native
  /**
    * Creates a managed endpoint. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def createManagedEndpoint(params: CreateManagedEndpointRequest): Request[CreateManagedEndpointResponse, AWSError] = js.native
  def createManagedEndpoint(
    params: CreateManagedEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateManagedEndpointResponse, Unit]
  ): Request[CreateManagedEndpointResponse, AWSError] = js.native
  
  /**
    * Creates a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def createVirtualCluster(): Request[CreateVirtualClusterResponse, AWSError] = js.native
  def createVirtualCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualClusterResponse, Unit]): Request[CreateVirtualClusterResponse, AWSError] = js.native
  /**
    * Creates a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def createVirtualCluster(params: CreateVirtualClusterRequest): Request[CreateVirtualClusterResponse, AWSError] = js.native
  def createVirtualCluster(
    params: CreateVirtualClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVirtualClusterResponse, Unit]
  ): Request[CreateVirtualClusterResponse, AWSError] = js.native
  
  /**
    * Deletes a job template. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def deleteJobTemplate(): Request[DeleteJobTemplateResponse, AWSError] = js.native
  def deleteJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTemplateResponse, Unit]): Request[DeleteJobTemplateResponse, AWSError] = js.native
  /**
    * Deletes a job template. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def deleteJobTemplate(params: DeleteJobTemplateRequest): Request[DeleteJobTemplateResponse, AWSError] = js.native
  def deleteJobTemplate(
    params: DeleteJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteJobTemplateResponse, Unit]
  ): Request[DeleteJobTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes a managed endpoint. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def deleteManagedEndpoint(): Request[DeleteManagedEndpointResponse, AWSError] = js.native
  def deleteManagedEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DeleteManagedEndpointResponse, Unit]): Request[DeleteManagedEndpointResponse, AWSError] = js.native
  /**
    * Deletes a managed endpoint. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def deleteManagedEndpoint(params: DeleteManagedEndpointRequest): Request[DeleteManagedEndpointResponse, AWSError] = js.native
  def deleteManagedEndpoint(
    params: DeleteManagedEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteManagedEndpointResponse, Unit]
  ): Request[DeleteManagedEndpointResponse, AWSError] = js.native
  
  /**
    * Deletes a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def deleteVirtualCluster(): Request[DeleteVirtualClusterResponse, AWSError] = js.native
  def deleteVirtualCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualClusterResponse, Unit]): Request[DeleteVirtualClusterResponse, AWSError] = js.native
  /**
    * Deletes a virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def deleteVirtualCluster(params: DeleteVirtualClusterRequest): Request[DeleteVirtualClusterResponse, AWSError] = js.native
  def deleteVirtualCluster(
    params: DeleteVirtualClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteVirtualClusterResponse, Unit]
  ): Request[DeleteVirtualClusterResponse, AWSError] = js.native
  
  /**
    * Displays detailed information about a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def describeJobRun(): Request[DescribeJobRunResponse, AWSError] = js.native
  def describeJobRun(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobRunResponse, Unit]): Request[DescribeJobRunResponse, AWSError] = js.native
  /**
    * Displays detailed information about a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def describeJobRun(params: DescribeJobRunRequest): Request[DescribeJobRunResponse, AWSError] = js.native
  def describeJobRun(
    params: DescribeJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobRunResponse, Unit]
  ): Request[DescribeJobRunResponse, AWSError] = js.native
  
  /**
    * Displays detailed information about a specified job template. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def describeJobTemplate(): Request[DescribeJobTemplateResponse, AWSError] = js.native
  def describeJobTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobTemplateResponse, Unit]): Request[DescribeJobTemplateResponse, AWSError] = js.native
  /**
    * Displays detailed information about a specified job template. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def describeJobTemplate(params: DescribeJobTemplateRequest): Request[DescribeJobTemplateResponse, AWSError] = js.native
  def describeJobTemplate(
    params: DescribeJobTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeJobTemplateResponse, Unit]
  ): Request[DescribeJobTemplateResponse, AWSError] = js.native
  
  /**
    * Displays detailed information about a managed endpoint. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def describeManagedEndpoint(): Request[DescribeManagedEndpointResponse, AWSError] = js.native
  def describeManagedEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedEndpointResponse, Unit]): Request[DescribeManagedEndpointResponse, AWSError] = js.native
  /**
    * Displays detailed information about a managed endpoint. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def describeManagedEndpoint(params: DescribeManagedEndpointRequest): Request[DescribeManagedEndpointResponse, AWSError] = js.native
  def describeManagedEndpoint(
    params: DescribeManagedEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeManagedEndpointResponse, Unit]
  ): Request[DescribeManagedEndpointResponse, AWSError] = js.native
  
  /**
    * Displays detailed information about a specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def describeVirtualCluster(): Request[DescribeVirtualClusterResponse, AWSError] = js.native
  def describeVirtualCluster(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualClusterResponse, Unit]): Request[DescribeVirtualClusterResponse, AWSError] = js.native
  /**
    * Displays detailed information about a specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def describeVirtualCluster(params: DescribeVirtualClusterRequest): Request[DescribeVirtualClusterResponse, AWSError] = js.native
  def describeVirtualCluster(
    params: DescribeVirtualClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVirtualClusterResponse, Unit]
  ): Request[DescribeVirtualClusterResponse, AWSError] = js.native
  
  /**
    * Generate a session token to connect to a managed endpoint. 
    */
  def getManagedEndpointSessionCredentials(): Request[GetManagedEndpointSessionCredentialsResponse, AWSError] = js.native
  def getManagedEndpointSessionCredentials(
    callback: js.Function2[/* err */ AWSError, /* data */ GetManagedEndpointSessionCredentialsResponse, Unit]
  ): Request[GetManagedEndpointSessionCredentialsResponse, AWSError] = js.native
  /**
    * Generate a session token to connect to a managed endpoint. 
    */
  def getManagedEndpointSessionCredentials(params: GetManagedEndpointSessionCredentialsRequest): Request[GetManagedEndpointSessionCredentialsResponse, AWSError] = js.native
  def getManagedEndpointSessionCredentials(
    params: GetManagedEndpointSessionCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetManagedEndpointSessionCredentialsResponse, Unit]
  ): Request[GetManagedEndpointSessionCredentialsResponse, AWSError] = js.native
  
  /**
    * Lists job runs based on a set of parameters. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def listJobRuns(): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]): Request[ListJobRunsResponse, AWSError] = js.native
  /**
    * Lists job runs based on a set of parameters. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def listJobRuns(params: ListJobRunsRequest): Request[ListJobRunsResponse, AWSError] = js.native
  def listJobRuns(
    params: ListJobRunsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobRunsResponse, Unit]
  ): Request[ListJobRunsResponse, AWSError] = js.native
  
  /**
    * Lists job templates based on a set of parameters. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def listJobTemplates(): Request[ListJobTemplatesResponse, AWSError] = js.native
  def listJobTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListJobTemplatesResponse, Unit]): Request[ListJobTemplatesResponse, AWSError] = js.native
  /**
    * Lists job templates based on a set of parameters. Job template stores values of StartJobRun API request in a template and can be used to start a job run. Job template allows two use cases: avoid repeating recurring StartJobRun API request values, enforcing certain values in StartJobRun API request.
    */
  def listJobTemplates(params: ListJobTemplatesRequest): Request[ListJobTemplatesResponse, AWSError] = js.native
  def listJobTemplates(
    params: ListJobTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobTemplatesResponse, Unit]
  ): Request[ListJobTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists managed endpoints based on a set of parameters. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def listManagedEndpoints(): Request[ListManagedEndpointsResponse, AWSError] = js.native
  def listManagedEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListManagedEndpointsResponse, Unit]): Request[ListManagedEndpointsResponse, AWSError] = js.native
  /**
    * Lists managed endpoints based on a set of parameters. A managed endpoint is a gateway that connects Amazon EMR Studio to Amazon EMR on EKS so that Amazon EMR Studio can communicate with your virtual cluster.
    */
  def listManagedEndpoints(params: ListManagedEndpointsRequest): Request[ListManagedEndpointsResponse, AWSError] = js.native
  def listManagedEndpoints(
    params: ListManagedEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListManagedEndpointsResponse, Unit]
  ): Request[ListManagedEndpointsResponse, AWSError] = js.native
  
  /**
    * Lists the tags assigned to the resources.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to the resources.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists information about the specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def listVirtualClusters(): Request[ListVirtualClustersResponse, AWSError] = js.native
  def listVirtualClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualClustersResponse, Unit]): Request[ListVirtualClustersResponse, AWSError] = js.native
  /**
    * Lists information about the specified virtual cluster. Virtual cluster is a managed entity on Amazon EMR on EKS. You can create, describe, list and delete virtual clusters. They do not consume any additional resource in your system. A single virtual cluster maps to a single Kubernetes namespace. Given this relationship, you can model virtual clusters the same way you model Kubernetes namespaces to meet your requirements.
    */
  def listVirtualClusters(params: ListVirtualClustersRequest): Request[ListVirtualClustersResponse, AWSError] = js.native
  def listVirtualClusters(
    params: ListVirtualClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVirtualClustersResponse, Unit]
  ): Request[ListVirtualClustersResponse, AWSError] = js.native
  
  /**
    * Starts a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def startJobRun(): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]): Request[StartJobRunResponse, AWSError] = js.native
  /**
    * Starts a job run. A job run is a unit of work, such as a Spark jar, PySpark script, or SparkSQL query, that you submit to Amazon EMR on EKS.
    */
  def startJobRun(params: StartJobRunRequest): Request[StartJobRunResponse, AWSError] = js.native
  def startJobRun(
    params: StartJobRunRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobRunResponse, Unit]
  ): Request[StartJobRunResponse, AWSError] = js.native
  
  /**
    * Assigns tags to resources. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize your Amazon Web Services resources by attributes such as purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a specific resource based on the tags you've assigned to it. For example, you can define a set of tags for your Amazon EMR on EKS clusters to help you track each cluster's owner and stack level. We recommend that you devise a consistent set of tag keys for each resource type. You can then search and filter the resources based on the tags that you add.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns tags to resources. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize your Amazon Web Services resources by attributes such as purpose, owner, or environment. When you have many resources of the same type, you can quickly identify a specific resource based on the tags you've assigned to it. For example, you can define a set of tags for your Amazon EMR on EKS clusters to help you track each cluster's owner and stack level. We recommend that you devise a consistent set of tag keys for each resource type. You can then search and filter the resources based on the tags that you add.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes tags from resources.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes tags from resources.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
}
