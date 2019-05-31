package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeginTransactionRequest extends js.Object {
  /**
    * The name of the database.
    */
  var database: js.UndefOr[DbName] = js.undefined
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
}

object BeginTransactionRequest {
  @scala.inline
  def apply(resourceArn: Arn, secretArn: Arn, database: DbName = null, schema: DbName = null): BeginTransactionRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn, secretArn = secretArn)
    if (database != null) __obj.updateDynamic("database")(database)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[BeginTransactionRequest]
  }
}

