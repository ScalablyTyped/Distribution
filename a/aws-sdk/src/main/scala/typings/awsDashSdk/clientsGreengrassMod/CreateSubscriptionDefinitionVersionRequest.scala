package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: __string = js.native
  /**
    * A list of subscriptions.
    */
  var Subscriptions: js.UndefOr[__listOfSubscription] = js.native
}

object CreateSubscriptionDefinitionVersionRequest {
  @scala.inline
  def apply(
    SubscriptionDefinitionId: __string,
    AmznClientToken: __string = null,
    Subscriptions: __listOfSubscription = null
  ): CreateSubscriptionDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriptionDefinitionVersionRequest]
  }
}

