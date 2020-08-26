package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentsResponse extends js.Object {
  /**
    * The list of application components.
    */
  var ApplicationComponentList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationComponentList] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListComponentsResponse {
  @scala.inline
  def apply(): ListComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsResponse]
  }
  @scala.inline
  implicit class ListComponentsResponseOps[Self <: ListComponentsResponse] (val x: Self) extends AnyVal {
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
    def setApplicationComponentListVarargs(value: ApplicationComponent*): Self = this.set("ApplicationComponentList", js.Array(value :_*))
    @scala.inline
    def setApplicationComponentList(value: ApplicationComponentList): Self = this.set("ApplicationComponentList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationComponentList: Self = this.set("ApplicationComponentList", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

