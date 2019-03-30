package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Glue
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Glue: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsGlueMod.GlueNs.ClientConfiguration = js.native
  /**
    * Creates one or more partitions in a batch operation.
    */
  def batchCreatePartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchCreatePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates one or more partitions in a batch operation.
    */
  def batchCreatePartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchCreatePartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchCreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a list of connection definitions from the Data Catalog.
    */
  def batchDeleteConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a list of connection definitions from the Data Catalog.
    */
  def batchDeleteConnection(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteConnection(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more partitions in a batch operation.
    */
  def batchDeletePartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeletePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more partitions in a batch operation.
    */
  def batchDeletePartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeletePartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def batchDeleteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes multiple tables at once.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling BatchDeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def batchDeleteTable(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteTable(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified batch of versions of a table.
    */
  def batchDeleteTableVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteTableVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified batch of versions of a table.
    */
  def batchDeleteTableVersion(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeleteTableVersion(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchDeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of crawler names. After calling the ListCrawlers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetCrawlers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetCrawlers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of crawler names. After calling the ListCrawlers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetCrawlers(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetCrawlers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of DevEndpoint names. After calling the ListDevEndpoints operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetDevEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetDevEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of DevEndpoint names. After calling the ListDevEndpoints operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetDevEndpoints(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetDevEndpoints(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of job names. After calling the ListJobs operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags. 
    */
  def batchGetJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of job names. After calling the ListJobs operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags. 
    */
  def batchGetJobs(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetJobs(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves partitions in a batch request.
    */
  def batchGetPartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetPartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves partitions in a batch request.
    */
  def batchGetPartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetPartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of trigger names. After calling the ListTriggers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetTriggers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of resource metadata for a given list of trigger names. After calling the ListTriggers operation, you can call this operation to access the data to which you have been granted permissions. This operation supports all IAM permissions, including permission conditions that uses tags.
    */
  def batchGetTriggers(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetTriggers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchGetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops one or more job runs for a specified job definition.
    */
  def batchStopJobRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchStopJobRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops one or more job runs for a specified job definition.
    */
  def batchStopJobRun(params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchStopJobRun(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.BatchStopJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a classifier in the user's account. This may be a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field of the request is present.
    */
  def createClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a classifier in the user's account. This may be a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field of the request is present.
    */
  def createClassifier(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createClassifier(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a connection definition in the Data Catalog.
    */
  def createConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a connection definition in the Data Catalog.
    */
  def createConnection(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createConnection(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
    */
  def createCrawler(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new crawler with specified targets, role, configuration, and optional schedule. At least one crawl target must be specified, in the s3Targets field, the jdbcTargets field, or the DynamoDBTargets field.
    */
  def createCrawler(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCrawler(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new database in a Data Catalog.
    */
  def createDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new database in a Data Catalog.
    */
  def createDatabase(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDatabase(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DevEndpoint.
    */
  def createDevEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new DevEndpoint.
    */
  def createDevEndpoint(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createDevEndpoint(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new job definition.
    */
  def createJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new job definition.
    */
  def createJob(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createJob(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new partition.
    */
  def createPartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new partition.
    */
  def createPartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Transforms a directed acyclic graph (DAG) into code.
    */
  def createScript(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createScript(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Transforms a directed acyclic graph (DAG) into code.
    */
  def createScript(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createScript(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateScriptResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new security configuration.
    */
  def createSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new security configuration.
    */
  def createSecurityConfiguration(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createSecurityConfiguration(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new table definition in the Data Catalog.
    */
  def createTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new table definition in the Data Catalog.
    */
  def createTable(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTable(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new trigger.
    */
  def createTrigger(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new trigger.
    */
  def createTrigger(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createTrigger(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new function definition in the Data Catalog.
    */
  def createUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new function definition in the Data Catalog.
    */
  def createUserDefinedFunction(params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserDefinedFunction(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.CreateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a classifier from the Data Catalog.
    */
  def deleteClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a classifier from the Data Catalog.
    */
  def deleteClassifier(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteClassifier(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a connection from the Data Catalog.
    */
  def deleteConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a connection from the Data Catalog.
    */
  def deleteConnection(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteConnection(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a specified crawler from the Data Catalog, unless the crawler state is RUNNING.
    */
  def deleteCrawler(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a specified crawler from the Data Catalog, unless the crawler state is RUNNING.
    */
  def deleteCrawler(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCrawler(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
    */
  def deleteDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a specified Database from a Data Catalog.  After completing this operation, you will no longer have access to the tables (and all table versions and partitions that might belong to the tables) and the user-defined functions in the deleted database. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteDatabase, use DeleteTableVersion or BatchDeleteTableVersion, DeletePartition or BatchDeletePartition, DeleteUserDefinedFunction, and DeleteTable or BatchDeleteTable, to delete any resources that belong to the database. 
    */
  def deleteDatabase(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDatabase(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified DevEndpoint.
    */
  def deleteDevEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified DevEndpoint.
    */
  def deleteDevEndpoint(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteDevEndpoint(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
    */
  def deleteJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified job definition. If the job definition is not found, no exception is thrown.
    */
  def deleteJob(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteJob(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified partition.
    */
  def deletePartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified partition.
    */
  def deletePartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deletePartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeletePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified policy.
    */
  def deleteResourcePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified policy.
    */
  def deleteResourcePolicy(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteResourcePolicy(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified security configuration.
    */
  def deleteSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified security configuration.
    */
  def deleteSecurityConfiguration(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteSecurityConfiguration(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def deleteTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes a table definition from the Data Catalog.  After completing this operation, you will no longer have access to the table versions and partitions that belong to the deleted table. AWS Glue deletes these "orphaned" resources asynchronously in a timely manner, at the discretion of the service. To ensure immediate deletion of all related resources, before calling DeleteTable, use DeleteTableVersion or BatchDeleteTableVersion, and DeletePartition or BatchDeletePartition, to delete any resources that belong to the table. 
    */
  def deleteTable(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTable(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified version of a table.
    */
  def deleteTableVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTableVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified version of a table.
    */
  def deleteTableVersion(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTableVersion(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
    */
  def deleteTrigger(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified trigger. If the trigger is not found, no exception is thrown.
    */
  def deleteTrigger(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteTrigger(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing function definition from the Data Catalog.
    */
  def deleteUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes an existing function definition from the Data Catalog.
    */
  def deleteUserDefinedFunction(params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUserDefinedFunction(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.DeleteUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the status of a migration operation.
    */
  def getCatalogImportStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCatalogImportStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the status of a migration operation.
    */
  def getCatalogImportStatus(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCatalogImportStatus(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCatalogImportStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a classifier by name.
    */
  def getClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieve a classifier by name.
    */
  def getClassifier(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClassifier(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all classifier objects in the Data Catalog.
    */
  def getClassifiers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClassifiers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists all classifier objects in the Data Catalog.
    */
  def getClassifiers(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getClassifiers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetClassifiersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a connection definition from the Data Catalog.
    */
  def getConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a connection definition from the Data Catalog.
    */
  def getConnection(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConnection(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of connection definitions from the Data Catalog.
    */
  def getConnections(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConnections(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of connection definitions from the Data Catalog.
    */
  def getConnections(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getConnections(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetConnectionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata for a specified crawler.
    */
  def getCrawler(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata for a specified crawler.
    */
  def getCrawler(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCrawler(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metrics about specified crawlers.
    */
  def getCrawlerMetrics(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCrawlerMetrics(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metrics about specified crawlers.
    */
  def getCrawlerMetrics(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCrawlerMetrics(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlerMetricsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata for all crawlers defined in the customer account.
    */
  def getCrawlers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCrawlers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata for all crawlers defined in the customer account.
    */
  def getCrawlers(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCrawlers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the security configuration for a specified catalog.
    */
  def getDataCatalogEncryptionSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDataCatalogEncryptionSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the security configuration for a specified catalog.
    */
  def getDataCatalogEncryptionSettings(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDataCatalogEncryptionSettings(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the definition of a specified database.
    */
  def getDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the definition of a specified database.
    */
  def getDatabase(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDatabase(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all Databases defined in a given Data Catalog.
    */
  def getDatabases(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDatabases(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all Databases defined in a given Data Catalog.
    */
  def getDatabases(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDatabases(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDatabasesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Transforms a Python script into a directed acyclic graph (DAG). 
    */
  def getDataflowGraph(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDataflowGraph(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Transforms a Python script into a directed acyclic graph (DAG). 
    */
  def getDataflowGraph(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDataflowGraph(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDataflowGraphResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a specified DevEndpoint.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address, and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoint(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevEndpoint(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all the DevEndpoints in this AWS account.  When you create a development endpoint in a virtual private cloud (VPC), AWS Glue returns only a private IP address and the public IP address field is not populated. When you create a non-VPC development endpoint, AWS Glue returns only a public IP address. 
    */
  def getDevEndpoints(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevEndpoints(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves an existing job definition.
    */
  def getJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves an existing job definition.
    */
  def getJob(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJob(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the metadata for a given job run.
    */
  def getJobRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the metadata for a given job run.
    */
  def getJobRun(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobRun(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata for all runs of a given job definition.
    */
  def getJobRuns(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobRuns(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves metadata for all runs of a given job definition.
    */
  def getJobRuns(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobRuns(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobRunsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all current job definitions.
    */
  def getJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves all current job definitions.
    */
  def getJobs(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getJobs(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates mappings.
    */
  def getMapping(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMapping(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates mappings.
    */
  def getMapping(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getMapping(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetMappingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a specified partition.
    */
  def getPartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about a specified partition.
    */
  def getPartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about the partitions in a table.
    */
  def getPartitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPartitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about the partitions in a table.
    */
  def getPartitions(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPartitions(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPartitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets code to perform a specified mapping.
    */
  def getPlan(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPlan(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets code to perform a specified mapping.
    */
  def getPlan(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPlan(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetPlanResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified resource policy.
    */
  def getResourcePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified resource policy.
    */
  def getResourcePolicy(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getResourcePolicy(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified security configuration.
    */
  def getSecurityConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSecurityConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified security configuration.
    */
  def getSecurityConfiguration(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSecurityConfiguration(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of all security configurations.
    */
  def getSecurityConfigurations(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSecurityConfigurations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of all security configurations.
    */
  def getSecurityConfigurations(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSecurityConfigurations(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetSecurityConfigurationsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the Table definition in a Data Catalog for a specified table.
    */
  def getTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the Table definition in a Data Catalog for a specified table.
    */
  def getTable(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTable(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified version of a table.
    */
  def getTableVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTableVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified version of a table.
    */
  def getTableVersion(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTableVersion(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of strings that identify available versions of a specified table.
    */
  def getTableVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTableVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of strings that identify available versions of a specified table.
    */
  def getTableVersions(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTableVersions(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTableVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the definitions of some or all of the tables in a given Database.
    */
  def getTables(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTables(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the definitions of some or all of the tables in a given Database.
    */
  def getTables(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTables(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTablesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of tags associated with a resource.
    */
  def getTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a list of tags associated with a resource.
    */
  def getTags(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTags(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the definition of a trigger.
    */
  def getTrigger(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the definition of a trigger.
    */
  def getTrigger(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTrigger(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets all the triggers associated with a job.
    */
  def getTriggers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets all the triggers associated with a job.
    */
  def getTriggers(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getTriggers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified function definition from the Data Catalog.
    */
  def getUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a specified function definition from the Data Catalog.
    */
  def getUserDefinedFunction(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserDefinedFunction(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a multiple function definitions from the Data Catalog.
    */
  def getUserDefinedFunctions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserDefinedFunctions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves a multiple function definitions from the Data Catalog.
    */
  def getUserDefinedFunctions(params: awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserDefinedFunctions(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.GetUserDefinedFunctionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports an existing Athena Data Catalog to AWS Glue
    */
  def importCatalogToGlue(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importCatalogToGlue(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Imports an existing Athena Data Catalog to AWS Glue
    */
  def importCatalogToGlue(params: awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def importCatalogToGlue(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ImportCatalogToGlueResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listCrawlers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCrawlers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all crawler resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listCrawlers(params: awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listCrawlers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListCrawlersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listDevEndpoints(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevEndpoints(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all DevEndpoint resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listDevEndpoints(params: awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevEndpoints(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListDevEndpointsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all job resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listJobs(params: awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listJobs(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listTriggers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTriggers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves the names of all trigger resources in this AWS account, or the resources with the specified tag. This operation allows you to see which resources are available in your account, and their names. This operation takes the optional Tags field which you can use as a filter on the response so that tagged resources can be retrieved as a group. If you choose to use tags filtering, only resources with the tag will be retrieved.
    */
  def listTriggers(params: awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTriggers(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ListTriggersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the security configuration for a specified catalog. After the configuration has been set, the specified encryption is applied to every catalog write thereafter.
    */
  def putDataCatalogEncryptionSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putDataCatalogEncryptionSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the security configuration for a specified catalog. After the configuration has been set, the specified encryption is applied to every catalog write thereafter.
    */
  def putDataCatalogEncryptionSettings(params: awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putDataCatalogEncryptionSettings(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutDataCatalogEncryptionSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the Data Catalog resource policy for access control.
    */
  def putResourcePolicy(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putResourcePolicy(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the Data Catalog resource policy for access control.
    */
  def putResourcePolicy(params: awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putResourcePolicy(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.PutResourcePolicyResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets a bookmark entry.
    */
  def resetJobBookmark(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetJobBookmark(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets a bookmark entry.
    */
  def resetJobBookmark(params: awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetJobBookmark(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.ResetJobBookmarkResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
    */
  def startCrawler(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a crawl using the specified crawler, regardless of what is scheduled. If the crawler is already running, returns a CrawlerRunningException.
    */
  def startCrawler(params: awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startCrawler(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
    */
  def startCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startCrawlerSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the schedule state of the specified crawler to SCHEDULED, unless the crawler is already running or the schedule state is already SCHEDULED.
    */
  def startCrawlerSchedule(params: awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startCrawlerSchedule(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a job run using a job definition.
    */
  def startJobRun(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startJobRun(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a job run using a job definition.
    */
  def startJobRun(params: awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startJobRun(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartJobRunResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
    */
  def startTrigger(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts an existing trigger. See Triggering Jobs for information about how different types of trigger are started.
    */
  def startTrigger(params: awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTrigger(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StartTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * If the specified crawler is running, stops the crawl.
    */
  def stopCrawler(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * If the specified crawler is running, stops the crawl.
    */
  def stopCrawler(params: awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopCrawler(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
    */
  def stopCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopCrawlerSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the schedule state of the specified crawler to NOT_SCHEDULED, but does not stop the crawler if it is already running.
    */
  def stopCrawlerSchedule(params: awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopCrawlerSchedule(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a specified trigger.
    */
  def stopTrigger(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a specified trigger.
    */
  def stopTrigger(params: awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTrigger(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.StopTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds tags to a resource. A tag is a label you can assign to an AWS resource. In AWS Glue, you can tag only certain resources. For information about what resources you can tag, see AWS Tags in AWS Glue.
    */
  def tagResource(params: awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field is present).
    */
  def updateClassifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClassifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies an existing classifier (a GrokClassifier, an XMLClassifier, a JsonClassifier, or a CsvClassifier, depending on which field is present).
    */
  def updateClassifier(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateClassifier(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateClassifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a connection definition in the Data Catalog.
    */
  def updateConnection(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConnection(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a connection definition in the Data Catalog.
    */
  def updateConnection(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateConnection(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateConnectionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
    */
  def updateCrawler(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCrawler(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a crawler. If a crawler is running, you must stop it using StopCrawler before updating it.
    */
  def updateCrawler(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCrawler(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the schedule of a crawler using a cron expression. 
    */
  def updateCrawlerSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCrawlerSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the schedule of a crawler using a cron expression. 
    */
  def updateCrawlerSchedule(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateCrawlerSchedule(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateCrawlerScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing database definition in a Data Catalog.
    */
  def updateDatabase(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDatabase(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing database definition in a Data Catalog.
    */
  def updateDatabase(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDatabase(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDatabaseResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a specified DevEndpoint.
    */
  def updateDevEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDevEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a specified DevEndpoint.
    */
  def updateDevEndpoint(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDevEndpoint(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateDevEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing job definition.
    */
  def updateJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing job definition.
    */
  def updateJob(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateJob(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a partition.
    */
  def updatePartition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePartition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a partition.
    */
  def updatePartition(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePartition(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdatePartitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a metadata table in the Data Catalog.
    */
  def updateTable(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTable(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a metadata table in the Data Catalog.
    */
  def updateTable(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTable(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTableResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a trigger definition.
    */
  def updateTrigger(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTrigger(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates a trigger definition.
    */
  def updateTrigger(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateTrigger(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateTriggerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing function definition in the Data Catalog.
    */
  def updateUserDefinedFunction(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserDefinedFunction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates an existing function definition in the Data Catalog.
    */
  def updateUserDefinedFunction(params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserDefinedFunction(
    params: awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGlueMod.GlueNs.UpdateUserDefinedFunctionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

