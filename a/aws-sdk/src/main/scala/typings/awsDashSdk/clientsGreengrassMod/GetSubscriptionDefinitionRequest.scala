package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSubscriptionDefinitionRequest extends js.Object {
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: __string
}

object GetSubscriptionDefinitionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: __string): GetSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId)
  
    __obj.asInstanceOf[GetSubscriptionDefinitionRequest]
  }
}

