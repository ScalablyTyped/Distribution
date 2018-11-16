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
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
     */
  def batchGetNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
     */
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
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
     */
  def batchGetNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of a single named query or a list of up to 50 queries, which you provide as an array of query ID strings. Use ListNamedQueries to get the list of named query IDs. If information could not be retrieved for a submitted query ID, information about the query ID submitted is listed under UnprocessedNamedQueryId. Named queries are different from executed queries. Use BatchGetQueryExecution to get details about each unique query execution, and ListQueryExecutions to get a list of query execution IDs.
     */
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
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
     */
  def batchGetQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
     */
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
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
     */
  def batchGetQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.BatchGetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the details of a single query execution or a list of up to 50 query executions, which you provide as an array of query execution ID strings. To get a list of query execution IDs, use ListQueryExecutions. Query executions are different from named (saved) queries. Use BatchGetNamedQuery to get details about named queries.
     */
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
     * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def createNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def createNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.CreateNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def deleteNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def deleteNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.DeleteNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a named query. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Returns information about a single query.
     */
  def getNamedQuery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a single query.
     */
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
     * Returns information about a single query.
     */
  def getNamedQuery(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetNamedQueryOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a single query.
     */
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
     * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
     */
  def getQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
     */
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
     * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
     */
  def getQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns information about a single execution of a query. Each time a query executes, information about the query execution is saved with a unique ID.
     */
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
     * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
     */
  def getQueryResults(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
     */
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
     * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
     */
  def getQueryResults(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.GetQueryResultsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the results of a single query execution specified by QueryExecutionId. This request does not execute the query but returns results. Use StartQueryExecution to run a query.
     */
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
     * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def listNamedQueries(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def listNamedQueries(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListNamedQueriesOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a list of all available query IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def listQueryExecutions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def listQueryExecutions(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.ListQueryExecutionsOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Provides a list of all available query execution IDs. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def startQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def startQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StartQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Runs (executes) the SQL query statements contained in the Query string. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def stopQueryExecution(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
     * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
  def stopQueryExecution(params: awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionInput): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAthenaMod.AthenaNs.StopQueryExecutionOutput, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops a query execution. For code samples using the AWS SDK for Java, see Examples and Code Samples in the Amazon Athena User Guide.
     */
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
}

