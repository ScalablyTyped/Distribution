package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventSubscriptionMessage extends js.Object {
  /**
    * The name of the Amazon Redshift event notification subscription to be deleted.
    */
  var SubscriptionName: String
}

object DeleteEventSubscriptionMessage {
  @scala.inline
  def apply(SubscriptionName: String): DeleteEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName)
  
    __obj.asInstanceOf[DeleteEventSubscriptionMessage]
  }
}

