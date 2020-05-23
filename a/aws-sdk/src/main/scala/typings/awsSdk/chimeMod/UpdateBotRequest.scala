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
  def apply(
    AccountId: NonEmptyString,
    BotId: NonEmptyString,
    Disabled: js.UndefOr[NullableBoolean] = js.undefined
  ): UpdateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
    if (!js.isUndefined(Disabled)) __obj.updateDynamic("Disabled")(Disabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotRequest]
  }
}

