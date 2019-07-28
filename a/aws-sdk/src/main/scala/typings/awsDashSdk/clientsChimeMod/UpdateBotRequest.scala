package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBotRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString
  /**
    * When true, stops the specified bot from running in your account.
    */
  var Disabled: js.UndefOr[NullableBoolean] = js.undefined
}

object UpdateBotRequest {
  @scala.inline
  def apply(
    AccountId: NonEmptyString,
    BotId: NonEmptyString,
    Disabled: js.UndefOr[NullableBoolean] = js.undefined
  ): UpdateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BotId = BotId)
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled)
    __obj.asInstanceOf[UpdateBotRequest]
  }
}

