package typings.awsDashSdk.clientsCodestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNotificationRulesResult extends js.Object {
  /**
    * An enumeration token that can be used in a request to return the next batch of the results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodestarnotificationsMod.NextToken] = js.native
  /**
    * The list of notification rules for the AWS account, by Amazon Resource Name (ARN) and ID. 
    */
  var NotificationRules: js.UndefOr[NotificationRuleBatch] = js.native
}

object ListNotificationRulesResult {
  @scala.inline
  def apply(NextToken: NextToken = null, NotificationRules: NotificationRuleBatch = null): ListNotificationRulesResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (NotificationRules != null) __obj.updateDynamic("NotificationRules")(NotificationRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNotificationRulesResult]
  }
}

