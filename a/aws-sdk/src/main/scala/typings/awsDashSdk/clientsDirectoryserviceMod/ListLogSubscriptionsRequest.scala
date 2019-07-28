package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLogSubscriptionsRequest extends js.Object {
  /**
    * If a DirectoryID is provided, lists only the log subscription associated with that directory. If no DirectoryId is provided, lists all log subscriptions associated with your AWS account. If there are no log subscriptions for the AWS account or the directory, an empty list will be returned.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  /**
    * The maximum number of items returned.
    */
  var Limit: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  /**
    * The token for the next set of items to return.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}

object ListLogSubscriptionsRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: NextToken = null
  ): ListLogSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLogSubscriptionsRequest]
  }
}

