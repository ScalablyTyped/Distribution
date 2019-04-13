package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateRelationalDatabaseFromSnapshotRequest extends js.Object {
  /**
    * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
    */
  var availabilityZone: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
    */
  var publiclyAccessible: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation. When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the source database.
    */
  var relationalDatabaseBundleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name to use for your new database. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseName: ResourceName
  /**
    * The name of the database snapshot from which to create your new database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The date and time to restore your database from. Constraints:   Must be before the latest restorable time for the database.   Cannot be specified if the use latest restorable time parameter is true.   Specified in Universal Coordinated Time (UTC).   Specified in the Unix time format. For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the restore time.  
    */
  var restoreTime: js.UndefOr[IsoDate] = js.undefined
  /**
    * The name of the source database.
    */
  var sourceRelationalDatabaseName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * Specifies whether your database is restored from the latest backup time. A value of true restores from the latest backup time.  Default: false  Constraints: Cannot be specified if the restore time parameter is provided.
    */
  var useLatestRestorableTime: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateRelationalDatabaseFromSnapshotRequest {
  @scala.inline
  def apply(
    relationalDatabaseName: ResourceName,
    availabilityZone: java.lang.String = null,
    publiclyAccessible: js.UndefOr[scala.Boolean] = js.undefined,
    relationalDatabaseBundleId: java.lang.String = null,
    relationalDatabaseSnapshotName: ResourceName = null,
    restoreTime: IsoDate = null,
    sourceRelationalDatabaseName: ResourceName = null,
    tags: TagList = null,
    useLatestRestorableTime: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateRelationalDatabaseFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName)
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (!js.isUndefined(publiclyAccessible)) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible)
    if (relationalDatabaseBundleId != null) __obj.updateDynamic("relationalDatabaseBundleId")(relationalDatabaseBundleId)
    if (relationalDatabaseSnapshotName != null) __obj.updateDynamic("relationalDatabaseSnapshotName")(relationalDatabaseSnapshotName)
    if (restoreTime != null) __obj.updateDynamic("restoreTime")(restoreTime)
    if (sourceRelationalDatabaseName != null) __obj.updateDynamic("sourceRelationalDatabaseName")(sourceRelationalDatabaseName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (!js.isUndefined(useLatestRestorableTime)) __obj.updateDynamic("useLatestRestorableTime")(useLatestRestorableTime)
    __obj.asInstanceOf[CreateRelationalDatabaseFromSnapshotRequest]
  }
}

