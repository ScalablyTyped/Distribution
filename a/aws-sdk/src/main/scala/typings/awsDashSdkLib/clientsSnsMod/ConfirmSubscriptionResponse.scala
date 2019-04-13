package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmSubscriptionResponse extends js.Object {
  /**
    * The ARN of the created subscription.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
}

object ConfirmSubscriptionResponse {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN = null): ConfirmSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    if (SubscriptionArn != null) __obj.updateDynamic("SubscriptionArn")(SubscriptionArn)
    __obj.asInstanceOf[ConfirmSubscriptionResponse]
  }
}

