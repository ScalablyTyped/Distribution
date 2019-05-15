package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBotRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString
}

object GetBotRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): GetBotRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BotId = BotId)
  
    __obj.asInstanceOf[GetBotRequest]
  }
}

