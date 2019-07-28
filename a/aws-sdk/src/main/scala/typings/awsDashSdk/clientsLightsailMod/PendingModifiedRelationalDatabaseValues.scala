package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingModifiedRelationalDatabaseValues extends js.Object {
  /**
    * A Boolean value indicating whether automated backup retention is enabled.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The database engine version.
    */
  var engineVersion: js.UndefOr[String] = js.undefined
  /**
    * The password for the master user of the database.
    */
  var masterUserPassword: js.UndefOr[String] = js.undefined
}

object PendingModifiedRelationalDatabaseValues {
  @scala.inline
  def apply(
    backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
    engineVersion: String = null,
    masterUserPassword: String = null
  ): PendingModifiedRelationalDatabaseValues = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backupRetentionEnabled)) __obj.updateDynamic("backupRetentionEnabled")(backupRetentionEnabled)
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion)
    if (masterUserPassword != null) __obj.updateDynamic("masterUserPassword")(masterUserPassword)
    __obj.asInstanceOf[PendingModifiedRelationalDatabaseValues]
  }
}

