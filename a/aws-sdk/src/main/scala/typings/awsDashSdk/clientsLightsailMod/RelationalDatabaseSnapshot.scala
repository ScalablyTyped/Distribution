package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationalDatabaseSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the database snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The timestamp when the database snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The software of the database snapshot (for example, MySQL)
    */
  var engine: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The database engine version for the database snapshot (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major engine version of a database.
    */
  var fromRelationalDatabaseBlueprintId: js.UndefOr[String] = js.undefined
  /**
    * The bundle ID of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseBundleId: js.UndefOr[String] = js.undefined
  /**
    * The name of the source database from which the database snapshot was created.
    */
  var fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The Region name and Availability Zone where the database snapshot is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  /**
    * The name of the database snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.undefined
  /**
    * The Lightsail resource type.
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  /**
    * The size of the disk in GB (for example, 32) for the database snapshot.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
  /**
    * The state of the database snapshot.
    */
  var state: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The support code for the database snapshot. Include this code in your email to support when you have questions about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.undefined
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object RelationalDatabaseSnapshot {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    createdAt: IsoDate = null,
    engine: NonEmptyString = null,
    engineVersion: NonEmptyString = null,
    fromRelationalDatabaseArn: NonEmptyString = null,
    fromRelationalDatabaseBlueprintId: String = null,
    fromRelationalDatabaseBundleId: String = null,
    fromRelationalDatabaseName: NonEmptyString = null,
    location: ResourceLocation = null,
    name: ResourceName = null,
    resourceType: ResourceType = null,
    sizeInGb: js.UndefOr[integer] = js.undefined,
    state: NonEmptyString = null,
    supportCode: String = null,
    tags: TagList = null
  ): RelationalDatabaseSnapshot = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (engine != null) __obj.updateDynamic("engine")(engine)
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion)
    if (fromRelationalDatabaseArn != null) __obj.updateDynamic("fromRelationalDatabaseArn")(fromRelationalDatabaseArn)
    if (fromRelationalDatabaseBlueprintId != null) __obj.updateDynamic("fromRelationalDatabaseBlueprintId")(fromRelationalDatabaseBlueprintId)
    if (fromRelationalDatabaseBundleId != null) __obj.updateDynamic("fromRelationalDatabaseBundleId")(fromRelationalDatabaseBundleId)
    if (fromRelationalDatabaseName != null) __obj.updateDynamic("fromRelationalDatabaseName")(fromRelationalDatabaseName)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb)
    if (state != null) __obj.updateDynamic("state")(state)
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[RelationalDatabaseSnapshot]
  }
}

