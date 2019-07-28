package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubscriptionDefinitionRequest extends js.Object {
  /**
    * The ID of the subscription definition.
    */
  var SubscriptionDefinitionId: __string
}

object DeleteSubscriptionDefinitionRequest {
  @scala.inline
  def apply(SubscriptionDefinitionId: __string): DeleteSubscriptionDefinitionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionDefinitionId = SubscriptionDefinitionId)
  
    __obj.asInstanceOf[DeleteSubscriptionDefinitionRequest]
  }
}

