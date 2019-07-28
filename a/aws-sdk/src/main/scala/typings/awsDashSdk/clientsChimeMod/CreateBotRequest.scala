package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBotRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The bot display name.
    */
  var DisplayName: SensitiveString
  /**
    * The domain of the Amazon Chime Enterprise account.
    */
  var Domain: js.UndefOr[NonEmptyString] = js.undefined
}

object CreateBotRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, DisplayName: SensitiveString, Domain: NonEmptyString = null): CreateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, DisplayName = DisplayName)
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    __obj.asInstanceOf[CreateBotRequest]
  }
}

