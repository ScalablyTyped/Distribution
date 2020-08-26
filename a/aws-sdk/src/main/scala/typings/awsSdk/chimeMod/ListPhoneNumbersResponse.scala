package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The phone number details.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.native
}

object ListPhoneNumbersResponse {
  @scala.inline
  def apply(): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
  @scala.inline
  implicit class ListPhoneNumbersResponseOps[Self <: ListPhoneNumbersResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPhoneNumbersVarargs(value: PhoneNumber*): Self = this.set("PhoneNumbers", js.Array(value :_*))
    @scala.inline
    def setPhoneNumbers(value: PhoneNumberList): Self = this.set("PhoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumbers: Self = this.set("PhoneNumbers", js.undefined)
  }
  
}

