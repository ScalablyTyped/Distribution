package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegenerateSecurityTokenRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString
}

object RegenerateSecurityTokenRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): RegenerateSecurityTokenRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BotId = BotId)
  
    __obj.asInstanceOf[RegenerateSecurityTokenRequest]
  }
}

