package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMeshesInput extends js.Object {
  /**
    * The maximum number of results returned by ListMeshes in paginated output.
    When you use this parameter, ListMeshes returns only limit
    results in a single page along with a nextToken response element. You can see
    the remaining results of the initial request by sending another ListMeshes
    request with the returned nextToken value. This value can be between
    1 and 100. If you don't use this parameter,
    ListMeshes returns up to 100 results and a
    nextToken value if applicable.
    */
  var limit: js.UndefOr[ListMeshesLimit] = js.native
  /**
    * The nextToken value returned from a previous paginated
    ListMeshes request where limit was used and the results
    exceeded the value of that parameter. Pagination continues from the end of the previous
    results that returned the nextToken value. 
    
    This token should be treated as an opaque identifier that is used only to
    retrieve the next items in a list and not for other programmatic purposes.
    
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListMeshesInput {
  @scala.inline
  def apply(): ListMeshesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMeshesInput]
  }
  @scala.inline
  implicit class ListMeshesInputOps[Self <: ListMeshesInput] (val x: Self) extends AnyVal {
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
    def setLimit(value: ListMeshesLimit): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

