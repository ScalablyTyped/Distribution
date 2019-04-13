package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventSubscriptionMessage extends js.Object {
  /**
    * The name of the event notification subscription you want to delete.
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

