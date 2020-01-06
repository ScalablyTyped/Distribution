package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetAggregateResourceConfigResponse extends js.Object {
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var BaseConfigurationItems: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.BaseConfigurationItems] = js.native
  /**
    * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources are processed.
    */
  var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.native
}

object BatchGetAggregateResourceConfigResponse {
  @scala.inline
  def apply(
    BaseConfigurationItems: BaseConfigurationItems = null,
    UnprocessedResourceIdentifiers: UnprocessedResourceIdentifierList = null
  ): BatchGetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (BaseConfigurationItems != null) __obj.updateDynamic("BaseConfigurationItems")(BaseConfigurationItems.asInstanceOf[js.Any])
    if (UnprocessedResourceIdentifiers != null) __obj.updateDynamic("UnprocessedResourceIdentifiers")(UnprocessedResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
  }
}

