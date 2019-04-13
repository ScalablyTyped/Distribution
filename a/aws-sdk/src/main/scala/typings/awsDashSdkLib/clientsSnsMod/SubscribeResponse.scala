package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeResponse extends js.Object {
  /**
    * The ARN of the subscription if it is confirmed, or the string "pending confirmation" if the subscription requires confirmation. However, if the API request parameter ReturnSubscriptionArn is true, then the value is always the subscription ARN, even if the subscription requires confirmation.
    */
  var SubscriptionArn: js.UndefOr[subscriptionARN] = js.undefined
}

object SubscribeResponse {
  @scala.inline
  def apply(SubscriptionArn: subscriptionARN = null): SubscribeResponse = {
    val __obj = js.Dynamic.literal()
    if (SubscriptionArn != null) __obj.updateDynamic("SubscriptionArn")(SubscriptionArn)
    __obj.asInstanceOf[SubscribeResponse]
  }
}

