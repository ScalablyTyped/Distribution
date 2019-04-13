package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Athena
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Athena: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
    */
  def batchGetNamedQuery(): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
    */
  def batchGetNamedQuery(params: BatchGetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetNamedQuery(
    params: BatchGetNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
    */
  def batchGetQueryExecution(): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
    */
  def batchGetQueryExecution(params: BatchGetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchGetQueryExecution(
    params: BatchGetQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchGetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchGetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(params: CreateNamedQueryInput): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNamedQuery(
    params: CreateNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a workgroup with the specified name.
    */
  def createWorkGroup(): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a workgroup with the specified name.
    */
  def createWorkGroup(params: CreateWorkGroupInput): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createWorkGroup(
    params: CreateWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(params: DeleteNamedQueryInput): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNamedQuery(
    params: DeleteNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
    */
  def deleteWorkGroup(): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
    */
  def deleteWorkGroup(params: DeleteWorkGroupInput): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteWorkGroup(
    params: DeleteWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
    */
  def getNamedQuery(): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
    */
  def getNamedQuery(params: GetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNamedQuery(
    params: GetNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNamedQueryOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
    */
  def getQueryExecution(): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
    */
  def getQueryExecution(params: GetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueryExecution(
    params: GetQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the results of a single query execution specified by QueryExecutionId if you have access to the workgroup in which the query ran. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
    */
  def getQueryResults(): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueryResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueryResultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the results of a single query execution specified by QueryExecutionId if you have access to the workgroup in which the query ran. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
    */
  def getQueryResults(params: GetQueryResultsInput): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getQueryResults(
    params: GetQueryResultsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetQueryResultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetQueryResultsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the workgroup with the specified name.
    */
  def getWorkGroup(): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the workgroup with the specified name.
    */
  def getWorkGroup(params: GetWorkGroupInput): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getWorkGroup(
    params: GetWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNamedQueries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNamedQueriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(params: ListNamedQueriesInput): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNamedQueries(
    params: ListNamedQueriesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNamedQueriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNamedQueriesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueryExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueryExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(params: ListQueryExecutionsInput): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listQueryExecutions(
    params: ListQueryExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListQueryExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListQueryExecutionsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags associated with this workgroup.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags associated with this workgroup.
    */
  def listTagsForResource(params: ListTagsForResourceInput): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists available workgroups for the account.
    */
  def listWorkGroups(): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWorkGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists available workgroups for the account.
    */
  def listWorkGroups(params: ListWorkGroupsInput): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listWorkGroups(
    params: ListWorkGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListWorkGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListWorkGroupsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(params: StartQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startQueryExecution(
    params: StartQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(params: StopQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopQueryExecution(
    params: StopQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopQueryExecutionOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to the resource, such as a workgroup. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize resources (workgroups) in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. For best practices, see AWS Tagging Strategies. The key length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The tag value length is from 0 (minimum) to 256 (maximum) Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one, separate them by commas.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds one or more tags to the resource, such as a workgroup. A tag is a label that you assign to an AWS Athena resource (a workgroup). Each tag consists of a key and an optional value, both of which you define. Tags enable you to categorize resources (workgroups) in Athena, for example, by purpose, owner, or environment. Use a consistent set of tag keys to make it easier to search and filter workgroups in your account. For best practices, see AWS Tagging Strategies. The key length is from 1 (minimum) to 128 (maximum) Unicode characters in UTF-8. The tag value length is from 0 (minimum) to 256 (maximum) Unicode characters in UTF-8. You can use letters and numbers representable in UTF-8, and the following characters: + - = . _ : / @. Tag keys and values are case-sensitive. Tag keys must be unique per resource. If you specify more than one, separate them by commas.
    */
  def tagResource(params: TagResourceInput): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ TagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[TagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by commas, and removes their tags at the same time.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes one or more tags from the workgroup resource. Takes as an input a list of TagKey Strings separated by commas, and removes their tags at the same time.
    */
  def untagResource(params: UntagResourceInput): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UntagResourceOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UntagResourceOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
    */
  def updateWorkGroup(): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
    */
  def updateWorkGroup(params: UpdateWorkGroupInput): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateWorkGroup(
    params: UpdateWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateWorkGroupOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

