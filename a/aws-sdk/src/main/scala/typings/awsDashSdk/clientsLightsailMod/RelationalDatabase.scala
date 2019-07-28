package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabase extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A Boolean value indicating whether automated backup retention is enabled for the database.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The timestamp when the database was created. Formatted in Unix time.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The database software (for example, MySQL).
    */
  var engine: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The database engine version (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Describes the hardware of the database.
    */
  var hardware: js.UndefOr[RelationalDatabaseHardware] = js.undefined
  /**
    * The latest point in time to which the database can be restored. Formatted in Unix time.
    */
  var latestRestorableTime: js.UndefOr[IsoDate] = js.undefined
  /**
    * The Region name and Availability Zone where the database is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the master database created when the Lightsail database resource is created.
    */
  var masterDatabaseName: js.UndefOr[String] = js.undefined
  /**
    * The master endpoint for the database.
    */
  var masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint] = js.undefined
  /**
    * The master user name of the database.
    */
  var masterUsername: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The unique name of the database resource in Lightsail.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The status of parameter updates for the database.
    */
  var parameterApplyStatus: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * Describes the pending maintenance actions for the database.
    */
  var pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList] = js.undefined
  /**
    * Describes pending database value modifications.
    */
  var pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues] = js.undefined
  /**
    * The daily time range during which automated backups are created for the database (for example, 16:00-16:30).
    */
  var preferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The weekly time range during which system maintenance can occur on the database. In the format ddd:hh24:mi-ddd:hh24:mi. For example, Tue:17:00-Tue:17:30.
    */
  var preferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * A Boolean value indicating whether the database is publicly accessible.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.undefined
  /**
    * The blueprint ID for the database. A blueprint describes the major engine version of a database.
    */
  var relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The bundle ID for the database. A bundle describes the performance specifications for your database.
    */
  var relationalDatabaseBundleId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The Lightsail resource type for the database (for example, RelationalDatabase).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * Describes the secondary Availability Zone of a high availability database. The secondary database is used for failover support of a high availability database.
    */
  var secondaryAvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Describes the current state of the database.
    */
  var state: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object RelationalDatabase {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
    createdAt: IsoDate = null,
    engine: NonEmptyString = null,
    engineVersion: NonEmptyString = null,
    hardware: RelationalDatabaseHardware = null,
    latestRestorableTime: IsoDate = null,
    location: ResourceLocation = null,
    masterDatabaseName: String = null,
    masterEndpoint: RelationalDatabaseEndpoint = null,
    masterUsername: NonEmptyString = null,
    name: ResourceName = null,
    parameterApplyStatus: NonEmptyString = null,
    pendingMaintenanceActions: PendingMaintenanceActionList = null,
    pendingModifiedValues: PendingModifiedRelationalDatabaseValues = null,
    preferredBackupWindow: NonEmptyString = null,
    preferredMaintenanceWindow: NonEmptyString = null,
    publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
    relationalDatabaseBlueprintId: NonEmptyString = null,
    relationalDatabaseBundleId: NonEmptyString = null,
    resourceType: ResourceType = null,
    secondaryAvailabilityZone: String = null,
    state: NonEmptyString = null,
    supportCode: String = null,
    tags: TagList = null
  ): RelationalDatabase = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (!js.isUndefined(backupRetentionEnabled)) __obj.updateDynamic("backupRetentionEnabled")(backupRetentionEnabled)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion)
    if (hardware != null) __obj.updateDynamic("hardware")(hardware)
    if (latestRestorableTime != null) __obj.updateDynamic("latestRestorableTime")(latestRestorableTime)
    if (location != null) __obj.updateDynamic("location")(location)
    if (masterDatabaseName != null) __obj.updateDynamic("masterDatabaseName")(masterDatabaseName)
    if (masterEndpoint != null) __obj.updateDynamic("masterEndpoint")(masterEndpoint)
    if (masterUsername != null) __obj.updateDynamic("masterUsername")(masterUsername)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameterApplyStatus != null) __obj.updateDynamic("parameterApplyStatus")(parameterApplyStatus)
    if (pendingMaintenanceActions != null) __obj.updateDynamic("pendingMaintenanceActions")(pendingMaintenanceActions)
    if (pendingModifiedValues != null) __obj.updateDynamic("pendingModifiedValues")(pendingModifiedValues)
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow)
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow)
    if (!js.isUndefined(publiclyAccessible)) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible)
    if (relationalDatabaseBlueprintId != null) __obj.updateDynamic("relationalDatabaseBlueprintId")(relationalDatabaseBlueprintId)
    if (relationalDatabaseBundleId != null) __obj.updateDynamic("relationalDatabaseBundleId")(relationalDatabaseBundleId)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (secondaryAvailabilityZone != null) __obj.updateDynamic("secondaryAvailabilityZone")(secondaryAvailabilityZone)
    if (state != null) __obj.updateDynamic("state")(state)
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[RelationalDatabase]
  }
}

