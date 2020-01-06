package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegenerateSecurityTokenRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString = js.native
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString = js.native
}

object RegenerateSecurityTokenRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): RegenerateSecurityTokenRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], BotId = BotId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegenerateSecurityTokenRequest]
  }
}

