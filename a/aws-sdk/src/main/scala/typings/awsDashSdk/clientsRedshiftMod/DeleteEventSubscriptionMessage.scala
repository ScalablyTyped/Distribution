package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEventSubscriptionMessage extends js.Object {
  /**
    * The name of the Amazon Redshift event notification subscription to be deleted.
    */
  var SubscriptionName: String = js.native
}

object DeleteEventSubscriptionMessage {
  @scala.inline
  def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEventSubscriptionMessage]
  }
}

