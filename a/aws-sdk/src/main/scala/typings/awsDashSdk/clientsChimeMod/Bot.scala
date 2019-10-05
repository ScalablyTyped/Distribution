package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bot extends js.Object {
  /**
    * The bot email address.
    */
  var BotEmail: js.UndefOr[SensitiveString] = js.undefined
  /**
    * The bot ID.
    */
  var BotId: js.UndefOr[String] = js.undefined
  /**
    * The bot type.
    */
  var BotType: js.UndefOr[typings.awsDashSdk.clientsChimeMod.BotType] = js.undefined
  /**
    * The bot creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * When true, the bot is stopped from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.undefined
  /**
    * The bot display name.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.undefined
  /**
    * The security token used to authenticate Amazon Chime with the outgoing event endpoint.
    */
  var SecurityToken: js.UndefOr[SensitiveString] = js.undefined
  /**
    * The updated bot timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
  /**
    * The unique ID for the bot user.
    */
  var UserId: js.UndefOr[String] = js.undefined
}

object Bot {
  @scala.inline
  def apply(
    BotEmail: SensitiveString = null,
    BotId: String = null,
    BotType: BotType = null,
    CreatedTimestamp: Iso8601Timestamp = null,
    Disabled: js.UndefOr[scala.Boolean] = js.undefined,
    DisplayName: SensitiveString = null,
    SecurityToken: SensitiveString = null,
    UpdatedTimestamp: Iso8601Timestamp = null,
    UserId: String = null
  ): Bot = {
    val __obj = js.Dynamic.literal()
    if (BotEmail != null) __obj.updateDynamic("BotEmail")(BotEmail)
    if (BotId != null) __obj.updateDynamic("BotId")(BotId)
    if (BotType != null) __obj.updateDynamic("BotType")(BotType.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (SecurityToken != null) __obj.updateDynamic("SecurityToken")(SecurityToken)
    if (UpdatedTimestamp != null) __obj.updateDynamic("UpdatedTimestamp")(UpdatedTimestamp)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[Bot]
  }
}

