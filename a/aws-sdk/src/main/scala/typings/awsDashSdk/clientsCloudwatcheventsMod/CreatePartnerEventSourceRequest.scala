package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePartnerEventSourceRequest extends js.Object {
  /**
    * The AWS account ID of the customer who is permitted to create a matching partner event bus for this partner event source.
    */
  var Account: AccountId
  /**
    * The name of the partner event source. This name must be unique and must be in the format  partner_name/event_namespace/event_name . The AWS account that wants to use this partner event source must create a partner event bus with a name that matches the name of the partner event source.
    */
  var Name: EventSourceName
}

object CreatePartnerEventSourceRequest {
  @scala.inline
  def apply(Account: AccountId, Name: EventSourceName): CreatePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account, Name = Name)
  
    __obj.asInstanceOf[CreatePartnerEventSourceRequest]
  }
}

