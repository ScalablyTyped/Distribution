package typings.awsDashSdk.clientsGreengrassMod

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
    * The ID of the subscription definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListSubscriptionDefinitionVersions'' requests. If the version is the last one that was associated with a subscription definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
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

