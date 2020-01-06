package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsubscribeResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the the notification rule from which you have removed a subscription.
    */
  var Arn: NotificationRuleArn = js.native
}

object UnsubscribeResult {
  @scala.inline
  def apply(Arn: NotificationRuleArn): UnsubscribeResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnsubscribeResult]
  }
}

