package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsHttpEndpointConfig extends js.Object {
  /**
    * AWS Region for RDS HTTP endpoint.
    */
  var awsRegion: js.UndefOr[String] = js.native
  /**
    * AWS secret store ARN for database credentials.
    */
  var awsSecretStoreArn: js.UndefOr[String] = js.native
  /**
    * Logical database name.
    */
  var databaseName: js.UndefOr[String] = js.native
  /**
    * Amazon RDS cluster identifier.
    */
  var dbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Logical schema name.
    */
  var schema: js.UndefOr[String] = js.native
}

object RdsHttpEndpointConfig {
  @scala.inline
  def apply(
    awsRegion: String = null,
    awsSecretStoreArn: String = null,
    databaseName: String = null,
    dbClusterIdentifier: String = null,
    schema: String = null
  ): RdsHttpEndpointConfig = {
    val __obj = js.Dynamic.literal()
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion.asInstanceOf[js.Any])
    if (awsSecretStoreArn != null) __obj.updateDynamic("awsSecretStoreArn")(awsSecretStoreArn.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[RdsHttpEndpointConfig]
  }
}

