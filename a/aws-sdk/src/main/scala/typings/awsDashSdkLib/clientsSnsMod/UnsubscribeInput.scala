package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsubscribeInput extends js.Object {
  /**
    * The ARN of the subscription to be deleted.
    */
  var SubscriptionArn: subscriptionARN
}

object UnsubscribeInput {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN): UnsubscribeInput = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn)
  
    __obj.asInstanceOf[UnsubscribeInput]
  }
}

