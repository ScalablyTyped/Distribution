package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBotRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The bot display name.
    */
  var DisplayName: SensitiveString = js.native
  /**
    * The domain of the Amazon Chime Enterprise account.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.native
}

object CreateBotRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, DisplayName: SensitiveString): CreateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotRequest]
  }
  @scala.inline
  implicit class CreateBotRequestOps[Self <: CreateBotRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: NonEmptyString): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: SensitiveString): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomain(value: NonEmptyString): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
  }
  
}

