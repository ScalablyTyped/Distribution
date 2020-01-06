package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamodbDataSourceConfig extends js.Object {
  /**
    * The AWS Region.
    */
  var awsRegion: String = js.native
  /**
    * The DeltaSyncConfig for a versioned datasource.
    */
  var deltaSyncConfig: js.UndefOr[DeltaSyncConfig] = js.native
  /**
    * The table name.
    */
  var tableName: String = js.native
  /**
    * Set to TRUE to use Amazon Cognito credentials with this data source.
    */
  var useCallerCredentials: js.UndefOr[Boolean] = js.native
  /**
    * Set to TRUE to use Conflict Detection and Resolution with this data source.
    */
  var versioned: js.UndefOr[Boolean] = js.native
}

object DynamodbDataSourceConfig {
  @scala.inline
  def apply(
    awsRegion: String,
    tableName: String,
    deltaSyncConfig: DeltaSyncConfig = null,
    useCallerCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    versioned: js.UndefOr[scala.Boolean] = js.undefined
  ): DynamodbDataSourceConfig = {
    val __obj = js.Dynamic.literal(awsRegion = awsRegion.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any])
    if (deltaSyncConfig != null) __obj.updateDynamic("deltaSyncConfig")(deltaSyncConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(useCallerCredentials)) __obj.updateDynamic("useCallerCredentials")(useCallerCredentials.asInstanceOf[js.Any])
    if (!js.isUndefined(versioned)) __obj.updateDynamic("versioned")(versioned.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamodbDataSourceConfig]
  }
}

