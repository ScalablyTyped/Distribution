package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountResponse extends js.Object {
  /**
    * The Amazon Chime account details.
    */
  var Account: js.UndefOr[typings.awsSdk.chimeMod.Account] = js.native
}

object CreateAccountResponse {
  @scala.inline
  def apply(): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountResponse]
  }
  @scala.inline
  implicit class CreateAccountResponseOps[Self <: CreateAccountResponse] (val x: Self) extends AnyVal {
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
    def setAccount(value: Account): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("Account", js.undefined)
  }
  
}

