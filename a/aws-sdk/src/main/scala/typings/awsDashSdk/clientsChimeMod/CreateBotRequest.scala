package typings.awsDashSdk.clientsChimeMod

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
  def apply(AccountId: NonEmptyString, DisplayName: SensitiveString, Domain: NonEmptyString = null): CreateBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotRequest]
  }
}

