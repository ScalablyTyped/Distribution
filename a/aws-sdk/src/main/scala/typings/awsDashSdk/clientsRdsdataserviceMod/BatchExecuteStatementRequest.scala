package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchExecuteStatementRequest extends js.Object {
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.undefined
  /**
    * The parameter set for the batch operation.
    */
  var parameterSets: js.UndefOr[SqlParameterSets] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Aurora Serverless DB cluster.
    */
  var resourceArn: Arn
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.undefined
  /**
    * The name or ARN of the secret that enables access to the DB cluster.
    */
  var secretArn: Arn
  /**
    * The SQL statement to run.
    */
  var sql: SqlStatement
  /**
    * The identifier of a transaction that was started by using the
    BeginTransaction operation. Specify the transaction ID of the
    transaction that you want to include the SQL statement in.
    If the SQL statement is not part of a transaction, don't set this
    parameter.
    */
  var transactionId: js.UndefOr[Id] = js.undefined
}

object BatchExecuteStatementRequest {
  @scala.inline
  def apply(
    resourceArn: Arn,
    secretArn: Arn,
    sql: SqlStatement,
    database: DbName = null,
    parameterSets: SqlParameterSets = null,
    schema: DbName = null,
    transactionId: Id = null
  ): BatchExecuteStatementRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, secretArn = secretArn, sql = sql)
    if (database != null) __obj.updateDynamic("database")(database)
    if (parameterSets != null) __obj.updateDynamic("parameterSets")(parameterSets)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[BatchExecuteStatementRequest]
  }
}

