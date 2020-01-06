package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabaseSnapshot extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the database snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The timestamp when the database snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The software of the database snapshot (for example, MySQL)
    */
  var engine: js.UndefOr[NonEmptyString] = js.native
  /**
    * The database engine version for the database snapshot (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Amazon Resource Name (ARN) of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseArn: js.UndefOr[NonEmptyString] = js.native
  /**
    * The blueprint ID of the database from which the database snapshot was created. A blueprint describes the major engine version of a database.
    */
  var fromRelationalDatabaseBlueprintId: js.UndefOr[String] = js.native
  /**
    * The bundle ID of the database from which the database snapshot was created.
    */
  var fromRelationalDatabaseBundleId: js.UndefOr[String] = js.native
  /**
    * The name of the source database from which the database snapshot was created.
    */
  var fromRelationalDatabaseName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Region name and Availability Zone where the database snapshot is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the database snapshot.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The Lightsail resource type.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * The size of the disk in GB (for example, 32) for the database snapshot.
    */
  var sizeInGb: js.UndefOr[integer] = js.native
  /**
    * The state of the database snapshot.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  /**
    * The support code for the database snapshot. Include this code in your email to support when you have questions about a database snapshot in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
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
    sizeInGb: Int | Double = null,
    state: NonEmptyString = null,
    supportCode: String = null,
    tags: TagList = null
  ): RelationalDatabaseSnapshot = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (fromRelationalDatabaseArn != null) __obj.updateDynamic("fromRelationalDatabaseArn")(fromRelationalDatabaseArn.asInstanceOf[js.Any])
    if (fromRelationalDatabaseBlueprintId != null) __obj.updateDynamic("fromRelationalDatabaseBlueprintId")(fromRelationalDatabaseBlueprintId.asInstanceOf[js.Any])
    if (fromRelationalDatabaseBundleId != null) __obj.updateDynamic("fromRelationalDatabaseBundleId")(fromRelationalDatabaseBundleId.asInstanceOf[js.Any])
    if (fromRelationalDatabaseName != null) __obj.updateDynamic("fromRelationalDatabaseName")(fromRelationalDatabaseName.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabaseSnapshot]
  }
}

