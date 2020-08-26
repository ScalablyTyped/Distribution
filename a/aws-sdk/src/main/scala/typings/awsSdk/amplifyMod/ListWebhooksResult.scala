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
  def apply(webhooks: Webhooks): ListWebhooksResult = {
    val __obj = js.Dynamic.literal(webhooks = webhooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWebhooksResult]
  }
  @scala.inline
  implicit class ListWebhooksResultOps[Self <: ListWebhooksResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWebhooksVarargs(value: Webhook*): Self = this.set("webhooks", js.Array(value :_*))
    @scala.inline
    def setWebhooks(value: Webhooks): Self = this.set("webhooks", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

