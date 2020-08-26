package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGatewayGroupsResponse extends js.Object {
  /**
    * The gateway groups in the list.
    */
  var GatewayGroups: js.UndefOr[GatewayGroupSummaries] = js.native
  /**
    * The token used to paginate though multiple pages of gateway group summaries.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListGatewayGroupsResponse {
  @scala.inline
  def apply(): ListGatewayGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGatewayGroupsResponse]
  }
  @scala.inline
  implicit class ListGatewayGroupsResponseOps[Self <: ListGatewayGroupsResponse] (val x: Self) extends AnyVal {
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
    def setGatewayGroupsVarargs(value: GatewayGroupSummary*): Self = this.set("GatewayGroups", js.Array(value :_*))
    @scala.inline
    def setGatewayGroups(value: GatewayGroupSummaries): Self = this.set("GatewayGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayGroups: Self = this.set("GatewayGroups", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

