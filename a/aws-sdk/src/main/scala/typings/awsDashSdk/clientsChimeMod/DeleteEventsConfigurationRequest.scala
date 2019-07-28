package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEventsConfigurationRequest extends js.Object {
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  /**
    * The bot ID.
    */
  var BotId: NonEmptyString
}

object DeleteEventsConfigurationRequest {
  @scala.inline
  def apply(AccountId: NonEmptyString, BotId: NonEmptyString): DeleteEventsConfigurationRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, BotId = BotId)
  
    __obj.asInstanceOf[DeleteEventsConfigurationRequest]
  }
}

