package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetResourceConfigResponse extends js.Object {
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var baseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined
  /**
    * A list of resource keys that were not processed with the current response. The unprocessesResourceKeys value is in the same form as ResourceKeys, so the value can be directly provided to a subsequent BatchGetResourceConfig operation. If there are no unprocessed resource keys, the response contains an empty unprocessedResourceKeys list. 
    */
  var unprocessedResourceKeys: js.UndefOr[ResourceKeys] = js.undefined
}

object BatchGetResourceConfigResponse {
  @scala.inline
  def apply(
    baseConfigurationItems: BaseConfigurationItems = null,
    unprocessedResourceKeys: ResourceKeys = null
  ): BatchGetResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (baseConfigurationItems != null) __obj.updateDynamic("baseConfigurationItems")(baseConfigurationItems)
    if (unprocessedResourceKeys != null) __obj.updateDynamic("unprocessedResourceKeys")(unprocessedResourceKeys)
    __obj.asInstanceOf[BatchGetResourceConfigResponse]
  }
}

