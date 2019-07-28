package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceFilters extends js.Object {
  /**
    * The 12-digit source account ID.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.undefined
  /**
    * The source region.
    */
  var Region: js.UndefOr[AwsRegion] = js.undefined
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceId] = js.undefined
  /**
    * The name of the resource.
    */
  var ResourceName: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceName] = js.undefined
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
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceName != null) __obj.updateDynamic("ResourceName")(ResourceName)
    __obj.asInstanceOf[ResourceFilters]
  }
}

