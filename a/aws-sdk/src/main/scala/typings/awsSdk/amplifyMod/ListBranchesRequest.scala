package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBranchesRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The maximum number of records to list in a single response. 
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    *  A pagination token. Set to null to start listing branches from the start. If a non-null pagination token is returned in a result, pass its value in here to list more branches. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBranchesRequest {
  @scala.inline
  def apply(appId: AppId): ListBranchesRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBranchesRequest]
  }
  @scala.inline
  implicit class ListBranchesRequestOps[Self <: ListBranchesRequest] (val x: Self) extends AnyVal {
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
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

