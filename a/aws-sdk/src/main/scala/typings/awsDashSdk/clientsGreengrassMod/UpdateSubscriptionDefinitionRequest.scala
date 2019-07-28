package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSubscriptionDefinitionRequest extends js.Object {
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: __string
}

object UpdateSubscriptionDefinitionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: __string, Name: __string = null): UpdateSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[UpdateSubscriptionDefinitionRequest]
  }
}

