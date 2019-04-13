package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RdsHttpEndpointConfig extends js.Object {
  /**
    * AWS Region for RDS HTTP endpoint.
    */
  var awsRegion: js.UndefOr[String] = js.undefined
  /**
    * AWS secret store ARN for database credentials.
    */
  var awsSecretStoreArn: js.UndefOr[String] = js.undefined
  /**
    * Logical database name.
    */
  var databaseName: js.UndefOr[String] = js.undefined
  /**
    * Amazon RDS cluster identifier.
    */
  var dbClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Logical schema name.
    */
  var schema: js.UndefOr[String] = js.undefined
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
    if (awsRegion != null) __obj.updateDynamic("awsRegion")(awsRegion)
    if (awsSecretStoreArn != null) __obj.updateDynamic("awsSecretStoreArn")(awsSecretStoreArn)
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName)
    if (dbClusterIdentifier != null) __obj.updateDynamic("dbClusterIdentifier")(dbClusterIdentifier)
    if (schema != null) __obj.updateDynamic("schema")(schema)
    __obj.asInstanceOf[RdsHttpEndpointConfig]
  }
}

