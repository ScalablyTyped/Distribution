package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGraphqlApisRequest extends js.Object {
  /**
    * The maximum number of results you want the request to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListGraphqlApisRequest {
  @scala.inline
  def apply(): ListGraphqlApisRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGraphqlApisRequest]
  }
  @scala.inline
  implicit class ListGraphqlApisRequestOps[Self <: ListGraphqlApisRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

