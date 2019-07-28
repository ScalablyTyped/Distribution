package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLogSubscriptionsResult extends js.Object {
  /**
    * A list of active LogSubscription objects for calling the AWS account.
    */
  var LogSubscriptions: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.LogSubscriptions] = js.undefined
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}

object ListLogSubscriptionsResult {
  @scala.inline
  def apply(LogSubscriptions: LogSubscriptions = null, NextToken: NextToken = null): ListLogSubscriptionsResult = {
    val __obj = js.Dynamic.literal()
    if (LogSubscriptions != null) __obj.updateDynamic("LogSubscriptions")(LogSubscriptions)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLogSubscriptionsResult]
  }
}

