package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glue
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Glue: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates one or more partitions in a batch operation.
    */
  def batchCreatePartition(): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchCreatePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchCreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates one or more partitions in a batch operation.
    */
  def batchCreatePartition(params: BatchCreatePartitionRequest): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchCreatePartition(
    params: BatchCreatePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchCreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchCreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a list of connection definitions from the Data Catalog.
    */
  def batchDeleteConnection(): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a list of connection definitions from the Data Catalog.
    */
  def batchDeleteConnection(params: BatchDeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteConnection(
    params: BatchDeleteConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes one or more partitions in a batch operation.
    */
  def batchDeletePartition(): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeletePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes one or more partitions in a batch operation.
    */
  def batchDeletePartition(params: BatchDeletePartitionRequest): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeletePartition(
    params: BatchDeletePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def batchDeleteTable(): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def batchDeleteTable(params: BatchDeleteTableRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteTable(
    params: BatchDeleteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified batch of versions of a table.
    */
  def batchDeleteTableVersion(): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteTableVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified batch of versions of a table.
    */
  def batchDeleteTableVersion(params: BatchDeleteTableVersionRequest): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeleteTableVersion(
    params: BatchDeleteTableVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of crawler names. After calling the ListCrawlers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetCrawlers(): awsDashSdkLib.libRequestMod.Request[BatchGetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetCrawlers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of crawler names. After calling the ListCrawlers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetCrawlers(params: BatchGetCrawlersRequest): awsDashSdkLib.libRequestMod.Request[BatchGetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetCrawlers(
    params: BatchGetCrawlersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of DevEndpoint names. After calling the ListDevEndpoints operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetDevEndpoints(): awsDashSdkLib.libRequestMod.Request[BatchGetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDevEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of DevEndpoint names. After calling the ListDevEndpoints operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetDevEndpoints(params: BatchGetDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[BatchGetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetDevEndpoints(
    params: BatchGetDevEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of job names. After calling the ListJobs operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags. 
    */
  def batchGetJobs(): awsDashSdkLib.libRequestMod.Request[BatchGetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of job names. After calling the ListJobs operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags. 
    */
  def batchGetJobs(params: BatchGetJobsRequest): awsDashSdkLib.libRequestMod.Request[BatchGetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetJobs(
    params: BatchGetJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves partitions in a batch request.
    */
  def batchGetPartition(): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetPartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves partitions in a batch request.
    */
  def batchGetPartition(params: BatchGetPartitionRequest): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetPartition(
    params: BatchGetPartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of trigger names. After calling the ListTriggers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetTriggers(): awsDashSdkLib.libRequestMod.Request[BatchGetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of trigger names. After calling the ListTriggers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetTriggers(params: BatchGetTriggersRequest): awsDashSdkLib.libRequestMod.Request[BatchGetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetTriggers(
    params: BatchGetTriggersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of workflow names. After calling the ListWorkflows operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetWorkflows(): awsDashSdkLib.libRequestMod.Request[BatchGetWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetWorkflows(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetWorkflowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of resource metadata for a given list of workflow names. After calling the ListWorkflows operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetWorkflows(params: BatchGetWorkflowsRequest): awsDashSdkLib.libRequestMod.Request[BatchGetWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetWorkflows(
    params: BatchGetWorkflowsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetWorkflowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops one or more job runs for a specified job definition.
    */
  def batchStopJobRun(): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchStopJobRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchStopJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops one or more job runs for a specified job definition.
    */
  def batchStopJobRun(params: BatchStopJobRunRequest): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchStopJobRun(
    params: BatchStopJobRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchStopJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchStopJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a classifier in the user's account. This can be a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field of the request is present.
    */
  def createClassifier(): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a classifier in the user's account. This can be a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field of the request is present.
    */
  def createClassifier(params: CreateClassifierRequest): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createClassifier(
    params: CreateClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a connection definition in the Data Catalog.
    */
  def createConnection(): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a connection definition in the Data Catalog.
    */
  def createConnection(params: CreateConnectionRequest): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnection(
    params: CreateConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
    */
  def createCrawler(): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
    */
  def createCrawler(params: CreateCrawlerRequest): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCrawler(
    params: CreateCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new database in a Data Catalog.
    */
  def createDatabase(): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new database in a Data Catalog.
    */
  def createDatabase(params: CreateDatabaseRequest): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDatabase(
    params: CreateDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DevEndpoint.
    */
  def createDevEndpoint(): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new DevEndpoint.
    */
  def createDevEndpoint(params: CreateDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDevEndpoint(
    params: CreateDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new job definition.
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new job definition.
    */
  def createJob(params: CreateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new partition.
    */
  def createPartition(): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new partition.
    */
  def createPartition(params: CreatePartitionRequest): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPartition(
    params: CreatePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Transforms a directed acyclic graph (DAG) into code.
    */
  def createScript(): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createScript(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateScriptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Transforms a directed acyclic graph (DAG) into code.
    */
  def createScript(params: CreateScriptRequest): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createScript(
    params: CreateScriptRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateScriptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateScriptResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new security configuration.
    */
  def createSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new security configuration.
    */
  def createSecurityConfiguration(params: CreateSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSecurityConfiguration(
    params: CreateSecurityConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new table definition in the Data Catalog.
    */
  def createTable(): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new table definition in the Data Catalog.
    */
  def createTable(params: CreateTableRequest): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTable(
    params: CreateTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new trigger.
    */
  def createTrigger(): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new trigger.
    */
  def createTrigger(params: CreateTriggerRequest): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createTrigger(
    params: CreateTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new function definition in the Data Catalog.
    */
  def createUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new function definition in the Data Catalog.
    */
  def createUserDefinedFunction(params: CreateUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserDefinedFunction(
    params: CreateUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new workflow.
    */
  def createWorkflow(): awsDashSdkLib.libRequestMod.Request[CreateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWorkflow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new workflow.
    */
  def createWorkflow(params: CreateWorkflowRequest): awsDashSdkLib.libRequestMod.Request[CreateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWorkflow(
    params: CreateWorkflowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a classifier from the Data Catalog.
    */
  def deleteClassifier(): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a classifier from the Data Catalog.
    */
  def deleteClassifier(params: DeleteClassifierRequest): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteClassifier(
    params: DeleteClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a connection from the Data Catalog.
    */
  def deleteConnection(): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a connection from the Data Catalog.
    */
  def deleteConnection(params: DeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConnection(
    params: DeleteConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.
    */
  def deleteCrawler(): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a specified crawler from the AWS Glue Data Catalog, unless the crawler state is RUNNING.
    */
  def deleteCrawler(params: DeleteCrawlerRequest): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCrawler(
    params: DeleteCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
    */
  def deleteDatabase(): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
    */
  def deleteDatabase(params: DeleteDatabaseRequest): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDatabase(
    params: DeleteDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DevEndpoint.
    */
  def deleteDevEndpoint(): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified DevEndpoint.
    */
  def deleteDevEndpoint(params: DeleteDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDevEndpoint(
    params: DeleteDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
    */
  def deleteJob(): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
    */
  def deleteJob(params: DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteJob(
    params: DeleteJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified partition.
    */
  def deletePartition(): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified partition.
    */
  def deletePartition(params: DeletePartitionRequest): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePartition(
    params: DeletePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeletePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified policy.
    */
  def deleteResourcePolicy(): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified policy.
    */
  def deleteResourcePolicy(params: DeleteResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourcePolicy(
    params: DeleteResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified security configuration.
    */
  def deleteSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified security configuration.
    */
  def deleteSecurityConfiguration(params: DeleteSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSecurityConfiguration(
    params: DeleteSecurityConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def deleteTable(): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def deleteTable(params: DeleteTableRequest): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTable(
    params: DeleteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified version of a table.
    */
  def deleteTableVersion(): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTableVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified version of a table.
    */
  def deleteTableVersion(params: DeleteTableVersionRequest): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTableVersion(
    params: DeleteTableVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
    */
  def deleteTrigger(): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
    */
  def deleteTrigger(params: DeleteTriggerRequest): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteTrigger(
    params: DeleteTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing function definition from the Data Catalog.
    */
  def deleteUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an existing function definition from the Data Catalog.
    */
  def deleteUserDefinedFunction(params: DeleteUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserDefinedFunction(
    params: DeleteUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a workflow.
    */
  def deleteWorkflow(): awsDashSdkLib.libRequestMod.Request[DeleteWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWorkflow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a workflow.
    */
  def deleteWorkflow(params: DeleteWorkflowRequest): awsDashSdkLib.libRequestMod.Request[DeleteWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWorkflow(
    params: DeleteWorkflowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the status of a migration operation.
    */
  def getCatalogImportStatus(): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCatalogImportStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCatalogImportStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the status of a migration operation.
    */
  def getCatalogImportStatus(params: GetCatalogImportStatusRequest): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCatalogImportStatus(
    params: GetCatalogImportStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCatalogImportStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCatalogImportStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a classifier by name.
    */
  def getClassifier(): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieve a classifier by name.
    */
  def getClassifier(params: GetClassifierRequest): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClassifier(
    params: GetClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all classifier objects in the Data Catalog.
    */
  def getClassifiers(): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClassifiers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists all classifier objects in the Data Catalog.
    */
  def getClassifiers(params: GetClassifiersRequest): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getClassifiers(
    params: GetClassifiersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetClassifiersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a connection definition from the Data Catalog.
    */
  def getConnection(): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a connection definition from the Data Catalog.
    */
  def getConnection(params: GetConnectionRequest): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnection(
    params: GetConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of connection definitions from the Data Catalog.
    */
  def getConnections(): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of connection definitions from the Data Catalog.
    */
  def getConnections(params: GetConnectionsRequest): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnections(
    params: GetConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for a specified crawler.
    */
  def getCrawler(): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for a specified crawler.
    */
  def getCrawler(params: GetCrawlerRequest): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCrawler(
    params: GetCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metrics about specified crawlers.
    */
  def getCrawlerMetrics(): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCrawlerMetrics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCrawlerMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metrics about specified crawlers.
    */
  def getCrawlerMetrics(params: GetCrawlerMetricsRequest): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCrawlerMetrics(
    params: GetCrawlerMetricsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCrawlerMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCrawlerMetricsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for all crawlers defined in the customer account.
    */
  def getCrawlers(): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCrawlers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for all crawlers defined in the customer account.
    */
  def getCrawlers(params: GetCrawlersRequest): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCrawlers(
    params: GetCrawlersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the security configuration for a specified catalog.
    */
  def getDataCatalogEncryptionSettings(): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataCatalogEncryptionSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the security configuration for a specified catalog.
    */
  def getDataCatalogEncryptionSettings(params: GetDataCatalogEncryptionSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataCatalogEncryptionSettings(
    params: GetDataCatalogEncryptionSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the definition of a specified database.
    */
  def getDatabase(): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the definition of a specified database.
    */
  def getDatabase(params: GetDatabaseRequest): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDatabase(
    params: GetDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all Databases defined in a given Data Catalog.
    */
  def getDatabases(): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDatabases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDatabasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all Databases defined in a given Data Catalog.
    */
  def getDatabases(params: GetDatabasesRequest): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDatabases(
    params: GetDatabasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDatabasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDatabasesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Transforms a Python script into a directed acyclic graph (DAG). 
    */
  def getDataflowGraph(): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataflowGraph(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataflowGraphResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Transforms a Python script into a directed acyclic graph (DAG). 
    */
  def getDataflowGraph(params: GetDataflowGraphRequest): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDataflowGraph(
    params: GetDataflowGraphRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDataflowGraphResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDataflowGraphResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoint(): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoint(params: GetDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevEndpoint(
    params: GetDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoints(): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoints(params: GetDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDevEndpoints(
    params: GetDevEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an existing job definition.
    */
  def getJob(): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves an existing job definition.
    */
  def getJob(params: GetJobRequest): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJob(
    params: GetJobRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the metadata for a given job run.
    */
  def getJobRun(): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the metadata for a given job run.
    */
  def getJobRun(params: GetJobRunRequest): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobRun(
    params: GetJobRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given job definition.
    */
  def getJobRuns(): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobRuns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given job definition.
    */
  def getJobRuns(params: GetJobRunsRequest): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobRuns(
    params: GetJobRunsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetJobRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetJobRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all current job definitions.
    */
  def getJobs(): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobs(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves all current job definitions.
    */
  def getJobs(params: GetJobsRequest): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getJobs(
    params: GetJobsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetJobsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates mappings.
    */
  def getMapping(): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates mappings.
    */
  def getMapping(params: GetMappingRequest): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMapping(
    params: GetMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetMappingResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a specified partition.
    */
  def getPartition(): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a specified partition.
    */
  def getPartition(params: GetPartitionRequest): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPartition(
    params: GetPartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the partitions in a table.
    */
  def getPartitions(): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPartitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPartitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the partitions in a table.
    */
  def getPartitions(params: GetPartitionsRequest): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPartitions(
    params: GetPartitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPartitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPartitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets code to perform a specified mapping.
    */
  def getPlan(): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPlan(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetPlanResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets code to perform a specified mapping.
    */
  def getPlan(params: GetPlanRequest): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPlan(
    params: GetPlanRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetPlanResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetPlanResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified resource policy.
    */
  def getResourcePolicy(): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified resource policy.
    */
  def getResourcePolicy(params: GetResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourcePolicy(
    params: GetResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified security configuration.
    */
  def getSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified security configuration.
    */
  def getSecurityConfiguration(params: GetSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSecurityConfiguration(
    params: GetSecurityConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all security configurations.
    */
  def getSecurityConfigurations(): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSecurityConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSecurityConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of all security configurations.
    */
  def getSecurityConfigurations(params: GetSecurityConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSecurityConfigurations(
    params: GetSecurityConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSecurityConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSecurityConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Table definition in a Data Catalog for a specified table.
    */
  def getTable(): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the Table definition in a Data Catalog for a specified table.
    */
  def getTable(params: GetTableRequest): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTable(
    params: GetTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified version of a table.
    */
  def getTableVersion(): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTableVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified version of a table.
    */
  def getTableVersion(params: GetTableVersionRequest): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTableVersion(
    params: GetTableVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTableVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of strings that identify available versions of a specified table.
    */
  def getTableVersions(): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTableVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTableVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of strings that identify available versions of a specified table.
    */
  def getTableVersions(params: GetTableVersionsRequest): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTableVersions(
    params: GetTableVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTableVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTableVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the definitions of some or all of the tables in a given Database.
    */
  def getTables(): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the definitions of some or all of the tables in a given Database.
    */
  def getTables(params: GetTablesRequest): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTables(
    params: GetTablesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTablesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of tags associated with a resource.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of tags associated with a resource.
    */
  def getTags(params: GetTagsRequest): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTags(
    params: GetTagsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetTagsResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the definition of a trigger.
    */
  def getTrigger(): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the definition of a trigger.
    */
  def getTrigger(params: GetTriggerRequest): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTrigger(
    params: GetTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets all the triggers associated with a job.
    */
  def getTriggers(): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets all the triggers associated with a job.
    */
  def getTriggers(params: GetTriggersRequest): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getTriggers(
    params: GetTriggersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified function definition from the Data Catalog.
    */
  def getUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a specified function definition from the Data Catalog.
    */
  def getUserDefinedFunction(params: GetUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserDefinedFunction(
    params: GetUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a multiple function definitions from the Data Catalog.
    */
  def getUserDefinedFunctions(): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserDefinedFunctions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserDefinedFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a multiple function definitions from the Data Catalog.
    */
  def getUserDefinedFunctions(params: GetUserDefinedFunctionsRequest): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserDefinedFunctions(
    params: GetUserDefinedFunctionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserDefinedFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserDefinedFunctionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves resource metadata for a workflow.
    */
  def getWorkflow(): awsDashSdkLib.libRequestMod.Request[GetWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves resource metadata for a workflow.
    */
  def getWorkflow(params: GetWorkflowRequest): awsDashSdkLib.libRequestMod.Request[GetWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflow(
    params: GetWorkflowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the metadata for a given workflow run. 
    */
  def getWorkflowRun(): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the metadata for a given workflow run. 
    */
  def getWorkflowRun(params: GetWorkflowRunRequest): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowRun(
    params: GetWorkflowRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the workflow run properties which were set during the run.
    */
  def getWorkflowRunProperties(): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowRunProperties(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowRunPropertiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the workflow run properties which were set during the run.
    */
  def getWorkflowRunProperties(params: GetWorkflowRunPropertiesRequest): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowRunProperties(
    params: GetWorkflowRunPropertiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowRunPropertiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given workflow.
    */
  def getWorkflowRuns(): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowRuns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves metadata for all runs of a given workflow.
    */
  def getWorkflowRuns(params: GetWorkflowRunsRequest): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkflowRuns(
    params: GetWorkflowRunsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkflowRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkflowRunsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports an existing Athena Data Catalog to AWS Glue
    */
  def importCatalogToGlue(): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importCatalogToGlue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportCatalogToGlueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Imports an existing Athena Data Catalog to AWS Glue
    */
  def importCatalogToGlue(params: ImportCatalogToGlueRequest): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def importCatalogToGlue(
    params: ImportCatalogToGlueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ImportCatalogToGlueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ImportCatalogToGlueResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listCrawlers(): awsDashSdkLib.libRequestMod.Request[ListCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCrawlers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listCrawlers(params: ListCrawlersRequest): awsDashSdkLib.libRequestMod.Request[ListCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCrawlers(
    params: ListCrawlersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCrawlersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listDevEndpoints(): awsDashSdkLib.libRequestMod.Request[ListDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listDevEndpoints(params: ListDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[ListDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevEndpoints(
    params: ListDevEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevEndpointsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listJobs(params: ListJobsRequest): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listTriggers(): awsDashSdkLib.libRequestMod.Request[ListTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field, which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag are retrieved.
    */
  def listTriggers(params: ListTriggersRequest): awsDashSdkLib.libRequestMod.Request[ListTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTriggers(
    params: ListTriggersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTriggersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists names of workflows created in the account.
    */
  def listWorkflows(): awsDashSdkLib.libRequestMod.Request[ListWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkflows(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWorkflowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists names of workflows created in the account.
    */
  def listWorkflows(params: ListWorkflowsRequest): awsDashSdkLib.libRequestMod.Request[ListWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkflows(
    params: ListWorkflowsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWorkflowsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWorkflowsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the security configuration for a specified catalog. After the configuration has been set, the specified encryption is applied to every catalog write thereafter.
    */
  def putDataCatalogEncryptionSettings(): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putDataCatalogEncryptionSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the security configuration for a specified catalog. After the configuration has been set, the specified encryption is applied to every catalog write thereafter.
    */
  def putDataCatalogEncryptionSettings(params: PutDataCatalogEncryptionSettingsRequest): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putDataCatalogEncryptionSettings(
    params: PutDataCatalogEncryptionSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutDataCatalogEncryptionSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the Data Catalog resource policy for access control.
    */
  def putResourcePolicy(): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the Data Catalog resource policy for access control.
    */
  def putResourcePolicy(params: PutResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putResourcePolicy(
    params: PutResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutResourcePolicyResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Puts the specified workflow run properties for the given workflow run. If a property already exists for the specified run, then it overrides the value otherwise adds the property to existing properties.
    */
  def putWorkflowRunProperties(): awsDashSdkLib.libRequestMod.Request[PutWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putWorkflowRunProperties(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutWorkflowRunPropertiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Puts the specified workflow run properties for the given workflow run. If a property already exists for the specified run, then it overrides the value otherwise adds the property to existing properties.
    */
  def putWorkflowRunProperties(params: PutWorkflowRunPropertiesRequest): awsDashSdkLib.libRequestMod.Request[PutWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putWorkflowRunProperties(
    params: PutWorkflowRunPropertiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutWorkflowRunPropertiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutWorkflowRunPropertiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets a bookmark entry.
    */
  def resetJobBookmark(): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetJobBookmark(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetJobBookmarkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets a bookmark entry.
    */
  def resetJobBookmark(params: ResetJobBookmarkRequest): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetJobBookmark(
    params: ResetJobBookmarkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetJobBookmarkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetJobBookmarkResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
    */
  def startCrawler(): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
    */
  def startCrawler(params: StartCrawlerRequest): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startCrawler(
    params: StartCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
    */
  def startCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startCrawlerSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
    */
  def startCrawlerSchedule(params: StartCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startCrawlerSchedule(
    params: StartCrawlerScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a job run using a job definition.
    */
  def startJobRun(): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startJobRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a job run using a job definition.
    */
  def startJobRun(params: StartJobRunRequest): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startJobRun(
    params: StartJobRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartJobRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
    */
  def startTrigger(): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
    */
  def startTrigger(params: StartTriggerRequest): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startTrigger(
    params: StartTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a new run of the specified workflow.
    */
  def startWorkflowRun(): awsDashSdkLib.libRequestMod.Request[StartWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startWorkflowRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartWorkflowRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a new run of the specified workflow.
    */
  def startWorkflowRun(params: StartWorkflowRunRequest): awsDashSdkLib.libRequestMod.Request[StartWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startWorkflowRun(
    params: StartWorkflowRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartWorkflowRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartWorkflowRunResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * If the specified crawler is running, stops the crawl.
    */
  def stopCrawler(): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * If the specified crawler is running, stops the crawl.
    */
  def stopCrawler(params: StopCrawlerRequest): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopCrawler(
    params: StopCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
    */
  def stopCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopCrawlerSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
    */
  def stopCrawlerSchedule(params: StopCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopCrawlerSchedule(
    params: StopCrawlerScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a specified trigger.
    */
  def stopTrigger(): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a specified trigger.
    */
  def stopTrigger(params: StopTriggerRequest): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopTrigger(
    params: StopTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field is present).
    */
  def updateClassifier(): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field is present).
    */
  def updateClassifier(params: UpdateClassifierRequest): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateClassifier(
    params: UpdateClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateClassifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a connection definition in the Data Catalog.
    */
  def updateConnection(): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a connection definition in the Data Catalog.
    */
  def updateConnection(params: UpdateConnectionRequest): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConnection(
    params: UpdateConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConnectionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
    */
  def updateCrawler(): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
    */
  def updateCrawler(params: UpdateCrawlerRequest): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCrawler(
    params: UpdateCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the schedule of a crawler using a cron expression. 
    */
  def updateCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCrawlerSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the schedule of a crawler using a cron expression. 
    */
  def updateCrawlerSchedule(params: UpdateCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCrawlerSchedule(
    params: UpdateCrawlerScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCrawlerScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing database definition in a Data Catalog.
    */
  def updateDatabase(): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing database definition in a Data Catalog.
    */
  def updateDatabase(params: UpdateDatabaseRequest): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDatabase(
    params: UpdateDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDatabaseResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a specified DevEndpoint.
    */
  def updateDevEndpoint(): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a specified DevEndpoint.
    */
  def updateDevEndpoint(params: UpdateDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDevEndpoint(
    params: UpdateDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDevEndpointResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing job definition.
    */
  def updateJob(): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing job definition.
    */
  def updateJob(params: UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateJob(
    params: UpdateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a partition.
    */
  def updatePartition(): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a partition.
    */
  def updatePartition(params: UpdatePartitionRequest): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePartition(
    params: UpdatePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePartitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a metadata table in the Data Catalog.
    */
  def updateTable(): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a metadata table in the Data Catalog.
    */
  def updateTable(params: UpdateTableRequest): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTable(
    params: UpdateTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTableResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a trigger definition.
    */
  def updateTrigger(): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a trigger definition.
    */
  def updateTrigger(params: UpdateTriggerRequest): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateTrigger(
    params: UpdateTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateTriggerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing function definition in the Data Catalog.
    */
  def updateUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing function definition in the Data Catalog.
    */
  def updateUserDefinedFunction(params: UpdateUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserDefinedFunction(
    params: UpdateUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserDefinedFunctionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing workflow.
    */
  def updateWorkflow(): awsDashSdkLib.libRequestMod.Request[UpdateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWorkflow(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates an existing workflow.
    */
  def updateWorkflow(params: UpdateWorkflowRequest): awsDashSdkLib.libRequestMod.Request[UpdateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWorkflow(
    params: UpdateWorkflowRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWorkflowResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWorkflowResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

