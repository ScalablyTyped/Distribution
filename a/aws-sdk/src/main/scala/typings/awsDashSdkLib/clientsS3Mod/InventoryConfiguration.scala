package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryConfiguration extends js.Object {
  /**
    * Contains information about where to publish the inventory results.
    */
  var Destination: InventoryDestination
  /**
    * Specifies an inventory filter. The inventory only includes objects that meet the filter's criteria.
    */
  var Filter: js.UndefOr[InventoryFilter] = js.undefined
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
  /**
    * Object versions to include in the inventory list. If set to All, the list includes all the object versions, which adds the version-related fields VersionId, IsLatest, and DeleteMarker to the list. If set to Current, the list does not contain these version-related fields.
    */
  var IncludedObjectVersions: InventoryIncludedObjectVersions
  /**
    * Specifies whether the inventory is enabled or disabled. If set to True, an inventory list is generated. If set to False, no inventory list is generated.
    */
  var IsEnabled: awsDashSdkLib.clientsS3Mod.IsEnabled
  /**
    * Contains the optional fields that are included in the inventory results.
    */
  var OptionalFields: js.UndefOr[InventoryOptionalFields] = js.undefined
  /**
    * Specifies the schedule for generating inventory results.
    */
  var Schedule: InventorySchedule
}

object InventoryConfiguration {
  @scala.inline
  def apply(
    Destination: InventoryDestination,
    Id: InventoryId,
    IncludedObjectVersions: InventoryIncludedObjectVersions,
    IsEnabled: IsEnabled,
    Schedule: InventorySchedule,
    Filter: InventoryFilter = null,
    OptionalFields: InventoryOptionalFields = null
  ): InventoryConfiguration = {
    val __obj = js.Dynamic.literal(Destination = Destination, Id = Id, IncludedObjectVersions = IncludedObjectVersions.asInstanceOf[js.Any], IsEnabled = IsEnabled, Schedule = Schedule)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (OptionalFields != null) __obj.updateDynamic("OptionalFields")(OptionalFields)
    __obj.asInstanceOf[InventoryConfiguration]
  }
}

