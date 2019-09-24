package typings.awsDashSdk.clientsRdsdataserviceMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDataService extends Service {
  @JSName("config")
  var config_RDSDataService: ConfigBase with ClientConfiguration = js.native
  /**
    * Runs a batch SQL statement over an array of data. You can run bulk update and insert operations for multiple records using a DML statement with different parameter sets. Bulk operations can provide a significant performance improvement over individual insert and update operations.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically. 
    */
  def batchExecuteStatement(): Request[BatchExecuteStatementResponse, AWSError] = js.native
  def batchExecuteStatement(callback: js.Function2[/* err */ AWSError, /* data */ BatchExecuteStatementResponse, Unit]): Request[BatchExecuteStatementResponse, AWSError] = js.native
  /**
    * Runs a batch SQL statement over an array of data. You can run bulk update and insert operations for multiple records using a DML statement with different parameter sets. Bulk operations can provide a significant performance improvement over individual insert and update operations.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically. 
    */
  def batchExecuteStatement(params: BatchExecuteStatementRequest): Request[BatchExecuteStatementResponse, AWSError] = js.native
  def batchExecuteStatement(
    params: BatchExecuteStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchExecuteStatementResponse, Unit]
  ): Request[BatchExecuteStatementResponse, AWSError] = js.native
  /**
    * Starts a SQL transaction.  &lt;important&gt; &lt;p&gt;A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours.&lt;/p&gt; &lt;p&gt;A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically.&lt;/p&gt; &lt;p&gt;DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate &lt;code&gt;ExecuteStatement&lt;/code&gt; call with &lt;code&gt;continueAfterTimeout&lt;/code&gt; enabled.&lt;/p&gt; &lt;/important&gt; 
    */
  def beginTransaction(): Request[BeginTransactionResponse, AWSError] = js.native
  def beginTransaction(callback: js.Function2[/* err */ AWSError, /* data */ BeginTransactionResponse, Unit]): Request[BeginTransactionResponse, AWSError] = js.native
  /**
    * Starts a SQL transaction.  &lt;important&gt; &lt;p&gt;A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after 24 hours.&lt;/p&gt; &lt;p&gt;A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before it's committed, it's rolled back automatically.&lt;/p&gt; &lt;p&gt;DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a separate &lt;code&gt;ExecuteStatement&lt;/code&gt; call with &lt;code&gt;continueAfterTimeout&lt;/code&gt; enabled.&lt;/p&gt; &lt;/important&gt; 
    */
  def beginTransaction(params: BeginTransactionRequest): Request[BeginTransactionResponse, AWSError] = js.native
  def beginTransaction(
    params: BeginTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BeginTransactionResponse, Unit]
  ): Request[BeginTransactionResponse, AWSError] = js.native
  /**
    * Ends a SQL transaction started with the BeginTransaction operation and commits the changes.
    */
  def commitTransaction(): Request[CommitTransactionResponse, AWSError] = js.native
  def commitTransaction(callback: js.Function2[/* err */ AWSError, /* data */ CommitTransactionResponse, Unit]): Request[CommitTransactionResponse, AWSError] = js.native
  /**
    * Ends a SQL transaction started with the BeginTransaction operation and commits the changes.
    */
  def commitTransaction(params: CommitTransactionRequest): Request[CommitTransactionResponse, AWSError] = js.native
  def commitTransaction(
    params: CommitTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CommitTransactionResponse, Unit]
  ): Request[CommitTransactionResponse, AWSError] = js.native
  /**
    * Runs one or more SQL statements.  This operation is deprecated. Use the BatchExecuteStatement or ExecuteStatement operation. 
    */
  def executeSql(): Request[ExecuteSqlResponse, AWSError] = js.native
  def executeSql(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteSqlResponse, Unit]): Request[ExecuteSqlResponse, AWSError] = js.native
  /**
    * Runs one or more SQL statements.  This operation is deprecated. Use the BatchExecuteStatement or ExecuteStatement operation. 
    */
  def executeSql(params: ExecuteSqlRequest): Request[ExecuteSqlResponse, AWSError] = js.native
  def executeSql(
    params: ExecuteSqlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteSqlResponse, Unit]
  ): Request[ExecuteSqlResponse, AWSError] = js.native
  /**
    * Runs a SQL statement against a database.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically.  The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over 1,000 records, the call is terminated.
    */
  def executeStatement(): Request[ExecuteStatementResponse, AWSError] = js.native
  def executeStatement(callback: js.Function2[/* err */ AWSError, /* data */ ExecuteStatementResponse, Unit]): Request[ExecuteStatementResponse, AWSError] = js.native
  /**
    * Runs a SQL statement against a database.  If a call isn't part of a transaction because it doesn't include the transactionID parameter, changes that result from the call are committed automatically.  The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over 1,000 records, the call is terminated.
    */
  def executeStatement(params: ExecuteStatementRequest): Request[ExecuteStatementResponse, AWSError] = js.native
  def executeStatement(
    params: ExecuteStatementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ExecuteStatementResponse, Unit]
  ): Request[ExecuteStatementResponse, AWSError] = js.native
  /**
    * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
    */
  def rollbackTransaction(): Request[RollbackTransactionResponse, AWSError] = js.native
  def rollbackTransaction(callback: js.Function2[/* err */ AWSError, /* data */ RollbackTransactionResponse, Unit]): Request[RollbackTransactionResponse, AWSError] = js.native
  /**
    * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
    */
  def rollbackTransaction(params: RollbackTransactionRequest): Request[RollbackTransactionResponse, AWSError] = js.native
  def rollbackTransaction(
    params: RollbackTransactionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RollbackTransactionResponse, Unit]
  ): Request[RollbackTransactionResponse, AWSError] = js.native
}

