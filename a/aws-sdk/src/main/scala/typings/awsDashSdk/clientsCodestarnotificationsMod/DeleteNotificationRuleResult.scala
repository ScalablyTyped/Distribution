package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNotificationRuleResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted notification rule.
    */
  var Arn: js.UndefOr[NotificationRuleArn] = js.native
}

object DeleteNotificationRuleResult {
  @scala.inline
  def apply(Arn: NotificationRuleArn = null): DeleteNotificationRuleResult = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNotificationRuleResult]
  }
}

