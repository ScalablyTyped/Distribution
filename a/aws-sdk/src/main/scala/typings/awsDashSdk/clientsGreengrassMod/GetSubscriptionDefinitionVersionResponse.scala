package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubscriptionDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the subscription definition version.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the subscription definition version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.native
  /**
    * Information about the subscription definition version.
    */
  var Definition: js.UndefOr[SubscriptionDefinitionVersion] = js.native
  /**
    * The ID of the subscription definition version.
    */
  var Id: js.UndefOr[__string] = js.native
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * The version of the subscription definition version.
    */
  var Version: js.UndefOr[__string] = js.native
}

object GetSubscriptionDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Definition: SubscriptionDefinitionVersion = null,
    Id: __string = null,
    NextToken: __string = null,
    Version: __string = null
  ): GetSubscriptionDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionDefinitionVersionResponse]
  }
}

