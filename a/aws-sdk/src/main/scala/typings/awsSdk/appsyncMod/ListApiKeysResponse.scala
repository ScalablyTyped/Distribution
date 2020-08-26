package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApiKeysResponse extends js.Object {
  /**
    * The ApiKey objects.
    */
  var apiKeys: js.UndefOr[ApiKeys] = js.native
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListApiKeysResponse {
  @scala.inline
  def apply(): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  @scala.inline
  implicit class ListApiKeysResponseOps[Self <: ListApiKeysResponse] (val x: Self) extends AnyVal {
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
    def setApiKeysVarargs(value: ApiKey*): Self = this.set("apiKeys", js.Array(value :_*))
    @scala.inline
    def setApiKeys(value: ApiKeys): Self = this.set("apiKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiKeys: Self = this.set("apiKeys", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

