package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Athena
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Athena: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAthenaMod.AthenaNs.ClientConfiguration = js.native
  /**
    * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
    */
  def batchGetNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Requires you to have access to the workgroup in which the queries were saved. Use ListNamedQueriesInput to get the list of named query IDs in the specified workgroup. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries differ from executed queries. Use BatchGetQueryExecutionInput to get details about each unique query execution, and ListQueryExecutionsInput to get a list of query execution IDs.
    */
  def batchGetNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetNamedQuery(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
    */
  def batchGetQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. Requires you to have access to the workgroup in which the queries ran. To get a list of query execution IDs, use ListQueryExecutionsInput$WorkGroup. Query executions differ from named (saved) queries. Use BatchGetNamedQueryInput to get details about named queries.
    */
  def batchGetQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchGetQueryExecution(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a named query in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def createNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createNamedQuery(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a workgroup with the specified name.
    */
  def createWorkGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a workgroup with the specified name.
    */
  def createWorkGroup(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createWorkGroup(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the named query if you have access to the workgroup in which the query was saved. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def deleteNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteNamedQuery(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
    */
  def deleteWorkGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the workgroup with the specified name. The primary workgroup cannot be deleted.
    */
  def deleteWorkGroup(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteWorkGroup(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
    */
  def getNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getNamedQuery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a single query. Requires that you have access to the workgroup in which the query was saved.
    */
  def getNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getNamedQuery(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
    */
  def getQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about a single execution of a query if you have access to the workgroup in which the query ran. Each time a query executes, information about the query execution is saved with a unique ID.
    */
  def getQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQueryExecution(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the results of a single query execution specified by QueryExecutionId if you have access to the workgroup in which the query ran. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
    */
  def getQueryResults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQueryResults(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the results of a single query execution specified by QueryExecutionId if you have access to the workgroup in which the query ran. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
    */
  def getQueryResults(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getQueryResults(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the workgroup with the speficied name.
    */
  def getWorkGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns information about the workgroup with the speficied name.
    */
  def getWorkGroup(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getWorkGroup(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listNamedQueries(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of available query IDs only for queries saved in the specified workgroup. Requires that you have access to the workgroup. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listNamedQueries(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listNamedQueries(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQueryExecutions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides a list of available query execution IDs for the queries in the specified workgroup. Requires you to have access to the workgroup in which the queries ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def listQueryExecutions(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listQueryExecutions(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available workgroups for the account.
    */
  def listWorkGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWorkGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists available workgroups for the account.
    */
  def listWorkGroups(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listWorkGroups(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListWorkGroupsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs the SQL query statements contained in the Query. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def startQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startQueryExecution(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopQueryExecution(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a query execution. Requires you to have access to the workgroup in which the query ran. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
    */
  def stopQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopQueryExecution(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
    */
  def updateWorkGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateWorkGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the workgroup with the specified name. The workgroup's name cannot be changed.
    */
  def updateWorkGroup(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateWorkGroup(
    params: awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.UpdateWorkGroupOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

