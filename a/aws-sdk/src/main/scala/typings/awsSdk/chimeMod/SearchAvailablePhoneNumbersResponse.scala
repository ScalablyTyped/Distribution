package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchAvailablePhoneNumbersResponse extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.native
}

object SearchAvailablePhoneNumbersResponse {
  @scala.inline
  def apply(): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
  @scala.inline
  implicit class SearchAvailablePhoneNumbersResponseOps[Self <: SearchAvailablePhoneNumbersResponse] (val x: Self) extends AnyVal {
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
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = this.set("E164PhoneNumbers", js.Array(value :_*))
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = this.set("E164PhoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE164PhoneNumbers: Self = this.set("E164PhoneNumbers", js.undefined)
  }
  
}

