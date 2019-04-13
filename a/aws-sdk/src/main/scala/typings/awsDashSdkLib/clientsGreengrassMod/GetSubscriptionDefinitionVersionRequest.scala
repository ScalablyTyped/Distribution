package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubscriptionDefinitionVersionRequest extends js.Object {
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: __string
  /**
    * The ID of the subscription definition version.
    */
  var SubscriptionDefinitionVersionId: __string
}

object GetSubscriptionDefinitionVersionRequest {
  @scala.inline
  def apply(
    SubscriptionDefinitionId: __string,
    SubscriptionDefinitionVersionId: __string,
    NextToken: __string = null
  ): GetSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId, SubscriptionDefinitionVersionId = SubscriptionDefinitionVersionId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetSubscriptionDefinitionVersionRequest]
  }
}

