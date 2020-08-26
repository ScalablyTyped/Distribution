package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bot extends js.Object {
  /**
    * The bot email address.
    */
  var BotEmail: js.UndefOr[SensitiveString] = js.native
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.native
  /**
    * The bot type.
    */
  var BotType: js.UndefOr[typings.awsSdk.chimeMod.BotType] = js.native
  /**
    * The bot creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * When true, the bot is stopped from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * The bot display name.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.native
  /**
    * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
    */
  var SecurityToken: js.UndefOr[SensitiveString] = js.native
  /**
    * The updated bot timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.native
  /**
    * The unique ID for the bot user.
    */
  var UserId: js.UndefOr[String] = js.native
}

object Bot {
  @scala.inline
  def apply(): Bot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bot]
  }
  @scala.inline
  implicit class BotOps[Self <: Bot] (val x: Self) extends AnyVal {
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
    def setBotEmail(value: SensitiveString): Self = this.set("BotEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotEmail: Self = this.set("BotEmail", js.undefined)
    @scala.inline
    def setBotId(value: String): Self = this.set("BotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotId: Self = this.set("BotId", js.undefined)
    @scala.inline
    def setBotType(value: BotType): Self = this.set("BotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotType: Self = this.set("BotType", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: Iso8601Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setDisabled(value: NullableBoolean): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    @scala.inline
    def setDisplayName(value: SensitiveString): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    @scala.inline
    def setSecurityToken(value: SensitiveString): Self = this.set("SecurityToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityToken: Self = this.set("SecurityToken", js.undefined)
    @scala.inline
    def setUpdatedTimestamp(value: Iso8601Timestamp): Self = this.set("UpdatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedTimestamp: Self = this.set("UpdatedTimestamp", js.undefined)
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
  
}

