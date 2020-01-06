package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetResourceConfigResponse extends js.Object {
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.native
  /**
    * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys list. 
    */
  var unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.native
}

object BatchGetResourceConfigResponse {
  @scala.inline
  def apply(
    baseConfigurationItems: BaseConfigurationItems = null,
    unprocessedResourceKeys: ResourceKeys = null
  ): BatchGetResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (baseConfigurationItems != null) __obj.updateDynamic("baseConfigurationItems")(baseConfigurationItems.asInstanceOf[js.Any])
    if (unprocessedResourceKeys != null) __obj.updateDynamic("unprocessedResourceKeys")(unprocessedResourceKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetResourceConfigResponse]
  }
}

