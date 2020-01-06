package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecuteSqlRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the secret that enables access to the DB cluster.
    */
  var awsSecretStoreArn: Arn = js.native
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.native
  /**
    * The ARN of the Aurora Serverless DB cluster.
    */
  var dbClusterOrInstanceArn: Arn = js.native
  /**
    * The name of the database schema.
    */
  var schema: js.UndefOr[DbName] = js.native
  /**
    * One or more SQL statements to run on the DB cluster. You can separate SQL statements from each other with a semicolon (;). Any valid SQL statement is permitted, including data definition, data manipulation, and commit statements. 
    */
  var sqlStatements: SqlStatement = js.native
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
    val __obj = js.Dynamic.literal(awsSecretStoreArn = awsSecretStoreArn.asInstanceOf[js.Any], dbClusterOrInstanceArn = dbClusterOrInstanceArn.asInstanceOf[js.Any], sqlStatements = sqlStatements.asInstanceOf[js.Any])
    if (database != null) __obj.updateDynamic("database")(database.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteSqlRequest]
  }
}

