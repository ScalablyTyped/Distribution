package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewayGroupsRequest extends js.Object {
  /**
    * The maximum number of gateway group summaries to return. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListGatewayGroupsRequest {
  @scala.inline
  def apply(): ListGatewayGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewayGroupsRequest]
  }
  @scala.inline
  implicit class ListGatewayGroupsRequestOps[Self <: ListGatewayGroupsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

