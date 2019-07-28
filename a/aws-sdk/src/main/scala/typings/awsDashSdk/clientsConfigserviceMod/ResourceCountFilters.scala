package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceCountFilters extends js.Object {
  /**
    * The 12-digit ID of the account.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.undefined
  /**
    * The region where the account is located.
    */
  var Region: js.UndefOr[AwsRegion] = js.undefined
  /**
    * The type of the AWS resource.
    */
  var ResourceType: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.ResourceType] = js.undefined
}

object ResourceCountFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, Region: AwsRegion = null, ResourceType: ResourceType = null): ResourceCountFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceCountFilters]
  }
}

