package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamodbDataSourceConfig extends js.Object {
  /**
    * The AWS Region.
    */
  var awsRegion: String
  /**
    * The table name.
    */
  var tableName: String
  /**
    * Set to TRUE to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.undefined
}

object DynamodbDataSourceConfig {
  @scala.inline
  def apply(awsRegion: String, tableName: String, useCallerCredentials: js.UndefOr[Boolean] = js.undefined): DynamodbDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion, tableName = tableName)
    if (!js.isUndefined(useCallerCredentials)) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials)
    __obj.asInstanceOf[DynamodbDataSourceConfig]
  }
}

