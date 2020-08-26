package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBotRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString = js.native
  /**
    * When true, stops the specified bot from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
}

object UpdateBotRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): UpdateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotRequest]
  }
  @scala.inline
  implicit class UpdateBotRequestOps[Self <: UpdateBotRequest] (val x: Self) extends AnyVal {
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
    def setBotId(value: NonEmptyString): Self = this.set("BotId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
  }
  
}

