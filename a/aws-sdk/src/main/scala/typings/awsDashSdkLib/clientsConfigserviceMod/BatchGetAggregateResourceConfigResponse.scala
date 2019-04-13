package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetAggregateResourceConfigResponse extends js.Object {
  /**
    * A list that contains the current configuration of one or more resources.
    */
  var BaseConfigurationItems: js.UndefOr[BaseConfigurationItems] = js.undefined
  /**
    * A list of resource identifiers that were not processed with current scope. The list is empty if all the resources are processed.
    */
  var UnprocessedResourceIdentifiers: js.UndefOr[UnprocessedResourceIdentifierList] = js.undefined
}

object BatchGetAggregateResourceConfigResponse {
  @scala.inline
  def apply(
    BaseConfigurationItems: BaseConfigurationItems = null,
    UnprocessedResourceIdentifiers: UnprocessedResourceIdentifierList = null
  ): BatchGetAggregateResourceConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (BaseConfigurationItems != null) __obj.updateDynamic("BaseConfigurationItems")(BaseConfigurationItems)
    if (UnprocessedResourceIdentifiers != null) __obj.updateDynamic("UnprocessedResourceIdentifiers")(UnprocessedResourceIdentifiers)
    __obj.asInstanceOf[BatchGetAggregateResourceConfigResponse]
  }
}

