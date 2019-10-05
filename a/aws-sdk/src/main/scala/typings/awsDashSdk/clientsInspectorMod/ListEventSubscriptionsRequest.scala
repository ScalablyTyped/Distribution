package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventSubscriptionsRequest extends js.Object {
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[ListEventSubscriptionsMaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListEventSubscriptions action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ARN of the assessment template for which you want to list the existing event subscriptions.
    */
  var resourceArn: js.UndefOr[Arn] = js.undefined
}

object ListEventSubscriptionsRequest {
  @scala.inline
  def apply(maxResults: Int | Double = null, nextToken: PaginationToken = null, resourceArn: Arn = null): ListEventSubscriptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourceArn != null) __obj.updateDynamic("resourceArn")(resourceArn)
    __obj.asInstanceOf[ListEventSubscriptionsRequest]
  }
}

