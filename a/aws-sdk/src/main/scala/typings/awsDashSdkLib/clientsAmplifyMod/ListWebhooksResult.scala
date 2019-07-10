package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebhooksResult extends js.Object {
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    *  List of webhooks. 
    */
  var webhooks: Webhooks
}

object ListWebhooksResult {
  @scala.inline
  def apply(webhooks: Webhooks, nextToken: NextToken = null): ListWebhooksResult = {
    val __obj = js.Dynamic.literal(webhooks = webhooks)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListWebhooksResult]
  }
}

