package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWebhooksResult extends js.Object {
  /**
    *  A pagination token. If non-null, the pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    *  A list of webhooks. 
    */
  var webhooks: Webhooks = js.native
}

object ListWebhooksResult {
  @scala.inline
  def apply(webhooks: Webhooks, nextToken: NextToken = null): ListWebhooksResult = {
    val __obj = js.Dynamic.literal(webhooks = webhooks.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhooksResult]
  }
}

