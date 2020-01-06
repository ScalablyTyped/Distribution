package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRelationalDatabaseFromSnapshotRequest extends js.Object {
  /**
    * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation. When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the source database.
    */
  var relationalDatabaseBundleId: js.UndefOr[String] = js.native
  /**
    * The name to use for your new database. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * The name of the database snapshot from which to create your new database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
  /**
    * The date and time to restore your database from. Constraints:   Must be before the latest restorable time for the database.   Cannot be specified if the use latest restorable time parameter is true.   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the restore time.  
    */
  var restoreTime: js.UndefOr[IsoDate] = js.native
  /**
    * The name of the source database.
    */
  var sourceRelationalDatabaseName: js.UndefOr[ResourceName] = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * Specifies whether your database is restored from the latest backup time. A value of true restores from the latest backup time.  Default: false  Constraints: Cannot be specified if the restore time parameter is provided.
    */
  var useLatestRestorableTime: js.UndefOr[Boolean] = js.native
}

object CreateRelationalDatabaseFromSnapshotRequest {
  @scala.inline
  def apply(
    relationalDatabaseName: ResourceName,
    availabilityZone: String = null,
    publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
    relationalDatabaseBundleId: String = null,
    relationalDatabaseSnapshotName: ResourceName = null,
    restoreTime: IsoDate = null,
    sourceRelationalDatabaseName: ResourceName = null,
    tags: TagList = null,
    useLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
  ): CreateRelationalDatabaseFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (!js.isUndefined(publiclyAccessible)) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.asInstanceOf[js.Any])
    if (relationalDatabaseBundleId != null) __obj.updateDynamic("relationalDatabaseBundleId")(relationalDatabaseBundleId.asInstanceOf[js.Any])
    if (relationalDatabaseSnapshotName != null) __obj.updateDynamic("relationalDatabaseSnapshotName")(relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    if (restoreTime != null) __obj.updateDynamic("restoreTime")(restoreTime.asInstanceOf[js.Any])
    if (sourceRelationalDatabaseName != null) __obj.updateDynamic("sourceRelationalDatabaseName")(sourceRelationalDatabaseName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (!js.isUndefined(useLatestRestorableTime)) __obj.updateDynamic("useLatestRestorableTime")(useLatestRestorableTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelationalDatabaseFromSnapshotRequest]
  }
}

