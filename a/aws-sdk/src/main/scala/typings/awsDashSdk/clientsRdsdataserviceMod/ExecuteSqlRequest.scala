package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteSqlRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
    */
  var awsSecretStoreArn: Arn
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.undefined
  /**
    * The ARN of the Aurora Serverless DB cluster.
    */
  var dbClusterOrInstanceArn: Arn
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.undefined
  /**
    * One or more SQL statements to run on the DB cluster.
    You can separate SQL statements from each other with a semicolon (;). Any valid SQL
    statement is permitted, including data definition, data manipulation, and commit
    statements. 
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

