package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDataService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RDSDataService: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Runs a batch SQL statement over an array of data.
    You can run bulk update and insert operations for multiple records using a DML 
    statement with different parameter sets. Bulk operations can provide a significant 
    performance improvement over individual insert and update operations.
    
    If a call isn't part of a transaction because it doesn't include the
    transactionID parameter, changes that result from the call are
    committed automatically.    
    
    */
  def batchExecuteStatement(): awsDashSdkLib.libRequestMod.Request[BatchExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchExecuteStatement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchExecuteStatementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs a batch SQL statement over an array of data.
    You can run bulk update and insert operations for multiple records using a DML 
    statement with different parameter sets. Bulk operations can provide a significant 
    performance improvement over individual insert and update operations.
    
    If a call isn't part of a transaction because it doesn't include the
    transactionID parameter, changes that result from the call are
    committed automatically.    
    
    */
  def batchExecuteStatement(params: BatchExecuteStatementRequest): awsDashSdkLib.libRequestMod.Request[BatchExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchExecuteStatement(
    params: BatchExecuteStatementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchExecuteStatementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a SQL transaction.
    
    
    A transaction can run for a maximum of 24 hours. A transaction is terminated and 
    rolled back automatically after 24 hours.
    A transaction times out if no calls use its transaction ID in three minutes. 
    If a transaction times out before it's committed, it's rolled back
    automatically.
    DDL statements inside a transaction cause an implicit commit. We recommend 
    that you run each DDL statement in a separate ExecuteStatement call with 
    continueAfterTimeout enabled.
    
    */
  def beginTransaction(): awsDashSdkLib.libRequestMod.Request[BeginTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def beginTransaction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BeginTransactionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BeginTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts a SQL transaction.
    
    
    A transaction can run for a maximum of 24 hours. A transaction is terminated and 
    rolled back automatically after 24 hours.
    A transaction times out if no calls use its transaction ID in three minutes. 
    If a transaction times out before it's committed, it's rolled back
    automatically.
    DDL statements inside a transaction cause an implicit commit. We recommend 
    that you run each DDL statement in a separate ExecuteStatement call with 
    continueAfterTimeout enabled.
    
    */
  def beginTransaction(params: BeginTransactionRequest): awsDashSdkLib.libRequestMod.Request[BeginTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def beginTransaction(
    params: BeginTransactionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BeginTransactionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BeginTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ends a SQL transaction started with the BeginTransaction operation and
    commits the changes.
    */
  def commitTransaction(): awsDashSdkLib.libRequestMod.Request[CommitTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def commitTransaction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CommitTransactionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CommitTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Ends a SQL transaction started with the BeginTransaction operation and
    commits the changes.
    */
  def commitTransaction(params: CommitTransactionRequest): awsDashSdkLib.libRequestMod.Request[CommitTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def commitTransaction(
    params: CommitTransactionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CommitTransactionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CommitTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs one or more SQL statements.
    
    This operation is deprecated. Use the BatchExecuteStatement or
    ExecuteStatement operation.
    
    */
  def executeSql(): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeSql(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteSqlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs one or more SQL statements.
    
    This operation is deprecated. Use the BatchExecuteStatement or
    ExecuteStatement operation.
    
    */
  def executeSql(params: ExecuteSqlRequest): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeSql(
    params: ExecuteSqlRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteSqlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs a SQL statement against a database.
    
    If a call isn't part of a transaction because it doesn't include the
    transactionID parameter, changes that result from the call are
    committed automatically.    
    
    The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over 1,000 records, the call is terminated.
    */
  def executeStatement(): awsDashSdkLib.libRequestMod.Request[ExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeStatement(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteStatementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Runs a SQL statement against a database.
    
    If a call isn't part of a transaction because it doesn't include the
    transactionID parameter, changes that result from the call are
    committed automatically.    
    
    The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over 1,000 records, the call is terminated.
    */
  def executeStatement(params: ExecuteStatementRequest): awsDashSdkLib.libRequestMod.Request[ExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeStatement(
    params: ExecuteStatementRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteStatementResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteStatementResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
    */
  def rollbackTransaction(): awsDashSdkLib.libRequestMod.Request[RollbackTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rollbackTransaction(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RollbackTransactionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RollbackTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Performs a rollback of a transaction. Rolling back a transaction cancels its changes.
    */
  def rollbackTransaction(params: RollbackTransactionRequest): awsDashSdkLib.libRequestMod.Request[RollbackTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rollbackTransaction(
    params: RollbackTransactionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RollbackTransactionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RollbackTransactionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

