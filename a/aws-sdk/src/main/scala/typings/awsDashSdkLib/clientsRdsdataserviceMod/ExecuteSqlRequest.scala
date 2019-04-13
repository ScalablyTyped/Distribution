package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteSqlRequest extends js.Object {
  /**
    * ARN of the db credentials in AWS Secret Store or the friendly secret name
    */
  var awsSecretStoreArn: Arn
  /**
    * Target DB name
    */
  var database: js.UndefOr[DbName] = js.undefined
  /**
    * ARN of the target db cluster or instance
    */
  var dbClusterOrInstanceArn: Arn
  /**
    * Target Schema name
    */
  var schema: js.UndefOr[DbName] = js.undefined
  /**
    * SQL statement(s) to be executed. Statements can be chained by using semicolons
    */
  var sqlStatements: SqlStatement
}

object ExecuteSqlRequest {
  @scala.inline
  def apply(
    awsSecretStoreArn: Arn,
    dbClusterOrInstanceArn: Arn,
    sqlStatements: SqlStatement,
    database: DbName = null,
    schema: DbName = null
  ): ExecuteSqlRequest = {
    val __obj = js.Dynamic.literal(awsSecretStoreArn = awsSecretStoreArn, dbClusterOrInstanceArn = dbClusterOrInstanceArn, sqlStatements = sqlStatements)
    if (database != null) __obj.updateDynamic("database")(database)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
}

