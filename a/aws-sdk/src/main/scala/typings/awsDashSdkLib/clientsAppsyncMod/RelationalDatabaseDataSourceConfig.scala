package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseDataSourceConfig extends js.Object {
  /**
    * Amazon RDS HTTP endpoint settings.
    */
  var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.undefined
  /**
    * Source type for the relational database.    RDS_HTTP_ENDPOINT: The relational database source type is an Amazon RDS HTTP endpoint.  
    */
  var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.undefined
}

object RelationalDatabaseDataSourceConfig {
  @scala.inline
  def apply(
    rdsHttpEndpointConfig: RdsHttpEndpointConfig = null,
    relationalDatabaseSourceType: RelationalDatabaseSourceType = null
  ): RelationalDatabaseDataSourceConfig = {
    val __obj = js.Dynamic.literal()
    if (rdsHttpEndpointConfig != null) __obj.updateDynamic("rdsHttpEndpointConfig")(rdsHttpEndpointConfig)
    if (relationalDatabaseSourceType != null) __obj.updateDynamic("relationalDatabaseSourceType")(relationalDatabaseSourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseDataSourceConfig]
  }
}

