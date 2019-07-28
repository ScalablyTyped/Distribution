package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWebhooksOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned and can be used in a subsequent ListWebhooks call to return the next set of webhooks in the list. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCodepipelineMod.NextToken] = js.undefined
  /**
    * The JSON detail returned for each webhook in the list output for the ListWebhooks call.
    */
  var webhooks: js.UndefOr[WebhookList] = js.undefined
}

object ListWebhooksOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, webhooks: WebhookList = null): ListWebhooksOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (webhooks != null) __obj.updateDynamic("webhooks")(webhooks)
    __obj.asInstanceOf[ListWebhooksOutput]
  }
}

