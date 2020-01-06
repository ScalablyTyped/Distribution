package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceFilters extends js.Object {
  /**
    * The 12-digit source account ID.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.native
  /**
    * The source region.
    */
  var Region: js.UndefOr[AwsRegion] = js.native
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceId] = js.native
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceName] = js.native
}

object ResourceFilters {
  @scala.inline
  def apply(
    AccountId: AccountId = null,
    Region: AwsRegion = null,
    ResourceId: ResourceId = null,
    ResourceName: ResourceName = null
  ): ResourceFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceFilters]
  }
}

