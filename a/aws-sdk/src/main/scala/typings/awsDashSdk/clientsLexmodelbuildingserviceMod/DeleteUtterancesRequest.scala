package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUtterancesRequest extends js.Object {
  /**
    * The name of the bot that stored the utterances.
    */
  var botName: BotName = js.native
  /**
    *  The unique identifier for the user that made the utterances. This is the user ID that was sent in the PostContent or PostText operation request that contained the utterance.
    */
  var userId: UserId = js.native
}

object DeleteUtterancesRequest {
  @scala.inline
  def apply(botName: BotName, userId: UserId): DeleteUtterancesRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUtterancesRequest]
  }
}

