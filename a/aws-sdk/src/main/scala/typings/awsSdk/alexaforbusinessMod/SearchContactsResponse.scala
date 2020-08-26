package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchContactsResponse extends js.Object {
  /**
    * The contacts that meet the specified set of filter criteria, in sort order.
    */
  var Contacts: js.UndefOr[ContactDataList] = js.native
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
  /**
    * The total number of contacts returned.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TotalCount] = js.native
}

object SearchContactsResponse {
  @scala.inline
  def apply(): SearchContactsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchContactsResponse]
  }
  @scala.inline
  implicit class SearchContactsResponseOps[Self <: SearchContactsResponse] (val x: Self) extends AnyVal {
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
    def setContactsVarargs(value: ContactData*): Self = this.set("Contacts", js.Array(value :_*))
    @scala.inline
    def setContacts(value: ContactDataList): Self = this.set("Contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("Contacts", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setTotalCount(value: TotalCount): Self = this.set("TotalCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalCount: Self = this.set("TotalCount", js.undefined)
  }
  
}

